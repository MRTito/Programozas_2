/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat1;

/**
 *
 * @author Robert
 */
public class Main {
     public static void main(String[] args) {
        Pont p1 = new Pont();
        Pont p2 = new Pont(5, 7);
        Pont p3 = new Pont();
        Pont p4 = new Pont(10, 3);
        
        System.out.println("Eredeti:" + p1.getX() + " " + p1.getY());
        p1.setY(p1.getY() + 5);
        System.out.println("Modositott:" + p1.getX() + " " + p1.getY());
        System.out.println("");
        
        System.out.println("Eredeti:" + p2.getX() + " " + p2.getY());
        p2.setY(p2.getY() + 5);
        System.out.println("Modositott:" + p2.getX() + " " + p2.getY());
        System.out.println("");
        
        System.out.println("Eredeti:" + p3.getX() + " " + p3.getY());
        p3.setX(p3.getX() - 3.4);
        System.out.println("Modositott:" + p3.getX() + " " + p3.getY());
        System.out.println("");
        
        System.out.println("Eredeti:" + p4.getX() + " " + p4.getY());
        p4.setX(p4.getX() - 3.4);
        System.out.println("Modositott:" + p4.getX() + " " + p4.getY());
        System.out.println("");
        
    }
}
