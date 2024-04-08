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
import java.sql.SQLException;

public class EliminarDatos {
    public static void eliminarDatos(DefaultTableModel model, int selectedRow) {
        if (selectedRow != -1) {
            try (Connection con = ConexionBD.getConnection()) {
                String query = "DELETE FROM frutas WHERE fruta = ? AND precio = ?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, (String) model.getValueAt(selectedRow, 0)); // Suponiendo que la primera columna es el nombre de la fruta
                pst.setDouble(2, (Double) model.getValueAt(selectedRow, 1)); // Suponiendo que la segunda columna es el precio de la fruta
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
}

