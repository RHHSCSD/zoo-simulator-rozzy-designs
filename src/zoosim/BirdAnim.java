/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Rosie Chai
 */
public class BirdAnim extends Animal implements IFlyable {
    //instance variables
    private boolean canFly;
    private boolean flying;
    private boolean hasNest = false;

    //----------------------------------------------------------------------------------------------------
    
    public BirdAnim(String name, String species, char sex, int age, int x, int y, int size, int speed, double direction, String sound, Image image, boolean canFly) {
        super(name, species, sex, age, x, y, size, speed, direction, sound, image);
        this.canFly = canFly;
        randomNest();
    }

    public BirdAnim(String name, String species, char sex, int age, String sound, Image image, boolean canFly) {
        super(name, species, sex, age, sound, image);
        this.canFly = canFly;
        randomNest();
    }

    public BirdAnim(String name, String species, char sex, String sound, Image image, boolean canFly) {
        super(name, species, sex, sound, image);
        this.canFly = canFly;
        randomNest();
    }

    //----------------------------------------------------------------------------------------------

    /**
     * @return String representation of object and its properties
     */
    @Override
    public String toString(){
        return super.toString() + " | Can Fly: " + canFly;
    }
    
    /**
     * Flies the bird animal
     * If the animal can fly, it will fly
     * If the animal cannot fly, it will waddle
     */
    @Override
    public void fly() {
        if (canFly) {
            System.out.print(super.getName() + " is flying ");
            super.move();
            flying = true;
        } else {
            System.out.print(super.getName() + " is waddling ");
            super.move();
        }
    }

    /**
     * Lands the animal
     * if it is flying, or else
     * it prints out a failure message
     */
    @Override
    public void land() {
        if (isFlying()) {
            System.out.println("I've landed!");
            flying = false;
        } else {
            System.out.println("Landing unsuccessful, " + super.getName() + " is already on land");
        }
    }

    /**
     *
     * @return boolean value representing if the animal can fly
     */
    @Override
    public boolean isFlying() {
        return flying;
    }

    /**
     * Puts the animal to rest
     * if they have a nest, or else it will 
     * print out a failure message
     */
    @Override
    public void sleep() {
        if (hasNest) {
            super.sleep();
        } else {
            System.out.println("I don't have a nest to sleep in");
        }
    }

    /**
     * Builds a nest for the animal to sleep in
     */
    public void makeNest() {
        hasNest = true;
    }

    /**
     * Randomly determines if the animal 
     * is instantiated with a nest or not
     */
    public void randomNest() {
        int randNum = (int) (Math.random());
        if (randNum == 0) {
            makeNest();
        }
    }
}
