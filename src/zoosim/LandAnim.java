/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author rosie
 */
public class LandAnim extends Animal{
    private String habitatType;
    
    public LandAnim(String name, String species, char sex, int age, int x, int y, int size, int speed, double direction, String sound, String habitatType){
        super(name, species, sex, age, x, y, size, speed, direction, sound);
        this.habitatType = habitatType;
    }
    
    public void pet(){
        System.out.println("ahhhh!");
    }
    
    public void bathe(){
        System.out.println("Finally, I'm feeling clean");
    }
}
