/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Feladat13;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class Masfel_millio_lepes implements Comparable<Masfel_millio_lepes>{
    private String nev;
    private int kekTura;
    private int helyiTura;

    public Masfel_millio_lepes(String nev, int kekTura, int helyiTura) {
        this.nev = nev;
        this.kekTura = kekTura;
        this.helyiTura = helyiTura;
    }

    public String getNev() {
        return nev;
    }

    public int getKekTura() {
        return kekTura;
    }

    public int getHelyiTura() {
        return helyiTura;
    }

    @Override
    public int compareTo(Masfel_millio_lepes o) {
        if(getKekTura() == o.getKekTura()) {
            if(getHelyiTura() == o.getHelyiTura()) {
                return getNev().compareTo(o.getNev());
            }
            return o.helyiTura - getHelyiTura();
        }
        return o.kekTura - getKekTura();
    }

    @Override
    public String toString() {
        return getNev();
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        line = sc.nextLine();
        int n = Integer.parseInt(line);
        Masfel_millio_lepes [] array = new Masfel_millio_lepes[n];
        
        for(int i = 0; i < n; ++i) {
            line = sc.nextLine();
            String [] tokens = line.split(";");
            String nev = tokens[0];
            String karakter = tokens[1];
            int kekTura = 0;
            int helyiTura = 0;
            for (int j = 0; j < karakter.length(); ++j) {
                if(karakter.charAt(j) == 'K')
                    kekTura++;
                if(karakter.charAt(j) == 'S' || karakter.charAt(j) == 'P' || karakter.charAt(j) == 'Z')
                    helyiTura++;
            }
            array[i] = new Masfel_millio_lepes(tokens[0], kekTura, helyiTura);
        }
        Arrays.sort(array);
        for(int i = 0; i < n; ++i) {
            System.out.println(array[i]);
        }
    }  
}
