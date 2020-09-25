/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat5;

/**
 * Ez az osztály a valós világbeli másodfokú egyenleteket kívánja modellezni.
 * Megadja az egyenlet dinszkriminánsát, gyökeit, és sztring reprerezentációját.
 * @author Robert
 */
public class QuadraticEquation {
    private double a;    
    private double b;    
    private double c;
    
    /**
     * Ez egy konstruktor, amely az a, b és c paraméterekkel egy másodfokú egyenletet hoz létre. 
     * @param a
     * @param b
     * @param c 
     */
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Az a adatmező lekérdező metódusa.
     * @return 
     */
    public double getA() {
        return a;
    }
    
    /**
     * A b adatmező lekérdező metódusa.
     * @return 
     */
    public double getB() {
        return b;
    }

    /**
     * A c adatmező lekérdező metódusa.
     * @return 
     */
    public double getC() {
        return c;
    }
    
    /**
     * A metódus vissza adja a másodfokú egyenlet diszkriminánsát.
     * @return - A másodfokú egyenlet diszkriminánsa: b^-4ac
     */
    public double getDiscriminant(){
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    
    /**
     * A metódus vissza adja a másodfokú egyenlet gyökét.
     * @return - A másodfokú egyenlet gyöke: (-b+sqrt(b^-4ac))/2a
     */
     public double getRoot1(){
         if(this.getDiscriminant() < 0)
             return 0;

        return (-this.b + (Math.sqrt(this.getDiscriminant()))) / (2 * this.a);
    }
   
    /**
     * A metódus vissza adja a másodfokú egyenlet gyökét.
     * @return - A másodfokú egyenlet gyöke: (-b-sqrt(b^-4ac))/2a
     * @return 
     */
    public double getRoot2(){
        if(this.getDiscriminant() < 0)
            return 0;

        return (-this.b - (Math.sqrt(this.getDiscriminant()))) / (2 * this.a);
    }
    
    /**
     * A metódus kiírja az italt a megadott módon.
     * @return 
     */
    @Override
    public String toString() {
        if(this.getDiscriminant() > 0)
            return "Első gyök: " + this.getRoot1() + ", Második gyök: " + this.getRoot2();
        else if(this.getDiscriminant() == 0)
            return "Közös gyök: " + this.getRoot1();
        else
            return "The equation has no roots.";
    } 
}
