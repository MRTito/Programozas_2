/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat7;

import java.util.Arrays;

/**
 * Ez az osztály tartalmaz 14 osztályszintű statikus metódust.
 * Tartalmazza a "main" statikus függvényt.
 * @author Robert
 */
public class Metodusok {
    
    /**
     * Ez az eljárás megkap paraméterként három egész számot, majd növekvő sorrendben írja ki őket.
     * @param elso
     * @param masodik
     * @param haramdik 
     */
    public static void rendez_1(int elso, int masodik, int haramdik){
        int [] tomb = new int[3];
        tomb[0] = elso;
        tomb[1] = masodik;
        tomb[2] = haramdik;
        
        Arrays.sort(tomb); //növekvő sorredbe állítja a számokat
        
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
            
    }
    
    /**
     * Ez az eljárás megkap paraméterként három valós számot, majd a három adott valós szám minimumát és abszolút értékeinek maximumát írja ki.
     * @param elso
     * @param masodik
     * @param harmadik 
     */
    public static void min_max_2(double elso, double masodik, double harmadik){
        double [] tomb = new double[3];
        tomb[0] = elso;
        tomb[1] = masodik;
        tomb[2] = harmadik;
        
        double minimum = Double.MAX_VALUE;
        double maximum = Double.MIN_VALUE;
        
        for (int i = 0; i < tomb.length; i++) {
            if(minimum > tomb[i]){
                minimum = tomb[i];
            }
            if(Math.abs(tomb[i]) > maximum){
                maximum = Math.abs(tomb[i]);
            }
        }
        System.out.println("Min.: " + minimum);
        System.out.println("Max.: " + maximum);        
    }
    /**
     * Ez az eljárás paraméterként megkap négy valós számot, majd a négy számot az adott sorrendben írja ki.
     * @param a
     * @param b
     * @param c
     * @param d 
     */
    public static void kiir_3(double a, double b, double c, double d){
        System.out.println("Eredeti: " + a + " " + b + " " + c + " " + d);
        
        if(d >= 0)
            System.out.println("Megoldas (d >= 0): " + a + " " + c + " " + b + " " + d);
        else
            System.out.println("Megoldas (d <= 0): " + a + " " + b + " " + d + " " + c);
    }
    
    /**
     * Ez a függvény paraméterként megkapja az a, b, c számokat és eldönti, hogy képezhetik-e ezek a számok egy háromszög oldalait.
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public static boolean haromszog_4(double a, double b, double c){
        if(a <= 0 || b <= 0 || c <= 0)
            return false;
        
        if(a + b <= c || a + c <= b || c + b <= a)
            return false;
        
        return true;
    }
    
    /**
     * Ez a függvény visszaadja, hogy hány szökőév volt/lesz két különböző évszám között.
     * @param a
     * @param b 
     */
    public static void szokoev_5(int a, int b){
        int count = 0;
        
        for (int i = a; i <= b; i++) {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
                count++;
        }        
        System.out.println("A szökőévek száma: " + count);
    }
    
    /**
     * Ez az eljárás paraméterként megkap egy dolgozatra adott jegyet, és kiírja a dolgozat szöveges értékelését az érdemjegy alapján.
     * @param a 
     */
    public static void jegy_6(int a){
        switch (a){
            case 1:
                System.out.println("Elégtelen");
                break;
            case 2:
                System.out.println("Elégséges");
                break;
            case 3:
                System.out.println("Közepes");
                break;
            case 4:
                System.out.println("Jó");
                break;
            case 5:
                System.out.println("Jeles");
                break;
        }
    }
    
    /**
     * Ez az eljárás kiszámolja két természetes szám hányadosát ismételt kivonásokkal.
     * @param a
     * @param b 
     */
    public static void hanyados_7(int a, int b){
        int hanyados = 0;
        
        while(a >= b){
            hanyados++;
            a = a - b;
        }
        System.out.println(hanyados);
    }
    
    /**
     * Ez a függvény megkap egy nullától különböző természetes számot és igaz értékkel tér vissza, ha a szám prím és hmais értékkel, ha a szám nem prím.
     * Ez a változat a prímszám definíciójából indul ki.
     * @param a
     * @return 
     */
    public static boolean  prim_8_1(int a){
        int osztok_szama = 0;
        
        for (int i = 1; i <= a; i++) {
            if(a % i == 0)
                osztok_szama++;
        }
        
        if(osztok_szama == 2 || a == 1)
            return true;
        else
            return false;
    }
    
