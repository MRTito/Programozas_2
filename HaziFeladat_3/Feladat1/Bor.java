/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat1;

/**
 *
 * @author Robert
 */
public class Bor extends AlkoholosItal{
    private String szoloFajta;
    private String termoTerulet;

    public Bor(String szoloFajta, String termoTerulet, String iz, double alkoholTartalom) {
        super(iz, alkoholTartalom);
        this.szoloFajta = szoloFajta;
        this.termoTerulet = termoTerulet;
    }

    @Override
    public String mibolKeszult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String milyeSzolobolKeszult() {
        return szoloFajta;
    }
    
    public String holTermett() {
        return termoTerulet;
    }
}
