/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Shinichi
 */
public class Latihan3 extends JFrame {
    private boolean checkBoxSelected; //Menyiapkan variabel untuk CheckBox
    public Latihan3() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Perintah untuk menutup JavaGUI ketikatombol X ditekan
        
        //Membuat headerLabel bertuliskan "Form Biodata" dengan posisi di tengah
        JLabel headerLabel = new JLabel("Form Biodata", JLabel.CENTER);  
        
        JPanel controlPanel = new JPanel(); //Membuat objek controlPanel untuk menampung JPanel
        controlPanel.setLayout(new FlowLayout()); //controlPanel diatur menjadi FlowLayout
        
        JPanel panel = new JPanel(); //Membuat objek panel untuk menyimpan objek label, input, textfield, radiobutton dan checkbox
        panel.setSize(300, 300);  //Mengatur ukuran panel
        JPanel panel2 = new JPanel(); //Membuat objek panel2 untuk menyimpan objek button
        panel2.setSize(100,100); //Mengatur ukuran panel
        GridBagLayout layout = new GridBagLayout(); // Instansiasi objek GridBagLayout
        panel.setLayout(layout); //Mengatur panel dengan objek GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints(); // Instansiasi objek GridBagConstraints
        
        JLabel labelNama = new JLabel("Nama : ");
//        labelNama.setBounds(15,40,350,10);
        
        JLabel labelHp = new JLabel("Nomor HP : "); //Membuat objek input Nomor HP
//        labelHp.setBounds(15,100,350,10);
        
        JTextField textField = new JTextField(); //Membuat objek TextField untuk inputan Nama
        //textField.setBounds(15,60,350,30);
        
        JTextField textHp = new JTextField(); //Membuat objek TextField untuk inputan Nomor HP
        //textHp.setBounds(15,120,350,30);
        
        JLabel labelRadio = new JLabel("Jenis Member : "); //Membuat RadioButton yang tidak dipilih dan tanpa teks, memiliki 2 JRadioButton
        //labelRadio.setBounds(15, 140,350,10);
        
        JRadioButton radioButton1 = new JRadioButton("Laki-laki",true); //Bagian dari RadioButton ke-1  //Harus ada true maksudnya defaultnya yaitu Laki-laki
        //radioButton1.setBounds(15,165,350,15);
        
        JRadioButton radioButton2 = new JRadioButton("Perempuan"); //Bagian dari RadioButton ke-2
       // radioButton2.setBounds(15,195,350,15);
        
        ButtonGroup bg = new ButtonGroup(); //Membuat objek ButtonGroup
        bg.add(radioButton1); //Menambahkan JRadioButton bernama radioButton1
        bg.add(radioButton2); //Menambahkan JRadioButton bernama radioButton1
        
        JCheckBox checkBox = new JCheckBox("Warga Negara Asing"); //Membuat objek JCheckBox Warga Negara Asing
        //checkBox.setBounds(15,220,350,30);
        
        JButton button = new JButton("Simpan"); //Membuat objek button untuk tombol simpan
        //button.setBounds(15,250,100,40);
        
        JTextArea txtOutput = new JTextArea(""); //Membuat objek untuk menampilkan output
        txtOutput.setBounds(15,300,350,100);
        
        checkBox.addItemListener(new ItemListener() { //Memberikan ItemListener kepada checkBox
            public void itemStateChanged(ItemEvent e) {
                checkBoxSelected = e.getStateChange() == 1; //Checkbox bernilai true jika event e bernilai 1
            }
        });
        button.addActionListener(new ActionListener() { //Menambahkan Action Listener pada button
            public void actionPerformed(ActionEvent e) {
                String jenisKelamin = ""; //Mendeklarasikan variabel String bernama jenisKelamin
                if(radioButton1.isSelected()) { //Mengecek apakah radioButton1 sudah dipilih atau belum
                    jenisKelamin = radioButton1.getText(); //Mendapatkan teks dari radioButton1 dan disimpan dalam variabel jenisKelamin
                }
                if(radioButton2.isSelected()) { //Mengecek apakah radioButton2 sudah dipilih atau belum
                    jenisKelamin = radioButton2.getText(); //Mendapatkan teks dari radioButton2 dan disimpan dalam variabel jenisKelamin
                }
                
                String nama = textField.getText(); //Inputan Nama disimpan ke dalam variabel nama
                String telp = textHp.getText();//Inputan Nomor HP disimpan ke dalam variabel telp
                txtOutput.append("Nama : "+nama+"\n"); //Menambahkan komponen teks nama pada textOutput 
                txtOutput.append("Nomor HP : "+telp+"\n"); //Menambahkan komponen teks nomor HP pada textOutput
                txtOutput.append("Jenis Kelamin : " +jenisKelamin+"\n"); //Menambahkan komponen jenis kelamin pada textOutput
                textField.setText(""); // Mengembalikan ke kondisi awal untuk Teks Output
                
                if(checkBoxSelected) { //Pengecekkan checkBox, apabila bernilai true atau dicentang,
                    txtOutput.append("WNA\t: " + "Ya\n"); //maka "Ya" akan dimasukkan ke dalam teks output
                }else{ //apabila tidak
                    txtOutput.append("WNA\t: " + "Bukan\n"); //maka "Bukan" akan dimasukkan ke dalam teks output
                }
                
                txtOutput.append("===================================\n");
                
                //Mengembalikan ke kondisi awal untuk Text Field Nomor HP dan CheckBox
                textHp.setText("");
                checkBox.setSelected(false);
            }
        });

