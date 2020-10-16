/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat08;

/**
 *
 * @author Robert
 */
public class Nyilas extends Katona{
    private int lotav;

    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    public Nyilas() {
    }

    public Nyilas(int lotav) {
        this.lotav = lotav;
    }

    public Nyilas(int lotav, int tamadoEro, int vedoEro) {
        super(tamadoEro + lotav, vedoEro);
        this.lotav = lotav;
    }

    @Override
    public String toString() {
        return "Nyilas: " + "TE: [" + this.getTamadoEro() + "], " + "VE: [" + this.getVedoEro() + "]";
    }
    
}
