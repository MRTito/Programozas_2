/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat1;

import java.util.Arrays;

/**
 *
 * @author Robert
 */
public class Main {
    public static Aszu [] otPuttonyos(Bor [] bor) {
        int db = 0;
        for(int i = 0; i < bor.length; ++i) {
            if(bor[i] instanceof Aszu && bor[i].milyeSzolobolKeszult().equals("Aszú")) {
                Aszu tmp = (Aszu)bor[i];
                if(tmp.hanyPuttonyos() == 5)
                    db++;
            }
        }
        
        Aszu [] aszu = new Aszu[db];
        db = 0;
        
        for(int i = 0; i < bor.length; ++i) {
            if(bor[i] instanceof Aszu && bor[i].milyeSzolobolKeszult().equals("Aszú")) {
                Aszu tmp = (Aszu)bor[i];
                if(tmp.hanyPuttonyos() == 5) {
                    aszu[db] = tmp;
                    db++;
                }
            }
        }
        return aszu;
    }
    
    
    public static void main(String[] args) {
        Bor [] bor = new Bor[] {
            new Bor("Furmint", "Tokaj","édes", 10),
            new Bor("Hárslevelű", "Tokaj-Hegyalja", "félédes", 10),
            new Bor("Sárgamuskotály", "Tokaj Borvidék", "édes", 5),
            new Aszu(5, "Aszú", "Tokaj", "édes", 11),
            new Aszu(3, "Aszú", "Tokaj", "édes", 10),
            new Aszu(5, "Aszú", "Tokaj Borvidék", "édes", 11),
        };
        
        System.out.println(Arrays.toString(otPuttonyos(bor)));
    }
}
