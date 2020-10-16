/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat04;

import java.util.Date;

/**
 *
 * @author Robert
 */
public class Teherauto extends Auto{
    private int maxSzallithatoTeher;

    public Teherauto(int maxSzallithatoTeher, String rendszam, int motorTeljesitmeny) {
        super(rendszam, motorTeljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return "\nTeherauto:{" + "maxSzallithatoTeher=" + maxSzallithatoTeher + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teherauto other = (Teherauto) obj;
        if (this.maxSzallithatoTeher != other.maxSzallithatoTeher) {
            return false;
        }
        return true;
    }
    
}