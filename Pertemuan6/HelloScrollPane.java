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
public class HelloScrollPane extends JFrame{
    public HelloScrollPane() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Perintah untuk menutup frame ketika tombol X ditekan
        
        JLabel labelInput = new JLabel("Nama : "); ///Instansiasi objek JLabel untuk inputan nama
        labelInput.setBounds(130, 40, 100, 10); //Mengatur posisi, lebar dan tinggi objek
        
        JTextField textNama = new JTextField(); //Membuat/Instansiasi objek JTextField untuk  inputan nama
        textNama.setBounds(130, 60, 100, 30); //Mengatur posisi, lebar dan tinggi objek
        
        JButton button = new JButton("Klik"); //Membuat/Instansiasi objek JButton untuk tombol "Klik"
        button.setBounds(130, 100, 100, 40); //Mengatur posisi, lebar dan tinggi objek
        
        JTextArea txtOutput = new JTextArea(""); //Membuat/Instansiasi objek JTextArea untuk output
        JScrollPane scrollableTextArea = new JScrollPane(txtOutput); // Instansiasi JScrollPane dengan nama scrollableTextArea yang diberikan ke objek txtOutput
        scrollableTextArea.setBounds(130, 150, 100, 100); //Mengatur posisi, lebar dan tinggi objek
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  // Mengatur scrollableTextArea pada posisi horizontal dan selalu terlihat
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Mengatur scrollableTextArea pada posisi vertikal dan selalu terlihat
        
        button.addActionListener(new ActionListener() { // Menambahkan actionListener ke button
            public void actionPerformed(ActionEvent e) {  // Method untuk menerima event
                String nama = textNama.getText(); //Variable nama yang menyimpan nilai dari textNama
                txtOutput.append("Hello, " + nama +"\n");  // txtOutput menambahkan pesan "Hello" ditambah dengan variable nama
                textNama.setText(""); //Mengatur textNama menjadi kosong kembali
            }
        });
        
        //Menambahkan objek-objek tersebut ke dalam frame
        this.add(button);
        this.add(textNama);
        this.add(labelInput);
        this.add(scrollableTextArea);
        
        this.setSize(400, 500); //Mengatur ukuran frame
        this.setLayout(null);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloScrollPane h = new HelloScrollPane();
                h.setVisible(true);
            }
        });
    }
}
