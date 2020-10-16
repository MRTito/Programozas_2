/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat07;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class KoPapirOllo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        
        System.out.println("Ez egy ko-papir-ollo jatek! A jatek vegehez ird be a 'vege' szot!");
        while(true) {
            System.out.print("Valassz egy opciot: ");
            line = sc.nextLine();
            if(line.compareTo("vege") == 0)
                System.exit(0);
            
            if(!(line.equals("ko")) && !(line.equals("papir")) && !(line.equals("ollo")))
                line = sc.nextLine();

            int random = (int)(Math.random() * 3) + 0; // (Math.random() * intervallum[0;2] (0,1,2) ) + alsó)
            String pc = null;

            if(random == 0)
                pc = "ko";
            else if(random == 1)
                pc = "papir";
            else if(random == 2)
                pc = "ollo";

            System.out.println("A gep valasztasa: " + pc);
            
            if(line.equals("ko") && pc.equals("ko") || line.equals("papir") && pc.equals("papir") || line.equals("ollo") && pc.equals("ollo"))
                System.out.println("Dontetlen");
            
            if(line.equals("ko") && pc.equals("papir"))
                System.out.println("A gep nyert!");
            if(line.equals("ko") && pc.equals("ollo"))
                System.out.println("Nyertel!");
            
            if(line.equals("papir") && pc.equals("ollo"))
                System.out.println("A gep nyert!");
            if(line.equals("papir") && pc.equals("ko"))
                System.out.println("Nyertel!");
            
            if(line.equals("ollo") && pc.equals("ko"))
                System.out.println("A gep nyert!");
            if(line.equals("ollo") && pc.equals("papir"))
                System.out.println("Nyertel!");
        }
    }
}
