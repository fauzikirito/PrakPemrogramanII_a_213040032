/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
/**
 *
 * @author Shinichi
 */
public class HelloTable extends JFrame {
    public HelloTable() {
        // Perintah untuk menurup frame ketika tombol X ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Instansiasi JLabel dengan nama labelInput yang diberikan nilai "Nama:"
        JLabel labelInput = new JLabel("Nama:");
        // Mengatur poisi, lebar dan tinggi objek
        labelInput.setBounds(15, 40, 350, 10);
        
        // Instansiasi JTextField dengan nama textField
        JTextField textField = new JTextField();
        // Mengatur poisi, lebar dan tinggi objek
        textField.setBounds(15, 60, 350, 30);
        
        // Instansiasi JLabel dengan nama labelInput yang diberikan nilai "Jenis Member:"
        JLabel labelRadio = new JLabel("Jenis Member:");
        // Mengatur poisi, lebar dan tinggi objek
        labelRadio.setBounds(15, 100, 350, 10);

        // Instansiasi JRadioButton dengan nama radioButton1 dengan pesan "Silver" dan selected dengan nilai true
        JRadioButton radioButton1 = new JRadioButton("Silver", true);
        // Mengatur poisi, lebar dan tinggi objek
        radioButton1.setBounds(15, 115, 350, 30);

        // Instansiasi JRadioButton dengan nama radioButton2 dengan pesan "Gold"
        JRadioButton radioButton2 = new JRadioButton("Gold");
        // Mengatur poisi, lebar dan tinggi objek
        radioButton2.setBounds(15, 145, 350, 30);

        // Instansiasi JRadioButton dengan nama radioButton3 dengan pesan "Platinum"
        JRadioButton radioButton3 = new JRadioButton("Platinum");
        // Mengatur poisi, lebar dan tinggi objek
        radioButton3.setBounds(15, 175, 350, 30);

        // Instansiasi objek ButtonGroup
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);
        bg.add(radioButton3);

        // Instansiasi JButton dengan nama button yang diberikan nilai "Simpan"
        JButton button = new JButton("Simpan");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        button.setBounds(15, 205, 100, 40);
        
        // Instansiasi JTable dengan nama table
        JTable table = new JTable();
        // Instansiasi JScrollPane dengan nama scrollableTable yang diberikan ke objek table
        JScrollPane scrollableTable = new JScrollPane(table);
        // Atur ukuran panjang dan lebar serta posisi x dan y
        scrollableTable.setBounds(15,
                250,
                350,
                200);
        
        // Instansiasi MyTableModel dengan nama tableModel
        MyTableModel tableModel = new MyTableModel();
        // Atur model dari table dengan objek tableModel
        table.setModel(tableModel);

        // Menambahkan actionListener ke button
        button.addActionListener(new ActionListener() {
            // Method untuk menerima event
            public void actionPerformed(ActionEvent e) {
                // Variable jenisMember untuk menyimpan nilai radio button yang diklik (jenis member)
                String jenisMember = "";

                // Jika radioButton1 diklik
                if (radioButton1.isSelected()) {
                    // Berikan nilai radioButton1 ke jenisMember
                    jenisMember = radioButton1.getText();
                }
                // Jika radioButton2 diklik
                if (radioButton2.isSelected()) {
                    // Berikan nilai radioButton2 ke jenisMember
                    jenisMember = radioButton2.getText();
                }
                // Jika radioButton3 diklik
                if (radioButton3.isSelected()) {
                    // Berikan nilai radioButton3 ke jenisMember
                    jenisMember = radioButton3.getText();
                }

                // Variable nama untuk menyimpan nilai dari objek textField (nama)
                String nama = textField.getText();
                // Tambahkan variable nama dan jenisMember ke objek ArrayList dan dikirim lagi ke objek tableModel melalui method add
                tableModel.add(new ArrayList<>(Arrays.asList(nama, jenisMember)));
                
            }
        });

        //Menambahkan objek-objek tersebut ke dalam Frame
        this.add(labelInput);
        this.add(textField);
        this.add(labelRadio);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(button);
        this.add(scrollableTable);
        
        this.setSize(400, 500); // Mengatur ukuran frame
        this.setLayout(null); //Mengatur layout frame menjadi null
    }
    
    // Main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Instansiasi class objek HelloTable
                HelloTable h = new HelloTable();
                //Menampilkan objek tersebut ke dalam frame
                h.setVisible(true);
            }
        });
    }
}
