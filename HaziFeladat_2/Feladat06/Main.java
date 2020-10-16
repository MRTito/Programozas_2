/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat06;

/**
 *
 * @author Robert
 */
public class Main {
    public static boolean isConsecutiveFour(int[] values) {
        int counter = 0;
        
        if(values.length < 4)
            return false;
        
        for(int i = 0; i < values.length; ++i) {
            for(int j = 0; j < values.length; ++j) {
                if(values[i] == values[j]) {
                    counter++; 
                    if(counter == 4)
                        return true;
                }
                else
                    counter = 0;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3};
        int [] array2 = {1, 2, 2, 2, 2, 3, 4, 5};
        int [] array3 = {1, 2, 3, 4, 5};
        int [] array4 = {1, 1, 1, 1, 1};
        
        System.out.println(isConsecutiveFour(array1));
        System.out.println(isConsecutiveFour(array2));
        System.out.println(isConsecutiveFour(array3));
        System.out.println(isConsecutiveFour(array4));
    }
}
