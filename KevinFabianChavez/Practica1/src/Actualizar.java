/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kecha
 */
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Actualizar {
    public static void actualizarTabla(DefaultTableModel model) {
        model.setRowCount(0); // Limpiar la tabla

        try {
            Connection con = ConexionBD.getConnection();
            String query = "SELECT fruta, precio FROM frutas ORDER BY precio";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Object[] row = {
                        rs.getString("fruta"),
                        rs.getDouble("precio")
                };
                model.addRow(row);
            }

            ConexionBD.close(con, pst, rs);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
