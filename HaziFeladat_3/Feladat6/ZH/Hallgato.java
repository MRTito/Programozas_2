/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat6.ZH;

/**
 *
 * @author Robert
 */
public class Hallgato {
    private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    public int getMennyitKeszult() {
        return mennyitKeszult;
    }

    public boolean isSokatTanul() {
        return sokatTanul;
    }
    
    public Dolgozat dolgozatotIr() {
        int randomSzam = 0;
        
        if(this.sokatTanul == true && this.mennyitKeszult != -1){
            randomSzam = (int) (Math.random() * (7 - 4) + 4) * mennyitKeszult;
        }
        else if(this.sokatTanul == false && this.mennyitKeszult != -1){
            randomSzam = (int) (Math.random() * (5 - 0) + 0) * mennyitKeszult;
        }
        else if(this.mennyitKeszult == -1)
            randomSzam = -1;
        
        Dolgozat dolgozat = new Dolgozat(randomSzam);
        return dolgozat;
    }
}