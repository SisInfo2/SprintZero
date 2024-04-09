/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kecha
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class interaccion extends javax.swing.JFrame {

    /**
     * Creates new form interaccion
     */
    public interaccion() {
        initComponents();
        
        
    }

     private void mostrarDatos() {
        // Variables para la conexión a la base de datos
        String url = "jdbc:postgresql://localhost:5432/frutasPG";
        String user = "postgres";
        String password = "79736993Juan";

        // Consulta SQL para obtener los datos
        String sql = "SELECT fruta, precio FROM frutas";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            // Limpiar la tabla antes de agregar nuevos datos
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            // Iterar sobre los resultados y agregarlos a la tabla
            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("fruta"),
                    rs.getDouble("precio")
                };
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al recuperar datos de la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
   
    }
     
     
     
     /////////////////////
     private void calcularRelacion() {
    // Obtener el precio del plátano del JTextField
    double precioPlatano = Double.parseDouble(jTextField1.getText());

    // Variables para la conexión a la base de datos
    String url = "jdbc:postgresql://localhost:5432/frutasPG";
    String user = "postgres";
    String password = "79736993Juan";

    // Consulta SQL para obtener los precios de las otras frutas
    String sql = "SELECT fruta, precio FROM frutas WHERE fruta <> 'Plátano' AND precio >= ? ";

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        // Establecer el parámetro de precio del plátano en la consulta SQL
        pstmt.setDouble(1, precioPlatano);

        try (ResultSet rs = pstmt.executeQuery()) {
            // Limpiar la tabla antes de agregar nuevos datos
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);

            // Iterar sobre los resultados y calcular la relación con el precio del plátano
            while (rs.next()) {
                String fruta = rs.getString("fruta");
                double precioFruta = rs.getDouble("precio");
                double relacion = precioFruta / precioPlatano;
                int relacion_entero = Math.round((float) relacion);
                model.addRow(new Object[]{fruta, "vale " + relacion_entero + " veces más"});
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al recuperar datos de la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
     
    ///////////////////////////////////////////////////
   private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/frutasPG", "postgres", "79736993Juan");
            String query = "DELETE FROM frutas WHERE fruta = ? AND precio = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, (String)model.getValueAt(selectedRow, 0)); // Suponiendo que la primera columna es el nombre de la fruta
            pst.setDouble(2, (Double)model.getValueAt(selectedRow, 1)); // Suponiendo que la segunda columna es el precio de la fruta
            pst.executeUpdate();
            model.removeRow(selectedRow);
            JOptionPane.showMessageDialog(null, "Fruta eliminada correctamente.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la fruta: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para eliminar.");
    }
}


   ///////////////////////////////////////////////////////////////////////////////////////////////////
    
   private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                                
    String nombreFruta = jTextField2.getText();
    double precioFruta = Double.parseDouble(jTextField3.getText());
    
    try {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/frutasPG", "postgres", "79736993Juan");
        
        // Verificar si la fruta ya existe en la base de datos
        String querySelect = "SELECT COUNT(*) FROM frutas WHERE fruta = ?";
        PreparedStatement pstSelect = con.prepareStatement(querySelect);
        pstSelect.setString(1, nombreFruta);
        ResultSet rs = pstSelect.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        
        // Si count es mayor que cero, significa que la fruta ya existe en la base de datos
        if (count > 0) {
            JOptionPane.showMessageDialog(null, "La fruta ya existe en la base de datos.");
        } else {
            // Si la fruta no existe, agregarla a la base de datos
            String queryInsert = "INSERT INTO frutas (fruta, precio) VALUES (?, ?)";
            PreparedStatement pstInsert = con.prepareStatement(queryInsert);
            pstInsert.setString(1, nombreFruta);
            pstInsert.setDouble(2, precioFruta);
            pstInsert.executeUpdate();
            
            // Actualizar la tabla mostrando la fruta recién agregada
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object[] row = {nombreFruta, precioFruta};
            model.addRow(row);
            
            JOptionPane.showMessageDialog(null, "Fruta agregada correctamente.");
        }
        
        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al agregar la fruta: " + ex.getMessage());
    }
}


