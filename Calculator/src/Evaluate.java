
import java.util.EmptyStackException;

/**
 *
 * @author Fernando Flores Moya
 */
public class Evaluate {

    public static double evaluate(Queue reversePolish, String[][] variables) throws InvalidFormulaException, EmptyStackException {
        Stack stack = new Stack();

        while (!reversePolish.empty()) {
            try {
                String data = reversePolish.dequeue();
                if (data.equals("+") || data.equals("-") || data.equals("*") || data.equals("/") || data.equals("^")) {
                    double x = Double.parseDouble(stack.pop());
                    double y = Double.parseDouble(stack.pop());
                    double z = 0;
                    switch (data) {
                        case "+":
                            z = y + x;
                            break;
                        case "-":
                            z = y - x;
                            break;
                        case "*":
                            z = y * x;
                            break;
                        case "/":
                            z = y / x;
                            break;
                        case "^":
                            z = Math.pow(y, x);
                            break;
                    }
                    stack.push(z + "");
                } else if (data.equals("$") || data.equals("%") || data.equals("&") || data.equals("#") || data.equals("!")) {
                    double x = Double.parseDouble(stack.pop());
                    double z = 0;
                    switch (data) {
                        case "$":
                            z = Math.sqrt(x);
                            break;
                        case "%":
                            z = Math.cos(x);
                            break;
                        case "#":
                            z = Math.sin(x);
                            break;
                        case "&":
                            z = Math.tan(x);
                            break;
                        case "!":
                            if (x - (int)x != 0)
                                throw new InvalidFormulaException("Error de sintaxis");
                            z = factorial((int)x);
                    }
                    stack.push(z + "");
                } else {
                    if (Character.isLetter(data.charAt(0))) {
                        for (int i = 0; i < variables.length; i++) {
                            if (variables[i][0].equals(data)) {
                                data = variables[i][1];
                                break;
                            }
                        }
                    }
                    stack.push(data);
                }
            } catch (EmptyQueueException ex) {
            } catch (EmptyStackException ex) {
                throw new InvalidFormulaException("Error de sintaxis");
            }
        }
        if (stack.size() == 1)
            return Double.parseDouble(stack.pop());
        throw new InvalidFormulaException("Error de sintaxis");
    }
    
    public static int factorial(int num) {
        int result = 1;
        while (num > 0) {
            result *= num;
            num--;
        }
        return result;
    }
}
