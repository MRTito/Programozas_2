/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat2;

/**
 * Ez az osztály egy n-oldalú szabályos sokszöget kíván modellezni.
 * Megadja az n-odalú sokszög kerületét, területét és sztring reprezentációját.
 * @author Robert
 */
public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;
    
    /**
     * Ez egy paraméter nélküli konstruktor amely a sokszög oldalainak számának, az oldal hosszának és a középpontjának x és y mezejének kezdőértéket állít be.
     */
    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Ez a konstruktor megadott oldalszámmal és oldalhosszal egy szabályos sokszöget hoz létre, amelynek középpontját (0,0) pontba helyezi.
     * @param n
     * @param side 
     */
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Ez a konstruktor megadott oldalszámmal, oldalhosszal, x- és y- koordinátákkal egy szabályos sokszöget hoz létre.
     * @param n
     * @param side
     * @param x
     * @param y 
     */
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    /**
     * Az n adatmező lekérdező metódusa.
     * @return n
     */
    public int getN() {
        return n;
    }
    
    /**
     * A side adatmező lekérdező metódusa.
     * @return side
     */
    public double getSide() {
        return side;
    }
    
    /**
     * Az x adatmező lekérdező metódusa.
     * @return x 
     */
    public double getX() {
        return x;
    }

    /**
     * Az y adatmező lekérdező metódusa.
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * Az n adatmező beállító metódusa.
     * @param n 
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * A side adatmező beállító metódusa.
     * @param side 
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Az x adatmező beállító metódusa.
     * @param x 
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Az y adatmező beállító metódusa.
     * @param y 
     */
    public void setY(double y) {
        this.y = y;
    }
    
    /**
     * A metódus vissza adja a sokszög kerületét.
     * @return - A sökszög kerületének kiszámítása: n*side
     */
    public double getPerimeter() {
        return (this.n * this.side);
    }
    
    /**
     * A metódus vissza adja a sokszög területét.
     * @return - A sökszög területének kiszámítása: (side^2*n)/4*szog
     */
    public double getArea() {
        double szog = 0;
        
        szog = (Math.cos(Math.toRadians(180 / this.n))) / (Math.sin(Math.toRadians(180 / this.n))) ;
        
        return (Math.pow(this.side, 2) * this.n / 4) * szog;         
    }
    
    /**
     * A metódus kiírja a sokszöget a megadott módon.
     * @return 
     */
    @Override
    public String toString() {
        return "RegularPolygon: " + /*"n=" + n + ", side=" + side + */",Perimeter: " + getPerimeter() + ", Area: " + getArea();
    }
}
