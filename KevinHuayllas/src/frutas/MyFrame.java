/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frutas;

import java.awt.GridLayout;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author TUF
 */
public class MyFrame {
    MyFrame(){
        JFrame frame = new JFrame(); 
        frame.setTitle("Frutas"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//        frame.setResizable(false); 
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setSize(1920,1080); 
        frame.setVisible(true); 
  
//        ImageIcon image = new ImageIcon("logo.png"); 
//        frame.setIconImage(image.getImage()); 
        frame.getContentPane().setBackground(new Color(0xf9f8fa));
        
        
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        JPanel panel = new JPanel(new GridLayout(4,10,0,0));
        panel.setBackground(new Color(0xff0000));
        panel.setPreferredSize(new Dimension(500,1000));
        
        JTable table = new JTable
        
        
        frame.add(panel);
        
        
        
    }
}
