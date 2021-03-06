/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Represents a symbol in a formula with a priority
 * 
 * @version
 * @author Jostin Castro
 */
public class FormulaData {
    
    public static final byte MAX_PRIORITY = 3;
    public static final byte MIDDLE_PRIORITY = 2;
    public static final byte LOW_PRIORITY = 1;
    public static final byte VALUE_PRIORITY = 0;
    public static final byte NO_PRIORITY = -1;
    
    private byte priority;
    private String data;

    /**
     * Constructor that sets that priority for the symbol based on its data
     * 
     * @param data a string representing a value or operand
     */
    public FormulaData(String data) {
        switch (data) {
        case "sqrt":
                this.data = "$";
                break;
            case "cos":
                this.data = "%";
                break;
            case "sen":
                this.data = "#";
                break;  
            case "tan":
                this.data = "&";
                break;
            default:
                this.data = data;
        }
        switch (this.data) {
            case "$":
            case "%":
            case "#":
            case "&":
            case "^":
            case "!":
                priority = MAX_PRIORITY;
                break;
            case "*":
            case "/":
                priority = MIDDLE_PRIORITY;
                break;
            case "+":
            case "-":
                priority = LOW_PRIORITY;
                break;
            case "{":
            case "}":
            case "[":
            case "]":
            case "(":
            case ")":
                priority = NO_PRIORITY;
                break;
            default:
                priority = VALUE_PRIORITY;
        }
    }
    
    public FormulaData(String data, byte priority) {
        this.data = data;
        this.priority = priority;
    }

    // Setters and getters
    
    public void setPriority(byte priority) {
        this.priority = priority;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public String getData() {
        return data;
    }

}
