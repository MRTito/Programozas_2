/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat08;

/**
 *
 * @author Robert
 */
public class Teszt {
   public static Katona megkuzd(Katona elso, Katona masodik) {
       Katona gyoztesKatona = null;
       
       if(( elso.getTamadoEro() - masodik.getVedoEro() ) > ( masodik.getTamadoEro() - elso.getVedoEro() ) || ( elso.getTamadoEro() - masodik.getVedoEro() ) == ( masodik.getTamadoEro() - elso.getVedoEro() ))
           gyoztesKatona = elso;
       else
           gyoztesKatona = masodik;
       
       return gyoztesKatona;
   }
   
    public static void main(String[] args) {
        Katona katona1 = new Nyilas(100, 5, 5);
        Katona katona2 = new Nyilas(90, 7, 3);
        Katona katona3 = new Landzsas(100, 2);
        
        Katona csata1 = megkuzd(katona1, katona2);
        Katona csata2 = megkuzd(csata1, katona3);
        
        System.out.println("A gyoztes:" + csata2);
    }
    
}
