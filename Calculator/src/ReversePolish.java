
/**
 *
 * @author Fernando Flores Moya
 */
public class ReversePolish {

    public static Queue reversePolish(FormulaData[] formula) {
        Queue originalFormula = new Queue();
        for (int i = 0; i < formula.length; i++) {
            originalFormula.enqueue(formula[i].getData());
        }
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
                        while (top.getPriority() > current.getPriority()) {
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
        FormulaData[] formula = new FormulaData[19];
        formula[0] = new FormulaData("(");
        formula[1] = new FormulaData("(");
        formula[2] = new FormulaData("x");
        formula[3] = new FormulaData("+");
        formula[4] = new FormulaData("2");
        formula[5] = new FormulaData("*");
        formula[6] = new FormulaData("y");
        formula[7] = new FormulaData(")");
        formula[8] = new FormulaData("^");
        formula[9] = new FormulaData("5");
        formula[10] = new FormulaData(")");
        formula[11] = new FormulaData("/");
        formula[12] = new FormulaData("(");
        formula[13] = new FormulaData("4");
        formula[14] = new FormulaData("*");
        formula[15] = new FormulaData("x");
        formula[16] = new FormulaData("-");
        formula[17] = new FormulaData("3");
        formula[18] = new FormulaData(")");
        Queue queue = reversePolish(formula);
        for (FormulaData i : formula) {
            System.out.print(i.getData() + " ");
        }
        System.out.println("");
        while (!queue.empty()) {
            try {
                System.out.print(queue.dequeue() + " ");
            } catch (EmptyQueueException ex) {
            }
        }
    }
}
