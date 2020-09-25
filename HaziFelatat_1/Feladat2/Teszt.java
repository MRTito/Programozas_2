/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat2;

/**
 *
 * @author Robert
 */
public class Teszt {
    public static void main(String[] args) {
        RegularPolygon a = new RegularPolygon();
        RegularPolygon b = new RegularPolygon(6, 4);
        RegularPolygon c = new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
