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
public class Katona {
    private int tamadoEro;
    private int vedoEro;

    public Katona() {
        this.tamadoEro = 5;
        this.vedoEro = 5;
    }

    public Katona(int tamadoEro, int vedoEro) {
        this.tamadoEro = tamadoEro;
        this.vedoEro = vedoEro;
    }

    public int getTamadoEro() {
        return tamadoEro;
    }

    public int getVedoEro() {
        return vedoEro;
    }

    public void setTamadoEro(int tamadoEro) {
        this.tamadoEro = tamadoEro;
    }

    public void setVedoEro(int vedoEro) {
        this.vedoEro = vedoEro;
    }

    @Override
    public String toString() {
        return "TE: [" + tamadoEro + ", VE: [" + vedoEro + ']';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Katona))
            return false;
        Katona k = (Katona) obj;
        
        return k.getTamadoEro() == this.tamadoEro && k.getVedoEro() == this.vedoEro;
    }
        
}
