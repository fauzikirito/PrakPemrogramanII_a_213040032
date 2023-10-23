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
public class HelloConfirmDialog extends JFrame {
    public HelloConfirmDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Perintah untuk menutup JavaGUI ketikatombol X ditekan
        this.setLayout(new FlowLayout()); // Method untuk mengatur layout menjadi FlowLayout
        
        JButton button = new JButton("Keluar"); //Membuat objek/instansiasi objek dengan String "Keluar"
        button.setBounds(130,100,100,40); //Mengatur posisi, lebar dan tinggi objek
        
        button.addActionListener(new ActionListener() { //Menambahkan actionListener ke button
           public void actionPerformed(ActionEvent e) { // Method untuk menerima event
               //Variabel konfirmasi yang menyimpan confirm dialog 
               int confirmation = JOptionPane.showConfirmDialog(HelloConfirmDialog.this,"Yakin Dek?", 
                       "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
               if (confirmation == JOptionPane.YES_OPTION) { //Jika Confirmation Option bernilai "Yes"
                   System.exit(0); //Maka frame konfirmasi ditutup
               } else { //Jika tidak,
                   JOptionPane.showMessageDialog(HelloConfirmDialog.this, "Anda menekan tombol NO"); //Menampilkan MessageDialog "Anda menekan tombol NO"
               }
           } 
        });
        
        this.add(button); //Menambahkan button ke dalam frame
        this.setSize(200,200); //Mengatur ukuran frame
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloConfirmDialog h = new HelloConfirmDialog(); //Instansiasi class objek HelloConfirmDialog
                h.setVisible(true); //Menampilkan objek tersebut ke frame
            }
        });
    }
}
