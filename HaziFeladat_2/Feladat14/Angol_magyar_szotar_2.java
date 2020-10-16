/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Feladat14;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class Angol_magyar_szotar_2 implements Comparable<Angol_magyar_szotar_2>{
    public String angol_szo;
    public String magyar_szo;

    public Angol_magyar_szotar_2(String angol_szo, String magyar_szo) {
        this.angol_szo = angol_szo;
        this.magyar_szo = magyar_szo;
    }

    public String getAngol_szo() {
        return angol_szo;
    }

    public String getMagyar_szo() {
        return magyar_szo;
    }

    @Override
    public String toString() {
        return getAngol_szo() + ":" + getMagyar_szo();
    }

    @Override
    public int compareTo(Angol_magyar_szotar_2 o) {
        if(getAngol_szo().compareTo(o.getAngol_szo()) == 0) {
            return getMagyar_szo().compareTo(o.getMagyar_szo());
        }
        return getAngol_szo().compareTo(o.getAngol_szo());
   }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        line = sc.nextLine();
        int n = Integer.parseInt(line);
        Angol_magyar_szotar_2 [] array = new Angol_magyar_szotar_2[n];
        
        for(int i = 0; i < n; ++i) {
            line = sc.nextLine();
            String [] tokens = line.split(":");
            array[i] = new Angol_magyar_szotar_2(tokens[0], tokens[1]);
        }
        Arrays.sort(array);
        
        for(int i = 0; i < n; ++i) {
            System.out.println(array[i]);
        }
    }

}