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
//213040032

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloGridLayout extends JFrame implements ActionListener {
    // Membuat seluruh button pada Frame
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;
    private JButton buttonE;
    private JButton buttonF;
    private JButton buttonG;
    private JButton buttonH;
    private JButton buttonI;

    // membuat array button untuk menyimpan button-button yang telah diklik
    private JButton[] buttons;
    // variabel sebagai flag apakah permainan diselesaikan atau tidak
    private boolean gameOver;

    public HelloGridLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Perintah untuk menutup JavaGUI ketikatombol X ditekan
        gameOver = false; // inisialisasi nilai false ke dalam variabel gameOver

        // Inisialisasi seluruh button dengan String kosong
        buttonA = new JButton("");
        buttonB = new JButton("");
        buttonC = new JButton("");
        buttonD = new JButton("");
        buttonE = new JButton("");
        buttonF = new JButton("");
        buttonG = new JButton("");
        buttonH = new JButton("");
        buttonI = new JButton("");

        // inisialisasi ukuran array sebesar 9
        buttons = new JButton[9];

        // Memasukkan seluruh button yang telah dibuat ke dalam array sesuai dengan indeks
        buttons[0] = buttonA;
        buttons[1] = buttonB;
        buttons[2] = buttonC;
        buttons[3] = buttonD;
        buttons[4] = buttonE;
        buttons[5] = buttonF;
        buttons[6] = buttonG;
        buttons[7] = buttonH;
        buttons[8] = buttonI;

        // Memberikan ActionListener ke semua button
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonG.addActionListener(this);
        buttonH.addActionListener(this);
        buttonI.addActionListener(this);

        // Mengatur layout frame dengan GridLayout 3 baris, 3 kolom
        this.setLayout(new GridLayout(3, 3));

        // Memasukkan semua button ke dalam frame
        this.add(buttonA);
        this.add(buttonB);
        this.add(buttonC);
        this.add(buttonD);
        this.add(buttonE);
        this.add(buttonF);
        this.add(buttonG);
        this.add(buttonH);
        this.add(buttonI);

        this.setSize(300, 300); //Mengatur ukuran frame
    }

    // Memodifikasi ActionListener dengan method actionPerformed
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) { // Jika permainan tidak berhenti,
            JButton button = (JButton) e.getSource(); // Konversi event e menjadi button

            if (button.getText().isEmpty()) { //Jika button yang ditekan berupa String kosong,
                button.setText("0"); // maka button tersebut diatur teks-nya menjadi 0
                checkWinner(); //Jalankan method checkWinner()

                if (!gameOver) {  // Jika permainannya belum berhenti,
                    for (int i = 0; i < buttons.length; i++) { //Iterasi seluruh elemen array buttons
                        if (buttons[i].getText().isEmpty()) { // Jika ditemukan button dengan String kosong,
                            buttons[i].setText("X"); // button tersebut akan diberikan String X
                            break; // Iterasi dipaksa berhenti
                        }
                    }
                    checkWinner(); //Method checkWinner() dijalankan kembali
                }
            }
        }
    }

    // Method checkWinner() untuk menentukan pemenang
    private void checkWinner() {
        // variabel string winner disiapkan dengan nilai awal String kosong
        String winner = "";

        if (!buttonA.getText().isEmpty() // Jika buttonA, buttonB, dan buttonC memiliki nilai,
                && buttonA.getText().equals(buttonB.getText())
                && buttonA.getText().equals(buttonC.getText())) {
            winner = buttonA.getText(); // Maka variabel winner diberikan nilai teks yang dimiliki buttonA

            // buttonA, buttonB, dan buttonC diatur warnanya menjadi warna merah
            buttonA.setForeground(Color.RED);
            buttonB.setForeground(Color.RED);
            buttonC.setForeground(Color.RED);
        }
        else if (!buttonD.getText().isEmpty() // Jika buttonD, buttonE, dan buttonF memiliki nilai,
                && buttonD.getText().equals(buttonE.getText())
                && buttonD.getText().equals(buttonF.getText())) {
            winner = buttonD.getText();// Maka variabel winner diberikan nilai teks yang dimiliki buttonD

            // buttonD, buttonE, dan buttonF diatur warnanya menjadi warna merah
            buttonD.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonF.setForeground(Color.RED);
        }
        else if (!buttonG.getText().isEmpty() // Jika buttonG, buttonH, dan buttonI memiliki nilai,
                && buttonG.getText().equals(buttonH.getText())
                && buttonG.getText().equals(buttonI.getText())) {
            winner = buttonG.getText(); // Maka variabel winner diberikan nilai teks yang dimiliki buttonG

            // buttonG, buttonH, dan buttonI diatur warnanya menjadi warna merah
            buttonG.setForeground(Color.RED);
            buttonH.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        }
        else if (!buttonA.getText().isEmpty() // Jika buttonA, buttonD, dan buttonG memiliki nilai,
                && buttonA.getText().equals(buttonD.getText())
                && buttonA.getText().equals(buttonG.getText())) {
            winner = buttonA.getText(); // Maka variabel winner diberikan nilai teks yang dimiliki buttonA

            // buttonA, buttonD, dan buttonG diatur warnanya menjadi warna merah
            buttonA.setForeground(Color.RED);
            buttonD.setForeground(Color.RED);
            buttonG.setForeground(Color.RED);
        }
        else if (!buttonB.getText().isEmpty() // Jika buttonB, buttonE, dan buttonH memiliki nilai,
                && buttonB.getText().equals(buttonE.getText())
                && buttonB.getText().equals(buttonH.getText())) {
            winner = buttonB.getText(); // Maka variabel winner diberikan nilai teks yang dimiliki buttonB

            // buttonB, buttonE, dan buttonH diatur warnanya menjadi warna merah
            buttonB.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonH.setForeground(Color.RED);
        }
        else if (!buttonC.getText().isEmpty() // Jika buttonC, buttonF, dan buttonI memiliki nilai,
                && buttonC.getText().equals(buttonF.getText())
                && buttonC.getText().equals(buttonI.getText())) {
            winner = buttonC.getText(); // Maka variabel winner diberikan nilai teks yang dimiliki buttonC

            // buttonC, buttonF, dan buttonI diatur warnanya menjadi warna merah
            buttonC.setForeground(Color.RED);
            buttonF.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        }
        else if (!buttonA.getText().isEmpty() // Jika buttonA, buttonE, dan buttonI memiliki nilai,
                && buttonA.getText().equals(buttonE.getText())
                && buttonA.getText().equals(buttonI.getText())) {
            winner = buttonA.getText(); // Maka variabel winner diberikan nilai teks yang dimiliki buttonA

            // buttonA, buttonE, dan buttonI diatur warnanya menjadi warna merah
            buttonA.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        }
        else if (!buttonC.getText().isEmpty() // Jika buttonC, buttonE, dan buttonG memiliki nilai,
                && buttonC.getText().equals(buttonE.getText())
                && buttonC.getText().equals(buttonG.getText())) {
            winner = buttonC.getText(); // Maka variabel winner diberikan nilai teks yang dimiliki buttonC

            // buttonC, buttonE, dan buttonG diatur warnanya menjadi warna merah
            buttonC.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonG.setForeground(Color.RED);
        }

        // nilai gameOver berdasarkan variabel winner apakah berisi nilai atau tidak
        gameOver = !winner.isEmpty();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloGridLayout h = new HelloGridLayout(); //Instansiasi objek Java Class
                h.setVisible(true); //Menampilkan objek Class tersebut ke dalam Frame
            }
        });
    }
}
