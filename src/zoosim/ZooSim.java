/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;
import java.util.Scanner;

/**
 *
 * @author Rosie Chai
 */

/**
 * How would you modify this structure to allow for 
 * predator/prey interactions and Carnivores/Omnivores/Herbivores?
 * 
 * I would add an instance variable that holds the diet of the animal (Carnivore/Omnivores/Herbivores)
 * When the animal is being fed, I would print out what type of food they're being fed based on their diet.
 * For predator/prey interactions, I would create two new interfaces (Prey and Predator) that could be implemented in animal classes
 * Eg. for a Lion object, this would be instantiated from a Lion class which implements a prey interface...
 * Though, this may be a bit inefficient, so another way could be to create instance variables for prey and predator
 * If the animal is a prey, then we would store its predator species, and vice versa
 * So whenever an animal eats, their prey could be printed out (ie. what they hunted for)
 * There could also be die() and hunt() methods which would remove the animal objects that are eaten
 */


public class ZooSim {

    /**
     * @param args the command line arguments
     */
    
    private static Animal[] animalList;
    private static ZooObject[] zooObjectList;
    
    public static void main(String[] args) {
        int totalAnimals = 5;
        int totalObjects = 3;
        //list of animals and zoo objects
        animalList = new Animal[totalAnimals];
        zooObjectList = new ZooObject[totalObjects];
        
        ZooObject zooObject1 = new ZooObject("rock", 0, 0, Animal.MEDIUM_SIZE, 0);
        ZooObject zooObject2 = new ZooObject("Tree", 5, 5, Animal.LARGE_SIZE, 90);
        ZooObject zooObject3 = new ZooObject("food", 90, 50, Animal.SMALL_SIZE, 50);
        zooObjectList[0] = zooObject1;
        zooObjectList[1] = zooObject2;
        zooObjectList[2] = zooObject3;
        
        
        //adding animals
        Image randomImage = new Image(10, 10);
        LandAnim cat = new LandAnim("johnny", "cat", 'F', 7, 2, 8, 50, 2, 50, "meow", randomImage, "desserts");
        addAnimal(cat);
        WaterAnim whale = new WaterAnim("cash", "whale", 'M', "baluga", randomImage, true);
        addAnimal(whale);
        BirdAnim eagle = new BirdAnim("julio", "eagle", 'F', 10, "Scree!", randomImage, true);
        addAnimal(eagle);
        
        displayStatistics();
        moveAnimals();
        moveAnimals();
        moveAnimals();
        moveAnimals();
        moveAnimals();
        feedHungryAnimals();
        makeAnimalsSleep();

        
    }
    
    /**
     * Adds an animal to the array of animal objects
     * @param newAnimal
     * @param animalList
     */
    public static void addAnimal(Animal newAnimal){
        boolean added = false;
        for (int i = 0; i < animalList.length && added == false; i++){
            if (animalList[i] == null){
                animalList[i] = newAnimal;
                added = true;
            }
        }
    }
    
    /**
     * Finds and feeds all the animals that are hungry
     * @param animalList
     */
    public static void feedHungryAnimals(){
        for(Animal animal: animalList){
            if (animal != null){
                if (animal.getHunger() >= 50){ //feed animals with hunger levels over 70 
                    animal.eat();
                } else{
                    System.out.println(animal.getName() + " isn't hungry.");
                    System.out.println("Hunger level: " + animal.getHunger() + "%");
                }
                System.out.println("----------------------");
            }
        }
    }
    
    /**
     * Puts tired animals to bed
     * @param animalList
     */
    public static void makeAnimalsSleep(){
        for (Animal animal: animalList){
            if (animal != null){
                if (animal.getFatigue() >= 50){
                    animal.sleep();
                } else{
                    System.out.println(animal.getName() + " isn't sleepy.");
                }
                System.out.println("----------------------");
            }
        }
    }
    
    /**
     * Print information for each animal
     */
    public static void displayStatistics(){
        System.out.println("Zoo Animal Statistics-------------------------");
        for (Animal animal: animalList){
            if (animal != null){
                System.out.println(animal);
                System.out.println("----------------------");
            }
        }
        
        System.out.println("Zoo Objects Statistics-------------------------");
        for (ZooObject zooObj: zooObjectList){
            System.out.println(zooObj);
            System.out.println("----------------------");
        }
        
    }
    
    /**
     * Move all the animals
     */
    public static void moveAnimals(){
        for (Animal animal: animalList){
            if (animal != null){
                if (animal instanceof BirdAnim){
                    ((BirdAnim)animal).fly();
                } else if (animal instanceof WaterAnim){
                    ((WaterAnim)animal).swim();
                } else if (animal instanceof LandAnim){
                    ((LandAnim)animal).crawl();
                }
                System.out.println("----------------------");
            }
        }
    }
    
}
