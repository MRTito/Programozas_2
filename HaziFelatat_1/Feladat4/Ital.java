/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat4;

import java.util.Date;
import java.util.Objects;

/**
 * Ez az osztály egy italt modellez.
 * Megadja az ital nevét, kiszerelését, árát forintban és euroban, valamit a sztring reprerezentációját.
 * @author Robert
 */
public class Ital {
    protected String nev;
    protected String kiszereles;
    private static int ar;
    protected Date gyartasiDatum;
    
    /**
     * Ez egy konstruktor, amely megadott név és kiszerelés értékkel hoz létre egy italt.
     * @param nev
     * @param kiszereles 
     */
    public Ital(String nev, String kiszereles) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.gyartasiDatum = new Date();
        this.ar = 10;
    }
    
    /**
     * A nev adatmező lekérdező metódusa.
     * @return nev
     */
    public String getNev() {
        return nev;
    }

    /**
     * A kiszereles adatmező lekérdező metódusa.
     * @return kiszereles
     */
    public String getKiszereles() {
        return kiszereles;
    }

    /**
     * Az ar adatmező lekérdező metódusa.
     * @return ar
     */
    public static int getAr() {
        return ar;
    }

    /**
     * A gyártási dátum adatmező lekérdező metódusa.
     * @return gyartasiDatum
     */
    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    /**
     * A metódus kiírja az italt a megadott módon.
     * @return 
     */
    @Override
    public String toString() {
        return nev + "," + kiszereles + "," + ar + "Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    /**
     * A metódus akkor tekint egyenlőnek két italt, ha a nevük, kiszerelésük és áruk is megegyezik.
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        Ital tmp = (Ital) obj;
        
        return this.nev.equals(tmp.getNev()) && this.kiszereles.equals(tmp.getKiszereles()) &&  this.ar == tmp.ar;
    }
    
    /**
     * Ez egy statikus metódus, amely vissza adja az ital árát euroban.
     * @return 
     */
    public static double getArEuroban(){
        return (double)getAr() / 360;
    }
}
