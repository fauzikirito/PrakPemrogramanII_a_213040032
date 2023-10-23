/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Shinichi
 */
public class HelloMessageDialog extends JFrame {
    //Public Class HelloMessageDialog
    public HelloMessageDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Perintah untuk menutup JavaGUI ketikatombol X ditekan
        this.setLayout(new FlowLayout()); // Method untuk mengatur layout menjadi FlowLayout
        
        JButton button = new JButton("KLIK"); //Membuat objek/instansiasi objek dengan String "KLIK"
        button.setBounds(130, 100, 100, 40); //Mengatur posisi, serta lebar dan tingginya
        
        button.addActionListener(new ActionListener() { // Menambahkan actionListener ke button
           public void actionPerformed(ActionEvent e) { //Method untuk menerima event
               JOptionPane.showMessageDialog(HelloMessageDialog.this, "Hello Nigga!"); // Menampilkan messageDialog dari JOptionPane
               
               //Message dialog untuk informasi
               // JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Hello, Welcome!", "showMessageDialog 2", JOptionPane.ERROR_MESSAGE);
               
               // Message dialog untuk warning
               // JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II", "showMessageDialog 2", JOptionPane.WARNING_MESSAGE);
                
               // Message dialog untuk question
               // JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II", "showMessageDialog 2", JOptionPane.QUESTION_MESSAGE);
                
               // Message dialog untuk plain/biasa
               // JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II", "showMessageDialog 2", JOptionPane.PLAIN_MESSAGE);
           
           }  
        });
        
        this.add(button); // Menambah button ke frame
        this.setSize(200,200); // Mengatur ukuran frame dengan ukuran 200 x 200
    } 
    //Main
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { //Override method dari Runnable
                HelloMessageDialog h = new HelloMessageDialog(); // Instansiasi class HelloMessageDialog
                h.setVisible(true); //Menampilkan objektersebut ke frame
            }
        });
    }
}
