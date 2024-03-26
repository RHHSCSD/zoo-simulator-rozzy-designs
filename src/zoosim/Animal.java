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
    private int size; //S-Small: M-Medium: L-Large
    private int speed; //varying speeds 2, 5, 10 (3 categories)
    private double direction;
    private String sound;
    private Image image;
    private int hunger = 0; //(not hungry) 0-100 (very hungry)
    private int fatigue = 0; //(not tired) 0-100 (very sleepy)
    private static final int ENERGY = 20;
    
    public Animal(String name, String species, char sex, int age, int x, int y, int size, int speed, double direction, String sound){
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;
        this.direction = direction;
        this.sound = sound;
    }
    
    
    @Override
    public void move() {
        double angleRad = Math.toRadians(getDirection());
        //calculate change in x and change in y
        int deltaX = (int)Math.round(Math.cos(angleRad) * this.speed); //finds adj (x)
        int deltaY = (int)Math.round(Math.sin(angleRad) * this.speed); //finds opp (y)
        setX(this.x+ deltaX);
        setY(this.y + deltaY);
        
        //increase fatigue and hunger
        setFatigue(this.fatigue + ENERGY);
        setHunger(this.hunger + ENERGY);
        
        //print movement
        System.out.println("Moving with speed of " + this.speed + "\nX: " + this.x + "    Y: " + this.y);
   }

    @Override 
    public void makeSound() {
        System.out.println(this.sound);
    }

    @Override
    public void eat() {
        System.out.println("Yummy");
        setHunger(0); 
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz");
        setFatigue(0); 
    }

    @Override
    public void turn(double degrees) {
        //turns clockwise by specified angle
        setDirection((this.direction + degrees) % 360);
    }

    @Override
    public void place(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Animal placed at: (" + this.x + ", " + this.y + ")");
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the direction
     */
    public double getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(double direction) {
        this.direction = direction;
    }

    /**
     * @return the hunger
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * @param hunger the hunger to set
     */
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    /**
     * @return the fatigue
     */
    public int getFatigue() {
        return fatigue;
    }

    /**
     * @param fatigue the fatigue to set
     */
    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }
    
}
