/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat03;

import java.util.Arrays;

/**
 *
 * @author Robert
 */
public class Teszt {
    private static Kocsma[] adottItaltKinaloKocsmak(String ital, VendeglatoipariEgyseg [] k) { 
        int db = 0;
        
        for(int i = 0; i < k.length; ++i) {
            if(k[i] instanceof Kocsma) {
                Kocsma tmp = (Kocsma)k[i];
                
                for(int j = 0; j < tmp.getSorlap().length; ++j) {
                    if(tmp.getSorlap()[j].equals(ital)) {
                        db++;
                        break;
                    }
                }
            }
        }
        Kocsma [] kocsma = new Kocsma[db];
        db = 0;
        
        for(int i = 0; i < k.length; ++i) {
            if(k[i] instanceof Kocsma) {
                Kocsma tmp = (Kocsma)k[i];
                
                for(int j = 0; j < tmp.getSorlap().length; ++j) {
                    if(tmp.getSorlap()[j].equals(ital)) {
                        kocsma[db++] = tmp;
                        break;
                    }
                }
            }
        }
        
        return kocsma;
    }
    
    public static void main(String[] args) {
        VendeglatoipariEgyseg [] ve = new VendeglatoipariEgyseg[] {
            new Kocsma(new String[] {"Soproni", "Dreher"}, "Kocsma", 35),
            new Kocsma(new String[] {"Kőbányai", "Stella"}, "Kocsma1", 40),
            new Kocsma(new String[] {"Borsodi"}, "Kocsma2", 20),
            new Kocsma(new String[] {"Amstel", "Gösser", "Zlaty Bazant", "Arany Ászok", "Dreher"}, "Kocsma3", 90),
            new Kocsma(new String[] {"Heineken", "Steffl", "Tuborg", "Dreher"}, "Kocsma4", 70),

            new Etterem(new String[] {"Tyúkhúsleves", "Bolognai spagetti", "Créme brulée"}, "Etterem", 70),
            new Etterem(new String[] {"Babgulyás", "Milánói spagetti", "Tiramisú"}, "Etterem1", 70),
            new Etterem(new String[] {"Gyümölcsleves", "Sushi", "Profiterol"}, "Etterem2", 50),
            new Etterem(new String[] {"Zöldborsó leves", "Kínai sülttészta", "Zuppa Inglese"}, "Etterem3", 50),
            new Etterem(new String[] {"Jókai bableves", "Gordon Bleu", "Cannoli"}, "Etterem4", 60),
        };
        
        System.out.println(Arrays.toString(adottItaltKinaloKocsmak("Dreher", ve)));
    }
}
