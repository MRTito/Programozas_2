/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Feladat12;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class IzzasztoFeladat {
    private String telepulesNev;
    private int homerseklet;

    public IzzasztoFeladat(String telepulesNev, int homerseklet) {
        this.telepulesNev = telepulesNev;
        this.homerseklet = homerseklet;
    }

    public String getTelepulesNev() {
        return telepulesNev;
    }

    public int getHomerseklet() {
        return homerseklet;
    }

    @Override
    public String toString() {
        return this.getTelepulesNev() + " (" + this.getHomerseklet() + ")";
    }    
    
    private static void rendez (IzzasztoFeladat[] tomb) {
        for(int i = 0; i < tomb.length - 1; ++i) {
            for(int j = i + 1; j <tomb.length; ++j) {
                if(tomb[i].getHomerseklet() == tomb[j].getHomerseklet()) {
                    if(tomb[i].getTelepulesNev().compareTo(tomb[j].getTelepulesNev()) > 0) {
                        IzzasztoFeladat tmp = tomb[i];
                        tomb[i] = tomb[j];
                        tomb[j] = tmp;
                    }
                }
                else if(tomb[i].getHomerseklet() < tomb[j].getHomerseklet()) {
                    IzzasztoFeladat tmp = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        
        line = sc.nextLine();
        String [] token = line.split(" ");
            
        int n = Integer.parseInt(token[0]);
        String word = token[1];
        IzzasztoFeladat[] array = new IzzasztoFeladat[n];
        
        for(int i = 0; i < n; ++i) {
            line = sc.nextLine();
            String [] tokens = line.split(":");
            array[i] = new IzzasztoFeladat(tokens[0], Integer.parseInt(tokens[1]));
        }
        
        boolean vanIlyenVaros = false;
        int varosHomerseklet = 0;
        
        for (int i = 0; i < array.length; i++) {
            //System.out.println("Eredmény:" + array[i]);
            if(array[i].telepulesNev.equals(word)) {
                vanIlyenVaros = true;
                varosHomerseklet = array[i].getHomerseklet();
            }
        }
        
        rendez(array);
        
        if(vanIlyenVaros == false)
            System.out.println("Missing data");
        else {
            for(int i = 0; i < array.length; ++i) {
                if(array[i].getHomerseklet() > varosHomerseklet)
                    System.out.println(array[i]);
            }
        }   
    }
}
