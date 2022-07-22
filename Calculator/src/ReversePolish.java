
import java.util.EmptyStackException;


/**
 *  Class that allows the conversion of a balanced formula to reverse polish notation
 * 
 * @author Fernando Flores Moya
 */
public class ReversePolish {

    /**
     * Converts a balanced formula to reverse polish notation
     * 
     * @param originalFormula a queue of strings that represent a mathematical formula
     * @return the converted formula in reverse polish notation
     */
    public static Queue reversePolish(Queue originalFormula) {
        Queue reversePolishQueue = new Queue();
        Stack helper = new Stack();

        while (!originalFormula.empty()) {
            try {
                String expression = originalFormula.dequeue();
                
                // Stacks immediately if the string is a parenthesis
                if (expression.equals("(") || expression.equals("[") || expression.equals("{")) {
                    helper.push(expression);
                } else if (expression.equals("+") || expression.equals("-") || expression.equals("*") || expression.equals("/") || expression.equals("^")
                        || expression.equals("$") || expression.equals("%") || expression.equals("#") || expression.equals("&") || expression.equals("!")) {
                    if (helper.empty()) {
                        helper.push(expression);
                    } else {
                        FormulaData current = new FormulaData(expression);
                        FormulaData top = new FormulaData(helper.peek());
                        while (top.getPriority() >= current.getPriority()) { // Determines if the priority of the current symbol is greater than the top
                            reversePolishQueue.enqueue(helper.pop());
                            if (helper.empty()) {
                                break;
                            }
                            top = new FormulaData(helper.peek());
                        }
                        helper.push(expression);
                    }
                } else if (expression.equals(")") || expression.equals("]") || expression.equals("}")) { // Pops values until target is found
                    String current = helper.pop();
                    String target = "";
                    if (expression.equals(")")) {
                        target = "(";
                    }
                    if (expression.equals("]")) {
                        target = "[";
                    }
                    if (expression.equals("}")) {
                        target = "{";
                    }
                    while (!current.equals(target)) {
                        reversePolishQueue.enqueue(current);
                        current = helper.pop();
                    }
                } else {
                    reversePolishQueue.enqueue(expression);
                }
            } catch (EmptyQueueException ex) {
            }
        }

        while (!helper.empty()) { // Enqueues values in the stack until it's empty
            reversePolishQueue.enqueue(helper.pop());
        }
        return reversePolishQueue;
    }
}
