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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Agregar{
    public static void agregarFruta(DefaultTableModel model, String nombreFruta, double precioFruta) {
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://oregon-postgres.render.com:5432/sisinfo2db", "kevin_123", "8baO6G0RmY0HjY2PqSrScxaR3p4aI3We");

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
                Object[] row = {nombreFruta, precioFruta};
                model.addRow(row);

                JOptionPane.showMessageDialog(null, "Fruta agregada correctamente.");
            }

            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar la fruta: " + ex.getMessage());
        }
    }
}