////////////////////////////////////////////////////////////////////////////////////////////
 
   private void jButtonModificarActionPerformed(ActionEvent evt) {                                                  
    int filaSeleccionada = jTable1.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para modificar.");
        return;
    }

    String nuevoNombreFruta = jTextField2.getText();
    double nuevoPrecioFruta = Double.parseDouble(jTextField3.getText());

    try {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/frutasPG", "postgres", "79736993Juan");

        // Consulta para verificar si el nuevo nombre de fruta ya existe
        String queryVerificar = "SELECT COUNT(*) FROM frutas WHERE fruta = ?";
        PreparedStatement pstVerificar = con.prepareStatement(queryVerificar);
        pstVerificar.setString(1, nuevoNombreFruta);
        ResultSet rs = pstVerificar.executeQuery();

        // Verificar si hay algún resultado en la consulta
        rs.next();
        int count = rs.getInt(1);
        if (count > 0) {
            JOptionPane.showMessageDialog(null, "El nombre de la fruta ya existe en la base de datos. Por favor, elige otra fruta.");
            return;
        }

        // Consulta para actualizar la fruta
        String queryUpdate = "UPDATE frutas SET fruta = ?, precio = ? WHERE id = ?";
        PreparedStatement pst = con.prepareStatement(queryUpdate);
        
        pst.setString(1, nuevoNombreFruta);
        pst.setDouble(2, nuevoPrecioFruta);
        pst.setInt(3, filaSeleccionada);

        pst.executeUpdate();

        // Actualizar la tabla mostrando la fruta modificada
        jTable1.getModel().setValueAt(nuevoNombreFruta, filaSeleccionada, 0); // Suponiendo que el nombre de la fruta está en la primera columna
        jTable1.getModel().setValueAt(nuevoPrecioFruta, filaSeleccionada, 1); // Suponiendo que el precio de la fruta está en la segunda columna

        JOptionPane.showMessageDialog(null, "Fruta modificada correctamente.");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al modificar la fruta: " + ex.getMessage());
    }
}


      


    
    ////////////////////////////////////////////////////////////////////////////////
    
   private void cargarFrutasEnComboBox() {
    try {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/frutasPG", "postgres", "79736993Juan");
        String query = "SELECT fruta FROM frutas";
        PreparedStatement pst = con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            String nombreFruta = rs.getString("fruta");
            System.out.println("Nombre de la fruta: " + nombreFruta); // Imprime el nombre de la fruta
            jComboBox1.addItem(nombreFruta);
        }

        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

////////////////////////////////////////////////////////////////////////////////////////
   private void actualizarTabla() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Limpiar la tabla

    try {
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/frutasPG", "postgres", "79736993Juan");
    String query = "SELECT fruta, precio FROM frutas ORDER BY precio"; // Ordenar por precio
    PreparedStatement pst = con.prepareStatement(query);
    ResultSet rs = pst.executeQuery();

    while (rs.next()) {
        Object[] row = {
            rs.getString("fruta"),
            rs.getDouble("precio")
        };
        model.addRow(row);
    }

    con.close();
} catch (SQLException ex) {
    ex.printStackTrace();
}

}

////////////////////////////////////////////////////////////////////////////////
   private void guardarCambios() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    try {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/frutasPG", "postgres", "79736993Juan");
        
        // Recorre todas las filas de la tabla
   for (int i = 0; i < model.getRowCount(); i++) {
    String fruta = (String) model.getValueAt(i, 0); // Nombre de la fruta
    double precio = (double) model.getValueAt(i, 1); // Precio de la fruta
    
    // Actualiza el registro en la base de datos basándose en el nombre de la fruta
    String query = "UPDATE frutas SET precio = ? WHERE fruta = ?";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setDouble(1, precio);
    pst.setString(2, fruta);
    pst.executeUpdate();
   }

        con.close();
        JOptionPane.showMessageDialog(null, "Cambios guardados exitosamente.");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al guardar los cambios: " + ex.getMessage());
    }
}

   /////////////////////////////////////////////////////////////////////////////////////
   


     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Mostrar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Interactuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Fruta");

        jLabel3.setText("Precio");

        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "frutas" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton6.setText("Actualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Guardar Cambios");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap(404, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton1)
                                .addGap(47, 47, 47)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(11, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6)
                        .addComponent(jButton7)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       mostrarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        calcularRelacion();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                                       
    jButtonEliminarActionPerformed(evt);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButtonAgregarActionPerformed(evt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButtonModificarActionPerformed(evt);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       cargarFrutasEnComboBox();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        actualizarTabla();
       
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       guardarCambios();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(interaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interaccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
