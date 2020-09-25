/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat6;

/**
 * Ez az osztály egy 2x2-es lieáris egyenletredszert reprezentál.
 * @author Robert
 */
public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    
    /**
     * Ez egy kontruktor, amely az a, b, c, d, e és f paraméterekkel egy 2x2-es lieáris egyenletredszert hoz létre.
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f 
     */
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    /**
     * Az a adatmező lekérdező metódusa.
     * @return a
     */
    public double getA() {
        return a;
    }

    /**
     * A b adatmező lekérdező metódusa.
     * @return b
     */
    public double getB() {
        return b;
    }

    /**
     * A c adatmező lekérdező metódusa.
     * @return c
     */
    public double getC() {
        return c;
    }

    /**
     * A d adatmező lekérdező metódusa.
     * @return d 
     */
    public double getD() {
        return d;
    }

    /**
     * Az e adatmező lekérdező metódusa.
     * @return e
     */
    public double getE() {
        return e;
    }

    /**
     * Az f adatmező lekérdező metódusa.
     * @return f 
     */
    public double getF() {
        return f;
    }
    
    /**
     * A metódus egy igaz értéket ad vissza, ha ad-bc nem 0.
     * @return (a*b)-(b*c)!=0 
     */
    public boolean isSolvable() {        
        if(((this.getA() * this.getD()) - (this.getB() * this.getC())) == 0)
            return false;
        
        return true;
    }
    
    /**
     * A metódus az egyenletrendszer x megoldását adja vissza.
     * @return x=(ed-bf)/(ad-bc)
     */
    public double getX() { 
        return ((this.getE() * this.getD()) - (this.getB() * this.getF())) / ((this.getA() * this.getD()) - (this.getB() * this.getC()));
    }
    
    /**
     * A metódus az egyenletrendszer y megoldását adja vissza.
     * @return y=(af-ec)/(ad-bc)
     * @return 
     */
    public double getY() {
        return ((this.getA() * this.getF()) - (this.getE() * this.getC())) / ((this.getA() * this.getD()) - (this.getB() * this.getC()));
    }

    /**
     * A metódus kiírja az egyenletrendszer megoldását a megadott módon.
     * @return 
     */
    @Override
    public String toString() {
        if(isSolvable())
            return "X eredménye: " + getX() + ", Y eredménye: " + getY();
        else
            return "The equation has no solution.";
    }
}
