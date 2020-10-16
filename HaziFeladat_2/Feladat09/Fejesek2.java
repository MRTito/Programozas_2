/*[]
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Feladat09;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class Fejesek2 {
    private String nev;
    private String elotte;

    public Fejesek2(String nev, String elotte) {
        this.nev = nev;
        this.elotte = elotte;
    }

    public String getNev() {
        return nev;
    }

    public String getElotte() {
        return elotte;
    }
    
    public static void main(String[] args) {
        int piros = 0;
        int kek = 0;
        Scanner sc = new Scanner(System.in);
        String line = null;
        
        line = sc.nextLine();
        String [] token = line.split(";");
        int lineNumber = Integer.parseInt(token[0]);
        String nev1 = token[1];
        String nev2 = token[2];
        Fejesek2 [] array = new Fejesek2[lineNumber - 1];
        
        for(int i = 0; i < lineNumber - 1; ++i) {
            line = sc.nextLine();
            String [] tokens = line.split(";");
            array[i] = new Fejesek2(tokens[0], tokens[1]);
        }
        
        int hanyadik = 0, szamlalo = 1;
        for (int i = 0; i < lineNumber; i++) {
            for (int j = 0; j < lineNumber - 1; j++) {
                if(nev1.equals(array[j].getElotte())){
                    if(nev2.equals(array[j].getNev()))
                        hanyadik = szamlalo;
                    nev1 = array[j].getNev();
                    szamlalo++;
                }
            }
        }
        
        if(hanyadik % 2 != 0){
            piros = (hanyadik + 1) / 2;
            kek = (hanyadik - 1) / 2;
            System.out.println(piros + " " + kek);
        }
        else{
            piros = hanyadik / 2;
            kek = hanyadik / 2;
            System.out.println(piros + " " + kek);
        }
        
    }
}