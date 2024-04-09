/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frutas;

import java.awt.Button;
import java.awt.GridLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author TUF
 */
public class MyFrame {
    JPanel panel;
    
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
        
        
        panel = new JPanel(new GridLayout(4,4,0,0));
        panel.setBackground(new Color(0xfccccc));
        panel.setPreferredSize(new Dimension(600, 100));
        frame.add(panel); 
        
        TablaFrutas tabla = new TablaFrutas();
        
        frame.add(tabla.getTable());
        frame.add(tabla.getButton());
        frame.add(new Button("Hola"));
    }
    
    
    public void agregarColumna(Color color){
        JPanel newPanel = new JPanel();
        newPanel.setBackground(color);
        newPanel.setSize(10,100);
        JPanel newPane2 = new JPanel();
        newPane2.setBackground(color.PINK);
        newPane2.setSize(10,100);
        JPanel newPane3 = new JPanel();
        newPane3.setBackground(color);
        newPane3.setSize(10,100);
        JPanel newPane4 = new JPanel();
        newPane4.setBackground(color.RED);
        newPane4.setSize(10,100);
//        this.panel.add(new Button("1"));
//        this.panel.add(new Button("2"));
//        this.panel.add(new Button("3"));
        this.panel.add(newPanel);
        this.panel.add(newPane2);
        this.panel.add(newPane3);
        this.panel.add(newPane4);
        
        panel.setPreferredSize(panel.getPreferredSize());
    }
}
