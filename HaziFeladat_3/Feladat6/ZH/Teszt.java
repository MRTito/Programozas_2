/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat6.ZH;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class Teszt {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String line = null;
        boolean sokatTanult = false;
        line = sc.nextLine();
        int n = Integer.parseInt(line);
        Hallgato [] array = new Hallgato[n];
        try {
            for(int i = 0; i < n; ++i) {
                line = sc.nextLine();
                String [] tokens = line.split(" ");

                if(tokens[1].equals("igaz"))
                    sokatTanult = true;
                else
                    sokatTanult = false;

                array[i] = new Hallgato(Integer.parseInt(tokens[0]), sokatTanult);
            }
            
            for(int i = 0; i < array.length; ++i) {
                boolean dolgozat1 = array[i].dolgozatotIr().megfelelt();
                boolean dolgozat2 = array[i].dolgozatotIr().megfelelt();
                
                if(dolgozat1 == true && dolgozat2 == true)
                    System.out.println("Megfelelt");
                else
                    System.out.println("Nem felet meg");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}