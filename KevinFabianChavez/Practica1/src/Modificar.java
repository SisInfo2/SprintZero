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

public class Modificar {
    public static void modificarFruta(DefaultTableModel model, int filaSeleccionada, String nuevoNombreFruta, double nuevoPrecioFruta) {
        String nombreFrutaSeleccionada = (String) model.getValueAt(filaSeleccionada, 0);

        // Verificar si el nombre de la fruta seleccionada es igual al nuevo nombre de la fruta
        if (!nombreFrutaSeleccionada.equals(nuevoNombreFruta)) {
            try {
                Connection con = ConexionBD.getConnection();

                // Consulta para verificar si el nuevo nombre de fruta ya existe
                String queryVerificar = "SELECT COUNT(*) FROM frutas WHERE fruta = ?";
                PreparedStatement pstVerificar = con.prepareStatement(queryVerificar);
                pstVerificar.setString(1, nuevoNombreFruta);
                ResultSet rs = pstVerificar.executeQuery();

                // Verificar si hay algún resultado en la consulta
                rs.next();
                int count = rs.getInt(1);
                if (count > 0) {
                    JOptionPane.showMessageDialog(null, "El nombre de la fruta ya existe en la base de datos.");
                    return;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al verificar la fruta en la base de datos: " + ex.getMessage());
                return;
            }
        }

        // Si el nombre de la fruta seleccionada es igual al nuevo nombre de la fruta
        // o si el nuevo nombre de la fruta no existe en la base de datos, procedemos con la modificación
        try {
            Connection con = ConexionBD.getConnection();

            // Consulta para actualizar la fruta
            String queryUpdate = "UPDATE frutas SET fruta = ?, precio = ? WHERE fruta = ?";
            PreparedStatement pst = con.prepareStatement(queryUpdate);
            pst.setString(1, nuevoNombreFruta);
            pst.setDouble(2, nuevoPrecioFruta);
            pst.setString(3, nombreFrutaSeleccionada); // Utilizamos el nombre de la fruta seleccionada como criterio de búsqueda
            pst.executeUpdate();

            // Actualizar la tabla mostrando la fruta modificada
            model.setValueAt(nuevoNombreFruta, filaSeleccionada, 0); // Suponiendo que el nombre de la fruta está en la primera columna
            model.setValueAt(nuevoPrecioFruta, filaSeleccionada, 1); // Suponiendo que el precio de la fruta está en la segunda columna

            JOptionPane.showMessageDialog(null, "Fruta modificada correctamente.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la fruta: " + ex.getMessage());
        }
    }
}

