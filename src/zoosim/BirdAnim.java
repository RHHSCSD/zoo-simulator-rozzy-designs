/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author rosie
 */
public class BirdAnim extends Animal implements IFlyable{
    private boolean canFly;
    private boolean flying;
    
    public BirdAnim(String name, String species, char sex, int age, int x, int y, int size, int speed, double direction, String sound, boolean canFly){
        super(name, species, sex, age, x, y, size, speed, direction, sound);
        this.canFly = canFly;
    }
    
    @Override
    public void fly() {
        if (this.isCanFly()){
            System.out.println("I'm Flying");
            flying = true;
        } else{
            System.out.println("I can't fly");
        }
    }

    @Override
    public void land() {
        if (this.isFlying()){
            System.out.println("I've landed!");
            flying = false;
        } else{
            System.out.println("Landing unsuccessful, I have to be flying to land");
        }
    }

    @Override
    public boolean isFlying() {
        return flying;
    }

    /**
     * @return the canFly
     */
    public boolean isCanFly() {
        return canFly;
    }

    /**
     * @param canFly the canFly to set
     */
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
