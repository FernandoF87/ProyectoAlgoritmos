/**
 *
 * @author Fernando Flores Moya
 */
public class ReversePolish {
    
    public static Queue reversePolish(DataInterface[] formula) {
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
                        Operator current = new Operator(expression);
                        Operator top = new Operator(helper.peek());
                        while (top.getPriority() > current.getPriority()) {
                            reversePolishQueue.enqueue(helper.pop());
                            if (helper.empty())
                                break;
                            top = new Operator(helper.peek());
                        }
                        helper.push(expression);
                    }
                } else if (expression.equals(")") || expression.equals("]") || expression.equals("}")) {
                    String current = helper.pop();
                    String target = "";
                    if (expression.equals(")"))
                        target = "(";
                    if (expression.equals("]"))
                        target = "[";
                    if (expression.equals("}"))
                        target = "{";
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
        
        while (!helper.empty())
                    reversePolishQueue.enqueue(helper.pop());
        return reversePolishQueue;
    }
    
    public static void main(String[] args) {
        DataInterface[] formula = new DataInterface[19];
        formula[0] = new Operator("(");
        formula[1] = new Operator("(");
        formula[2] = new Value("x", 0);
        formula[3] = new Operator("+");
        formula[4] = new Value("2", 0);
        formula[5] = new Operator("*");
        formula[6] = new Value("y", 0);
        formula[7] = new Operator(")");
        formula[8] = new Operator("^");
        formula[9] = new Value("5", 0);
        formula[10] = new Operator(")");
        formula[11] = new Operator("/");
        formula[12] = new Operator("(");
        formula[13] = new Value("4", 0);
        formula[14] = new Operator("*");
        formula[15] = new Value("x", 0);
        formula[16] = new Operator("-");
        formula[17] = new Value("3", 0);
        formula[18] = new Operator(")");
        Queue queue = reversePolish(formula);
        for (DataInterface i : formula) {
            System.out.print(i.getData()+ " ");
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
