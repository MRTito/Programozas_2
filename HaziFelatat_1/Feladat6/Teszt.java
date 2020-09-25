/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat6;

/**
 *
 * @author Robert
 */
public class Teszt {
    public static void main(String[] args) {
        LinearEquation obj1 = new LinearEquation(1,2,3,4,5,6);
        LinearEquation obj2 = new LinearEquation(7,5,1,2,3,6);
        LinearEquation obj3 = new LinearEquation(1,2,3,6,5,4);        
        
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);        
    }
}
