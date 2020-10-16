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
public class Landzsas extends Katona{

    public Landzsas() {
    }

    public Landzsas(int tamadoEro, int vedoEro) {
        super(tamadoEro, vedoEro);
    }

    @Override
    public String toString() {
        return "Landzsas: " + "TE: [" + this.getTamadoEro() + "], " + "VE: [" + this.getVedoEro() + "]";
    }
    
}