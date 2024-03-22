/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author rosie
 */
public class Animal implements IEntity{
    
    //properties
    private String id;
    private String name;
    private String species;
    private char sex;
    private int age; 
    private int x;
    private int y;
    private char size; //S-Small: M-Medium: L-Large
    private int speed; //varying speeds 0, 50, 100 (3 categories)
    private double direction;
    private int hunger; //(not hungry) 0-100 (very hungry)
    private int fatigue; //(not tired) 0-100 (very sleepy)
    private Image image;
    private String sound;
    
    @Override
    public void move() {
        double angleRad = Math.toRadians(direction);
        //calculate change in x and change in y
        int deltaX = (int)Math.round(Math.cos(angleRad) * speed); //finds adj (x)
        int deltaY = (int)Math.round(Math.sin(angleRad) * speed); //finds opp (y)
        x = x + deltaX;
        y = y + deltaY;
        //increase fatigue and hunger
        fatigue = fatigue + energy;
        hunger = hunger + energy;
        
        //print movement
        System.out.println("Moving with speed of " + speed + "\nX: " + x + "    Y: " + y);
   }

    @Override
    public void makeSound() {
        System.out.println("I'm an animal");
    }

    @Override
    public void eat() {
        System.out.println("Yummy");
        hunger = 0; 
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz");
        fatigue = 0; 
    }

    @Override
    public void turn(double degrees) {
        //turns clockwise by specified angle
        direction = (direction + degrees)%360;
    }

    @Override
    public void place(int newX, int newY) {
        
    }
    
}
