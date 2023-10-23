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
public class Latihan4 extends JFrame {
    private boolean checkBoxSelected;  // Properti checkBoxSlected untuk menyimpan nilai apakah checkBox dicentang atau tidak
    
    public Latihan4() {
        this.checkBoxSelected = false; // Mengatur nilai awal checkBoxSelected menjadi false
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Method untuk menutup frame ketika tombol X ditekan
        
        // Instansiasi objek JLabel untuk Header dengan nama labelNama yang diberikan nilai "Form Biodata:" dan diletakan pada posisi tengah
        JLabel labelHeader = new JLabel("Form Biodata", JLabel.CENTER);
        // Mengatur posisi, lebar dan tinggi objek
        labelHeader.setBounds(0, 20, 350, 10);
        
        // Instansiasi objek JLabel dengan nama labelNama untuk inputan Nama
        JLabel labelNama = new JLabel("Nama: ");
        // Mengatur posisi, lebar dan tinggi objek
        labelNama.setBounds(15, 40, 350, 10);

        // Instansiasi objek JTextField dengan nama textFieldNama
        JTextField textFieldNama = new JTextField();
        // Mengatur posisi, lebar dan tinggi objek
        textFieldNama.setBounds(15, 60, 350, 30);

        // Instansiasi objek JLabel dengan nama labelTelepon untuk inputan Nomor Telepon
        JLabel labelTelepon = new JLabel("Nomor Telepon: ");
        // Mengatur posisi, lebar dan tinggi objek
        labelTelepon.setBounds(15, 100, 350, 10);

        // Instansiasi objek JTextField dengan nama textFieldTelepon
        JTextField textFieldTelepon = new JTextField();
        // Mengatur posisi, lebar dan tinggi objek
        textFieldTelepon.setBounds(15, 120, 350, 30);

        // Instansiasi objek JLabel dengan nama labelInput yang diberikan nilai "Jenis Kelamin:"
        JLabel labelRadio = new JLabel("Jenis Kelamin:");
        // Mengatur posisi, lebar dan tinggi objek
        labelRadio.setBounds(15, 160, 350, 10);

        // Instansiasi objek JRadioButton dengan nama radioButton1 dengan pesan "Laki-Laki"
        JRadioButton radioButton1 = new JRadioButton("Laki-Laki", true); //Nilai true berarti dicentang
        // Mengatur posisi, lebar dan tinggi objek
        radioButton1.setBounds(15, 180, 350, 30);

        // Instansiasi objek JRadioButton dengan nama radioButton1 dengan pesan "Perempuan"
        JRadioButton radioButton2 = new JRadioButton("Perempuan");
        // Mengatur posisi, lebar dan tinggi objek
        radioButton2.setBounds(15, 220, 350, 30);

        // Instansiasi objek ButtonGroup
        ButtonGroup bg = new ButtonGroup();
        //Menambahkan JRadioButton bernama radioButton1 ke dalam objek
        bg.add(radioButton1);
        //Menambahkan JRadioButton bernama radioButton2 ke dalam objek
        bg.add(radioButton2);
        
        // Instansiasi objek JCheckBox dengan nama checkBox dengan pesan "Warga Asing"
        JCheckBox checkBox = new JCheckBox("Warga Asing");
        // Mengatur posisi, lebar dan tinggi objek
        checkBox.setBounds(15, 260, 350, 30);

        // Instansiasi JButton dengan nama button yang diberikan nilai "Simpan"
        JButton button = new JButton("Simpan");
        // Mengatur posisi, lebar dan tinggi objek
        button.setBounds(15, 300, 100, 40);
        
        // Instansiasi  objek JTable dengan nama table
        JTable table = new JTable();
        // Instansiasi objek JScrollPane dengan nama scrollableTable yang diberikan ke objek table
        JScrollPane scrollableTable = new JScrollPane(table);
        // Mengatur posisi, lebar dan tinggi objek
        scrollableTable.setBounds(15, 350,350,200);
        
        // Instansiasi class LatihanMyTableModel dengan nama tableModel
        LatihanMyTableModel tableModel = new LatihanMyTableModel();
        // Mengatur model dari table dengan objek tableModel
        table.setModel(tableModel);

        // Menambahkan actionListener ke checkBox
        checkBox.addItemListener(new ItemListener() {
            // Method untuk menerima event
            public void itemStateChanged(ItemEvent e) {
                checkBoxSelected = e.getStateChange() == 1; //Checkbox bernilai true jika event e bernilai 1
            }
        });
        
        // Menambahkan actionListener ke button
        button.addActionListener(new ActionListener() {
            // Method untuk menerima event
            public void actionPerformed(ActionEvent e) {
                // Variable wna untuk menyimpan nilai checkBox "WNA"
                String wna = "";
                // Variable jenisKelamin untuk menyimpan nilai radioButton "Jenis Kelamin"
                String jenisKelamin = "";

                // Jika radioButton1 diklik
                if (radioButton1.isSelected()) {
                    jenisKelamin = radioButton1.getText(); // Maka jenisKelamin akan bernilai Laki-Laki
                    radioButton1.setSelected(false); //Mengambalikan radioButton ke kondisi semula
                }
                // Jika radioButton2 diklik
                if (radioButton2.isSelected()) {
                    jenisKelamin = radioButton2.getText(); // Maka jenisKelamin akan bernilai Perempuan
                    radioButton2.setSelected(false); //Mengambalikan radioButton ke kondisi semula
                }
                
                // Jika checkBoxSelected bernilai true
                if (checkBoxSelected) {
                    // String WNA: "Ya" dimasukan ke textarea (output)
                    wna = "Ya";
                }
                // Jika checkBoxSelected bernilai false,
                else {
                    // String WNA: "Bukan" dimasukan ke textarea (output)
                    wna = "Bukan";
                }

                // Variable nama untuk menyimpan nilai dari objek textFieldNama (nama)
                String nama = textFieldNama.getText();
                // Variable telepon untuk menyimpan nilai dari objek textFieldTelepon (telepon)
                String telepon = textFieldTelepon.getText();
                // Tambahkan variable nama, telepon, jenisKelamin, dan wna ke objek ArrayList dan dikirim lagi ke objek tableModel melalui method add
                tableModel.add(new ArrayList<>(Arrays.asList(nama, telepon, jenisKelamin, wna)));
                // Mengembalaikan isi textFieldNama ke kondisi semula (kosong)
                textFieldNama.setText("");
                // Mengembalaikan isi textFieldTelepon ke kondisi semula (kosong)
                textFieldTelepon.setText("");
            }
        });
        
        // Menambahkan objek-objek tersebut ke dalam Frame
        this.add(labelHeader);
        this.add(labelNama);
        this.add(textFieldNama);
        this.add(labelTelepon);
        this.add(textFieldTelepon);
        this.add(labelRadio);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(checkBox);
        this.add(button);
        this.add(scrollableTable);
        
        // Atur ukuran frame menjadi 400 x 600
        this.setSize(400, 600);
        // Atur layout frame menjadi null
        this.setLayout(null);
    }
    
    // Main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Instansiasi class objek Latihan4
                Latihan4 h = new Latihan4();
                //Menampilkan objek tersebut ke frame
                h.setVisible(true);
            }
        });
    }
}