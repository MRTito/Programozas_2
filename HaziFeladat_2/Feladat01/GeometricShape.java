/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat01;

import java.util.Date;

/**
 *
 * @author Robert
 */
public class GeometricShape {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricShape() {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return this.getDateCreated().toString() + "\n" + "color: " + this.getColor() + " and filled: " + this.isFilled();
    }
    
    
}
