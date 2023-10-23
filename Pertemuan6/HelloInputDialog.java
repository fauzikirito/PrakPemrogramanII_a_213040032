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
public class HelloInputDialog extends JFrame {
    public HelloInputDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Perintah untuk menutup frame ketika tombol X ditekan
        this.setLayout(new FlowLayout()); // Method untuk mengatur layout menjadi FlowLayout
         
        JButton button = new JButton("Input"); // Instansiasi objek JButton dengan nama button yang diberi nilai string "Input"
        button.setBounds(130,100,100,400); //Mengatur posisi, panjang, dan lebar objek
        
        button.addActionListener(new ActionListener() {  // Menambahkan actionListener ke button
            public void actionPerformed(ActionEvent e) { // Method untuk menerima event
                // Variabel nama menyimpan nilai input dialog yang diberikan dengan pesan "Inputkan nama anda!"
                String nama = JOptionPane.showInputDialog(HelloInputDialog.this, "Inputkan nama anda!"); 
                // Menampilkan message dialog pada komponen frame ini dengan pesan "Hello, (variable nama) !"
                JOptionPane.showMessageDialog(HelloInputDialog.this, "Hello, " + nama);  
            }
        });
        
        this.add(button);  // Menambah button ke frame
        this.setSize(200, 200); // Mengatur ukuran frame
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloInputDialog h = new HelloInputDialog(); // Instansiasi class objek HelloInputDialog
                h.setVisible(true); //Objek tersebut ditampilkan ke frame
            }
        });
    }
}
