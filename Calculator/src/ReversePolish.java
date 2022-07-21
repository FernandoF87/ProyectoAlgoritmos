
import java.util.EmptyStackException;


/**
 *
 * @author Fernando Flores Moya
 */
public class ReversePolish {

    public static Queue reversePolish(Queue originalFormula) {
        Queue reversePolishQueue = new Queue();
        Stack helper = new Stack();

        while (!originalFormula.empty()) {
            try {
                String expression = originalFormula.dequeue();
                if (expression.equals("(") || expression.equals("[") || expression.equals("{")) {
                    helper.push(expression);
                } else if (expression.equals("+") || expression.equals("-") || expression.equals("*") || expression.equals("/") || expression.equals("^")
                        || expression.equals("$") || expression.equals("%") || expression.equals("#") || expression.equals("&") || expression.equals("!")) {
                    if (helper.empty()) {
                        helper.push(expression);
                    } else {
                        FormulaData current = new FormulaData(expression);
                        FormulaData top = new FormulaData(helper.peek());
                        while (top.getPriority() >= current.getPriority()) {
                            reversePolishQueue.enqueue(helper.pop());
                            if (helper.empty()) {
                                break;
                            }
                            top = new FormulaData(helper.peek());
                        }
                        helper.push(expression);
                    }
                } else if (expression.equals(")") || expression.equals("]") || expression.equals("}")) {
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

        while (!helper.empty()) {
            reversePolishQueue.enqueue(helper.pop());
        }
        return reversePolishQueue;
    }

    public static void main(String[] args) {
        Queue formula = new Queue();
        formula.enqueue("(");
        formula.enqueue("4");
        formula.enqueue("+");
        formula.enqueue("3");
        formula.enqueue(")");
        formula.enqueue("!");
        System.out.println(formula.printAll());
        Queue queue = reversePolish(formula);
        System.out.println(queue.printAll());
        String[][] variables = {{"A", "B", "C"}, {"1", "2", "4"}};
        try {
            System.out.println(Evaluate.evaluate(queue, variables));
        } catch (InvalidFormulaException ex) {
            ex.printStackTrace();
        } catch (EmptyStackException ex) {
            ex.printStackTrace();
        }
    }
}
