/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Feladat11; //package-t kivenni Procont teszteléshez!!!

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class Hullamvasutak {
    private String nev;
    private String vilag;
    private int legkisebbMagassag;
    private int varakozasiIdo;

    public Hullamvasutak(String nev, String vilag, int legkisebbMagassag, int varakozasiIdo) {
        this.nev = nev;
        this.vilag = vilag;
        this.legkisebbMagassag = legkisebbMagassag;
        this.varakozasiIdo = varakozasiIdo;
    }

    public String getNev() {
        return nev;
    }

    public String getVilag() {
        return vilag;
    }

    public int getLegkisebbMagassag() {
        return legkisebbMagassag;
    }

    public int getVarakozasiIdo() {
        return varakozasiIdo;
    }

    @Override
    public String toString() {
        return this.getNev() + " (" + this.getVilag() + "): " + this.getVarakozasiIdo();
    }
    
    
    private static void rendez(Hullamvasutak[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].getVarakozasiIdo() == a[j].getVarakozasiIdo()) {
                    if (a[i].getLegkisebbMagassag() == a[j].getLegkisebbMagassag()) {
                        if (a[i].getNev().compareTo(a[j].getNev()) > 0) {
                            Hullamvasutak tmp = a[i];
                            a[i] = a[j];
                            a[j] = tmp;
                        }
                    }
                    else if(a[i].getLegkisebbMagassag() < a[j].getLegkisebbMagassag()) {
                        Hullamvasutak tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
                else if(a[i].getVarakozasiIdo() > a[j].getVarakozasiIdo()) {
                    Hullamvasutak tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;                
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Hullamvasutak[] array = new Hullamvasutak[n];
    String line = null;
    
    for(int i = 0; i < n; i++) {
        line = sc.nextLine();
        String[] tokens = line.split(";");
        
        array[i] = new Hullamvasutak(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
    }
    
    rendez(array);
    
    for (int i = 0; i < array.length; i++)
        System.out.println(array[i]);
    }
    
}