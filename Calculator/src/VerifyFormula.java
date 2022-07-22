/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.EmptyStackException;

/**
 *
 * @version
 * @author Jostin Castro
 */
public class VerifyFormula {
    
    public static boolean isBalanced(String formula) {
        if (formula == null || formula.isBlank()) {
            return true;
        }
        Stack stack = new Stack();
        char[] array = formula.toCharArray();
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
            case '{':
            case '[':
            case '(':
                stack.push(Character.toString(array[i]));
                break;
            case ')':
                try {
                    if (!stack.peek().equals(Character.toString('('))) {
                        return false;
                    }
                } catch (EmptyStackException ex) {
                    return false;
                }
                stack.pop();
                break;
            case ']':
                try {
                    if (!stack.peek().equals(Character.toString('['))) {
                        return false;
                    }
                } catch (EmptyStackException ex) {
                    return false;
                }
                stack.pop();
                break;
            case '}':
                try {
                    if (!stack.peek().equals(Character.toString('{'))) {
                        return false;
                    }
                } catch (EmptyStackException ex) {
                    return false;
                }
                stack.pop();
                break;
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }
    
    public static boolean validateSyntax(Queue reversePolish) {
        Stack stack = new Stack();

        while (!reversePolish.empty()) {
            try {
                String data = reversePolish.dequeue();
                if (data.equals("+") || data.equals("-") || data.equals("*") || data.equals("/") || data.equals("^")) {
                    stack.push((stack.pop() + stack.pop()) + "");
                } else if (data.equals("$") || data.equals("%") || data.equals("&") || data.equals("#") || data.equals("!")) {
                    stack.push(stack.pop());
                } else {
                    stack.push("1");
                }
            } catch (EmptyQueueException ex) {
            } catch (EmptyStackException ex) {
                return false;
            }
        }
        if (stack.size() == 1)
            return true;
        return false;
    }
}

