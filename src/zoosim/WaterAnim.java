/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author rosie
 */
public class WaterAnim extends Animal implements ISwimmable{
    boolean canBreathe;

    @Override
    public boolean canSurface() {
        if (canBreathe){
            return true;
        } else{
            return false;
        }
    }
    
}
