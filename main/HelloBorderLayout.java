/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Shinichi
 */

//Fauzi Ilyas Nuryadi
//213040302

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloBorderLayout extends JFrame {
    public HelloBorderLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Perintah untuk menutup JavaGUI ketika tombol X ditekan

        JLabel labelPertanyaan = new JLabel("Apakah ibukota Indonesia"); //Membuat objek labelPertanyaan
        JLabel labelHasil = new JLabel("Jawab pertanyaan di atas"); //Label hasil
        JButton buttonA = new JButton("Jakarta"); // Membuat button untuk jawaban Jakarta
        JButton buttonB = new JButton("Bandung"); // Membuat button untuk jawaban Bandung
        JButton buttonC = new JButton("Surabaya"); // Membuat button untuk jawaban Surabaya

        buttonA.addActionListener(new ActionListener() { //Menambahkan ActionListener terhadap buttonA (Jakarta)
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda benar");// Jika buttonA diklik, maka labelHasil akan menampilkan pesan benar
            }
        });

        buttonB.addActionListener(new ActionListener() { //Menambahkan ActionListener terhadap buttonB (Bandung)
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah"); // Jika buttonB diklik, maka labelHasil akan menampilkan pesan salah
            }
        });

        buttonC.addActionListener(new ActionListener() { //Menambahkan ActionListener terhadap buttonC (Surabaya)
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah"); // Jika buttonB diklik, maka labelHasil akan menampilkan pesan salah
            }
        });

        // menambahkan seluruh elemen ke dalam frame dengan posisi yang diberikan
        this.add(labelPertanyaan, BorderLayout.NORTH);
        this.add(labelHasil, BorderLayout.SOUTH);
        this.add(buttonA, BorderLayout.WEST);
        this.add(buttonB, BorderLayout.CENTER);
        this.add(buttonC, BorderLayout.EAST);

        //Mengatur ukuran frame
        this.setSize(400, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloBorderLayout h = new HelloBorderLayout(); //Instansiasi objek Java Class
                h.setVisible(true); //Menampilkan objek Class tersebut ke dalam Frame
            }
        });
    }
}
