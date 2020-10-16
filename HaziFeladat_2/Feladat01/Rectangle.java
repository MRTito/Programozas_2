/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat01;

/**
 *
 * @author Robert
 */
public class Rectangle extends GeometricShape{
    private double height;  
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea() { //terület
        return this.getWidth() * this.getHeight();
    }
    
    public double getPerimeter() { //kerület
        return 2 * (this.getWidth() + this.getHeight());
    }
}
