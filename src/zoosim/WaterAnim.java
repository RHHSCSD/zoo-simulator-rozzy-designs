/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Rosie Chai
 */
public class WaterAnim extends Animal implements ISwimmable{
    boolean canBreathe;
    
    //----------------------------------------------------------------------------------------------------
    
    public WaterAnim(String name, String species, char sex, int age, int x, int y, int size, int speed, double direction, String sound, Image image, boolean canBreathe){
        super(name, species, sex, age, x, y, size, speed, direction, sound, image);
        this.canBreathe = canBreathe;
    }
    
    public WaterAnim(String name, String species, char sex, int age, String sound, Image image, boolean canBreathe){
        super(name, species, sex, age, sound, image);
        this.canBreathe = canBreathe;
    }
    
    public WaterAnim(String name, String species, char sex, String sound, Image image, boolean canBreathe){
        super(name, species, sex, sound, image);
        this.canBreathe = canBreathe;
    }
        
    //----------------------------------------------------------------------------------------------

    /**
     *
     * @return String representation of object
     */

    @Override
    public String toString(){
        return super.toString() + " | Can Breathe: " + canBreathe;
    }
    
    /**
     *
     * @return if the animal can survive out of the water
     */
    @Override
    public boolean canSurface() {
        return canBreathe;
    }
    
    /**
     * Moves the animal and
     * prints out swimming action
     */
    public void swim(){
        System.out.print(super.getName() + " is swimming ");
        super.move();
    }
    
    /**
     * Resurfaces the animal
     * so they are on land
     */
    public void resurface(){
        if (canSurface()){
            System.out.println(super.getName() + " is on fresh land.");
        }
    }
    
}
