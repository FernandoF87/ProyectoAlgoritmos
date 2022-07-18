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
    
    public static boolean checkString(String formula) {
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

}

