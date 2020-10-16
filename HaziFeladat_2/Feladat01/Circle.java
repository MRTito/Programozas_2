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
public class Circle extends GeometricShape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() { //terület
        return Math.pow(this.getRadius(), 2) * Math.PI;
    }
    
    public double getPerimeter() { //kerület
        return 2 * this.getRadius() * Math.PI;
    }
    
    public double getDiameter() { //átmérő
        return 2 * this.getRadius();
    }
}
