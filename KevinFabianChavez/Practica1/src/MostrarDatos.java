/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kecha
 */
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MostrarDatos {
    public static void mostrarDatos(DefaultTableModel model) {
        String sql = "SELECT fruta, precio FROM frutas WHERE precio IS NOT NULL";
        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            model.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
            while (rs.next()) {
                Object[] rowData = {
                        rs.getString("fruta"),
                        rs.getDouble("precio")
                };
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar datos de la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
