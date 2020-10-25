/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat2;

import java.util.Arrays;

/**
 *
 * @author Robert
 */
public class Dolgozat {
    public static SzeszesItal [] italokAlkoholtartalma (SzeszesItal [] szi) {
    if(szi.length < 3)
        return null;
    
    SzeszesItal [] szeszesital = new SzeszesItal[3];
    
    for(int i = 0; i < szi.length; ++i) {
        for(int j = 0; j < szi.length; ++j) {
            if(szi[i].getAlkoholTartalom() > szi[j].getAlkoholTartalom()) {
                SzeszesItal tmp = szi[i];
                szi[i] = szi[j];
                szi[j] = tmp;
            }        
        }
    }
    szeszesital[0] = szi[0];
    szeszesital[1] = szi[1];
    szeszesital[2] = szi[2];
    
    return szeszesital;
    }
    
    
    public static void main(String[] args) {
        SzeszesItal [] szi = new SzeszesItal[] {
            new SzeszesItal(5, "sör", "0,5 l", 450),
            new SzeszesItal(10, "bor", "0,75 l", 1000),
            new SzeszesItal(10, "pezsgő", "0,75 l", 1000),
            new SzeszesItal(50, "pálinka", "0,3 l", 5000),
        };
        
        System.out.println(Arrays.toString(italokAlkoholtartalma(szi)));
    }
}
