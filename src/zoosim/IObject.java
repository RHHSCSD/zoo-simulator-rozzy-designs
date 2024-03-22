/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 *
 * @author rosie
 */
public interface IObject {
    
    
    //----------------------------------
    //Methods
    
    /**
     * Turns the object by a specified angle
     * @param int angle in degrees 
     * @return void
     */
    void turn(double degrees);
    
    /**
     * Places the object at a specified coordinate
     * @param x coordinate
     * @param y coordinate
     * @return void
     */
    void place(int x, int y);
}
