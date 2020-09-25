/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat1;

/**
 *Ez az osztály egy kétdimenziós pont modellezére szolgál.
 * @author Robert
 */
public class Pont {
    private double x;
    private double y;
    
    /**
     * Ez egy paraméter nélküli konstruktor amely a pont két koordinátájának kezdőértéket állít be.
     */
    public Pont() {
        this.x = 0;
        this.y = 0;
    }
    /**
     * A Pont megkonstruálására szolgáló konstruktor, amivel be tudjuk állítani létrehozáskor a két koordinátát.
     * @param x
     * @param y 
     */
    public Pont(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Az x koordináta lekérdező metódusa.
     * @return x
     */
    public double getX() {
        return x;
    }
    
    /**
     * Az y koordináta lekérdező metódusa.
     * @return y
     */
    public double getY() {
        return y;
    }
    
    /**
     * Az x koordináta beállító metódusa.
     * @param x 
     */
    public void setX(double x) {
        this.x = x;
    }
    
    
    /**
     * Az y koordináta beállító metódusa.
     * @param y 
     */
    public void setY(double y) {
        this.y = y;
    }
}
