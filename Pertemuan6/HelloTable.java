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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelNama = new JLabel("Nama : ");
        labelNama.setBounds(15,40,350,10);
        
        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);
        
        JLabel labelRadio = new JLabel("Jenis Member : ");
        labelRadio.setBounds(15, 100, 350, 10);
        
        JRadioButton radioButton1 = new JRadioButton("Silver", true);
        radioButton1.setBounds(15, 115, 350, 30);
        
        JRadioButton radioButton2 = new JRadioButton("Gold");
        radioButton2.setBounds(15, 145, 350, 30);
        
        JRadioButton radioButton3 = new JRadioButton("Platinum");
        radioButton3.setBounds(15, 175, 350, 30);
    }
}
