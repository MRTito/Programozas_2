/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat2;

import java.util.Objects;

/**
 *
 * @author Robert
 */
public class Ital  implements Comparable<Ital>{
    protected String nev;
    protected String kiszereles;
    protected int ar;

    public Ital(String nev, String kiszereles, int ar) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return this.nev +", "+ this.kiszereles +", "+ this.ar +" Ft";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Ital))
            return false;
        Ital t = (Ital) obj;
        
        return this.ar == t.ar && this.kiszereles.equals(t.kiszereles) && this.nev.equals(t.nev);
    }

    @Override
    public int compareTo(Ital o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
