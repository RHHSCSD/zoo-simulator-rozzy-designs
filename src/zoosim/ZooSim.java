/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal[] animalList = new Animal[10];       

    }
    
    /**
     *
     * @param newAnimal
     * @param animalList
     */
    public static void addAnimal(Animal newAnimal, Animal[] animalList){
        boolean added = false;
        for (int i = 0; i < animalList.length && added == false; i++){
            if (animalList[i] == null){
                animalList[i] = newAnimal;
                added = true;
            }
        }
    }
    
    /**
     *
     * @param animalList
     */
    public static void feedHungryAnimals(Animal[] animalList){
        for(Animal animal: animalList){
            if (animal.getHunger() >= 70){ //feed animals with hunger levels over 70 
                animal.eat();
            }
        }
    }
    
    /**
     *
     * @param animalList
     */
    public static void makeAnimalsSleep(Animal[] animalList){
        for (Animal animal: animalList){
            if (animal.getFatigue() >= 70){
                animal.sleep();
            }
        }
    }
    
}
