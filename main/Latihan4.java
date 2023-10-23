/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.event.*; //Buat event Listener dan lain-lain
import javax.swing.*; //Label, Frame dan lain
/**
 *
 * @author Shinichi
 */
public class Latihan4 extends JFrame {
    
    public Latihan4() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelInput = new JLabel("Input Nama: ");
        labelInput.setBounds(130,40,100,10);
        
        JTextField textField = new JTextField();
        textField.setBounds(130, 60, 100, 30);
        
        JLabel labelTelpon = new JLabel("Input Nomor Telepon: ");
        labelTelpon.setBounds(130,100,100,10);
        
        JTextField textTelp = new JTextField();
        textTelp.setBounds(130, 120, 100, 30);
        
        JButton button = new JButton("Klik");
        button.setBounds(130,200,100,40);
        
        JTextArea txtOutput = new JTextArea("");
        txtOutput.setBounds(130, 300, 100, 100);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText() + " - " + textTelp.getText() + "\n";
                txtOutput.append(nama);
                textField.setText("");
                textTelp.setText("");
                
            }
        });
        
        this.add(labelInput);
        this.add(textField);
        this.add(labelTelpon);
        this.add(textTelp);
        this.add(button);
        this.add(txtOutput);
        
        
        
        this.setSize(400,500);
        this.setLayout(null);
    }
    
     public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Latihan4 h = new Latihan4();
                h.setVisible(true);
            }
        });
    }
    
}
