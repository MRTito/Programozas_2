/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat3;

/**
 *
 * @author Robert
 */
public class Tea implements Rendezheto<Tea>{
    public String nev;
    public int ar;

    public Tea(String nev, int ar) {
        this.nev = nev;
        this.ar = ar;
    }
    
    @Override
    public boolean egyenlo(Object o) {
        if(o == null || !(o instanceof Tea))
            return false;
        Tea t = (Tea) o;
        return this.ar == t.ar;
    }

    @Override
    public boolean nagyobbMint(Object o) {
         if(o == null || !(o instanceof Tea))
            return false;
        Tea t = (Tea) o;
        return this.ar > t.ar;
    }

    @Override
    public boolean kisebbMint(Object o) {
        if(o == null || !(o instanceof Tea))
            return false;
        Tea t = (Tea) o;
        return this.ar < t.ar;
    }
}