        gbc.fill = GridBagConstraints.HORIZONTAL; //Atur GridBagConstraints panjang Horizontal secara penuh (fill) 
        gbc.gridx = 0; //Atur letak objek gbc ke posisi x menjadi 0
        gbc.gridy = 0; //Atur letak objek gbc ke posisi y menjadi 0
        panel.add(labelNama,gbc); //Masukkan labelNama dan gbc ke dalam panel dengan posisi yang sudah ditentukan
        
        gbc.gridx = 0; //Atur letak objek gbc ke posisi x menjadi 0
        gbc.gridy = 2; //Atur letak objek gbc ke posisi y menjadi 2
        panel.add(labelHp,gbc); //Masukkan labelHp dan gbc ke dalam panel dengan posisi yang sudah ditentukan
        
        gbc.fill = GridBagConstraints.HORIZONTAL; //Atur GridBagConstraints panjang Horizontal secara penuh (fill) 
        gbc.gridx = 0; //Atur letak objek gbc ke posisi x menjadi 0
        gbc.gridy = 1; //Atur letak objek gbc ke posisi y menjadi 1
        panel.add(textField,gbc); //Masukkan textField untuk Nama dan gbc ke dalam panel dengan posisi yang sudah ditentukan
        
        gbc.gridx = 0; //Atur letak objek gbc ke posisi x menjadi 0
        gbc.gridy = 3; //Atur letak objek gbc ke posisi y menjadi 3
        panel.add(textHp,gbc); //Masukkan textField untuk Nomor HP dan gbc ke dalam panel dengan posisi yang sudah ditentukan
        
        gbc.fill = GridBagConstraints.HORIZONTAL; //Atur GridBagConstraints panjang Horizontal secara penuh (fill) 
        gbc.gridx = 1; //Atur letak objek gbc ke posisi x menjadi 0
        gbc.gridy = 0; //Atur letak objek gbc ke posisi y menjadi 1
        panel.add(labelRadio, gbc); //Masukkan labelRadio dan gbc ke dalam panel dengan posisi yang sudah ditentukan
        
        gbc.gridx = 1; //Atur letak objek gbc ke posisi x menjadi 1
        gbc.gridy = 1; //Atur letak objek gbc ke posisi y menjadi 1
        panel.add(radioButton1,gbc); //Masukkan radioButton1 dan gbc ke dalam panel dengan posisi yang sudah ditentukan
        
        gbc.gridx = 1; //Atur letak objek gbc ke posisi x menjadi 1
        gbc.gridy = 2; //Atur letak objek gbc ke posisi y menjadi 2
        panel.add(radioButton2,gbc); //Masukkan radioButton2 dan gbc ke dalam panel dengan posisi yang sudah ditentukan
        
        gbc.gridx = 1; //Atur letak objek gbc ke posisi x menjadi 1
        gbc.gridy = 3; //Atur letak objek gbc ke posisi y menjadi 3
        panel.add(checkBox,gbc);
        
        //Versi menggunakan GridBagLayout
//        gbc.gridx = 1; //Atur letak objek gbc ke posisi x menjadi 0
//        gbc.gridy = 4; //Atur letak objek gbc ke posisi y menjadi 4
//        gbc.fill = GridBagConstraints.CENTER; //Atur GridBagConstraint menjadi ke tengah
//        gbc.gridwidth = 2; //Atur lebar menjadi 2
//        panel.add(button,gbc); //Masukkan button "Simpan" dan gbc ke dalam panel dengan posisi yang sudah ditentukan
        
        //Versi menggunakan panel2
        gbc.fill = GridBagConstraints.VERTICAL; //Atur GridBagConstraints panjang Vertical secara penuh (fill) 
        gbc.gridx = 1; //Atur letak objek gbc ke posisi x menjadi 1
        gbc.gridy = 4; //Atur letak objek gbc ke posisi y menjadi 4
        panel2.add(button); //Masukkan button "Simpan" dan gbc ke dalam panel2 dengan posisi yang sudah ditentukan
        
        //Memasukkan panel dan panel2 ke dalam controlPanel
        controlPanel.add(panel);
        controlPanel.add(panel2);
        
        this.setLayout(new GridLayout(4, 1)); //Mengatur Layout menjadi GridLayout dengan ukuran 4 baris dan 1 kolom
        this.add(headerLabel); //Memasukkan komponen headerLabel ke dalam Frame
        this.add(controlPanel); //Memasukkan komponen controlPanel ke dalam Frame
        this.add(panel2); // Memasukkann panel2
        this.add(txtOutput); //Memasukkan txtOutput untuk output ke dalam frame
        this.setSize(400,400); //Mengatur frame ukuran 400 x 400
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Latihan3 h = new Latihan3(); //Instansiasi Class Java Latihan3
                h.setVisible(true); //Objek ditampilkan ke frame
            }
        });
    }
}