    /**
     * Ez a függvény megkap egy nullától különböző természetes számot és igaz értékkel tér vissza, ha a szám prím és hmais értékkel, ha a szám nem prím.
     * Ez a második algoritmus változat.
     * @param a
     * @return 
     */
    public static boolean prim_8_2(int a){
        
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0)
                return false;
        }
        return true;
    }
    
    /**
     * Ez az eljárás legenerálja az első n Fibonacci-számot.
     * Ez az első algoritmus változat.
     * @param n 
     */
    public static void fibonacci_9_1(int n){
        int a = 0;
        int b = 1;
        int c;
        int k;
        
        if(n == 1)
            System.out.println(a);
        else{
            if(n == 2)
                System.out.println(a + " " + b);
            else{
                c = a + b;
                System.out.print(a + " " + b + " " + c);
                k = 3;
                
                while(k < n){
                    a = b;
                    b = c;
                    c = a + b;
                    
                    System.out.print(" " + c);
                    k++;
                }
                System.out.println("");
            }            
        }
    }
    
    /**
     * Ez az eljárás legenerálja az első n Fibonacci-számot.
     * Ez a második algoritmus változat.
     * @param n 
     */
    public static void fibonacci_9_2(int n){
        int a = 0;
        int b = 1;
        
        System.out.print(a);
        
        for (int i = 1; i < n; i++) {
            System.out.print(" " + b);
            b = a + b;
            a = b - a;
        }
        System.out.println("");
    }
    
    /**
     * Ez az eljárás a Horner-séma alapján lérehoz és kiír egy számot, amely az eredeti szám számjegyeit fordíott sorrendben tartalmazza.
     * @param n 
     */
    public static void horner_10(int n){
        
        if(n > 0 && n < 100000000){
            int uj_szam = 0;
        
            while(n != 0){
                uj_szam = uj_szam * 10 + (n % 10);
                n = n / 10;
            }
            System.out.println(uj_szam);
        }
        else{
            System.err.println("Hiba! Nem 0 > n < 100000000 kozotti szamot adtal meg!");
        }
    }
    
    /**
     * Ez a függvény paraméterként kap egy 0 és 12 közötti egész számot és visszaadja annak faktoriálisát.
     * @param a 
     */
    public static void faktorialis_11(int a){
        int szam;
        szam = 1;
        
        for (int i = a; i > 0; i--) {
            szam = szam * i;
        }
        
        System.out.println(szam);
    }
    
    /**
     * Ez az eljárás megtalálja és kiírja az összes k-val osztható számot, amelyek két adott szám között találhatók.
     * @param a
     * @param b
     * @param k 
     */
    public static void oszthato_12(int a, int b, int k){
        int count;
        count = 0;
        
        for (int i = a + 1; i < b; i++) {
            if(i % k == 0)
                count++;
        }
        System.out.println(count);
    } 
     /**
      * Ez a függvény megkeresi azt a legkisebb Fibonacci-számot, amely nagyobb mint egy adott n szám.
      * @param n 
      */
    public static void min_fibonacci_13(int n){
        int a, b;
        a = 1;
        b = 0;
        
        while(b <= n){
            b = a + b;
            a = b - a;
        }
        System.out.println(b);
    }
    
    /**
     * Ez az eljárás megkeresi azokat az 1000-nél kisebb számokat, amelyek egyenlők számjegyeik köbének összegével.
     */
    public static void kob_14(){  
        for(int i = 0; i < 1000; ++i) {
            int szam = i;
            int szazasok = szam / 100;
            szam -= szazasok * 100;
            int tizesek = szam / 10;
            int egyesek = szam;
            
            if((Math.pow(egyesek, 3) + Math.pow(tizesek, 3) + Math.pow(szazasok, 3)) == i)
                System.out.println(i + " ");
        }
    }
    
    public static void main(String[] args) {
        rendez_1(10, 1, -5);
        min_max_2(9.87654321, -6.78, 0.12345);
        kiir_3(1.23, -34.56, 1, -0.1234);
        System.out.println(haromszog_4(1, 1, 1));
        szokoev_5(1988, 2020);
        jegy_6(5);
        hanyados_7(18, 7);
        System.out.println(prim_8_1(2));
        System.out.println(prim_8_2(25));
        fibonacci_9_1(5);
        fibonacci_9_2(11);
        horner_10(4321);
        faktorialis_11(12);
        oszthato_12(1, 10, 2);
        min_fibonacci_13(10);
        kob_14();
    }
}
