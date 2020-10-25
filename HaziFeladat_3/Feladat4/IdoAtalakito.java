/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat4;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Robert
 */
public class IdoAtalakito extends JFrame implements ActionListener{
    private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12;
    private JButton bt;
    private JPanel p1, p2, p3, p4;
    
    public IdoAtalakito(String title) throws HeadlessException {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.lb1 = new JLabel("nap");
        this.lb2 = new JLabel("óra");
        this.lb3 = new JLabel("perc");
        this.lb4 = new JLabel("másodperc");
        
        this.lb5 = new JLabel("nap");
        this.lb6 = new JLabel("óra");
        this.lb7 = new JLabel("perc");
        this.lb8 = new JLabel("másodperc");
        
        this.lb9 = new JLabel("nap");
        this.lb10 = new JLabel("óra");
        this.lb11 = new JLabel("perc");
        this.lb12 = new JLabel("másodperc");
        
        this.tf1 = new JTextField(5);
        this.tf2 = new JTextField(5);
        this.tf3 = new JTextField(5);
        this.tf4 = new JTextField(5);
        
        this.tf5 = new JTextField(5);
        this.tf6 = new JTextField(5);
        this.tf7 = new JTextField(5);
        this.tf8 = new JTextField(5);
        
        this.tf9 = new JTextField(5);
        this.tf10 = new JTextField(5);
        this.tf11 = new JTextField(5);
        this.tf12 = new JTextField(5);
        
        this.bt = new JButton("Szamol");
        this.bt.addActionListener(this);
        
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        this.p4 = new JPanel();
        
        GridLayout gr = new GridLayout(4, 1);
        setLayout(gr);
        GridLayout gr1 = new GridLayout(1, 4);
        p1.setLayout(gr1);
        GridLayout gr2 = new GridLayout(1, 4);
        p2.setLayout(gr2);
        GridLayout gr3 = new GridLayout(1, 4);
        p3.setLayout(gr3);
        GridLayout gr4 = new GridLayout(1, 4);
        p4.setLayout(gr4);
        
        p1.add(tf1);
        p1.add(lb1);
        p1.add(tf2);
        p1.add(lb2);
        p1.add(tf3);
        p1.add(lb3);
        p1.add(tf4);
        p1.add(lb4);
        
        p2.add(tf5);
        p2.add(lb5);
        p2.add(tf6);
        p2.add(lb6);
        p2.add(tf7);
        p2.add(lb7);
        p2.add(tf8);
        p2.add(lb8);
        
        p3.add(bt);
        
        p4.add(tf9);
        p4.add(lb9);
        p4.add(tf10);
        p4.add(lb10);
        p4.add(tf11);
        p4.add(lb11);
        p4.add(tf12);
        p4.add(lb12);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        
        pack();
    }

    public static void main(String[] args) {
        IdoAtalakito ia = new IdoAtalakito("IdoAtalakito");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.bt) {
            int nap = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf5.getText());
            int ora = Integer.parseInt(tf2.getText()) + Integer.parseInt(tf6.getText());
            int perc = Integer.parseInt(tf3.getText()) + Integer.parseInt(tf7.getText());
            int masodperc = Integer.parseInt(tf4.getText()) + Integer.parseInt(tf8.getText());
            
            if(masodperc >= 60) {
                perc++;
                masodperc -= 60;
            }
            if(perc >= 60) {
                ora++;
                perc -= 60;
            }
            if(ora >= 24) {
                nap++;
                ora -= 24;
            }
            
            tf9.setText(String.valueOf(nap));
            tf10.setText(String.valueOf(ora));
            tf11.setText(String.valueOf(perc));
            tf12.setText(String.valueOf(masodperc));
        }
    }
}