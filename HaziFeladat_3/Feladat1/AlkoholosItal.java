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
public abstract class AlkoholosItal extends Ital{
    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String iz, double alkoholTartalom) {
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }
    
    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }
    public String milyenIzu() {
        return iz;
    }

    @Override
    public String toString() {
        return "AlkoholosItal{" + "iz=" + iz + ", alkoholTartalom=" + alkoholTartalom + '}';
    }
}
