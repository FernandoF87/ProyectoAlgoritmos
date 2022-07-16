/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Jostin Castro
 */
public interface DataInterface {
    
    final int MAX_PRIORITY = 0;
    final int MIDDLE_PRIORITY = 1;
    final int LOW_PRIORITY = 2;
    final int VALUE_PRIORITY = 3;
    final int NO_PRIORITY = 4;
    
    int getPriority();
    
    String getData();
    
}
