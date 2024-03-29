/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Rosie Chai
 */
public class LandAnim extends Animal{
    private String habitatType; //forests, desserts, rasslands, mountains, etc.
    
    //----------------------------------------------------------------------------------------------------
    
    public LandAnim(String name, String species, char sex, int age, int x, int y, int size, int speed, double direction, String sound, Image image, String habitatType){
        super(name, species, sex, age, x, y, size, speed, direction, sound, image);
        this.habitatType = habitatType;
    }
    
    public LandAnim(String name, String species, char sex, int age, String sound, Image image, String habitatType){
        super(name, species, sex, age, sound, image);
        this.habitatType = habitatType;
    }
    
    public LandAnim(String name, String species, char sex, String sound, Image image, String habitatType){
        super(name, species, sex, sound, image);
        this.habitatType = habitatType;
    }
    
    //-------------------------------------------------------------------------------------

    /**
     *
     * @return String representation of object and its attributes
     */
    
    @Override
    public String toString(){
        return super.toString() + " | Habitat: " + habitatType;
    }
    
    /**
     * Pets the animal
     */
    public void pet(){
        System.out.println("Petting " + super.getName());
    }
    
    /**
     * Bathes the animal
     */
    public void bathe(){
        System.out.println(super.getName() + " is being bathed");
    }
    
    /**
     * Puts the animal to rest
     */
    @Override
    public void sleep(){
        bathe(); //give the animal a bath before putting them to bed
        super.sleep();
        System.out.println(super.getName() + " is resting in " + habitatType);
    }
    
    /**
     * Moves the animal and
     * prints out crawling action
     */
    public void crawl(){
        System.out.print(super.getName() + " is crawling ");
        super.move();
    }
    
}
