/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 *
 * @author Rosie Chai
 */
public interface IObject {
    
    
    //----------------------------------
    //Methods
    
    /**
     * Turns the object by a specified angle
     * @param degrees
     */
    void turn(double degrees);
    
    /**
     * Places the object at a specified coordinate
     * @param x coordinate
     * @param y coordinate
     */
    void place(int x, int y);
}
