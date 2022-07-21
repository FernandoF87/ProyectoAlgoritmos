
/**
 *
 * @author Fernando Flores Moya
 */
public class ReversePolish {

    public static Queue reversePolish(Queue formula) {
        Queue reversePolishQueue = new Queue();
        Stack helper = new Stack();

        while (!formula.empty()) {
            try {
                String expression = formula.dequeue();
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
        formula.enqueue("4");
        formula.enqueue("*");
        formula.enqueue("3");
        formula.enqueue("/");
        formula.enqueue("2");
        Queue queue = reversePolish(formula);
        while (!queue.empty()) {
            try {
                System.out.print(queue.dequeue() + " ");
            } catch (EmptyQueueException ex) {
            }
        }
    }
}
