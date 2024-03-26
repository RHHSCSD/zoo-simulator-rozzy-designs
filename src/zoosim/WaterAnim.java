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
    
    public WaterAnim(String name, String species, char sex, int age, int x, int y, int size, int speed, double direction, String sound, boolean canBreathe){
        super(name, species, sex, age, x, y, size, speed, direction, sound);
        this.canBreathe = canBreathe;
    }

    @Override
    public boolean canSurface() {
        if (canBreathe){
            return true;
        } else{
            return false;
        }
    }
    
}
