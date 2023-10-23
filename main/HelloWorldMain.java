/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Shinichi
 */
public class HelloWorldMain {
    private static void createAndShowGUI(){
        JFrame frame = new JFrame("Hello Wolrd Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //perilaku windowsnya ketika exit diklik
        
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        
        frame.pack();
        frame.setVisible(true);
    
    }
    
    private static void buatGUI(){
        JFrame frame = new JFrame("GUI lainnya");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //perilaku windowsnya ketika exit diklik
        
        JLabel label = new JLabel("Ada seorang pemuda bernama Lutfi yang sedang mencari jodoh");
        frame.getContentPane().add(label);
        
        
        frame.pack();
        
        frame.setSize(400, 300);
        frame.setVisible(true);
    
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
                buatGUI();
            }
        });
    }
}
