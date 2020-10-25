
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Feladat7;

/**
 *
 * @author Robert
 */
public class Bankkartyaszam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        String [] bn = null;
        
        while(sc.hasNextLine()) { //nézi hogy van e még beolvasandó sor
            line = sc.nextLine();
            bn = line.split("");
            int tmp = 0;
            int tmp1 = 0;
            int oddSum = 0;
            
            if(line.isEmpty())
                System.exit(0);
            else {   
                for(int i = 0; i < line.length(); ++i) {
                    if(i % 2 == 0) {
                        if(Integer.valueOf(bn[i]) * 2 <= 9)
                            tmp += Integer.valueOf(bn[i]) * 2;
                        else
                            tmp1 += (Integer.valueOf(bn[i]) * 2) - 9;
                    }
                    else
                        oddSum += Integer.valueOf(bn[i]);
                }
            }
            int result = tmp + tmp1 + oddSum;
            
            if(result % 10 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}