/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Feladat10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class Budapest_kupa_1 implements Comparable<Budapest_kupa_1>{
    private int ev;
    private int honap;
    private int nap;
    private String turaNeve;
    private int tavolsag;

    public Budapest_kupa_1(int ev, int honap, int nap, String turaNeve, int resztav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.turaNeve = turaNeve;
        this.tavolsag = resztav;
    }

    public int getEv() {
        return ev;
    }

    public int getHonap() {
        return honap;
    }

    public int getNap() {
        return nap;
    }

    public String getTuraNeve() {
        return turaNeve;
    }

    public int getTavolsag() {
        return tavolsag;
    }

    
    @Override
    public int compareTo(Budapest_kupa_1 o) {
        if(this.getTavolsag() == o.getTavolsag()) {
            if(this.getEv() == o.getEv()) {
                if(this.getHonap() == o.getHonap()) {
                    if(this.getNap() == o.getNap()) {
                        return this.turaNeve.compareTo(o.getTuraNeve()); 
                    }
                    return this.getNap() - o.getNap();
                }
                return this.getHonap() - o.getHonap();
            }
            return this.getEv() - o.getEv();
        }
        return o.getTavolsag() - this.getTavolsag();
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        line = sc.nextLine();
        int n = Integer.parseInt(line);
        Budapest_kupa_1 [] array = new Budapest_kupa_1[n];
        int osszeg = 0;
        int max = Integer.MIN_VALUE;
        int db = 0;
        
        for(int i = 0; i < n; ++i) {
            line = sc.nextLine();
            String [] tokens = line.split(";");
            osszeg = 0;
            for(int j = 4; j < tokens.length; ++j) {
                osszeg += Integer.parseInt(tokens[j]);
            }
            array[i] = new Budapest_kupa_1(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), tokens[3], osszeg);
        }
        Arrays.sort(array);
        max = array[0].getTavolsag();
        
        for(int i = 0; i < n; ++i) {
            if(array[i].getTavolsag() == max){
                if(array[i].getHonap() < 10 && array[i].getNap() < 10)
                    System.out.println(array[i].getEv() +";0"+ array[i].getHonap() +";0"+ array[i].getNap() +";"+ array[i].getTuraNeve());
                if(array[i].getHonap() < 10 && array[i].getNap() >= 10)
                    System.out.println(array[i].getEv() +";0"+ array[i].getHonap() +";"+ array[i].getNap() +";"+ array[i].getTuraNeve());
                if(array[i].getHonap() >= 10 && array[i].getNap() < 10)
                    System.out.println(array[i].getEv() +";"+ array[i].getHonap() +";0"+ array[i].getNap() +";"+ array[i].getTuraNeve());
                if(array[i].getHonap() >= 10 && array[i].getNap() >= 10)
                    System.out.println(array[i].getEv() +";"+ array[i].getHonap() +";"+ array[i].getNap() +";"+ array[i].getTuraNeve());
            }
        }
    }
}