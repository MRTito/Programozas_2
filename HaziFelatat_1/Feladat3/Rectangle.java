/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat3;

/**
 * Ez az osztály egy téglalapot reprezentál.
 * Megadja a téglalap kerületét, területét és sztring reprezentációját.
 * @author Robert
 */
public class Rectangle {
    public double width;
    public double height;
    
    /**
     * Ez egy paraméter nélküli konstruktor amely a téglalap szélességét és magasságát alapértelmezés szerinti 1-es értékre állítja be.
     */
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }
    
    /**
     * Ez egy konstruktor, amely megadott szélesség és magasság értékkel hoz létre egy téglalapot.
     * @param width
     * @param height 
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    /**
     * A  metódus vissza adja a téglalap területét.
     * @return - A téglalap területének kiszámítása: width*height
     */
    public double getArea() {
        return (this.width * this.height);
    }
    
    /**
     * A  metódus vissza adja a téglalap kerületét.
     * @return - A téglalap kerületének kiszámítása: 2*(width+height)
     */
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
    
    /**
     * A metódus kiírja a téglalapot a megadott módon.
     * @return 
     */
    @Override
    public String toString() {
        return "Rectangle: " + "width=" + width + ", height=" + height + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
