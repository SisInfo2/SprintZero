/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package censo;

import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import dba.Mysql;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author kecha
 */
public class ConteoDeDatos extends javax.swing.JFrame {

    DefaultTableModel model;    
    Connection conn;
    Statement sent;
    /**
     * Creates new form ConteoDeDatos
     */
    public ConteoDeDatos() {
        initComponents();
          setLocationRelativeTo(null);
        conn=Mysql.getConnection(); 
        respaldo1();
       }
    public void mostrar1(){
      try {
            conn = Mysql.getConnection();
            String[]titulos = {"id", "Nombre", "Dirección", "Correo", "Número","codMunicipal", "Distrito", "CiudadComunidad", "ZonaCensal", "Sector", "Ciudad", "Localidad", "Zona", "Avenida", "Piso", "NroDepartamento", "NumeroOrden", "NumeroVivienda", "NrPuerta", "NomEdificio","Mujeres", "Hombres", "TotalPersonas","Vivienda", "Observacion", "MaterialConstruccion", "revoque", "TechoVivienda", "MaterialMasUsado","ProveerAgua", 
                "AguaEnLaVivienda", "ServicioSanitario", "TieneDesague", "EnergiaElectrica", "Combustible", "CuartoDeCocina"}; 
            String sql = "SELECT * FROM encuestador INNER JOIN ubicaciongeografica ON encuestador.id = ubicaciongeografica.codMunicipal INNER JOIN vivienda ON encuestador.id = vivienda.idv WHERE Nombre = " + jTextField1.getText() + "";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[40];
            while(rs.next()){
                fila[0]=rs.getString("id");
                fila[1]=rs.getString("Nombre");
                fila[2]=rs.getString("Dirección");
                fila[3]=rs.getString("Correo");
                fila[4]=rs.getString("Número");
               
                fila[5]=rs.getString("codMunicipal");
                fila[6]=rs.getString("Distrito");
                fila[7]=rs.getString("CiudadComunidad");
                fila[8]=rs.getString("ZonaCensal");
                fila[9]=rs.getString("Sector");
                fila[10]=rs.getString("Ciudad");
                fila[11]=rs.getString("Localidad");
                fila[12]=rs.getString("Zona");
                fila[13]=rs.getString("Avenida");
                fila[14]=rs.getString("Piso");
                fila[15]=rs.getString("NroDepartamento");
                fila[16]=rs.getString("NumeroOrden");
                fila[17]=rs.getString("NumeroVivienda");
                fila[18]=rs.getString("NrPuerta");
                fila[19]=rs.getString("NomEdificio");
                fila[20]=rs.getString("Mujeres");
                fila[21]=rs.getString("Hombres");
                fila[22]=rs.getString("TotalPersonas");
                fila[23]=rs.getString("Vivienda");
                fila[24]=rs.getString("Observacion");
                fila[25]=rs.getString("MaterialConstruccion");
                fila[26]=rs.getString("revoque");
                fila[27]=rs.getString("TechoVivienda");
                fila[28]=rs.getString("MaterialMasUsado");
                fila[29]=rs.getString("ProveerAgua");
                fila[30]=rs.getString("AguaEnLaVivienda");
                fila[31]=rs.getString("ServicioSanitario");
                fila[32]=rs.getString("TieneDesague");
                fila[33]=rs.getString("EnergiaElectrica");
                fila[34]=rs.getString("Combustible");
                fila[35]=rs.getString("CuartoDeCocina");
               
                model.addRow(fila);
            }
            jTable1.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void respaldo1(){
    try {
            conn = Mysql.getConnection();
            String[]titulos = {"codMunicipal", "Distrito", "CiudadComunidad", "ZonaCensal", "Sector", "Ciudad", "Localidad", "Zona", "Avenida", "Piso", "NroDepartamento", "NumeroOrden", "NumeroVivienda", "NrPuerta", "NomEdificio","Mujeres", "Hombres", "TotalPersonas"}; 
            String sql = "SELECT * FROM ubicaciongeografica WHERE codMunicipal ";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[18];
            while(rs.next()){
                fila[0]=rs.getString("codMunicipal");
                fila[1]=rs.getString("Distrito");
                fila[2]=rs.getString("CiudadComunidad");
                fila[3]=rs.getString("ZonaCensal");
                fila[4]=rs.getString("Sector");
                fila[5]=rs.getString("Ciudad");
                fila[6]=rs.getString("Localidad");
                fila[7]=rs.getString("Zona");
                fila[8]=rs.getString("Avenida");
                fila[9]=rs.getString("Piso");
                fila[10]=rs.getString("NroDepartamento");
                fila[11]=rs.getString("NumeroOrden");
                fila[12]=rs.getString("NumeroVivienda");
                fila[13]=rs.getString("NrPuerta");
                fila[14]=rs.getString("NomEdificio");
                fila[15]=rs.getString("Mujeres");
                fila[16]=rs.getString("Hombres");
                fila[17]=rs.getString("TotalPersonas");
               
                model.addRow(fila);
            }
            jTable2.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dato(){
     try {
            
            String sql = "SELECT COUNT(id)AS Nombre from encuestador where Nombre="+jTextField1.getText()+"";
            sent = (Statement) conn.createStatement();
            ResultSet rs = sent.executeQuery(sql);
            rs.next();   
            jTextField2.setText (rs.getString("Nombre"));
            
           String[]fila = new String[1];
            while(rs.next()){
                fila[0]=rs.getString(1);
 
                model.addRow(fila);
            }
            jTable1.setModel(model);
           
            }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 1000));
        setMinimumSize(new java.awt.Dimension(1200, 1000));
        setPreferredSize(new java.awt.Dimension(1200, 1000));

        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1160, 130));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 240, -1));

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE DEL ENCUESTADOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 1140, 510));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NÚMERO DE BOLETA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, 20));

        jButton2.setText("ATRAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        jButton3.setText("VOLVER AL MENU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-wallpaper (5).jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1200, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1200, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1200, 1000));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          mostrar1();
           dato();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 interfazPrincipal Ec = new interfazPrincipal();
        Ec.setVisible(true);
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 FuncionesEncuestador Ec = new FuncionesEncuestador();
        Ec.setVisible(true);
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConteoDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConteoDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConteoDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConteoDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConteoDeDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
