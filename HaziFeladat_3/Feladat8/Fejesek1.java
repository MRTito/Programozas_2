/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Feladat8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class Fejesek1 implements Comparable<Fejesek1>{
    private String nev;
    private int osszgol;
    private int szabadrugas;
    private int bunteto;
    private int akciogol;
    private double fejesgol;

    public Fejesek1(String nev, int osszgol, int szabadrugas, int bunteto, int akciogol, double fejesgol) {
        this.nev = nev;
        this.osszgol = osszgol;
        this.szabadrugas = szabadrugas;
        this.bunteto = bunteto;
        this.akciogol = akciogol;
        this.fejesgol = fejesgol;
    }

    public String getNev() {
        return nev;
    }

    public int getOsszgol() {
        return osszgol;
    }

    public int getSzabadrugas() {
        return szabadrugas;
    }

    public int getBunteto() {
        return bunteto;
    }

    public int getAkciogol() {
        return akciogol;
    }

    public double getFejesgol() {
        return fejesgol;
    }
    
    @Override
    public String toString() {
        return nev + ": " + (int)fejesgol;
    }

    @Override
    public int compareTo(Fejesek1 o) {
        if(this.getFejesgol() == o.getFejesgol()) {
            if(this.getOsszgol() == o.getOsszgol()) {
                if(this.getBunteto() == o.getBunteto()) {
                    return this.getNev().compareTo(o.getNev());
                }
                return this.getBunteto() - o.getBunteto();
            }
            return o.getOsszgol() - this.getOsszgol();
        }
        return Double.compare(o.getFejesgol(), this.getFejesgol());
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        line = sc.nextLine();
        int n = Integer.parseInt(line);
        Fejesek1 [] array = new Fejesek1[n];
        
        for(int i = 0; i < n; ++i) {
            line = sc.nextLine();
            String [] tokens = line.split(";");
            array[i] = new Fejesek1(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), 0, 0);
            array[i].akciogol = array[i].getOsszgol() - array[i].getSzabadrugas() - array[i].getBunteto();
            array[i].fejesgol = (array[i].getAkciogol() * 0.2) + (array[i].getSzabadrugas() * 0.4);
        }
        Arrays.sort(array);
        
        for(int i = 0; i < n; ++i) {
            System.out.println(array[i]);
        }
    }   
}

