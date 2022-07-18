/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @version
 * @author Jostin Castro
 */
public class Operator implements DataInterface {
    
    private int priority;
    private String data;

    public Operator(String data) {
        this.data = data;
        if (data.equals("+")|| data.equals("-"))
            priority = 1;
        else if (data.equals("*")|| data.equals("/"))
            priority = 2;
        else if (data.equals("$") || data.equals("%") || data.equals("#") || data.equals("&") || data.equals("!"))
            priority = 3;
        else
            priority = 0;
    }
    
    public Operator(String data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int getPriority() {
        return priority;
    }
    
    public String getData() {
        return data;
    }

}
