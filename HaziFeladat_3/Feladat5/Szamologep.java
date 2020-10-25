/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat5;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Robert
 */
public class Szamologep extends JFrame implements ActionListener{
    private JPanel p1, p2, p3, p4, p5, p6;
    private JTextField tf1;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24;
    private JButton b25, b26, b27, b28;
    
    
    public Szamologep() throws HeadlessException {
        super("Szamologep");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.b1 = new JButton("");
        this.b2 = new JButton("Backspace");
        this.b2 = new JButton("<html><body><font color=#FF0000>Backspace</font></body></html>");
        this.b2.addActionListener(this);
        this.b3 = new JButton("CE");
        this.b3 = new JButton("<html><body><font color=#FF0000>CE</font></body></html>");
        this.b3.addActionListener(this);
        this.b4 = new JButton("C");
        this.b4 = new JButton("<html><body><font color=#FF0000>C</font></body></html>");
        this.b4.addActionListener(this);
        
        this.b5 = new JButton("MC");
        this.b5 = new JButton("<html><body><font color=#FF0000>MC</font></body></html>");
        this.b5.addActionListener(this);
        this.b6 = new JButton("7");
        this.b6.addActionListener(this);
        this.b7 = new JButton("8");
        this.b7.addActionListener(this);
        this.b8 = new JButton("9");
        this.b8.addActionListener(this);
        this.b9 = new JButton("/");
        this.b9 = new JButton("<html><body><font color=#FF0000>/</font></body></html>");
        this.b9.addActionListener(this);
        this.b10 = new JButton("sqrt");
        this.b10.addActionListener(this);
        
        this.b11 = new JButton("MR");
        this.b11 = new JButton("<html><body><font color=#FF0000>MR</font></body></html>");
        this.b11.addActionListener(this);
        this.b12 = new JButton("4");
        this.b12.addActionListener(this);
        this.b13 = new JButton("5");
        this.b13.addActionListener(this);
        this.b14 = new JButton("6");
        this.b14.addActionListener(this);
        this.b15 = new JButton("*");
        this.b15 = new JButton("<html><body><font color=#FF0000>*</font></body></html>");
        this.b15.addActionListener(this);
        this.b16 = new JButton("%");
        this.b16.addActionListener(this);
        
        this.b17 = new JButton("MS");
        this.b17 = new JButton("<html><body><font color=#FF0000>MS</font></body></html>");
        this.b17.addActionListener(this);
        this.b18 = new JButton("1");
        this.b18.addActionListener(this);
        this.b19 = new JButton("2");
        this.b19.addActionListener(this);
        this.b20 = new JButton("3");
        this.b20.addActionListener(this);
        this.b21 = new JButton("-");
        this.b21 = new JButton("<html><body><font color=#FF0000>-</font></body></html>");
        this.b21.addActionListener(this);
        this.b22 = new JButton("1/x");
        this.b22.addActionListener(this);
        
        this.b23 = new JButton("M+");
        this.b23 = new JButton("<html><body><font color=#FF0000>M+</font></body></html>");
        this.b23.addActionListener(this);
        this.b24 = new JButton("0");
        this.b24.addActionListener(this);
        this.b25 = new JButton("+/-");
        this.b25.addActionListener(this);
        this.b26 = new JButton(".");
        this.b26.addActionListener(this);
        this.b27 = new JButton("+");
        this.b27 = new JButton("<html><body><font color=#FF0000>+</font></body></html>");
        this.b27.addActionListener(this);
        this.b28 = new JButton("=");
        this.b28 = new JButton("<html><body><font color=#FF0000>=</font></body></html>");
        this.b28.addActionListener(this);
        
        this.tf1 = new JTextField(20);
        
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        this.p4 = new JPanel();
        this.p5 = new JPanel();
        this.p6 = new JPanel();
        
        GridLayout gr = new GridLayout(6, 1);
        setLayout(gr);
        GridLayout gr1 = new GridLayout(1, 6);
        p1.setLayout(gr1);
        GridLayout gr2 = new GridLayout(1, 6);
        p2.setLayout(gr2);
        GridLayout gr3 = new GridLayout(1, 6);
        p3.setLayout(gr3);
        GridLayout gr4 = new GridLayout(1, 6);
        p4.setLayout(gr4);
        GridLayout gr5 = new GridLayout(1, 6);
        p5.setLayout(gr5);
        GridLayout gr6 = new GridLayout(1, 6);
        p6.setLayout(gr6);
        
        p1.add(tf1);
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        
        p3.add(b5);
        p3.add(b6);
        p3.add(b7);
        p3.add(b8);
        p3.add(b9);
        p3.add(b10);
        
        p4.add(b11);
        p4.add(b12);
        p4.add(b13);
        p4.add(b14);
        p4.add(b15);
        p4.add(b16);
        
        p5.add(b17);
        p5.add(b18);
        p5.add(b19);
        p5.add(b20);
        p5.add(b21);
        p5.add(b22);
        
        p6.add(b23);
        p6.add(b24);
        p6.add(b25);
        p6.add(b26);
        p6.add(b27);
        p6.add(b28);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        
        pack();
    }
    
    public static void main(String[] args) {
        Szamologep szg = new Szamologep();
    }
    
    double [] array = new double[100];
    int n = 0;
    double finalNum = 0;
    String number;
    double d = 0;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b18)
            tf1.setText(tf1.getText() + "1");
        if(e.getSource() == b19)
            tf1.setText(tf1.getText() + "2");
        if(e.getSource() == b20)
            tf1.setText(tf1.getText() + "3");
        
        if(e.getSource() == b12)
            tf1.setText(tf1.getText() + "4");
        if(e.getSource() == b13)
            tf1.setText(tf1.getText() + "5");
        if(e.getSource() == b14)
            tf1.setText(tf1.getText() + "6");
        
        if(e.getSource() == b6)
            tf1.setText(tf1.getText() + "7");
        if(e.getSource() == b7)
            tf1.setText(tf1.getText() + "8");
        if(e.getSource() == b8)
            tf1.setText(tf1.getText() + "9");
        
        if(e.getSource() == b24)
            tf1.setText(tf1.getText() + "0");
        
        // 'Backspace'
        if (e.getSource() == b2) {
            tf1.setText("");
        }
        // 'CE'
        if (e.getSource() == b3) {
            tf1.setText("");
            n = 0;
            finalNum = 0;
            d = 0;
        }
        // 'C'
        if (e.getSource() == b4) {
            tf1.setText("");
            n = 0;
            finalNum = 0;
            number = null;
            d = 0;
        }

        // '+/-' - negatív számok írását teszi lehetővé.
        if (e.getSource() == b25) {
            if (tf1.getText().equals(""))
                tf1.setText("-");
        }  
        // '.' - tört számokhoz
        if (e.getSource() == b26) {
            tf1.setText(tf1.getText()+'.');
        }
        // '+'
        if (e.getSource() == b27) {
            number = tf1.getText();
            tf1.setText("");
            array[n++] = Double.parseDouble(number);
        }
        // '='
        if (e.getSource() == b28) {
            number = tf1.getText();
            array[n++] = Double.parseDouble(number);
            
            for (int i = 0; i < n; i++)
                finalNum += array[i];
            
            number = String.valueOf(finalNum);
            tf1.setText(number);
        }
    }   
}