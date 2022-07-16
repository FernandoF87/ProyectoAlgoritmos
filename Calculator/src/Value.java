/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @version
 * @author Jostin Castro
 */
public class Value implements DataInterface {
    
    private String data;
    private int priority;
    
    public Value(String data, int priority) {
        this.data = data;
        this.priority = priority;
    }
    
    public Value() {
        
    }

    @Override
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    

}
