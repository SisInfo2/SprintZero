/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frutas;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

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
  
        ImageIcon image = new ImageIcon("logo.png"); 
        frame.setIconImage(image.getImage()); 
        frame.getContentPane().setBackground(new Color(0xf9f8fa));
        
        
        
        
    }
}
