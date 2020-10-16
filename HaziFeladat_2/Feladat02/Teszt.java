/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat02;

/**
 *
 * @author Robert
 */
public class Teszt {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1, "yellow", true);
        
        System.out.println(triangle.toString());
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The diameter is " + triangle.getPerimeter());
        System.out.println("color: " + triangle.getColor() + " and filled: " + triangle.isFilled());
    }
}
