/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat04;

import java.util.Arrays;

/**
 *
 * @author Robert
 */
public class Test {
    public static Teherauto [] rendezMaxSzallithatoTeherCsokkenoleg(Teherauto [] teher){
        int k = 0;
        
        for (int i = 0; i < teher.length; i++) {
            if(teher[i] instanceof Teherauto)
                k++;
        }
        Teherauto [] rendez = new Teherauto[k];
        k = 0;
        for (int i = 0; i < teher.length; i++) {
            if(teher[i] instanceof Teherauto){
                rendez[k] = teher[i];
                k++;
            }                
        }
        for (int i = 0; i < rendez.length; i++) {
            for (int j = i + 1; j < rendez.length; j++) {
                if(rendez[i].getMaxSzallithatoTeher() < rendez[j].getMaxSzallithatoTeher()){
                    Teherauto teh = rendez[i];
                    rendez[i] = rendez[j];
                    rendez[j] = teh;
                }
            }
        }        
        return rendez;
    }
    
    public static Auto keresMaxMotorTeljesitmeny(Auto [] auto){
        //talalat = new Auto("", Integer.MIN_VALUE);
      
        Auto tmp = null;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < auto.length; i++) {
            if(!(auto[i] instanceof Teherauto)){
                if(auto[i].getMotorTeljesitmeny() > max)
                     max = auto[i].getMotorTeljesitmeny();
                     tmp = auto[i];
            }
        }
        return tmp;
    }
    
    
    public static void main(String[] args) {
        Auto [] a = new Auto [] {
            new Auto("CAR-001", 90),
            new Auto("CAR-002", 110),
            new Auto("CAR-003", 131),
            new Auto("CAR-004", 90),
            new Auto("CAR-005", 131),
            
            new Teherauto(40, "ZIL-111", 97),
            new Teherauto(30, "ZIL-112", 109),
            new Teherauto(25, "ZIL-113", 129),
            new Teherauto(20, "ZIL-114", 150),
            new Teherauto(25, "ZIL-115", 170),   
        };
        Teherauto [] ta = new Teherauto [] {
            new Teherauto(40, "MAN-990", 250),
            new Teherauto(30, "MAN-991", 320),
            new Teherauto(25, "MAN-111", 420),
            new Teherauto(20, "MAN-111", 441),
            new Teherauto(25, "MAN-111", 460),
            new Teherauto(40, "MAN-111", 500),
            new Teherauto(30, "MAN-111", 320),
            new Teherauto(25, "MAN-111", 430),
            new Teherauto(20, "MAN-111", 480),
            new Teherauto(25, "MAN-111", 460),
        };
        Teherauto [] teherauto = rendezMaxSzallithatoTeherCsokkenoleg(ta); 
        System.out.println("A rendezett tömb csökkenő sorrendben: " + Arrays.toString(teherauto));
        
        Auto auto = keresMaxMotorTeljesitmeny(a);
        System.out.println("A legnagyobb teljesítményű autó: " + auto);
    }
}
