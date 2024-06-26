/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Rosie Chai
 */
public class ZooObject implements IObject{
    private String type;
    private int x;
    private int y;
    private int size;
    private double direction;
    
    //----------------------------------------------------------------------------
    
    public ZooObject(String type, int x, int y, int size, double direction){
        this.type = type;
        this.x = x;
        this.y = y; 
        this.size = size;
        this.direction = direction;
    }
    
    //----------------------------------------------------------------------------

    /**
     * Turns the object by a certain number
     * @param degrees
     */
    
    @Override
    public void turn(double degrees){
        //turns clockwise by specified angle
        this.setDirection((this.direction + degrees) % 360);
    }
    
    /**
     * Places the object at specified coordinates
     * @param x
     * @param y
     */
    @Override
    public void place (int x, int y){
        setX(x);
        setY(y);
    }
    
    /**
     *
     * @return String representation of zoo object
     */
    @Override
    public String toString(){
        return type + " Properties - " + "Point: (" + x + ", " + y + ") | Size: " + size +  " | Direction: " + direction;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
    
}
