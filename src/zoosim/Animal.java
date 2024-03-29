/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Rosie Chai
 */
public abstract class Animal implements IEntity {

    //properties
    private String id;
    private String name;
    private String species;
    private char sex;
    private int age; //in years
    private int x;
    private int y;
    private int size; //10-Small: 20-Medium: 30-Large
    private int speed; //varying speeds 2, 5, 10 (3 categories)
    private double direction;
    private String sound;
    private Image image;
    private int hunger = 0; //(not hungry) 0-100 (very hungry)
    private int fatigue = 0; //(not tired) 0-100 (very sleepy)
    //constants
    private static final int ENERGY = 20;
    public static final int SMALL_SIZE = 10;
    public static final int MEDIUM_SIZE = 20;
    public static final int LARGE_SIZE = 30;
    public static final int SLOW_SPEED = 2;
    public static final int MEDIUM_SPEED = 5;
    public static final int FAST_SPEED = 10;
    //static var(s)
    private static int count = 0;

    //----------------------------------------------------------------------------------------------------
    public Animal(String name, String species, char sex, int age, int x, int y, int size, int speed, double direction, String sound, Image image) {
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        place(x, y);
        this.size = size;
        this.speed = speed;
        this.direction = direction;
        this.sound = sound;
        this.image = image;
        id = generateID();
    }

    public Animal(String name, String species, char sex, int age, String sound, Image image) {
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.sound = sound;
        this.image = image;
        place((int)(Math.random() * 100), (int)(Math.random() * 100));
        size = MEDIUM_SIZE;
        speed = MEDIUM_SPEED;
        direction = 0;
        id = generateID();
    }
    
    public Animal(String name, String species, char sex, String sound, Image image) {
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.sound = sound;
        this.image = image;
        age = (int) (Math.random() * 100);
        place((int)(Math.random() * 100), (int)(Math.random() * 100));
        size = MEDIUM_SIZE;
        speed = MEDIUM_SPEED;
        direction = 0;
        id = generateID();
    }

    //----------------------------------------------------------------------------------------------------
    /**
     * Generates a unique ID for each animal
     * First digit is the #of animals
     * and numbers following are a between 1000 to 9999
     * @return String of random generated ID
     */
    
    private static String generateID() {
        String randomID = String.valueOf(count) + String.valueOf((int) (Math.random() * (9999 - 1000) + 1000));
        count = count + 1;
        return randomID;
    }

    /**
     * @return string representation of animal object
     */
    @Override
    public String toString() {
        return "Name: " + name + " | Species: " + species + " | Sex: " + sex + " | ID: " + id + " | Age: " + age + " | Sound: " + sound + " | Hunger: " + hunger + " | Fatigue: " + fatigue + "\n"
                + "Position: " + "(" + x + ", " + y + ")" + " | Size: " + size + " | Speed: " + speed + " | Direction: " + direction;
    }

    /**
     * Moves the animal object using
     * its predetermined speed and direction
     */
    @Override
    public void move() {
        double angleRad = Math.toRadians(getDirection());
        //calculate change in x and change in y
        int deltaX = (int) Math.round(Math.cos(angleRad) * speed); //finds adj (x)
        int deltaY = (int) Math.round(Math.sin(angleRad) * speed); //finds opp (y)
        setX(x + deltaX);
        setY(y + deltaY);

        //increase fatigue and hunger
        setFatigue(fatigue + (ENERGY + speed)); //the faster the animal, the more energy they exert
        setHunger(hunger + (ENERGY + speed));

        //print movement
        System.out.println("at speed: " + speed + "\nPoint: (" + x + ", " + y + ")");
        makeSound();
    }

    /**
     * Makes a noise, specific to each animal
     */
    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    /**
     * Feeds the animal
     * and resets its hunger
     */
    @Override
    public void eat() {
        System.out.println(name + " is " + hunger + "% hungry.");
        System.out.println(name + " is eating... Yummy!!");
        setHunger(0);
    }

    /**
     * Makes the animal rest
     * and restores its fatigue
     */
    @Override
    public void sleep() {
        System.out.println(name + " is " + fatigue + "% sleepy.");
        System.out.println(name + " is sleeping... Zzzzz");
        setFatigue(0);
    }

    /**
     * Turns the animal a certain amount of degrees
     * @param degrees
     */
    @Override
    public void turn(double degrees) {
        //turns clockwise by specified angle
        setDirection((this.direction + degrees) % 360);
    }

    /**
     * Places the animal at specific coordinates
     * @param x
     * @param y
     */
    @Override
    public void place(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(name + " placed at: (" + this.x + ", " + this.y + ")");
    }

    //----------------------------------------------------------------------------------------------------
    
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
        if (hunger > 100) {
            this.hunger = (hunger - (hunger % 100)); //keep the value from 0-100%
        } else {
            this.hunger = hunger;
        }
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
       if (fatigue > 100) {
            this.fatigue = (fatigue - (fatigue % 100)); //keep below 100%
        } else {
            this.fatigue = fatigue;
        }    }

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
}
