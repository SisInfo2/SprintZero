/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package censo;
import java.sql.Connection;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import dba.Mysql;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.sql.Array.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;             
/**
 *
 * @author kecha
 */

public class BoletaCensal extends javax.swing.JFrame {
    
    DefaultTableModel model;
    Connection conn;
    Statement sent;
    public BoletaCensal() {
        initComponents();
        
        //sin Habilitar
        
        setLocationRelativeTo(null);
        conn=Mysql.getConnection();
        Deshabilitar();
        Llenar();
        
        Limpiar();
    }    
       void Deshabilitar(){
       jTextField1.setEditable(false);
       jTextField2.setEditable(false);
       jTextField3.setEditable(false);
       jTextField4.setEditable(false);
       jTextField5.setEditable(false);
       jTextField6.setEditable(false);
       jTextField7.setEditable(false);
       jTextField8.setEditable(false);
       jTextField9.setEditable(false);
       jTextField10.setEditable(false);
        jTextField11.setEditable(false);
       jTextField12.setEditable(false);
       jTextField13.setEditable(false);
       jTextField14.setEditable(false);
       jTextField15.setEditable(false);
       jTextField16.setEditable(false);
       jTextField17.setEditable(false);
       jTextField18.setEditable(false);
       jTextField19.setEditable(false);
       jTextField20.setEditable(false);
       jTextField21.setEditable(false);       
       jTextField22.setEditable(false);
       jTextField23.setEditable(false);
       jTextField24.setEditable(false);
       jTextField25.setEditable(false);
       jTextField26.setEditable(false);
       jTextField27.setEditable(false);
       jTextField28.setEditable(false);
       jTextField29.setEditable(false);
       jTextField30.setEditable(false);
        jTextField31.setEditable(false);
       jTextField32.setEditable(false);
       jTextField33.setEditable(false);
       jTextField34.setEditable(false);
       jTextField35.setEditable(false);
       jTextField36.setEditable(false);
       jTextField37.setEditable(false);
       jTextField38.setEditable(false);
       jTextField39.setEditable(false);
       jTextField40.setEditable(false);
       jTextField41.setEditable(false);
       jTextField42.setEditable(false);
       jTextField43.setEditable(false);
       jTextField44.setEditable(false);
       jTextField45.setEditable(false);
       jTextField46.setEditable(false);
       jTextField47.setEditable(false);
       jTextField48.setEditable(false);
       jTextField49.setEditable(false);
       jTextField50.setEditable(false);
       jTextField51.setEditable(false);
       jTextField52.setEditable(false);
       jTextField53.setEditable(false);
       jTextField54.setEditable(false);
       jTextField55.setEditable(false);
       jTextField56.setEditable(false);
       jTextField57.setEditable(false);
       jTextField58.setEditable(false);
       jTextField59.setEditable(false);
       jTextField60.setEditable(false);
       jTextField61.setEditable(false);
       jTextField62.setEditable(false);
       jTextField63.setEditable(false);
       jTextField64.setEditable(false);
       jTextField65.setEditable(false);
       jTextField66.setEditable(false);
       jTextField67.setEditable(false);
       jTextField68.setEditable(false);
       jTextField69.setEditable(false);
       jTextField70.setEditable(false);
       jTextField71.setEditable(false);
       jTextField72.setEditable(false);
       jTextField73.setEditable(false);
       jTextField74.setEditable(false);
       jTextField75.setEditable(false);
       jTextField76.setEditable(false);
       jTextField77.setEditable(false);
       jTextField78.setEditable(false);
       jTextField79.setEditable(false);
       jTextField80.setEditable(false);
      
    }
       
    
    void Limpiar(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
        jTextField35.setText("");
        jTextField36.setText("");
        jTextField37.setText("");
        jTextField38.setText("");
        jTextField39.setText("");
        jTextField40.setText("");
        jTextField41.setText("");
        jTextField42.setText("");
        jTextField43.setText("");
        jTextField44.setText("");
        jTextField45.setText("");
        jTextField46.setText("");
        jTextField47.setText("");
        jTextField48.setText("");
        jTextField49.setText("");
        jTextField50.setText("");
        jTextField51.setText("");
        jTextField52.setText("");
        jTextField53.setText("");
        jTextField54.setText("");
        jTextField55.setText("");
        jTextField56.setText("");
        jTextField57.setText("");
        jTextField58.setText("");
        jTextField59.setText("");
        jTextField60.setText("");
        jTextField61.setText("");
        jTextField62.setText("");
        jTextField63.setText("");
        jTextField64.setText("");
        jTextField65.setText("");
        jTextField66.setText("");
        jTextField67.setText("");
        jTextField68.setText("");
        jTextField69.setText("");
        jTextField70.setText("");
        jTextField71.setText("");
        jTextField72.setText("");
        jTextField73.setText("");
        jTextField74.setText("");
        jTextField75.setText("");
        jTextField76.setText("");
        jTextField77.setText("");
        jTextField78.setText("");
        jTextField79.setText("");
        jTextField80.setText("");
        
    }
    void Habilitar(){
      
        jTextField1.setEditable(true);
       jTextField2.setEditable(true);
       jTextField3.setEditable(true);
       jTextField4.setEditable(true);
       jTextField5.setEditable(true);
       jTextField6.setEditable(true);
       jTextField7.setEditable(true);
       jTextField8.setEditable(true);
       jTextField9.setEditable(true);
       jTextField10.setEditable(true);
        jTextField11.setEditable(true);
       jTextField12.setEditable(true);
       jTextField13.setEditable(true);
       jTextField14.setEditable(true);
       jTextField15.setEditable(true);
       jTextField16.setEditable(true);
       jTextField17.setEditable(true);
       jTextField18.setEditable(true);
       jTextField19.setEditable(true);
       jTextField20.setEditable(true);
       jTextField21.setEditable(true);    
       jTextField22.setEditable(true);
       jTextField23.setEditable(true);
       jTextField24.setEditable(true);
       jTextField25.setEditable(true);
       jTextField26.setEditable(true);
       jTextField27.setEditable(true);
       jTextField28.setEditable(true);
       jTextField29.setEditable(true);
       jTextField30.setEditable(true);
        jTextField31.setEditable(true);
       jTextField32.setEditable(true);
       jTextField33.setEditable(true);
       jTextField34.setEditable(true);
       jTextField35.setEditable(true);
       jTextField36.setEditable(true);
       jTextField37.setEditable(true);
       jTextField38.setEditable(true);
       jTextField39.setEditable(true);
       jTextField40.setEditable(true);
        jTextField41.setEditable(true);
       jTextField42.setEditable(true);
       jTextField43.setEditable(true);
       jTextField44.setEditable(true);
       jTextField45.setEditable(true);
       jTextField46.setEditable(true);
       jTextField47.setEditable(true);
       jTextField48.setEditable(true);
       jTextField49.setEditable(true);
       jTextField50.setEditable(true);
       jTextField51.setEditable(true);
       jTextField52.setEditable(true);
       jTextField53.setEditable(true);
       jTextField54.setEditable(true);
       jTextField55.setEditable(true);
       jTextField56.setEditable(true);
       jTextField57.setEditable(true);
       jTextField58.setEditable(true);
       jTextField59.setEditable(true);
       jTextField60.setEditable(true);
       jTextField61.setEditable(true);
       jTextField62.setEditable(true);
       jTextField63.setEditable(true);
       jTextField64.setEditable(true);
       jTextField65.setEditable(true);
       jTextField66.setEditable(true);
       jTextField67.setEditable(true);
       jTextField68.setEditable(true);
       jTextField69.setEditable(true);
       jTextField70.setEditable(true);
       jTextField71.setEditable(true);
       jTextField72.setEditable(true);
       jTextField73.setEditable(true);
       jTextField74.setEditable(true);
       jTextField75.setEditable(true);
       jTextField76.setEditable(true);
       jTextField77.setEditable(true);
       jTextField78.setEditable(true);
       jTextField79.setEditable(true);
       jTextField80.setEditable(true);
        jTextField1.requestFocus();
    }
    
    void Llenar(){
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"CodMunicipal", "Distrito", "CiudadComunidad", "ZonaCensal", "Sector","Ciudad","Localidad","Zona","Avenida","Piso","NroDepartamento","NumeroOrden","NumeroVivienda","NrPuerta","NomEdificio","Mujeres","Hombres","TotalPersonas"}; 
            String sql = "SELECT * from ubicaciongeografica";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[18];
            while(rs.next()){
                fila[0]=rs.getString("CodMunicipal");
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
            jTable1.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
  
    
    
    /////////////////////////
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        buttonGroup28 = new javax.swing.ButtonGroup();
        buttonGroup29 = new javax.swing.ButtonGroup();
        buttonGroup30 = new javax.swing.ButtonGroup();
        buttonGroup31 = new javax.swing.ButtonGroup();
        buttonGroup32 = new javax.swing.ButtonGroup();
        buttonGroup33 = new javax.swing.ButtonGroup();
        buttonGroup34 = new javax.swing.ButtonGroup();
        buttonGroup35 = new javax.swing.ButtonGroup();
        buttonGroup36 = new javax.swing.ButtonGroup();
        buttonGroup37 = new javax.swing.ButtonGroup();
        buttonGroup38 = new javax.swing.ButtonGroup();
        buttonGroup39 = new javax.swing.ButtonGroup();
        buttonGroup40 = new javax.swing.ButtonGroup();
        buttonGroup41 = new javax.swing.ButtonGroup();
        buttonGroup42 = new javax.swing.ButtonGroup();
        buttonGroup43 = new javax.swing.ButtonGroup();
        buttonGroup44 = new javax.swing.ButtonGroup();
        buttonGroup45 = new javax.swing.ButtonGroup();
        buttonGroup46 = new javax.swing.ButtonGroup();
        buttonGroup47 = new javax.swing.ButtonGroup();
        buttonGroup48 = new javax.swing.ButtonGroup();
        buttonGroup49 = new javax.swing.ButtonGroup();
        buttonGroup50 = new javax.swing.ButtonGroup();
        buttonGroup51 = new javax.swing.ButtonGroup();
        buttonGroup52 = new javax.swing.ButtonGroup();
        buttonGroup53 = new javax.swing.ButtonGroup();
        buttonGroup54 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        jRadioButton57 = new javax.swing.JRadioButton();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        jRadioButton61 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jRadioButton69 = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        jRadioButton70 = new javax.swing.JRadioButton();
        jRadioButton71 = new javax.swing.JRadioButton();
        jLabel48 = new javax.swing.JLabel();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jRadioButton65 = new javax.swing.JRadioButton();
        jRadioButton66 = new javax.swing.JRadioButton();
        jRadioButton67 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jRadioButton108 = new javax.swing.JRadioButton();
        jRadioButton109 = new javax.swing.JRadioButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jRadioButton106 = new javax.swing.JRadioButton();
        jRadioButton107 = new javax.swing.JRadioButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jRadioButton116 = new javax.swing.JRadioButton();
        jRadioButton117 = new javax.swing.JRadioButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jRadioButton118 = new javax.swing.JRadioButton();
        jRadioButton119 = new javax.swing.JRadioButton();
        jRadioButton126 = new javax.swing.JRadioButton();
        jRadioButton127 = new javax.swing.JRadioButton();
        jRadioButton128 = new javax.swing.JRadioButton();
        jRadioButton129 = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jTextField20 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jRadioButton72 = new javax.swing.JRadioButton();
        jRadioButton73 = new javax.swing.JRadioButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jRadioButton144 = new javax.swing.JRadioButton();
        jRadioButton145 = new javax.swing.JRadioButton();
        jLabel104 = new javax.swing.JLabel();
        jRadioButton152 = new javax.swing.JRadioButton();
        jRadioButton153 = new javax.swing.JRadioButton();
        jRadioButton154 = new javax.swing.JRadioButton();
        jRadioButton155 = new javax.swing.JRadioButton();
        jRadioButton156 = new javax.swing.JRadioButton();
        jLabel97 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel12 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jRadioButton74 = new javax.swing.JRadioButton();
        jRadioButton75 = new javax.swing.JRadioButton();
        jRadioButton76 = new javax.swing.JRadioButton();
        jRadioButton77 = new javax.swing.JRadioButton();
        jRadioButton78 = new javax.swing.JRadioButton();
        jRadioButton79 = new javax.swing.JRadioButton();
        jRadioButton80 = new javax.swing.JRadioButton();
        jRadioButton81 = new javax.swing.JRadioButton();
        jRadioButton82 = new javax.swing.JRadioButton();
        jRadioButton83 = new javax.swing.JRadioButton();
        jRadioButton84 = new javax.swing.JRadioButton();
        jLabel79 = new javax.swing.JLabel();
        jRadioButton85 = new javax.swing.JRadioButton();
        jRadioButton86 = new javax.swing.JRadioButton();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jRadioButton87 = new javax.swing.JRadioButton();
        jRadioButton88 = new javax.swing.JRadioButton();
        jLabel90 = new javax.swing.JLabel();
        jRadioButton89 = new javax.swing.JRadioButton();
        jRadioButton90 = new javax.swing.JRadioButton();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jRadioButton91 = new javax.swing.JRadioButton();
        jRadioButton92 = new javax.swing.JRadioButton();
        jRadioButton93 = new javax.swing.JRadioButton();
        jRadioButton94 = new javax.swing.JRadioButton();
        jRadioButton95 = new javax.swing.JRadioButton();
        jRadioButton96 = new javax.swing.JRadioButton();
        jRadioButton97 = new javax.swing.JRadioButton();
        jRadioButton98 = new javax.swing.JRadioButton();
        jRadioButton99 = new javax.swing.JRadioButton();
        jRadioButton100 = new javax.swing.JRadioButton();
        jRadioButton101 = new javax.swing.JRadioButton();
        jRadioButton102 = new javax.swing.JRadioButton();
        jRadioButton103 = new javax.swing.JRadioButton();
        jRadioButton104 = new javax.swing.JRadioButton();
        jLabel105 = new javax.swing.JLabel();
        jRadioButton105 = new javax.swing.JRadioButton();
        jLabel106 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jRadioButton110 = new javax.swing.JRadioButton();
        jRadioButton111 = new javax.swing.JRadioButton();
        jLabel107 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jRadioButton112 = new javax.swing.JRadioButton();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jRadioButton113 = new javax.swing.JRadioButton();
        jRadioButton114 = new javax.swing.JRadioButton();
        jTextField32 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jRadioButton115 = new javax.swing.JRadioButton();
        jLabel119 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jRadioButton120 = new javax.swing.JRadioButton();
        jRadioButton121 = new javax.swing.JRadioButton();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jRadioButton122 = new javax.swing.JRadioButton();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jRadioButton123 = new javax.swing.JRadioButton();
        jRadioButton124 = new javax.swing.JRadioButton();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jRadioButton125 = new javax.swing.JRadioButton();
        jLabel134 = new javax.swing.JLabel();
        jRadioButton130 = new javax.swing.JRadioButton();
        jTextField43 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        jRadioButton131 = new javax.swing.JRadioButton();
        jRadioButton132 = new javax.swing.JRadioButton();
        jLabel120 = new javax.swing.JLabel();
        jRadioButton133 = new javax.swing.JRadioButton();
        jRadioButton134 = new javax.swing.JRadioButton();
        jRadioButton135 = new javax.swing.JRadioButton();
        jRadioButton136 = new javax.swing.JRadioButton();
        jButton14 = new javax.swing.JButton();
        jRadioButton199 = new javax.swing.JRadioButton();
        jButton15 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jPanel22 = new javax.swing.JPanel();
        jLabel136 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jRadioButton137 = new javax.swing.JRadioButton();
        jRadioButton138 = new javax.swing.JRadioButton();
        jRadioButton139 = new javax.swing.JRadioButton();
        jLabel139 = new javax.swing.JLabel();
        jRadioButton140 = new javax.swing.JRadioButton();
        jRadioButton141 = new javax.swing.JRadioButton();
        jRadioButton142 = new javax.swing.JRadioButton();
        jRadioButton143 = new javax.swing.JRadioButton();
        jLabel140 = new javax.swing.JLabel();
        jRadioButton146 = new javax.swing.JRadioButton();
        jLabel141 = new javax.swing.JLabel();
        jRadioButton147 = new javax.swing.JRadioButton();
        jRadioButton148 = new javax.swing.JRadioButton();
        jLabel142 = new javax.swing.JLabel();
        jRadioButton149 = new javax.swing.JRadioButton();
        jRadioButton150 = new javax.swing.JRadioButton();
        jRadioButton151 = new javax.swing.JRadioButton();
        jRadioButton157 = new javax.swing.JRadioButton();
        jLabel143 = new javax.swing.JLabel();
        jRadioButton158 = new javax.swing.JRadioButton();
        jRadioButton159 = new javax.swing.JRadioButton();
        jRadioButton160 = new javax.swing.JRadioButton();
        jRadioButton161 = new javax.swing.JRadioButton();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jRadioButton162 = new javax.swing.JRadioButton();
        jRadioButton163 = new javax.swing.JRadioButton();
        jRadioButton164 = new javax.swing.JRadioButton();
        jLabel149 = new javax.swing.JLabel();
        jRadioButton165 = new javax.swing.JRadioButton();
        jRadioButton166 = new javax.swing.JRadioButton();
        jLabel150 = new javax.swing.JLabel();
        jRadioButton167 = new javax.swing.JRadioButton();
        jRadioButton168 = new javax.swing.JRadioButton();
        jLabel151 = new javax.swing.JLabel();
        jRadioButton169 = new javax.swing.JRadioButton();
        jRadioButton170 = new javax.swing.JRadioButton();
        jLabel152 = new javax.swing.JLabel();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jLabel153 = new javax.swing.JLabel();
        jRadioButton171 = new javax.swing.JRadioButton();
        jRadioButton172 = new javax.swing.JRadioButton();
        jRadioButton173 = new javax.swing.JRadioButton();
        jRadioButton174 = new javax.swing.JRadioButton();
        jRadioButton175 = new javax.swing.JRadioButton();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jRadioButton176 = new javax.swing.JRadioButton();
        jRadioButton177 = new javax.swing.JRadioButton();
        jRadioButton178 = new javax.swing.JRadioButton();
        jRadioButton179 = new javax.swing.JRadioButton();
        jRadioButton180 = new javax.swing.JRadioButton();
        jRadioButton181 = new javax.swing.JRadioButton();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jTextField75 = new javax.swing.JTextField();
        jLabel158 = new javax.swing.JLabel();
        jRadioButton182 = new javax.swing.JRadioButton();
        jRadioButton183 = new javax.swing.JRadioButton();
        jRadioButton184 = new javax.swing.JRadioButton();
        jRadioButton185 = new javax.swing.JRadioButton();
        jRadioButton186 = new javax.swing.JRadioButton();
        jRadioButton187 = new javax.swing.JRadioButton();
        jLabel159 = new javax.swing.JLabel();
        jTextField76 = new javax.swing.JTextField();
        jLabel160 = new javax.swing.JLabel();
        jRadioButton188 = new javax.swing.JRadioButton();
        jRadioButton189 = new javax.swing.JRadioButton();
        jRadioButton190 = new javax.swing.JRadioButton();
        jRadioButton191 = new javax.swing.JRadioButton();
        jRadioButton192 = new javax.swing.JRadioButton();
        jRadioButton193 = new javax.swing.JRadioButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton16 = new javax.swing.JButton();
        jLabel171 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jTextField77 = new javax.swing.JTextField();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jTextField78 = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jTextField79 = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        jTextField80 = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        jRadioButton194 = new javax.swing.JRadioButton();
        jRadioButton195 = new javax.swing.JRadioButton();
        jLabel170 = new javax.swing.JLabel();
        jRadioButton196 = new javax.swing.JRadioButton();
        jRadioButton197 = new javax.swing.JRadioButton();
        jRadioButton198 = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel161 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLICACION CENSO 2022");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jTabbedPane1.setRequestFocusEnabled(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1000, 570));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 570));

        jPanel7.setMaximumSize(new java.awt.Dimension(1000, 570));
        jPanel7.setPreferredSize(new java.awt.Dimension(1000, 570));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UBICACIÓN GEOGRÁFICA DE LA VIVIENDA");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("1.-         Cod. Municipal");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Distrito");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ciudad/Comunidad");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Censal");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sector");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("1.1 Dirección de la vivienda");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("2.-      Ciudad/Comunidad");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("3.-      Centro poblado/Localidad");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("4.-      Barrio/Zona/Unidad vecinal");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 210, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("     Calle, Avenida, Camino o carretera");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 300, 250, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("     Piso");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("  Nro Departamento");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 330, 140, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Número de orden de la vivienda");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Numero de la boleta en la vivienda");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 100, -1));
        jPanel7.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 90, -1));
        jPanel7.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 100, -1));
        jPanel7.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 80, -1));
        jPanel7.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 80, -1));
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 670, -1));
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 630, -1));
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 630, -1));
        jPanel7.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 570, -1));
        jPanel7.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 140, -1));
        jPanel7.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 160, -1));
        jPanel7.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 120, -1));
        jPanel7.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 130, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/47934422-guardar-icono-botón-de-internet-sobre-fondo-blanco - removebg-preview.png"))); // NOI18N
        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("  Nro Puerta");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText(" Nombre del Edificio");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 360, 140, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("5.-En esta vivienda, ¿cuántas personas pasaron la noche anterior al día del Censo?");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 390, 560, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Mujeres");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Hombres");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Total Personas");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, -1, -1));

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 90, -1));
        jPanel7.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 160, -1));
        jPanel7.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 130, -1));
        jPanel7.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 130, -1));
        jPanel7.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 110, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura1-removebg-preview (1).png"))); // NOI18N
        jButton1.setText("VOLVER AL MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        jButton18.setBackground(new java.awt.Color(0, 51, 255));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("NUEVO DOCUMENTO");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 180, 50));

        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton19.setText("JEFE DE FAMILIA");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-wallpaper (2).jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 570));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 570));
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        jScrollPane1.setViewportView(jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CAPITULO A", jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 1200));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 1200));

        jScrollPane2.setMaximumSize(new java.awt.Dimension(1000, 1200));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1000, 1200));

        jPanel8.setMaximumSize(new java.awt.Dimension(1000, 1200));
        jPanel8.setPreferredSize(new java.awt.Dimension(1000, 1200));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("PRINCIPALES CARACTERISTICAS DE LA VIVIENDA");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("6.-Tipo de vivienda (Marque por observación)");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Particular");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Casa/Choza/Pahuichi");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton1.setFocusable(false);
        jRadioButton1.setRequestFocusEnabled(false);
        jRadioButton1.setRolloverEnabled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Departamento");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/47934422-guardar-icono-botón-de-internet-sobre-fondo-blanco - removebg-preview.png"))); // NOI18N
        jButton3.setText("GUARDAR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1110, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Cuarto(s) o habitacion(es) o suelta(s)");
        jPanel8.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Vivienda improvisada");
        jPanel8.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Local no destinado para vivienda");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Colectiva");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Vivienda colectiva (Hoteles, Hospitales y otros)");
        jPanel8.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Sin vivienda");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("En transito");
        jPanel8.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("Persona que vive en la calle");
        jPanel8.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("7.- La vivienda esta... (Marque por observacion)");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Viviendas Ocupadas");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        buttonGroup2.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("Ocupada con personas presentes");
        jPanel8.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("Ocupada con personas Temporalmente ausentes");
        jPanel8.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("8.-Viviendas desocupadas");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        buttonGroup2.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setText("Para alquilar y/o vender");
        jPanel8.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, -1, -1));

        buttonGroup2.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setText("En construccion o en reparacion");
        jPanel8.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, -1, -1));

        buttonGroup2.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton13.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton13.setText("Abandonada");
        jPanel8.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("9.- ¿Material de construcción más utilizado en las paredes exteriores de esta vivienda?");
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, -1, -1));

        buttonGroup3.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton14.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton14.setText("Ladrillo, Bloque de cemento, Hormigon");
        jPanel8.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, -1, -1));

        buttonGroup3.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton15.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton15.setText("Adobe, tapial");
        jPanel8.add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 750, -1, -1));

        buttonGroup3.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton16.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton16.setText("Tabique, Quinche");
        jPanel8.add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 770, -1, -1));

        buttonGroup3.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton17.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton17.setText("Piedra");
        jPanel8.add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 790, -1, -1));

        buttonGroup3.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton18.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton18.setText("Madera");
        jPanel8.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 810, -1, -1));

        buttonGroup3.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton19.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton19.setText("Caña, Palma, Tronco");
        jPanel8.add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 830, -1, -1));

        buttonGroup3.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton20.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton20.setText("Otro");
        jPanel8.add(jRadioButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 850, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("10.- ¿Las paredes interiores de esta vivienda tienen revoque?");
        jPanel8.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, 360, -1));

        buttonGroup4.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton21.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton21.setText("Si");
        jPanel8.add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 920, -1, -1));

        buttonGroup4.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton22.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton22.setText("No");
        jPanel8.add(jRadioButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 920, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("11-¿Cuál es el material más utilizado en los techos de esta vivienda?");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 970, -1, -1));

        buttonGroup5.add(jRadioButton23);
        jRadioButton23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton23.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton23.setText("Calamina o plancha metaica");
        jPanel8.add(jRadioButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 990, -1, -1));

        buttonGroup5.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton24.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton24.setText("Teja de arcilla, Teja de Cemento, Fibrocementro");
        jPanel8.add(jRadioButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1010, -1, -1));

        buttonGroup5.add(jRadioButton25);
        jRadioButton25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton25.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton25.setText("Losa de hormigon armado");
        jPanel8.add(jRadioButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1030, -1, -1));

        buttonGroup5.add(jRadioButton26);
        jRadioButton26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton26.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton26.setText("Paja, Palma, Caña, Barro");
        jPanel8.add(jRadioButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1050, -1, -1));

        buttonGroup5.add(jRadioButton27);
        jRadioButton27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton27.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton27.setText("Otro");
        jPanel8.add(jRadioButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1070, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("12.-¿Cuál es el material más utilizado en los pisos de esta vivienda?");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        buttonGroup6.add(jRadioButton28);
        jRadioButton28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton28.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton28.setText("Tierra");
        jPanel8.add(jRadioButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        buttonGroup6.add(jRadioButton29);
        jRadioButton29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton29.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton29.setText("Tablon de madera");
        jPanel8.add(jRadioButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        buttonGroup6.add(jRadioButton30);
        jRadioButton30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton30.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton30.setText("Machimbre");
        jPanel8.add(jRadioButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        buttonGroup6.add(jRadioButton31);
        jRadioButton31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton31.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton31.setText("Parquet");
        jPanel8.add(jRadioButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        buttonGroup6.add(jRadioButton32);
        jRadioButton32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton32.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton32.setText("Ceramica");
        jPanel8.add(jRadioButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        buttonGroup6.add(jRadioButton33);
        jRadioButton33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton33.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton33.setText("Cemento");
        jPanel8.add(jRadioButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));

        buttonGroup6.add(jRadioButton34);
        jRadioButton34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton34.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton34.setText("Mosaico, Baldosa");
        jPanel8.add(jRadioButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        buttonGroup6.add(jRadioButton35);
        jRadioButton35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton35.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton35.setText("Ladrillo");
        jPanel8.add(jRadioButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

        buttonGroup6.add(jRadioButton36);
        jRadioButton36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton36.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton36.setText("Otro");
        jPanel8.add(jRadioButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("13.- Principalmente, ¿el agua que usan en la vivienda proviene de…");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        buttonGroup7.add(jRadioButton37);
        jRadioButton37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton37.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton37.setText("Cañeria de red?");
        jPanel8.add(jRadioButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

        buttonGroup7.add(jRadioButton38);
        jRadioButton38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton38.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton38.setText("Pileta publica?");
        jPanel8.add(jRadioButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        buttonGroup7.add(jRadioButton39);
        jRadioButton39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton39.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton39.setText("Carro repartidor (Aguatero)?");
        jPanel8.add(jRadioButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));

        buttonGroup7.add(jRadioButton40);
        jRadioButton40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton40.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton40.setText("Pozo o noria con bomba?");
        jPanel8.add(jRadioButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        buttonGroup7.add(jRadioButton41);
        jRadioButton41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton41.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton41.setText("Pozo o noria sin bomba?");
        jPanel8.add(jRadioButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        buttonGroup7.add(jRadioButton42);
        jRadioButton42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton42.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton42.setText("Lluvia, rio, vertiente, Acequia?");
        jPanel8.add(jRadioButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, -1));

        buttonGroup7.add(jRadioButton43);
        jRadioButton43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton43.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton43.setText("Lago, Laguna, Curichi?");
        jRadioButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton43ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("14.-¿El agua que usan en la vivienda se distribuye…");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, -1));

        buttonGroup8.add(jRadioButton44);
        jRadioButton44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton44.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton44.setText("Por cañeria dentro de la vivienda?");
        jPanel8.add(jRadioButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, -1, -1));

        buttonGroup8.add(jRadioButton45);
        jRadioButton45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton45.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton45.setText("Por cañeria fuera de la vivienda, pero dentro del lote o terreno?");
        jPanel8.add(jRadioButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, -1, -1));

        buttonGroup8.add(jRadioButton46);
        jRadioButton46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton46.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton46.setText("Por cañeria fuera de la vivienda del lote o terreno?");
        jPanel8.add(jRadioButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, -1, -1));

        buttonGroup8.add(jRadioButton47);
        jRadioButton47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton47.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton47.setText("No se distribuye por cañeria.");
        jPanel8.add(jRadioButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("15.-¿Tiene servicio sanitario, baño o letrina?");
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, -1, -1));

        buttonGroup9.add(jRadioButton48);
        jRadioButton48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton48.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton48.setText("Si, de uso privado");
        jRadioButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton48ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 670, -1, -1));

        buttonGroup9.add(jRadioButton49);
        jRadioButton49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton49.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton49.setText("Si, de uso compartido");
        jRadioButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton49ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 690, -1, -1));

        buttonGroup9.add(jRadioButton50);
        jRadioButton50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton50.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton50.setText("No tiene");
        jRadioButton50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton50MouseClicked(evt);
            }
        });
        jRadioButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton50ActionPerformed(evt);
            }
        });
        jRadioButton50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jRadioButton50KeyReleased(evt);
            }
        });
        jPanel8.add(jRadioButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 710, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Si no tiene, pase  a la pregunta 2.11");
        jPanel8.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 710, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("16.-¿El servicio sanitario, baño o letrina tiene desagüe...");
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 740, -1, -1));

        buttonGroup10.add(jRadioButton51);
        jRadioButton51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton51.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton51.setText("Al alcantarillado?");
        jRadioButton51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton51MouseClicked(evt);
            }
        });
        jRadioButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton51ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 760, -1, -1));

        buttonGroup10.add(jRadioButton52);
        jRadioButton52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton52.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton52.setText("A una camara septica?");
        jPanel8.add(jRadioButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 780, -1, -1));

        buttonGroup10.add(jRadioButton53);
        jRadioButton53.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton53.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton53.setText("A un pozo ciego?");
        jPanel8.add(jRadioButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 800, -1, 20));

        buttonGroup10.add(jRadioButton54);
        jRadioButton54.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton54.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton54.setText("A la calle?");
        jPanel8.add(jRadioButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 820, -1, -1));

        buttonGroup10.add(jRadioButton55);
        jRadioButton55.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton55.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton55.setText("A la quebrada, rio?");
        jPanel8.add(jRadioButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 840, -1, -1));

        buttonGroup10.add(jRadioButton56);
        jRadioButton56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton56.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton56.setText("A un lago, laguna, curichi");
        jPanel8.add(jRadioButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 860, -1, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("17.-¿Tienen energía eléctrica que proviene de…");
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 880, -1, -1));

        buttonGroup11.add(jRadioButton57);
        jRadioButton57.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton57.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton57.setText("Red de empresa electrica (Servicio publico)?");
        jPanel8.add(jRadioButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 900, -1, -1));

        buttonGroup11.add(jRadioButton58);
        jRadioButton58.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton58.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton58.setText("Motor propio?");
        jPanel8.add(jRadioButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 920, -1, -1));

        buttonGroup11.add(jRadioButton59);
        jRadioButton59.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton59.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton59.setText("Panel solar?");
        jPanel8.add(jRadioButton59, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 940, -1, -1));

        buttonGroup11.add(jRadioButton60);
        jRadioButton60.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton60.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton60.setText("Otro?");
        jPanel8.add(jRadioButton60, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 960, -1, -1));

        buttonGroup11.add(jRadioButton61);
        jRadioButton61.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton61.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton61.setText("No tiene?");
        jPanel8.add(jRadioButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 980, -1, -1));

        buttonGroup12.add(jRadioButton68);
        jRadioButton68.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton68.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton68.setText("Otro");
        jRadioButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton68ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1070, -1, -1));

        buttonGroup12.add(jRadioButton69);
        jRadioButton69.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton69.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton69.setText("No cocina");
        jPanel8.add(jRadioButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 1070, -1, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("19.-¿Tiene un cuarto sólo para cocinar? radio?");
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1100, -1, -1));

        buttonGroup13.add(jRadioButton70);
        jRadioButton70.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton70.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton70.setText("Si");
        jPanel8.add(jRadioButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 1130, -1, -1));

        buttonGroup13.add(jRadioButton71);
        jRadioButton71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton71.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton71.setText("No");
        jPanel8.add(jRadioButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1130, -1, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("18.-¿Cuál es el principal combustible o energía que utilizan para cocinar?");
        jPanel8.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1010, -1, -1));

        buttonGroup12.add(jRadioButton62);
        jRadioButton62.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton62.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton62.setText("Gas domiciliario (por cañeria)");
        jRadioButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton62ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1030, -1, -1));

        buttonGroup12.add(jRadioButton63);
        jRadioButton63.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton63.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton63.setText("Gas en garrafa");
        jRadioButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton63ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton63, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 1030, -1, -1));

        buttonGroup12.add(jRadioButton64);
        jRadioButton64.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton64.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton64.setText("Electricidad");
        jPanel8.add(jRadioButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1030, -1, -1));

        buttonGroup12.add(jRadioButton65);
        jRadioButton65.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton65.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton65.setText("Energia solar");
        jPanel8.add(jRadioButton65, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1050, -1, -1));

        buttonGroup12.add(jRadioButton66);
        jRadioButton66.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton66.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton66.setText("Leña");
        jPanel8.add(jRadioButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 1050, -1, -1));

        buttonGroup12.add(jRadioButton67);
        jRadioButton67.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton67.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton67.setText("Guano, Bosta o Taquia");
        jPanel8.add(jRadioButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1050, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 51, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura1-removebg-preview (1).png"))); // NOI18N
        jButton7.setText("VOLVER AL MENU");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1110, 190, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título-2.png"))); // NOI18N
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane2.setViewportView(jPanel8);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CAPITULO B", jPanel2);

        jPanel9.setMaximumSize(new java.awt.Dimension(800, 469));
        jPanel9.setPreferredSize(new java.awt.Dimension(800, 469));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("La persona es:");
        jPanel9.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        buttonGroup15.add(jRadioButton108);
        jRadioButton108.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton108.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton108.setText("Mujer");
        jRadioButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton108ActionPerformed(evt);
            }
        });
        jPanel9.add(jRadioButton108, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        buttonGroup15.add(jRadioButton109);
        jRadioButton109.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton109.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton109.setText("Hombre");
        jRadioButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton109ActionPerformed(evt);
            }
        });
        jPanel9.add(jRadioButton109, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("EMIGRACION INTERNACIONAL");
        jPanel9.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 20));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("20 Desde 2001 a la fecha, Alguna persona que vivia con ustedes en este hogar, ¿Actualmente vive en otro pais?");
        jPanel9.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, 20));

        buttonGroup14.add(jRadioButton106);
        jRadioButton106.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton106.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton106.setText("SI");
        jRadioButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton106ActionPerformed(evt);
            }
        });
        jRadioButton106.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jRadioButton106KeyReleased(evt);
            }
        });
        jPanel9.add(jRadioButton106, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 20));

        buttonGroup14.add(jRadioButton107);
        jRadioButton107.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton107.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton107.setText("No");
        jRadioButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton107ActionPerformed(evt);
            }
        });
        jRadioButton107.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jRadioButton107KeyReleased(evt);
            }
        });
        jPanel9.add(jRadioButton107, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, 20));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("¿Cuantas personas?");
        jPanel9.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, 20));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Pase a la pregunta 21");
        jPanel9.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, 20));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("(Anote en el siguiente cuadro, los datos de cada una de las personas que actualmente viven en otro pais)");
        jPanel9.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, 20));

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 76, -1));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Nombre de la persona");
        jPanel9.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 95, -1));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Año de salida del pais");
        jPanel9.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));
        jPanel9.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 108, -1));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Pais donde vive actualmente");
        jPanel9.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, -1));
        jPanel9.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 110, -1));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("A que edad se fue");
        jPanel9.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 100, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/47934422-guardar-icono-botón-de-internet-sobre-fondo-blanco - removebg-preview.png"))); // NOI18N
        jButton4.setText("GUARDAR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel9.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura1-removebg-preview (1).png"))); // NOI18N
        jButton5.setText("VOLVER AL MENU");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-wallpaper (2).jpg"))); // NOI18N
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField19.setText("jTextField19");
        jPanel9.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jScrollPane3.setViewportView(jPanel9);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CAPITULO C", jPanel3);

        jPanel10.setMaximumSize(new java.awt.Dimension(800, 469));
        jPanel10.setPreferredSize(new java.awt.Dimension(800, 469));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("MORTALIDAD");
        jPanel10.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("21 De enero a diciembre del año pasado, ¿Murio alguna persona que vivia con ustedes en este hogar?");
        jPanel10.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("(Anote en el siguiente cuadro los datos de cada una de las personas que fallecieron. No olvide a niñas, niños, recien nacidos, ancianas y ancianos)");
        jPanel10.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        buttonGroup21.add(jRadioButton116);
        jRadioButton116.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton116.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton116.setText("SI");
        jRadioButton116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton116ActionPerformed(evt);
            }
        });
        jPanel10.add(jRadioButton116, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        buttonGroup21.add(jRadioButton117);
        jRadioButton117.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton117.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton117.setText("No");
        jRadioButton117.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton117MouseClicked(evt);
            }
        });
        jPanel10.add(jRadioButton117, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("¿Cuantas persons?");
        jPanel10.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Pase a la pregunta 22");
        jPanel10.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("Nombre de la persona");
        jPanel10.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("<html>¿Que edad tenia al morir?<p>(Anote 0 para menores de un año)<html>");
        jPanel10.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("La persona era:");
        jPanel10.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("<html>Si era mujer de 15 años o mas edad,<p>murio por alguna causa relacionado con...<html>");
        jPanel10.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, -1, -1));
        jPanel10.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 120, 30));
        jPanel10.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 90, -1));

        buttonGroup19.add(jRadioButton118);
        jRadioButton118.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton118.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton118.setText("Mujer");
        jPanel10.add(jRadioButton118, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        buttonGroup19.add(jRadioButton119);
        jRadioButton119.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton119.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton119.setText("Hombre");
        jPanel10.add(jRadioButton119, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        buttonGroup20.add(jRadioButton126);
        jRadioButton126.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton126.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton126.setText("Embarazo");
        jPanel10.add(jRadioButton126, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, -1, -1));

        buttonGroup20.add(jRadioButton127);
        jRadioButton127.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton127.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton127.setText("Parto");
        jPanel10.add(jRadioButton127, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        buttonGroup20.add(jRadioButton128);
        jRadioButton128.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton128.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton128.setText("El sobreparto (hasta 2 meses después del parto)");
        jPanel10.add(jRadioButton128, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));

        buttonGroup20.add(jRadioButton129);
        jRadioButton129.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton129.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton129.setText("Otra causa");
        jPanel10.add(jRadioButton129, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/47934422-guardar-icono-botón-de-internet-sobre-fondo-blanco - removebg-preview.png"))); // NOI18N
        jButton6.setText("GUARDAR");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel10.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, -1, -1));
        jPanel10.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 80, -1));

        jButton9.setBackground(new java.awt.Color(0, 51, 255));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura1-removebg-preview (1).png"))); // NOI18N
        jButton9.setText("VOLVER AL MENU");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 200, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-wallpaper (2).jpg"))); // NOI18N
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane4.setViewportView(jPanel10);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CAPITULO D", jPanel4);

        jPanel11.setMaximumSize(new java.awt.Dimension(800, 469));
        jPanel11.setPreferredSize(new java.awt.Dimension(800, 469));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("PERSONAS CON ALGUNA DIFICULTAD PERMANENTE");
        jPanel11.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("<html>Ver, si usa anteojos o lentes?<p>Oir,si usa aun audifonos?<p>Hablar,comunicarse o conversar?<p>Caminar o subir escalones?<p>Recordar o concentrarse?<html>");
        jPanel11.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("22 ¿Hay en este hogar alguna persona con dificultad permanente para…");
        jPanel11.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        buttonGroup22.add(jRadioButton72);
        jRadioButton72.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton72.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton72.setText("SI");
        jRadioButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton72ActionPerformed(evt);
            }
        });
        jPanel11.add(jRadioButton72, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        buttonGroup22.add(jRadioButton73);
        jRadioButton73.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton73.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton73.setText("NO");
        jRadioButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton73ActionPerformed(evt);
            }
        });
        jPanel11.add(jRadioButton73, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Pasar a la pregunta 23.");
        jPanel11.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, -1));

        jLabel103.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("La persona es:");
        jPanel11.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        buttonGroup23.add(jRadioButton144);
        jRadioButton144.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton144.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton144.setText("Mujer");
        jPanel11.add(jRadioButton144, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        buttonGroup23.add(jRadioButton145);
        jRadioButton145.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton145.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton145.setText("Hombre");
        jPanel11.add(jRadioButton145, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jLabel104.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("La dificultad permanente es para…");
        jPanel11.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, -1, -1));

        buttonGroup24.add(jRadioButton152);
        jRadioButton152.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton152.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton152.setText("Ver, aun si usa anteojoso lentes?");
        jPanel11.add(jRadioButton152, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, -1));

        buttonGroup24.add(jRadioButton153);
        jRadioButton153.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton153.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton153.setText("Oir, aun si usa audifono?");
        jPanel11.add(jRadioButton153, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, -1, -1));

        buttonGroup24.add(jRadioButton154);
        jRadioButton154.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton154.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton154.setText("Hablar, comunicarse o conversar?");
        jPanel11.add(jRadioButton154, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));

        buttonGroup24.add(jRadioButton155);
        jRadioButton155.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton155.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton155.setText("Caminar o subir escalones?");
        jPanel11.add(jRadioButton155, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, -1, -1));

        buttonGroup24.add(jRadioButton156);
        jRadioButton156.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton156.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton156.setText("Recordar o centrarse?");
        jPanel11.add(jRadioButton156, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, -1));

        jLabel97.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Nombre Persona");
        jPanel11.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("Edad");
        jPanel11.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 90, -1));
        jPanel11.add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 80, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/47934422-guardar-icono-botón-de-internet-sobre-fondo-blanco - removebg-preview.png"))); // NOI18N
        jButton8.setText("GUARDAR");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel11.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, -1, -1));

        jButton11.setBackground(new java.awt.Color(0, 51, 255));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura1-removebg-preview (1).png"))); // NOI18N
        jButton11.setText("VOLVER AL MENU");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 200, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-wallpaper (2).jpg"))); // NOI18N
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane5.setViewportView(jPanel11);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CAPITULO E", jPanel5);

        jPanel6.setMaximumSize(new java.awt.Dimension(1000, 1200));
        jPanel6.setPreferredSize(new java.awt.Dimension(1000, 1200));

        jScrollPane6.setMaximumSize(new java.awt.Dimension(1000, 1200));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(1000, 1200));

        jPanel12.setMaximumSize(new java.awt.Dimension(1000, 1200));
        jPanel12.setMinimumSize(new java.awt.Dimension(1000, 1200));
        jPanel12.setPreferredSize(new java.awt.Dimension(1000, 1200));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("PRINCIPALES CARACTERÍSTICAS DE LA PERSONA");
        jPanel12.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("23.-¿Qué relación o parentesco tiene con la jefa o jefe del  hogar?");
        jPanel12.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        buttonGroup25.add(jRadioButton74);
        jRadioButton74.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton74.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton74.setText("Jefa o jefe del hogar");
        jPanel12.add(jRadioButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        buttonGroup25.add(jRadioButton75);
        jRadioButton75.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton75.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton75.setText("Esposo/a, conviviente o concubino/a  ");
        jPanel12.add(jRadioButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        buttonGroup25.add(jRadioButton76);
        jRadioButton76.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton76.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton76.setText("Hija o hijo");
        jPanel12.add(jRadioButton76, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        buttonGroup25.add(jRadioButton77);
        jRadioButton77.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton77.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton77.setText("Nuera o Yerno");
        jPanel12.add(jRadioButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        buttonGroup25.add(jRadioButton78);
        jRadioButton78.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton78.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton78.setText("Nieta o nieto");
        jPanel12.add(jRadioButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        buttonGroup25.add(jRadioButton79);
        jRadioButton79.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton79.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton79.setText("Hermana/o o cuñada/o");
        jPanel12.add(jRadioButton79, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        buttonGroup25.add(jRadioButton80);
        jRadioButton80.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton80.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton80.setText("Padre, madre, suegra/o");
        jPanel12.add(jRadioButton80, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        buttonGroup25.add(jRadioButton81);
        jRadioButton81.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton81.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton81.setText("Otro pariente  ");
        jPanel12.add(jRadioButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        buttonGroup25.add(jRadioButton82);
        jRadioButton82.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton82.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton82.setText("Trabajador/a del hogar  ");
        jPanel12.add(jRadioButton82, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        buttonGroup25.add(jRadioButton83);
        jRadioButton83.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton83.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton83.setText("Otro no pariente");
        jPanel12.add(jRadioButton83, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        buttonGroup25.add(jRadioButton84);
        jRadioButton84.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton84.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton84.setText("Persona en vivienda colectiva ");
        jPanel12.add(jRadioButton84, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("24.-¿Es mujer u hombre?");
        jPanel12.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 20));

        buttonGroup26.add(jRadioButton85);
        jRadioButton85.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton85.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton85.setText("Mujer");
        jPanel12.add(jRadioButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        buttonGroup26.add(jRadioButton86);
        jRadioButton86.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton86.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton86.setText("Hombre");
        jPanel12.add(jRadioButton86, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("25.-¿Cuántos años cumplidos tiene? ");
        jPanel12.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 200, -1));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Para menores de 1 año, anote 0");
        jPanel12.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));
        jPanel12.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 90, -1));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("26.- ¿Su nacimiento está inscrito en el registro civil o  cívico?");
        jPanel12.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        buttonGroup27.add(jRadioButton87);
        jRadioButton87.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton87.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton87.setText("SI");
        jPanel12.add(jRadioButton87, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        buttonGroup27.add(jRadioButton88);
        jRadioButton88.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton88.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton88.setText("NO");
        jPanel12.add(jRadioButton88, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, -1));

        jLabel90.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("27.-¿Tiene carnet o cédula de identidad?");
        jPanel12.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        buttonGroup28.add(jRadioButton89);
        jRadioButton89.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton89.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton89.setText("SI");
        jPanel12.add(jRadioButton89, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        buttonGroup28.add(jRadioButton90);
        jRadioButton90.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton90.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton90.setText("NO");
        jPanel12.add(jRadioButton90, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, -1, -1));

        jLabel91.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("28.- Cuando tiene problemas de salud,¿Acude a....");
        jPanel12.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        jLabel92.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("caja de salud (CNS, COSSMIL, u otras)?");
        jPanel12.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, -1, -1));

        jLabel93.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("seguro de salud privado? ");
        jPanel12.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, -1, -1));

        jLabel94.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("establecimiento de salud público? ");
        jPanel12.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, -1, -1));

        jLabel95.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("establecimiento de salud privado? ");
        jPanel12.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 680, -1, -1));

        jLabel99.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("médico tradicional? ");
        jPanel12.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 700, -1, -1));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("soluciones caseras?");
        jPanel12.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 720, -1, -1));

        jLabel101.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("la farmacia o se automedica?");
        jPanel12.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 740, -1, -1));

        buttonGroup29.add(jRadioButton91);
        jRadioButton91.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton91.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton91.setText("SI");
        jPanel12.add(jRadioButton91, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, -1, -1));

        buttonGroup29.add(jRadioButton92);
        jRadioButton92.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton92.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton92.setText("NO");
        jPanel12.add(jRadioButton92, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, -1, -1));

        buttonGroup30.add(jRadioButton93);
        jRadioButton93.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton93.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton93.setText("SI");
        jPanel12.add(jRadioButton93, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, -1, -1));

        buttonGroup30.add(jRadioButton94);
        jRadioButton94.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton94.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton94.setText("NO");
        jPanel12.add(jRadioButton94, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, -1, -1));

        buttonGroup32.add(jRadioButton95);
        jRadioButton95.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton95.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton95.setText("SI");
        jPanel12.add(jRadioButton95, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 660, -1, -1));

        buttonGroup32.add(jRadioButton96);
        jRadioButton96.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton96.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton96.setText("NO");
        jPanel12.add(jRadioButton96, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, -1, -1));

        buttonGroup33.add(jRadioButton97);
        jRadioButton97.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton97.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton97.setText("SI");
        jPanel12.add(jRadioButton97, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 680, -1, 20));

        buttonGroup33.add(jRadioButton98);
        jRadioButton98.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton98.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton98.setText("NO");
        jPanel12.add(jRadioButton98, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, -1, -1));

        buttonGroup34.add(jRadioButton99);
        jRadioButton99.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton99.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton99.setText("SI");
        jPanel12.add(jRadioButton99, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 700, -1, 20));

        buttonGroup34.add(jRadioButton100);
        jRadioButton100.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton100.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton100.setText("NO");
        jPanel12.add(jRadioButton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, -1, -1));

        buttonGroup35.add(jRadioButton101);
        jRadioButton101.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton101.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton101.setText("SI");
        jPanel12.add(jRadioButton101, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 720, -1, 20));

        buttonGroup35.add(jRadioButton102);
        jRadioButton102.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton102.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton102.setText("NO");
        jPanel12.add(jRadioButton102, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 720, -1, -1));

        buttonGroup36.add(jRadioButton103);
        jRadioButton103.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton103.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton103.setText("SI");
        jPanel12.add(jRadioButton103, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 740, -1, 20));

        buttonGroup36.add(jRadioButton104);
        jRadioButton104.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton104.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton104.setText("NO");
        jPanel12.add(jRadioButton104, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 740, -1, -1));

        jLabel105.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("<html>29.-Como boliviana o boliviano ¿pertenece a alguna nación o pueblo<p> indígena originario campesino o afro boliviano?<html>");
        jPanel12.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 770, -1, -1));

        buttonGroup31.add(jRadioButton105);
        jRadioButton105.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton105.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton105.setText("SI");
        jRadioButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton105ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton105, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 830, -1, -1));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("¿A cual?");
        jPanel12.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 860, -1, -1));
        jPanel12.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 860, 180, -1));

        buttonGroup31.add(jRadioButton110);
        jRadioButton110.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton110.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton110.setText("No pertenece");
        jRadioButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton110ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton110, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 890, -1, -1));

        buttonGroup31.add(jRadioButton111);
        jRadioButton111.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton111.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton111.setText("No soy Boliviano o Boliviana");
        jRadioButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton111ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton111, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 920, -1, -1));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("30.-¿Cuál es el primer idioma que aprendió a hablar en su niñez?");
        jPanel12.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 950, -1, -1));

        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 980, 220, -1));

        buttonGroup37.add(jRadioButton112);
        jRadioButton112.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton112.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton112.setText("No habla");
        jRadioButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton112ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton112, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1010, -1, -1));

        jLabel108.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("Pase a la pregunta 32");
        jPanel12.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 1010, -1, -1));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setText(" 31.-¿Qué idiomas habla? (Anote en orden de importancia)");
        jPanel12.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1040, -1, -1));
        jPanel12.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1070, 160, -1));
        jPanel12.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1100, 160, -1));
        jPanel12.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1070, 170, -1));
        jPanel12.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1100, 170, -1));

        jLabel110.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("1.-");
        jPanel12.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1070, -1, -1));

        jLabel111.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("2.-");
        jPanel12.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1100, -1, -1));

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("3.-");
        jPanel12.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1070, -1, -1));

        jLabel113.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("4.-");
        jPanel12.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1100, -1, -1));

        jLabel114.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("32.-¿Donde nacio?");
        jPanel12.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, 20));

        buttonGroup38.add(jRadioButton113);
        jRadioButton113.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton113.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton113.setText("Aqui");
        jRadioButton113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton113ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton113, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        buttonGroup38.add(jRadioButton114);
        jRadioButton114.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton114.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton114.setText("En otro lugar ");
        jRadioButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton114ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton114, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        jTextField32.setToolTipText("");
        jPanel12.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 130, -1));

        jLabel116.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("Ciudad o comunidad");
        jPanel12.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 670, -1, -1));

        jLabel117.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("Municipio");
        jPanel12.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 700, -1, -1));

        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 130, -1));

        jLabel118.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("Departamento");
        jPanel12.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 730, -1, -1));
        jPanel12.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 130, -1));

        buttonGroup41.add(jRadioButton115);
        jRadioButton115.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton115.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton115.setText("En el exterior");
        jRadioButton115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton115ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton115, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 760, -1, 20));

        jLabel119.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("Nombre del pais");
        jPanel12.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 760, -1, -1));
        jPanel12.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 110, -1));
        jPanel12.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 110, -1));

        jLabel121.setBackground(new java.awt.Color(255, 255, 255));
        jLabel121.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("33.-¿Donde vive habitualmente?");
        jPanel12.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, 20));

        buttonGroup40.add(jRadioButton120);
        jRadioButton120.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton120.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton120.setText("Aqui");
        jRadioButton120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton120ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton120, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, -1, -1));

        buttonGroup40.add(jRadioButton121);
        jRadioButton121.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton121.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton121.setText("En otro lugar del pais");
        jRadioButton121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton121ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton121, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        jLabel122.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("Departamento");
        jPanel12.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        jLabel123.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("Ciudad o comunidad");
        jPanel12.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        jLabel124.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("Municipio");
        jPanel12.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, -1));

        buttonGroup39.add(jRadioButton122);
        jRadioButton122.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton122.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton122.setText("En el exterior");
        jRadioButton122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton122ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton122, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        jLabel125.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setText("Nombre del pais");
        jPanel12.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setText("Año de llegada a Bolivia");
        jPanel12.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));
        jPanel12.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 80, -1));
        jPanel12.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 80, -1));
        jPanel12.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 80, -1));
        jPanel12.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, 90, -1));

        jLabel127.setBackground(new java.awt.Color(255, 255, 255));
        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setText("Pase a la pregunta 33");
        jPanel12.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, -1, -1));

        jLabel128.setBackground(new java.awt.Color(255, 255, 255));
        jLabel128.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setText("Pase a la pregunta 34");
        jPanel12.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        jLabel129.setBackground(new java.awt.Color(255, 255, 255));
        jLabel129.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setText("34.-¿Donde vivia hace 5 años?");
        jPanel12.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, 160, -1));

        buttonGroup41.add(jRadioButton123);
        jRadioButton123.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton123.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton123.setText("Aqui");
        jRadioButton123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton123ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton123, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, -1, -1));

        buttonGroup41.add(jRadioButton124);
        jRadioButton124.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton124.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton124.setText("En otro lugar del pais");
        jRadioButton124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton124ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton124, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, -1, -1));

        jLabel130.setBackground(new java.awt.Color(255, 255, 255));
        jLabel130.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setText("Pase a la pregunta 35");
        jPanel12.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, -1, -1));

        jLabel131.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setText("Ciudad o comunidad");
        jPanel12.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, -1));

        jLabel132.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setText("Municipio");
        jPanel12.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, -1));

        jLabel133.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setText("Departamento");
        jPanel12.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, -1));

        buttonGroup40.add(jRadioButton125);
        jRadioButton125.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton125.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton125.setText("En el exterior");
        jRadioButton125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton125ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton125, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, -1, 20));

        jLabel134.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setText("Nombre del pais");
        jPanel12.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, -1, -1));

        buttonGroup41.add(jRadioButton130);
        jRadioButton130.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton130.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton130.setText("Aun no habia nacido");
        jPanel12.add(jRadioButton130, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 790, -1, -1));
        jPanel12.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 670, 80, -1));
        jPanel12.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 700, 80, -1));
        jPanel12.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 730, 80, -1));
        jPanel12.add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 760, 90, -1));

        jLabel135.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("35.-¿Sabe leer y escribir?");
        jPanel12.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 830, -1, -1));

        buttonGroup42.add(jRadioButton131);
        jRadioButton131.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton131.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton131.setText("Si");
        jRadioButton131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton131ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton131, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 860, -1, -1));

        buttonGroup42.add(jRadioButton132);
        jRadioButton132.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton132.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton132.setText("No");
        jRadioButton132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton132ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton132, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 890, -1, -1));

        jLabel120.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setText("36.-Actualmente, ¿Asiste a alguna escuela o colegio?");
        jPanel12.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 930, -1, -1));

        buttonGroup43.add(jRadioButton133);
        jRadioButton133.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton133.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton133.setText("Si, a una publica");
        jRadioButton133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton133ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton133, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 960, -1, -1));

        buttonGroup43.add(jRadioButton134);
        jRadioButton134.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton134.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton134.setText("Si, a una privada");
        jPanel12.add(jRadioButton134, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 990, -1, -1));

        buttonGroup43.add(jRadioButton135);
        jRadioButton135.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton135.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton135.setText("Si, a una de convenio");
        jPanel12.add(jRadioButton135, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1020, -1, -1));

        buttonGroup43.add(jRadioButton136);
        jRadioButton136.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton136.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton136.setText("No asiste");
        jPanel12.add(jRadioButton136, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1050, -1, -1));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/47934422-guardar-icono-botón-de-internet-sobre-fondo-blanco - removebg-preview.png"))); // NOI18N
        jButton14.setText("GUARDAR");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1110, -1, -1));

        buttonGroup37.add(jRadioButton199);
        jRadioButton199.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton199.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton199.setText("Reset Seleccion");
        jRadioButton199.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton199ActionPerformed(evt);
            }
        });
        jPanel12.add(jRadioButton199, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1010, -1, -1));

        jButton15.setBackground(new java.awt.Color(0, 51, 255));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura1-removebg-preview (1).png"))); // NOI18N
        jButton15.setText("VOLVER AL MENU");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 1110, 200, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título-2.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel12.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 1200));

        jScrollPane6.setViewportView(jPanel12);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CAPITULO F", jPanel6);

        jPanel21.setMaximumSize(new java.awt.Dimension(1000, 1200));
        jPanel21.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel21.setPreferredSize(new java.awt.Dimension(1000, 1200));

        jScrollPane16.setMaximumSize(new java.awt.Dimension(1000, 1200));
        jScrollPane16.setPreferredSize(new java.awt.Dimension(1000, 1200));

        jPanel22.setMaximumSize(new java.awt.Dimension(1000, 1200));
        jPanel22.setPreferredSize(new java.awt.Dimension(1000, 1200));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel136.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("37.- ¿Cual fue el nivel y curso mas alto de instruccion que aprobo?");
        jPanel22.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel138.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setText("Curso");
        jPanel22.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel137.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(255, 255, 255));
        jLabel137.setText("Nivel");
        jPanel22.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        buttonGroup44.add(jRadioButton137);
        jRadioButton137.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton137.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton137.setText("Ninguno");
        jRadioButton137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton137ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton137, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        buttonGroup44.add(jRadioButton138);
        jRadioButton138.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton138.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton138.setText("Curso de alfabetizacion");
        jRadioButton138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton138ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton138, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        buttonGroup44.add(jRadioButton139);
        jRadioButton139.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton139.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton139.setText("Inicial( pre kinder, kinder)");
        jRadioButton139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton139ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton139, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel139.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setText("Sistema antiguo");
        jPanel22.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        buttonGroup45.add(jRadioButton140);
        jRadioButton140.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton140.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton140.setText("Basico (1 a 5 años)");
        jRadioButton140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton140ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton140, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        buttonGroup45.add(jRadioButton141);
        jRadioButton141.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton141.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton141.setText("Intermedio (1 a 3 años)");
        jRadioButton141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton141ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton141, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        buttonGroup45.add(jRadioButton142);
        jRadioButton142.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton142.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton142.setText("Medio( 1 a 4 años)");
        jRadioButton142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton142ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton142, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        buttonGroup46.add(jRadioButton143);
        jRadioButton143.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton143.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton143.setText("Primaria (1 a 8 años)");
        jRadioButton143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton143ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton143, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel140.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setText("Sistema anterior");
        jPanel22.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        buttonGroup46.add(jRadioButton146);
        jRadioButton146.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton146.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton146.setText("Secundaria (1 a 4 años)");
        jRadioButton146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton146ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton146, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel141.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(255, 255, 255));
        jLabel141.setText("Sistema actual");
        jPanel22.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        buttonGroup47.add(jRadioButton147);
        jRadioButton147.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton147.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton147.setText("Primaria (1 a 6 años)");
        jRadioButton147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton147ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton147, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        buttonGroup47.add(jRadioButton148);
        jRadioButton148.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton148.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton148.setText("Secundaria ( 1 a 6 años)");
        jRadioButton148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton148ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton148, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel142.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setText("Universitario");
        jPanel22.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        buttonGroup48.add(jRadioButton149);
        jRadioButton149.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton149.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton149.setText("Tecnico universitario");
        jRadioButton149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton149ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton149, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        buttonGroup48.add(jRadioButton150);
        jRadioButton150.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton150.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton150.setText("Licenciatura");
        jRadioButton150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton150ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton150, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        buttonGroup48.add(jRadioButton151);
        jRadioButton151.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton151.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton151.setText("Maestria");
        jRadioButton151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton151ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton151, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        buttonGroup48.add(jRadioButton157);
        jRadioButton157.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton157.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton157.setText("Doctorado");
        jRadioButton157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton157ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton157, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        jLabel143.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setText("No universitario");
        jPanel22.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, -1, -1));

        buttonGroup49.add(jRadioButton158);
        jRadioButton158.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton158.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton158.setText("Normal superior");
        jRadioButton158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton158ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton158, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, -1, -1));

        buttonGroup49.add(jRadioButton159);
        jRadioButton159.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton159.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton159.setText("Militar o policial");
        jRadioButton159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton159ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton159, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, -1, -1));

        buttonGroup49.add(jRadioButton160);
        jRadioButton160.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton160.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton160.setText("Tecnico de instituto");
        jRadioButton160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton160ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton160, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 750, -1, -1));

        buttonGroup49.add(jRadioButton161);
        jRadioButton161.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton161.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton161.setText("Otro");
        jRadioButton161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton161ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton161, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, -1, -1));
        jPanel22.add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 100, -1));
        jPanel22.add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 100, -1));
        jPanel22.add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 100, -1));
        jPanel22.add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 100, -1));
        jPanel22.add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 100, -1));
        jPanel22.add(jTextField55, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 100, -1));
        jPanel22.add(jTextField56, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 100, -1));
        jPanel22.add(jTextField57, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 100, -1));
        jPanel22.add(jTextField58, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 100, -1));
        jPanel22.add(jTextField59, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 100, -1));
        jPanel22.add(jTextField60, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 100, -1));
        jPanel22.add(jTextField61, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 80, -1));
        jPanel22.add(jTextField62, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 80, -1));
        jPanel22.add(jTextField63, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 100, -1));
        jPanel22.add(jTextField64, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 690, 80, -1));
        jPanel22.add(jTextField65, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 720, 80, -1));
        jPanel22.add(jTextField66, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 750, 80, -1));
        jPanel22.add(jTextField67, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 780, 80, -1));

        jLabel144.setBackground(new java.awt.Color(255, 255, 255));
        jLabel144.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setText("<html>Pase a la pregunta 39<p>de no haber escogido<p>ninguna de las<p>anteriores areas<html>");
        jPanel22.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, -1, -1));

        jLabel145.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setText("<html>38.- Para ingresar a ese nivel, ¿Cual fue el nivel y <p>curso de educacion escolar que aprobo?<html>");
        jPanel22.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 820, -1, -1));

        jLabel146.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setText("Nivel");
        jPanel22.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 860, -1, -1));

        jLabel147.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setText("Curso");
        jPanel22.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 860, -1, -1));

        jLabel148.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setText("Sistema antiguo");
        jPanel22.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 880, -1, -1));

        buttonGroup50.add(jRadioButton162);
        jRadioButton162.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton162.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton162.setText("Basico (1 a 5 años)");
        jRadioButton162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton162ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton162, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 910, -1, -1));

        buttonGroup50.add(jRadioButton163);
        jRadioButton163.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton163.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton163.setText("Intermedio (1 a 3 años)");
        jRadioButton163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton163ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton163, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 940, -1, -1));

        buttonGroup50.add(jRadioButton164);
        jRadioButton164.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton164.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton164.setText("Medio (1 a 4 años)");
        jRadioButton164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton164ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton164, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 970, -1, -1));

        jLabel149.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setText("Sistema anterior");
        jPanel22.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1000, -1, -1));

        buttonGroup51.add(jRadioButton165);
        jRadioButton165.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton165.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton165.setText("Primaria (1 a 8 años)");
        jRadioButton165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton165ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton165, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1030, -1, -1));

        buttonGroup51.add(jRadioButton166);
        jRadioButton166.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton166.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton166.setText("Secundaria (1 a 4 años)");
        jRadioButton166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton166ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton166, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1060, -1, -1));

        jLabel150.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));
        jLabel150.setText("Sistema actual");
        jPanel22.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1100, -1, -1));

        buttonGroup52.add(jRadioButton167);
        jRadioButton167.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton167.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton167.setText("Primaria (1 a 6 años)");
        jRadioButton167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton167ActionPerformed(evt);
            }
        });
        jPanel22.add(jRadioButton167, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1120, -1, -1));

        buttonGroup52.add(jRadioButton168);
        jRadioButton168.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton168.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton168.setText("Secundaria (1 a 6 años)");
        jPanel22.add(jRadioButton168, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1150, -1, -1));

        jLabel151.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(255, 255, 255));
        jLabel151.setText("39.- Durante la semana pasada ¿Trabajo?");
        jPanel22.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jRadioButton169.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton169.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton169.setText("Si");
        jPanel22.add(jRadioButton169, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jRadioButton170.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton170.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton170.setText("No");
        jPanel22.add(jRadioButton170, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        jLabel152.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setText("Pase a la pregunta 42");
        jPanel22.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));
        jPanel22.add(jTextField68, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 910, 90, -1));
        jPanel22.add(jTextField69, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 940, 90, -1));
        jPanel22.add(jTextField70, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 970, 90, -1));
        jPanel22.add(jTextField71, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1030, 90, -1));
        jPanel22.add(jTextField72, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1060, 90, -1));
        jPanel22.add(jTextField73, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1120, 90, -1));
        jPanel22.add(jTextField74, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1150, 90, -1));

        jLabel153.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setText("40.- Durante la semana pasada, ...");
        jPanel22.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jRadioButton171.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton171.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton171.setText("<html>¿Tenia trabajo, pero no trabajo porque estuvo con licencia,<p>vacacion, enfermo o por falta de materiales<html>");
        jPanel22.add(jRadioButton171, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jRadioButton172.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton172.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton172.setText("<html>¿Atendio o ayudo en los cultivos agricolas o <p>en la crianza de animales?<html>");
        jPanel22.add(jRadioButton172, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jRadioButton173.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton173.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton173.setText("¿Atendio o ayudo en algun negocio propio o familiar?");
        jPanel22.add(jRadioButton173, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jRadioButton174.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton174.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton174.setText("¿Realizo alguna actividad por ingreso?");
        jPanel22.add(jRadioButton174, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jRadioButton175.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton175.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton175.setText("¿No trabajo?");
        jPanel22.add(jRadioButton175, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        jLabel154.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setText("Pase a la pregunta 42");
        jPanel22.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, -1, -1));

        jLabel155.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setText("41.- Durante la semana pasada, ...");
        jPanel22.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        jRadioButton176.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton176.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton176.setText("¿Busco trabajo habiendo trabajado antes?");
        jPanel22.add(jRadioButton176, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        jRadioButton177.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton177.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton177.setText("¿Busco trabajo por primera vez?");
        jPanel22.add(jRadioButton177, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        jRadioButton178.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton178.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton178.setText("¿Estuvo estudiando?");
        jPanel22.add(jRadioButton178, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        jRadioButton179.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton179.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton179.setText("¿Realizo labores de casa?");
        jPanel22.add(jRadioButton179, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        jRadioButton180.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton180.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton180.setText("¿Es jubilado, pensionista o rentista?");
        jPanel22.add(jRadioButton180, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, -1));

        jRadioButton181.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton181.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton181.setText("Otra");
        jPanel22.add(jRadioButton181, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        jLabel156.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setText("Pase a la pregunta 45");
        jPanel22.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, -1, -1));

        jLabel157.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setText("42.- ¿Cual fue su ocupacion, trabajo u oficio principal durante la semana pasada?");
        jPanel22.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, -1));
        jPanel22.add(jTextField75, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 400, -1));

        jLabel158.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel158.setText("43.- En esta ocupacion, ¿Usted trabajo como...");
        jPanel22.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, -1, -1));

        jRadioButton182.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton182.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton182.setText("obrera/o o empleada/o?");
        jPanel22.add(jRadioButton182, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, -1, -1));

        jRadioButton183.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton183.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton183.setText("trabajadora/or por cuenta propia?");
        jPanel22.add(jRadioButton183, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 680, -1, -1));

        jRadioButton184.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton184.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton184.setText("empleadora/or o socia/o?");
        jPanel22.add(jRadioButton184, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 710, -1, -1));

        jRadioButton185.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton185.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton185.setText("trabajadora/or familiar o aprendiz sin remuneracion?");
        jPanel22.add(jRadioButton185, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 740, -1, -1));

        jRadioButton186.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton186.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton186.setText("trabajadora/or del hogar?");
        jPanel22.add(jRadioButton186, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 770, -1, -1));

        jRadioButton187.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton187.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton187.setText("cooperativista de produccion/servicios?");
        jPanel22.add(jRadioButton187, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 800, -1, -1));

        jLabel159.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setText("<html>44.- ¿Que produce, vende o a qu actividad economica se dedica principalmente <p>el lugar o establecimiento donde trabaja?<html>");
        jPanel22.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 840, -1, -1));
        jPanel22.add(jTextField76, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 880, 400, -1));

        jLabel160.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(255, 255, 255));
        jLabel160.setText("45.- ¿Cual es su estado civil o conyugal?");
        jPanel22.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 920, -1, -1));

        jRadioButton188.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton188.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton188.setText("soltera/o ");
        jPanel22.add(jRadioButton188, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 940, -1, -1));

        jRadioButton189.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton189.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton189.setText("casada/o");
        jPanel22.add(jRadioButton189, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 970, -1, -1));

        jRadioButton190.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton190.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton190.setText("conviviente o concubina/o");
        jPanel22.add(jRadioButton190, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1000, -1, -1));

        jRadioButton191.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton191.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton191.setText("separada/o");
        jPanel22.add(jRadioButton191, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1030, -1, -1));

        jRadioButton192.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton192.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton192.setText("divorciada/o");
        jPanel22.add(jRadioButton192, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1060, -1, -1));

        jRadioButton193.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton193.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton193.setText("viuda/o");
        jPanel22.add(jRadioButton193, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1090, -1, -1));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/47934422-guardar-icono-botón-de-internet-sobre-fondo-blanco - removebg-preview.png"))); // NOI18N
        jButton12.setText("GUARDAR");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1110, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(102, 102, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setCaretColor(new java.awt.Color(51, 255, 255));
        jTextArea1.setDisabledTextColor(new java.awt.Color(51, 255, 255));
        jTextArea1.setSelectedTextColor(new java.awt.Color(102, 204, 255));
        jTextArea1.setSelectionColor(new java.awt.Color(51, 255, 255));
        jScrollPane14.setViewportView(jTextArea1);

        jPanel22.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 450, 10));

        jScrollPane15.setBackground(new java.awt.Color(102, 102, 255));
        jScrollPane15.setForeground(new java.awt.Color(102, 102, 255));

        jTextArea2.setBackground(new java.awt.Color(102, 102, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane15.setViewportView(jTextArea2);

        jPanel22.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 470, 10));

        jTextArea3.setBackground(new java.awt.Color(102, 102, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane17.setViewportView(jTextArea3);

        jPanel22.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 470, 10));

        jButton16.setBackground(new java.awt.Color(0, 51, 255));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura1-removebg-preview (1).png"))); // NOI18N
        jButton16.setText("VOLVER AL MENU");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 1110, 200, 60));

        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título-2.png"))); // NOI18N
        jPanel22.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane16.setViewportView(jPanel22);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CAPITULO F1", jPanel21);

        jPanel19.setMaximumSize(new java.awt.Dimension(1000, 1200));
        jPanel19.setPreferredSize(new java.awt.Dimension(1000, 1200));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel162.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setText("46.-En total, ¿Cuantas hijas e hijos nacidos vivos a tenido usted, incluyendo fallecidos o ausentes?");
        jPanel19.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel163.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(255, 255, 255));
        jLabel163.setText("Sino tuvo, anote 0 y pase a la siguiente persona      Numero");
        jPanel19.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel19.add(jTextField77, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 90, -1));

        jLabel164.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(255, 255, 255));
        jLabel164.setText("47.-De sus hijas e hijos nacidos vivos, ¿Cuantos viven actualmente?");
        jPanel19.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel165.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(255, 255, 255));
        jLabel165.setText("Numero");
        jPanel19.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));
        jPanel19.add(jTextField78, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 90, -1));

        jLabel166.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setText("48.-¿En que mes y año nacio su ultima hija o hijo nacido vivo?");
        jPanel19.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel167.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(255, 255, 255));
        jLabel167.setText("Mes");
        jPanel19.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));
        jPanel19.add(jTextField79, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 100, -1));

        jLabel168.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setText("Año");
        jPanel19.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));
        jPanel19.add(jTextField80, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 90, -1));

        jLabel169.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setText("49.- a) Esta ultima hija o hijo ¿Vive actualmente?");
        jPanel19.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        buttonGroup53.add(jRadioButton194);
        jRadioButton194.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton194.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton194.setText("Si");
        jPanel19.add(jRadioButton194, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        buttonGroup53.add(jRadioButton195);
        jRadioButton195.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton195.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton195.setText("No");
        jPanel19.add(jRadioButton195, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel170.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(255, 255, 255));
        jLabel170.setText("50.- b) ¿Donde tuvo lugar su ultimo parto?");
        jPanel19.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        buttonGroup54.add(jRadioButton196);
        jRadioButton196.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton196.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton196.setText("En un establecimiento de salud");
        jPanel19.add(jRadioButton196, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        buttonGroup54.add(jRadioButton197);
        jRadioButton197.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton197.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton197.setText("En un domicilio");
        jPanel19.add(jRadioButton197, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        buttonGroup54.add(jRadioButton198);
        jRadioButton198.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton198.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton198.setText("En otro lugar");
        jPanel19.add(jRadioButton198, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/47934422-guardar-icono-botón-de-internet-sobre-fondo-blanco - removebg-preview.png"))); // NOI18N
        jButton10.setText("GUARDAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, -1, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/89130609-bandera-de-bolivia-alrededor-del-icono-del-pin-vector-illustración-libre-de-derechos-removebg-preview (3).png"))); // NOI18N
        jPanel19.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, -1, 210));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/censo.png"))); // NOI18N
        jPanel19.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, 280));

        jButton17.setBackground(new java.awt.Color(0, 51, 255));
        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura1-removebg-preview (1).png"))); // NOI18N
        jButton17.setText("VOLVER AL MENU");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));

        jLabel161.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(255, 255, 255));
        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título-2.png"))); // NOI18N
        jPanel19.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("CAPITULO F2", jPanel19);

        jPanel14.setMaximumSize(new java.awt.Dimension(900, 600));
        jPanel14.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel14.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-wallpaper (2).jpg"))); // NOI18N
        jLabel22.setText("900, 600");
        jLabel22.setMaximumSize(new java.awt.Dimension(800, 469));
        jLabel22.setMinimumSize(new java.awt.Dimension(800, 500));
        jLabel22.setPreferredSize(new java.awt.Dimension(800, 469));
        jPanel14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        jScrollPane8.setMaximumSize(new java.awt.Dimension(900, 600));
        jScrollPane8.setPreferredSize(new java.awt.Dimension(900, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable1);

        jPanel14.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 950, 190));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTable2);

        jPanel14.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 460, 160));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("CAPITULO  B");
        jPanel14.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("CAPITULO A");
        jPanel14.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jButton13.setText("jButton13");
        jPanel14.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane18.setViewportView(jTable7);

        jPanel14.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 327, 270, 240));

        jScrollPane7.setViewportView(jPanel14);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", jPanel13);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-wallpaper (2).jpg"))); // NOI18N
        jPanel15.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("CAPITULO C");
        jPanel15.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jTable3);

        jPanel15.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 70, 920, 180));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("CAPITULO D");
        jPanel15.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTable4);

        jPanel15.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 920, 200));

        jTabbedPane1.addTab("", jPanel15);

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-wallpaper (2).jpg"))); // NOI18N
        jPanel16.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("CAPITULO E");
        jPanel16.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("CAPITULO F");
        jPanel16.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(jTable5);

        jPanel16.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 940, 190));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane13.setViewportView(jTable6);

        jPanel16.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 940, 200));

        jTabbedPane1.addTab("", jPanel16);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        try {
            String sql = "insert into ubicaciongeografica (CodMunicipal, Distrito, CiudadComunidad, ZonaCensal, Sector,Ciudad,Localidad,Zona,Avenida,Piso,NroDepartamento,NumeroOrden,NumeroVivienda,NrPuerta,NomEdificio,Mujeres,Hombres,TotalPersonas)"+
                    "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, jTextField1.getText());
            ps.setString(2, jTextField2.getText());
            ps.setString(3, jTextField3.getText());
            ps.setString(4, jTextField4.getText());
            ps.setString(5, jTextField5.getText());
            ps.setString(6, jTextField6.getText());
            ps.setString(7, jTextField7.getText());
            ps.setString(8, jTextField8.getText());
            ps.setString(9, jTextField9.getText());
            ps.setString(10, jTextField10.getText());
            ps.setString(11, jTextField11.getText());
            ps.setString(12, jTextField12.getText());
            ps.setString(13, jTextField13.getText());
            ps.setString(14, jTextField14.getText());
            ps.setString(15, jTextField15.getText());
            ps.setString(16, jTextField16.getText());
            ps.setString(17, jTextField17.getText());
            ps.setString(18, jTextField18.getText());
            
            
            
            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }

        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error" + e.getMessage());
        }
        Llenar();
           

              
                        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String Vivienda;
        String Observacion;
        String MaterialConstruccion;
        String revoque;
        String TechoVivienda;
        String MaterialMasUsado;
        String ProveerAgua;
        String AguaEnLaVivienda;
        String ServicioSanitario;
        String EnergiaElectrica;
        String TieneDesague;
        String Combustible;
        String CuartoDeCocina;
       
        if(jRadioButton1.isSelected() == true){
            Vivienda = "Casa/Choza/Pahuichi";
        }else if(jRadioButton2.isSelected()== true){
            Vivienda = "Departamento";
            }else if(jRadioButton3.isSelected()== true) {
           Vivienda = "Cuarto(s) o habitacion(es) o suelta(s)";
        } else if(jRadioButton4.isSelected()== true){
            Vivienda = "Vivienda improvisada";
            }else if(jRadioButton5.isSelected()== true) {
           Vivienda = "Local no destinado para vivienda";
        }else if(jRadioButton6.isSelected()== true) {
           Vivienda = "Vivienda colectiva (Hoteles, Hospitales y otros)";
        } else if(jRadioButton7.isSelected()== true){
            Vivienda = "En transito";
            }else if(jRadioButton8.isSelected()== true) {
           Vivienda = "Persona que vive en la calle";
        }else{
            Vivienda = null;
            }
        if(jRadioButton9.isSelected() == true){
          Observacion = "Ocupada con personas presentes";
        }else if(jRadioButton10.isSelected() == true){
           Observacion ="Ocupada con personas Temporalmente ausentes";
        }else if(jRadioButton11.isSelected() == true){
           Observacion="Para alquilar y/o vender";
        }else if(jRadioButton12.isSelected() == true){
           Observacion="En construccion o en reparacion";
        }else if (jRadioButton13.isSelected() == true){
           Observacion="Abandonada";
        }else {
           Observacion=null;
        }
        
        if(jRadioButton14.isSelected() == true){
          MaterialConstruccion = "Ladrillo, Bloque de cemento, Hormigon";
        }else if(jRadioButton15.isSelected() == true){
           MaterialConstruccion ="Adobe, tapial";
        }else if(jRadioButton16.isSelected() == true){
           MaterialConstruccion="Tabique, Quinche";
        }else if(jRadioButton17.isSelected() == true){
           MaterialConstruccion="Piedra";
        }else if (jRadioButton18.isSelected() == true){
           MaterialConstruccion="Madera";
        }else if(jRadioButton19.isSelected() == true){
           MaterialConstruccion="Caña, Palma, Tronco";
        }else if (jRadioButton20.isSelected() == true){
           MaterialConstruccion="Otro";
        }else {
           MaterialConstruccion=null;
        }
        //2.4
        if(jRadioButton21.isSelected() == true){
          revoque = "SI";
        }else if(jRadioButton22.isSelected() == true){
          revoque = "NO";
        }else{
          revoque = null;
        }
        //2.5
        if(jRadioButton23.isSelected() == true){
           TechoVivienda="Calamina o plancha metaica";
        }else if(jRadioButton24.isSelected() == true){
           TechoVivienda="Teja de arcilla, Teja de Cemento, Fibrocementro";
        }else if(jRadioButton25.isSelected() == true){
           TechoVivienda="Losa de hormigon armado";
        }else if(jRadioButton26.isSelected() == true){
           TechoVivienda="Paja, Palma, Caña, Barro";
        }else if(jRadioButton27.isSelected() == true){
           TechoVivienda="Otro";
        }else {
           TechoVivienda=null;
        }
        //2.6
        if(jRadioButton28.isSelected() == true){
           MaterialMasUsado="Tierra";
        }else if(jRadioButton29.isSelected() == true){
           MaterialMasUsado="Tablon de madera";
        }else if(jRadioButton30.isSelected() == true){
           MaterialMasUsado="Machimbre";
        }else if(jRadioButton31.isSelected() == true){
           MaterialMasUsado="Machimbre";
        }else if(jRadioButton32.isSelected() == true){
           MaterialMasUsado="Ceramica";
        }else if(jRadioButton33.isSelected() == true){
           MaterialMasUsado="Cemento";
        }else if(jRadioButton34.isSelected() == true){
           MaterialMasUsado="Mosaico, Baldosa";
        }else if(jRadioButton35.isSelected() == true){
           MaterialMasUsado="Ladrillo";
        }else if(jRadioButton36.isSelected() == true){
           MaterialMasUsado="Otro";
        }else {
           MaterialMasUsado=null;
        }
        //2.7
        if(jRadioButton37.isSelected() == true){
          ProveerAgua = "Cañeria de red?";
        }else if(jRadioButton38.isSelected() == true){
          ProveerAgua = "Pileta publica?";
        }else if(jRadioButton39.isSelected() == true){
          ProveerAgua = "Carro repartidor (Aguatero)?";
        }else if(jRadioButton40.isSelected() == true){
          ProveerAgua = "Pozo o noria con bomba?";
        }else if(jRadioButton41.isSelected() == true){
          ProveerAgua = "Pozo o noria sin bomba?";
        }else if(jRadioButton42.isSelected() == true){
          ProveerAgua = "Lluvia, rio, vertiente, Acequia?";
        }else if(jRadioButton43.isSelected() == true){
          ProveerAgua = "Lluvia, rio, vertiente, Acequia?";
        }else{
          ProveerAgua = null;
        } 
        //2.8
        if(jRadioButton44.isSelected() == true){
            AguaEnLaVivienda = "Por cañeria dentro de la vivienda?";
        }else if(jRadioButton45.isSelected() == true){
          AguaEnLaVivienda = "Por cañeria fuera de la vivienda, pero dentro del terreno?";
        }else if(jRadioButton46.isSelected() == true){
          AguaEnLaVivienda = "Por cañeria fuera de la vivienda del  terreno?";
        }else if(jRadioButton47.isSelected() == true){
          AguaEnLaVivienda = "No se distribuye por cañeria.";
        }else{
          AguaEnLaVivienda = null;
        } if(jRadioButton50.isSelected() == true){
             jRadioButton50.setEnabled(false);
         }  else{
        jRadioButton50.setEnabled(true);
        }
        //2.9
        if(jRadioButton48.isSelected() == true){
          ServicioSanitario = "Si, de uso privado";
        }else if(jRadioButton49.isSelected() == true){
          ServicioSanitario = "Si, de uso compartido";
        }else if(jRadioButton50.isSelected() == true){
          ServicioSanitario = "No tiene";
        }else{
          ServicioSanitario = null;
        }
        
          
        //2.10
        
        if(jRadioButton51.isSelected() == true){
          TieneDesague = "Al alcantarillado?";
        }else if(jRadioButton52.isSelected() == true){
          TieneDesague = "A una camara septica?";
        }else if(jRadioButton53.isSelected() == true){
          TieneDesague = "A un pozo ciego?";
        }else if(jRadioButton54.isSelected() == true){
          TieneDesague = "A la calle?";
        }else if(jRadioButton55.isSelected() == true){
          TieneDesague = "A la quebrada, rio?";
        }else if(jRadioButton56.isSelected() == true){
          TieneDesague = "A un lago, laguna, curichi";
        }else {
          TieneDesague=null; 
        } 
        
        //2.11
         if(jRadioButton57.isSelected() == true){
          EnergiaElectrica = "Red de empresa electrica (Servicio publico)?";
        }else if(jRadioButton58.isSelected() == true){
          EnergiaElectrica = "Motor propio?";
        }else if(jRadioButton59.isSelected() == true){
          EnergiaElectrica = "Panel solar?";
        }else if(jRadioButton60.isSelected() == true){
          EnergiaElectrica = "Otro?";
        }else if(jRadioButton61.isSelected() == true){
          EnergiaElectrica = "No tiene?";
        }else{
          EnergiaElectrica = null;
        }
         //2.12
        if(jRadioButton62.isSelected() == true){
          Combustible = "Gas domiciliario (por cañeria)";
        }else if(jRadioButton63.isSelected() == true){
          Combustible = "Gas en garrafa";
        }else if(jRadioButton64.isSelected() == true){
          Combustible = "Electricidad";
        }else if(jRadioButton65.isSelected() == true){
          Combustible = "Energia solar";
        }else if(jRadioButton66.isSelected() == true){
          Combustible = "Leña";
        }else if(jRadioButton67.isSelected() == true){
          Combustible = "Guano, Bosta o Taquia";
        }else if(jRadioButton68.isSelected() == true){
          Combustible = "Otro";
        }else if(jRadioButton69.isSelected() == true){
          Combustible = "No cocina";
        }else{
          Combustible = null; 
        }
        // 2.13
         if(jRadioButton70.isSelected() == true){
          CuartoDeCocina = "SI";
        }else if(jRadioButton71.isSelected() == true){
          CuartoDeCocina = "NO";
        }else{
          CuartoDeCocina = null; 
        }
        try {
            String sql = "insert into vivienda (Vivienda,Observacion,MaterialConstruccion,revoque,TechoVivienda,MaterialMasUsado,ProveerAgua,AguaEnLaVivienda,ServicioSanitario,TieneDesague,EnergiaElectrica,Combustible,CuartoDeCocina)"+
                    "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, Vivienda);
            ps.setString(2,Observacion );
            ps.setString(3,MaterialConstruccion );
            ps.setString(4,revoque );
            ps.setString(5,TechoVivienda);
            ps.setString(6,MaterialMasUsado);
            ps.setString(7,ProveerAgua);
            ps.setString(8,AguaEnLaVivienda);
            ps.setString(9,ServicioSanitario);
            ps.setString(10,TieneDesague);
            ps.setString(11,EnergiaElectrica);
            ps.setString(12,Combustible);
            ps.setString(13,CuartoDeCocina);
            
            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error" + e.getMessage());
        }
        
       
       try {
            conn = Mysql.getConnection();
            String[]titulos = {"Vivienda","Observacion","MaterialConstruccion","revoque","TechoVivienda","ProveerAgua","AguaEnLaVivienda","ServicioSanitario","TieneDesague","EnergiaElectrica","Combustible","CuartoDeCocina"}; 
            String sql = "SELECT * from vivienda";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[12];
            while(rs.next()){
                fila[0]=rs.getString("Vivienda");
                fila[1]=rs.getString("Observacion");
                fila[2]=rs.getString("MaterialConstruccion");
                fila[3]=rs.getString("revoque");
                fila[4]=rs.getString("TechoVivienda");
                fila[5]=rs.getString("ProveerAgua");
                fila[6]=rs.getString("AguaEnLaVivienda");
                fila[7]=rs.getString("ServicioSanitario");
                fila[8]=rs.getString("TieneDesague");
                fila[9]=rs.getString("Combustible");
                fila[10]=rs.getString("EnergiaElectrica");
                fila[11]=rs.getString("CuartoDeCocina");
                model.addRow(fila);
            }
            jTable2.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
       
       
        Llenar();
        
        
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked
    
    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code 
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton43ActionPerformed

    private void jRadioButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton48ActionPerformed
       buttonGroup9.add(jRadioButton48);
        jRadioButton51.setEnabled(true);
        jRadioButton52.setEnabled(true);
        jRadioButton53.setEnabled(true);
        jRadioButton54.setEnabled(true);
        jRadioButton55.setEnabled(true);
        jRadioButton56.setEnabled(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton48ActionPerformed

    private void jRadioButton50KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton50KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton50KeyReleased

    private void jRadioButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton50ActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton50ActionPerformed

    private void jRadioButton50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton50MouseClicked
        if(jRadioButton50.isSelected()){
           jRadioButton51.setEnabled(false);
           jRadioButton52.setEnabled(false);
           jRadioButton53.setEnabled(false);
           jRadioButton54.setEnabled(false);
           jRadioButton55.setEnabled(false);
           jRadioButton56.setEnabled(false);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton50MouseClicked

    private void jRadioButton51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton51MouseClicked
               // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton51MouseClicked

    private void jRadioButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton49ActionPerformed
        buttonGroup9.add(jRadioButton49);
        jRadioButton51.setEnabled(true);
        jRadioButton52.setEnabled(true);
        jRadioButton53.setEnabled(true);
        jRadioButton54.setEnabled(true);
        jRadioButton55.setEnabled(true);
        jRadioButton56.setEnabled(true); // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton49ActionPerformed

    private void jRadioButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton51ActionPerformed

    private void jRadioButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton68ActionPerformed

    private void jRadioButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton63ActionPerformed

    private void jRadioButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton109ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton109ActionPerformed

    private void jRadioButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton106ActionPerformed
        buttonGroup14.add(jRadioButton106);
        jTextField21.setEnabled(true);
        jTextField22.setEnabled(true);
        jRadioButton108.setEnabled(true);
        jRadioButton109.setEnabled(true);
        jTextField27.setEnabled(true);
        jTextField31.setEnabled(true);
        jTextField35.setEnabled(true); 
       // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton106ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       String deViaje;
       String sexo;
       
       //3.20
         
       if(jRadioButton106.isSelected() == true){
          deViaje = "SI";
       }else if(jRadioButton107.isSelected() == true){
          deViaje = "NO";
       }else{
          deViaje = null;
       }
       
       if(jRadioButton108.isSelected() == true){
          sexo="Mujer";
       }else if (jRadioButton109.isSelected() == true){
          sexo="Hombre";   
       }else {
          sexo = null;
       } 
       
       
       try {
            
            String sql1 ="insert into emigracioninterlacional(deViaje,CantPersonas,nomPersona,sexo,AñoSalida,EdadSalida,Residencia)"+"Values(?,?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareCall(sql1);
            ps.setString(1, deViaje);
            ps.setString(2, jTextField21.getText());
            ps.setString(3, jTextField22.getText());
            ps.setString(4, sexo);
            ps.setString(5, jTextField27.getText());
            ps.setString(6, jTextField31.getText());
            ps.setString(7, jTextField35.getText());
            
            
            
            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error" + e.getMessage());      
        }
       try {
            conn = Mysql.getConnection();
            String[]titulos = {"deViaje","CantPersonas","nomPersona","sexo","AñoSalida","EdadSalida","Residencia"}; 
            String sql = "SELECT * from emigracioninterlacional";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[20];
            while(rs.next()){
                fila[0]=rs.getString("deViaje");
                fila[1]=rs.getString("CantPersonas");
                fila[2]=rs.getString("nomPersona");
                fila[3]=rs.getString("sexo");
                fila[4]=rs.getString("AñoSalida");
                fila[5]=rs.getString("EdadSalida");
                fila[6]=rs.getString("Residencia");
                model.addRow(fila);
            }
            jTable3.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Llenar();
        
                    
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jRadioButton106KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton106KeyReleased
          // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton106KeyReleased

    private void jRadioButton107KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton107KeyReleased
      // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton107KeyReleased

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
       String Muerte;
       String sexo;
       String PerMayor;
       //3.20
       
       if(jRadioButton116.isSelected() == true){
          Muerte = "SI";
       }else if(jRadioButton117.isSelected() == true){
          Muerte = "NO";
       }else{
          Muerte = null;
       }
       
       if(jRadioButton118.isSelected() == true){
          sexo="Mujer";
       }else if (jRadioButton119.isSelected() == true){
          sexo="Hombre";   
       }else {
          sexo = null;
       } 
       
       if(jRadioButton126.isSelected() == true){
          PerMayor="Embarazo";
       }else if (jRadioButton127.isSelected() == true){
          PerMayor="Parto";   
       }else if(jRadioButton128.isSelected()== true){
          PerMayor = "El sobreparto (hasta 2 meses después del parto)";
       } else if (jRadioButton129.isSelected() == true){
          PerMayor="Otra causa";   
       }else {
          PerMayor = null;
       }
       
           
       try {
            
            String sql1 ="insert into mortalidad(Muerte,CantMuertes,nomPersonaF,EdadPersona,sexo,PerMayor)"+"Values(?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareCall(sql1);
            ps.setString(1, Muerte);
            ps.setString(2, jTextField20.getText());
             ps.setString(3, jTextField40.getText());
            ps.setString(4, jTextField44.getText());
            ps.setString(5, sexo);
            ps.setString(6, PerMayor);
           
            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error" + e.getMessage());      
        }
       try {
            conn = Mysql.getConnection();
            String[]titulos = {"Muerte","CantMuertes","nomPersonaF","EdadPersona","sexo","PerMayor"}; 
            String sql = "SELECT * from mortalidad";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[6];
            while(rs.next()){
                fila[0]=rs.getString("Muerte");
                fila[1]=rs.getString("CantMuertes");
                fila[2]=rs.getString("nomPersonaF");
                fila[3]=rs.getString("EdadPersona");
                fila[4]=rs.getString("sexo");
                fila[5]=rs.getString("PerMayor");
                
                model.addRow(fila);
            }
            jTable4.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Llenar();
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        String dificult;
       String sexo;
       String discapacidad;
       //3.20
       
       if(jRadioButton72.isSelected() == true){
          dificult = "SI";
       }else if(jRadioButton73.isSelected() == true){
          dificult = "NO";
       }else{
          dificult = null;
       }
       
       if(jRadioButton144.isSelected() == true){
          sexo="Mujer";
       }else if (jRadioButton145.isSelected() == true){
          sexo="Hombre";   
       }else {
          sexo = null;
       } 
       
       if(jRadioButton152.isSelected() == true){
          discapacidad="Ver, aun si usa anteojoso lentes?";
       }else if (jRadioButton153.isSelected() == true){
          discapacidad="Oir, aun si usa audifono?";   
       }else if(jRadioButton154.isSelected()== true){
          discapacidad = "Hablar, comunicarse o conversar?";
       } else if (jRadioButton155.isSelected() == true){
          discapacidad="Caminar o subir escalones?";   
       }else if (jRadioButton156.isSelected() == true){
          discapacidad="Recordar o centrarse?";   
       }else {
          discapacidad = null;
       }
       
           
       try {
            
            String sql1 ="insert into dificultadpermanente(dificult,nomPersona,EdadPersona,sexo,discapacidad)"+"Values(?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareCall(sql1);
            ps.setString(1, dificult);
            ps.setString(2, jTextField48.getText());
            ps.setString(3, jTextField52.getText());
            ps.setString(4, sexo);
            ps.setString(5, discapacidad);
           
            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error" + e.getMessage());      
        }
       try {
            conn = Mysql.getConnection();
            String[]titulos = {"dificult","nomPersona","EdadPersona","sexo","discapacidad"}; 
            String sql = "SELECT * from dificultadpermanente";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[5];
            while(rs.next()){
                fila[0]=rs.getString("dificult");
                fila[1]=rs.getString("nomPersona");
                fila[2]=rs.getString("EdadPersona");
                fila[3]=rs.getString("sexo");
                fila[4]=rs.getString("discapacidad");
                
                
                model.addRow(fila);
            }
            jTable5.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Llenar();
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jButton8MouseClicked

    private void jRadioButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton114ActionPerformed
            buttonGroup38.add(jRadioButton114);
         jRadioButton122.setEnabled(true);
        jTextField32.setEnabled(false);
        jTextField33.setEnabled(false);
        jTextField34.setEnabled(false);
        jTextField36.setEnabled(true);
         jTextField37.setEnabled(true);
        
          // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton114ActionPerformed

    private void jRadioButton120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton120ActionPerformed
               buttonGroup40.add(jRadioButton120);
         jRadioButton121.setEnabled(true);
        jTextField38.setEnabled(false);
        jTextField39.setEnabled(false);
        jTextField41.setEnabled(false);
        jTextField42.setEnabled(false);
         jRadioButton125.setEnabled(false);
    }//GEN-LAST:event_jRadioButton120ActionPerformed

    private void jRadioButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton107ActionPerformed
          buttonGroup14.add(jRadioButton106);
        jTextField21.setEnabled(false);
        jTextField22.setEnabled(false);
        jRadioButton108.setEnabled(false);
        jRadioButton109.setEnabled(false);
        jTextField27.setEnabled(false);
        jTextField31.setEnabled(false);
        jTextField35.setEnabled(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton107ActionPerformed

    private void jRadioButton116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton116ActionPerformed
         buttonGroup21.add(jRadioButton116);
        jTextField20.setEnabled(true);
        jTextField40.setEnabled(true);
        jRadioButton118.setEnabled(true);
        jRadioButton119.setEnabled(true);
        jTextField44.setEnabled(true);
        jRadioButton126.setEnabled(true);
        jRadioButton127.setEnabled(true);
        jRadioButton128.setEnabled(true);
        jRadioButton129.setEnabled(true);
          // TODO add your handling true here:
    }//GEN-LAST:event_jRadioButton116ActionPerformed

    private void jRadioButton117MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton117MouseClicked
   if(jRadioButton117.isSelected()){
           jTextField20.setEnabled(false);
        jTextField40.setEnabled(false);
        jRadioButton118.setEnabled(false);
        jRadioButton119.setEnabled(false);
        jTextField44.setEnabled(false);
        jRadioButton126.setEnabled(false);
        jRadioButton127.setEnabled(false);
        jRadioButton128.setEnabled(false);
        jRadioButton129.setEnabled(false);
       }         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton117MouseClicked

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jRadioButton108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton108ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton108ActionPerformed

    private void jRadioButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton72ActionPerformed
     buttonGroup22.add(jRadioButton72);
        jTextField48.setEnabled(true);
        jTextField52.setEnabled(true);
        jRadioButton44.setEnabled(true);
        jRadioButton45.setEnabled(true);
         jRadioButton144.setEnabled(true);
          jRadioButton145.setEnabled(true);
        jRadioButton152.setEnabled(true);
        jRadioButton153.setEnabled(true);
        jRadioButton154.setEnabled(true);
        jRadioButton155.setEnabled(true);
        jRadioButton156.setEnabled(true);
        
           
    }//GEN-LAST:event_jRadioButton72ActionPerformed

    private void jRadioButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton73ActionPerformed
    if(jRadioButton73.isSelected()){
    jTextField48.setEnabled(false);
        jTextField52.setEnabled(false);
        jRadioButton44.setEnabled(false);
        jRadioButton45.setEnabled(false);
        jRadioButton144.setEnabled(false);
        jRadioButton145.setEnabled(false);
        jRadioButton152.setEnabled(false);
        jRadioButton153.setEnabled(false);
        jRadioButton154.setEnabled(false);
        jRadioButton155.setEnabled(false);
        jRadioButton156.setEnabled(false);
    }        // TODO add your false code here:
    }//GEN-LAST:event_jRadioButton73ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       String relacion;
       String Sexo;
       String RegistroCivil;
       String Carnet;
       String CajaDesalud;
       String SeguroPrivado;
       String establecimientoSaludPublico;
       String establecimientoSaludPrivado;
       String MedicoTradicional;
       String SolucionesCaseras;
       String FarmacioOautomedicacion;
       String NacionOpueblo;
       String NoHabla;
       String nacimiento;
       String exterior;  
       String Residencia;
       String Residencia5anios;
       String saberescribir;
       String asistenciaColegio;

       if(jRadioButton74.isSelected() == true){
          relacion = "Jefe del hogar";
       }else if(jRadioButton75.isSelected() == true){
          relacion = "Esposo/a, conviviente o concubino/a";
       }else if(jRadioButton76.isSelected() == true){
          relacion = "Hija o hijo";
       }else if(jRadioButton77.isSelected() == true){
          relacion = "Nuera o Yerno";
       }else if(jRadioButton78.isSelected() == true){
          relacion = "Nieta o nieto";
       }else if(jRadioButton79.isSelected() == true){
          relacion = "Hermana/o o cuñada/o";
       }else if(jRadioButton80.isSelected() == true){
          relacion = "Padre, madre, suegra/o";
       }else if(jRadioButton81.isSelected() == true){
          relacion = "Otro pariente";
       }else if(jRadioButton82.isSelected() == true){
          relacion = "Trabajador/a del hogar";
       }else if(jRadioButton83.isSelected() == true){
          relacion = "Otro no pariente";
       }else if(jRadioButton84.isSelected() == true){
          relacion = "Persona en vivienda colectiva ";
       }else{
          relacion = null;     
       }
       
       if(jRadioButton85.isSelected() == true){
          Sexo="Mujer";
       }else if (jRadioButton86.isSelected() == true){
          Sexo="Hombre";   
       }else {
          Sexo = null;
       } 
       
      if(jRadioButton87.isSelected() == true){
          RegistroCivil="SI";
       }else if (jRadioButton88.isSelected() == true){
          RegistroCivil="NO";   
       }else {
          RegistroCivil = null;
       } 
       
       if(jRadioButton89.isSelected() == true){
          Carnet="SI";
       }else if (jRadioButton90.isSelected() == true){
          Carnet="NO";   
       }else {
          Carnet = null;
       } 
       
       if(jRadioButton91.isSelected() == true){
          CajaDesalud="SI";
       }else if (jRadioButton92.isSelected() == true){
          CajaDesalud="NO";   
       }else {
          CajaDesalud = null;
       } 
       
       if(jRadioButton93.isSelected() == true){
          SeguroPrivado="SI";
       }else if (jRadioButton94.isSelected() == true){
          SeguroPrivado="NO";   
       }else {
          SeguroPrivado = null;
       } 
       
       if(jRadioButton95.isSelected() == true){
          establecimientoSaludPublico="SI";
       }else if (jRadioButton96.isSelected() == true){
          establecimientoSaludPublico="NO";   
       }else {
          establecimientoSaludPublico = null;
       } 
       
       if(jRadioButton97.isSelected() == true){
          establecimientoSaludPrivado="SI";
       }else if (jRadioButton98.isSelected() == true){
          establecimientoSaludPrivado="NO";   
       }else {
          establecimientoSaludPrivado = null;
       } 
       
       if(jRadioButton99.isSelected() == true){
          MedicoTradicional="SI";
       }else if (jRadioButton100.isSelected() == true){
          MedicoTradicional="NO";   
       }else {
          MedicoTradicional = null;
       } 
       
       if(jRadioButton101.isSelected() == true){
          SolucionesCaseras="SI";
       }else if (jRadioButton102.isSelected() == true){
          SolucionesCaseras="NO";   
       }else {
          SolucionesCaseras = null;
       } 
       
       if(jRadioButton103.isSelected() == true){
          FarmacioOautomedicacion="SI";
       }else if (jRadioButton104.isSelected() == true){
          FarmacioOautomedicacion="NO";   
       }else {
          FarmacioOautomedicacion = null;
       } 
       
        if(jRadioButton105.isSelected() == true){
          NacionOpueblo="Si";
          
       }else if (jRadioButton110.isSelected() == true){
          NacionOpueblo="No pertenece"; 
          
       }else if (jRadioButton111.isSelected() == true){
          NacionOpueblo="NO soy Boliviano";   
       }else {
          NacionOpueblo = null;
       } 
           
        if(jRadioButton112.isSelected() == true){
          NoHabla="No habla";
          }else {
          NoHabla = null;
          }
        
        if(jRadioButton113.isSelected() == true){
          nacimiento="Aqui";
       }else if (jRadioButton114.isSelected() == true){
          nacimiento="En otro lugar";   
       }else {
          nacimiento = null;
       }
        
        if(jRadioButton122.isSelected() == true){
          exterior="En el exterior";
       }else{
          exterior = null;
       }
        
        
        if(jRadioButton120.isSelected() == true){
          Residencia="Aqui";
       }else if (jRadioButton121.isSelected() == true){
          Residencia="En otro lugar del pais";   
       }else if (jRadioButton125.isSelected() == true){
          Residencia="En el exterior";   
       }else{
          Residencia = null;
       }
        
         if(jRadioButton123.isSelected() == true){
          Residencia5anios="Aqui";
       }else if (jRadioButton124.isSelected() == true){
          Residencia5anios="En otro lugar del pais";   
       }else if (jRadioButton115.isSelected() == true){
          Residencia5anios="En el exterior";   
       }else if (jRadioButton130.isSelected() == true){
          Residencia5anios="Aun no habia nacido";   
       }else{
          Residencia5anios = null;
       }
         
       if(jRadioButton131.isSelected() == true){
          saberescribir="SI";
       }else if (jRadioButton132.isSelected() == true){
          saberescribir="NO";   
       }else {
          saberescribir = null;
       } 
       
        if(jRadioButton133.isSelected() == true){
          asistenciaColegio="Si, a una publica";
       }else if (jRadioButton134.isSelected() == true){
          asistenciaColegio="Si, a una privada";   
       }else if (jRadioButton135.isSelected() == true){
          asistenciaColegio="Si, a una de convenio";   
       }else if (jRadioButton136.isSelected() == true){
          asistenciaColegio="No asiste";   
       }else {
          asistenciaColegio = null;
       } 
       
        try {
            
            String sql1 ="insert into caracteristicaspersona(relacion,Sexo,Edad,RegistroCivil,Carnet,CajaDesalud,SeguroPrivado,establecimientoSaludPublico,establecimientoSaludPrivado,MedicoTradicional,SolucionesCaseras,FarmacioOautomedicacion,NacionOpueblo,aCual,IdiomaNines,NoHabla,idioma1,idioma2,idioma3,idioma4,nacimiento,ciudad,municipio,departamento,exterior,exteriorPais,llegadaDelExterior,Residencia,ResidenciaC,ResidenciaM,ResidenciaD,ResidenciaEx,Residencia5anios,Residenciaciudad5anios,Residenciamunicipio5anios,Residenciadepartamento5anios,Residenciaexterior5años,saberescribir,asistenciaColegio)"+"Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareCall(sql1);
            ps.setString(1, relacion);
            ps.setString(2, Sexo);
            ps.setString(3, jTextField23.getText());
            ps.setString(4, RegistroCivil);
            ps.setString(5, Carnet);
            ps.setString(6, CajaDesalud);
            ps.setString(7, SeguroPrivado);
            ps.setString(8, establecimientoSaludPublico);
            ps.setString(9, establecimientoSaludPrivado);
            ps.setString(10, MedicoTradicional);
            ps.setString(11, SolucionesCaseras);
            ps.setString(12, FarmacioOautomedicacion);
            ps.setString(13, NacionOpueblo);
            ps.setString(14, jTextField24.getText());
            ps.setString(15, jTextField25.getText());
            ps.setString(16, NoHabla);
            ps.setString(17, jTextField26.getText());
            ps.setString(18, jTextField28.getText());
            ps.setString(19, jTextField29.getText());
            ps.setString(20, jTextField30.getText());
            ps.setString(21, nacimiento);
            ps.setString(22, jTextField32.getText());
            ps.setString(23, jTextField33.getText());
            ps.setString(24, jTextField34.getText());
            ps.setString(25, exterior);
            ps.setString(26, jTextField36.getText());
            ps.setString(27, jTextField37.getText());
            ps.setString(28, Residencia);
            ps.setString(29, jTextField38.getText());
            ps.setString(30, jTextField39.getText());
            ps.setString(31, jTextField41.getText());
            ps.setString(32, jTextField42.getText());
            ps.setString(33, Residencia5anios);
            ps.setString(34, jTextField43.getText());
            ps.setString(35, jTextField45.getText());
            ps.setString(36, jTextField46.getText());
            ps.setString(37, jTextField47.getText());
            ps.setString(38, saberescribir);
            ps.setString(39, asistenciaColegio);
            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error" + e.getMessage());      
        }
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"relacion","Sexo","Edad","RegistroCivil","Carnet","CajaDesalud","SeguroPrivado","establecimientoSaludPublico","establecimientoSaludPrivado","MedicoTradicional","SolucionesCaseras","FarmacioOautomedicacion","NacionOpueblo","aCual","IdiomaNines","NoHabla","idioma1","idioma2","idioma3","idioma4","nacimiento","ciudad","municipio","departamento","exterior","exteriorPais","llegadaDelExterior","Residencia","ResidenciaC","ResidenciaM","ResidenciaD","ResidenciaEx","Residencia5anios","Residenciaciudad5anios","Residenciamunicipio5anios","Residenciadepartamento5anios","Residenciaexterior5años","saberescribir","asistenciaColegio"}; 
            String sql = "SELECT * from caracteristicaspersona";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[40];
            while(rs.next()){
                fila[0]=rs.getString("relacion");
                fila[1]=rs.getString("Sexo");
                fila[2]=rs.getString("Edad");
                fila[3]=rs.getString("RegistroCivil");
                fila[4]=rs.getString("Carnet");
                fila[5]=rs.getString("CajaDesalud");
                fila[6]=rs.getString("SeguroPrivado");
                fila[7]=rs.getString("establecimientoSaludPublico");
                fila[8]=rs.getString("establecimientoSaludPrivado");
                fila[9]=rs.getString("MedicoTradicional");
                fila[10]=rs.getString("SolucionesCaseras");
                fila[11]=rs.getString("FarmacioOautomedicacion");
                fila[12]=rs.getString("NacionOpueblo");
                fila[13]=rs.getString("aCual");
                fila[14]=rs.getString("IdiomaNines");
                fila[15]=rs.getString("NoHabla");
                fila[16]=rs.getString("idioma1");
                fila[17]=rs.getString("idioma2");
                fila[18]=rs.getString("idioma3");
                fila[19]=rs.getString("idioma4");
                fila[20]=rs.getString("nacimiento");
                fila[21]=rs.getString("ciudad");
                fila[22]=rs.getString("municipio");
                fila[23]=rs.getString("departamento");
                fila[24]=rs.getString("exterior");
                fila[25]=rs.getString("exteriorPais");
                fila[26]=rs.getString("llegadaDelExterior");
                fila[27]=rs.getString("Residencia");
                fila[28]=rs.getString("ResidenciaC");
                fila[29]=rs.getString("ResidenciaM");
                fila[30]=rs.getString("ResidenciaD");
                fila[31]=rs.getString("ResidenciaEx");
                fila[32]=rs.getString("Residencia5anios");
                fila[33]=rs.getString("Residenciaciudad5anios");
                fila[34]=rs.getString("Residenciamunicipio5anios");
                fila[35]=rs.getString("Residenciadepartamento5anios");
                fila[36]=rs.getString("Residenciaexterior5años");
                fila[37]=rs.getString("saberescribir");
                fila[38]=rs.getString("asistenciaColegio");
                
                
                
                model.addRow(fila);
            }
            jTable7.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Llenar();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jRadioButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton105ActionPerformed
            buttonGroup31.add(jRadioButton105);
           jTextField24.setEnabled(true);
           jRadioButton110.setEnabled(true);
           jRadioButton111.setEnabled(true);
                   // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton105ActionPerformed

    private void jRadioButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton110ActionPerformed
       buttonGroup31.add(jRadioButton110);
           jTextField24.setEnabled(false);
           jRadioButton111.setEnabled(false);
                   // TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton110ActionPerformed

    private void jRadioButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton111ActionPerformed
          buttonGroup31.add(jRadioButton111);
          jTextField24.setEnabled(false);
          jRadioButton110.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton111ActionPerformed

    private void jRadioButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton112ActionPerformed
        buttonGroup37.add(jRadioButton112);
         jTextField25.setEnabled(false);
         jTextField26.setEnabled(false);
         jTextField28.setEnabled(false);
         jTextField29.setEnabled(false);
         jTextField30.setEnabled(false);
    
    }//GEN-LAST:event_jRadioButton112ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
       
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jRadioButton199ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton199ActionPerformed
         buttonGroup37.add(jRadioButton199);
         jTextField25.setEnabled(true); 
         jTextField26.setEnabled(true);
         jTextField28.setEnabled(true);
         jTextField29.setEnabled(true);
         jTextField30.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton199ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jRadioButton113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton113ActionPerformed
       buttonGroup38.add(jRadioButton113);
         jRadioButton114.setEnabled(false); 
         jTextField32.setEnabled(false); 
         jTextField33.setEnabled(false);
         jTextField34.setEnabled(false);
         jRadioButton122.setEnabled(false);
         jTextField36.setEnabled(false);
         jTextField37.setEnabled(false);
         jRadioButton125.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton113ActionPerformed

    private void jRadioButton121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton121ActionPerformed
         buttonGroup40.add(jRadioButton121);
         jRadioButton120.setEnabled(true);
        jTextField38.setEnabled(true);
        jTextField39.setEnabled(true);
        jTextField41.setEnabled(true);
        jTextField42.setEnabled(false);
         jRadioButton125.setEnabled(true); // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton121ActionPerformed

    private void jRadioButton125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton125ActionPerformed
          buttonGroup40.add(jRadioButton125);
         jRadioButton120.setEnabled(true);
        jTextField38.setEnabled(false);
        jTextField39.setEnabled(false);
        jTextField41.setEnabled(false);
        jTextField42.setEnabled(true);
         jRadioButton125.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton125ActionPerformed

    private void jRadioButton123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton123ActionPerformed
       buttonGroup41.add(jRadioButton123);
         jRadioButton124.setEnabled(true);
         jRadioButton123.setEnabled(true);
        jTextField43.setEnabled(false);
        jTextField45.setEnabled(false);
        jTextField46.setEnabled(false);
        jTextField47.setEnabled(false);
         jRadioButton115.setEnabled(false); 
         jRadioButton130.setEnabled(false); // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton123ActionPerformed

    private void jRadioButton124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton124ActionPerformed
        buttonGroup41.add(jRadioButton124);
         jRadioButton123.setEnabled(true);
         jRadioButton124.setEnabled(true);
        jTextField43.setEnabled(true);
        jTextField45.setEnabled(true);
        jTextField46.setEnabled(true);
        jTextField47.setEnabled(true);
         jRadioButton115.setEnabled(true); 
         jRadioButton130.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton124ActionPerformed

    private void jRadioButton115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton115ActionPerformed
       buttonGroup41.add(jRadioButton115);
         jRadioButton123.setEnabled(true);
         jRadioButton124.setEnabled(false);
        jTextField43.setEnabled(false);
        jTextField45.setEnabled(false);
        jTextField46.setEnabled(false);
        jTextField47.setEnabled(true);
         jRadioButton115.setEnabled(true); 
         jRadioButton130.setEnabled(true); // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton115ActionPerformed

    private void jRadioButton131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton131ActionPerformed
          buttonGroup42.add(jRadioButton131);
         jRadioButton132.setEnabled(true);
                   // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton131ActionPerformed

    private void jRadioButton132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton132ActionPerformed
        buttonGroup42.add(jRadioButton132);
         jRadioButton131.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton132ActionPerformed

    private void jRadioButton133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton133ActionPerformed
         buttonGroup43.add(jRadioButton133);
         jRadioButton134.setEnabled(true);
         jRadioButton135.setEnabled(true);
         jRadioButton136.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton133ActionPerformed

    private void jRadioButton122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton122ActionPerformed
       buttonGroup39.add(jRadioButton122);
         jRadioButton113.setEnabled(true);
         jRadioButton114.setEnabled(true);
         jTextField36.setEnabled(true);
         jTextField37.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton122ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
     String Inicial;
     String SistemaAntiguo;
     String SistemaAnterior;
     String SistemaActual;
     String NivelUniversitario;
     String NoUniversitario;
     String SisAntiguo;
     String SisAnterior; 
     String SisActual; 
     String Trabajo;
     String TrabajoSemanaPasada;
     String BuscarTrabajo;
     String Ocupacion;
     String EstadoCivil;
        if(jRadioButton137.isSelected() == true){
          Inicial="Ninguno";
       }else if (jRadioButton138.isSelected() == true){
          Inicial="Curso de alfabetizacion";   
       }else if (jRadioButton139.isSelected() == true){
          Inicial="Inicial(pre kinder, kinder)";   
       }else {
          Inicial = null;
       }  
        
       if(jRadioButton140.isSelected() == true){
          SistemaAntiguo="Basico (1 a 5 años)";
       }else if (jRadioButton141.isSelected() == true){
          SistemaAntiguo="Intermedio (1 a 3 años)";   
       }else if (jRadioButton142.isSelected() == true){
          SistemaAntiguo="Medio( 1 a 4 años)";   
       }else {
          SistemaAntiguo = null;
       }
       
       if(jRadioButton143.isSelected() == true){
          SistemaAnterior="Primaria (1 a 8 años)";
       }else if (jRadioButton146.isSelected() == true){
          SistemaAnterior="Secundaria (1 a 4 años)";   
       }else {
          SistemaAnterior = null;
       }
       
       if(jRadioButton147.isSelected() == true){
          SistemaActual="Primaria (1 a 6 años)";
       }else if (jRadioButton148.isSelected() == true){
          SistemaActual="Secundaria ( 1 a 6 años)";   
       }else {
          SistemaActual = null;
       }
       
       if(jRadioButton149.isSelected() == true){
          NivelUniversitario="Tecnico universitario";
       }else if (jRadioButton150.isSelected() == true){
          NivelUniversitario="Licenciatura";   
       }else if (jRadioButton151.isSelected() == true){
          NivelUniversitario="Maestria";   
       }else if (jRadioButton157.isSelected() == true){
          NivelUniversitario="Doctorado";   
       }else {
          NivelUniversitario = null;
       }
       
       if(jRadioButton158.isSelected() == true){
          NoUniversitario="Normal superior";
       }else if (jRadioButton159.isSelected() == true){
          NoUniversitario="Militar o policial";   
       }else if (jRadioButton160.isSelected() == true){
          NoUniversitario="Tecnico de instituto";   
       }else if (jRadioButton161.isSelected() == true){
          NoUniversitario="Otro";   
       }else {
          NoUniversitario = null;
       }
       
       if(jRadioButton162.isSelected() == true){
          SisAntiguo="Basico (1 a 5 años)";
       }else if (jRadioButton163.isSelected() == true){
          SisAntiguo="Intermedio (1 a 3 años)";   
       }else if (jRadioButton164.isSelected() == true){
          SisAntiguo="Medio (1 a 4 años)";   
       }else {
          SisAntiguo = null;
       }
       
        if(jRadioButton165.isSelected() == true){
          SisAnterior="Primaria (1 a 8 años)";
       }else if (jRadioButton166.isSelected() == true){
          SisAnterior="Secundaria (1 a 4 años)";   
       }else{
          SisAnterior = null;
       }
        
        if(jRadioButton167.isSelected() == true){
          SisActual="Primaria (1 a 6 años)";
       }else if (jRadioButton168.isSelected() == true){
          SisActual="Secundaria (1 a 6 años)";   
       }else{
          SisActual = null;
       }
        
        if(jRadioButton169.isSelected() == true){
          Trabajo="SI";
       }else if (jRadioButton170.isSelected() == true){
          Trabajo="NO";   
       }else{
          Trabajo = null;
       }
        
        if(jRadioButton171.isSelected() == true){
          TrabajoSemanaPasada="Licencia Vacación";
       }else if (jRadioButton172.isSelected() == true){
          TrabajoSemanaPasada="Agricola o Ganaderia";   
       }else if (jRadioButton173.isSelected() == true){
          TrabajoSemanaPasada="Negocio Familiar";   
       }else if (jRadioButton174.isSelected() == true){
          TrabajoSemanaPasada="Avtividad por Ingreso";   
       }else if (jRadioButton175.isSelected() == true){
          TrabajoSemanaPasada="No trabajo";   
       }else{
          TrabajoSemanaPasada = null;
       }
        
        if(jRadioButton176.isSelected() == true){
          BuscarTrabajo="Busco Trabajo con Experiencia";
       }else if (jRadioButton177.isSelected() == true){
          BuscarTrabajo="Busco Trabajo por primera vez";   
       }else if (jRadioButton178.isSelected() == true){
          BuscarTrabajo="Estuvo estudiando";   
       }else if (jRadioButton179.isSelected() == true){
          BuscarTrabajo="Realizo Labores de casa";   
       }else if (jRadioButton180.isSelected() == true){
          BuscarTrabajo="Pensionado,Jubilado o Rentista";   
       }else if (jRadioButton181.isSelected() == true){
          BuscarTrabajo="Otra";   
       }else{
          BuscarTrabajo = null;
       } 
        
        if(jRadioButton182.isSelected() == true){
          Ocupacion="obrera/o o empleada/o ";
       }else if (jRadioButton183.isSelected() == true){
          Ocupacion="trabajadora/or por cuenta propia";   
       }else if (jRadioButton184.isSelected() == true){
          Ocupacion="empleadora/or o socia/o";   
       }else if (jRadioButton185.isSelected() == true){
          Ocupacion="trabajadora/or familiar o aprendiz sin remuneracion";   
       }else if (jRadioButton186.isSelected() == true){
          Ocupacion="trabajadora/or del hogar?";   
       }else if (jRadioButton187.isSelected() == true){
          Ocupacion="cooperativista de produccion/servicios?";   
       }else{
          Ocupacion = null;
       } 
        
         if(jRadioButton188.isSelected() == true){
          EstadoCivil="soltera/o ";
       }else if (jRadioButton189.isSelected() == true){
          EstadoCivil="casada/o";   
       }else if (jRadioButton190.isSelected() == true){
          EstadoCivil="conviviente o concubina/o";   
       }else if (jRadioButton191.isSelected() == true){
          EstadoCivil="separada/o";   
       }else if (jRadioButton192.isSelected() == true){
          EstadoCivil="divorciada/o";   
       }else if (jRadioButton193.isSelected() == true){
          EstadoCivil="viuda/o";   
       }else{
          EstadoCivil = null;
       } 
         
       
       try {
            
            String sql1 ="insert into caracteristicaspersona1(Inicial,CursoInicialA,CursoInicialB,CursoInicialC,SistemaAntiguo,CursoAntiguoA,CursoAntiguoB,CursoAntiguoC,SistemaAnterior,SistemaAnteriorA,SistemaAnteriorB,SistemaActual,SistemaActualA,SistemaActualB,NivelUniversitario,TecUniversitario,Licenciatura,Maestria,Doctorado,NoUniversitario,NormalSuperior,MilitarOpolicial,TecnicoInstituto,Otro,SisAntiguo,SisAntiguoA,SisAntiguoB,SisAntiguoC,SisAnterior,SisAnteriorA,SisAnteriorB,SisActual,SisActualA,SisActualB,Trabajo,TrabajoSemanaPasada,BuscarTrabajo,OficioSemanaPasada,Ocupacion,ActividadEconomica,EstadoCivil)"+"Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareCall(sql1);
            ps.setString(1, Inicial);
            ps.setString(2, jTextField49.getText());
            ps.setString(3, jTextField50.getText());
            ps.setString(4, jTextField51.getText());
            ps.setString(5, SistemaAntiguo);
            ps.setString(6, jTextField53.getText());
            ps.setString(7, jTextField54.getText());
            ps.setString(8, jTextField55.getText());
            ps.setString(9, SistemaAnterior);
            ps.setString(10, jTextField56.getText());
            ps.setString(11, jTextField57.getText());
            ps.setString(12, SistemaActual);
            ps.setString(13, jTextField58.getText());
            ps.setString(14, jTextField59.getText());
            ps.setString(15, NivelUniversitario);
            ps.setString(16, jTextField60.getText());
            ps.setString(17, jTextField61.getText());
            ps.setString(18, jTextField62.getText());
            ps.setString(19, jTextField63.getText());
            ps.setString(20, NoUniversitario);
            ps.setString(21, jTextField64.getText());
            ps.setString(22, jTextField65.getText());
            ps.setString(23, jTextField66.getText());
            ps.setString(24, jTextField67.getText());
            ps.setString(25, SisAntiguo);
            ps.setString(26, jTextField68.getText());
            ps.setString(27, jTextField69.getText());
            ps.setString(28, jTextField70.getText());
            ps.setString(29, SisAnterior);
            ps.setString(30, jTextField71.getText());
            ps.setString(31, jTextField72.getText());
            ps.setString(32, SisActual);
            ps.setString(33, jTextField73.getText());
            ps.setString(34, jTextField74.getText());
            ps.setString(35, Trabajo);
            ps.setString(36, TrabajoSemanaPasada);
            ps.setString(37, BuscarTrabajo);
            ps.setString(38, jTextField75.getText());
            ps.setString(39, Ocupacion);
            ps.setString(40, jTextField76.getText());
            ps.setString(41, EstadoCivil);
            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error" + e.getMessage());      
        } 
       
       try {
            conn = Mysql.getConnection();
            String[]titulos = {"Inicial","CursoInicialA","CursoInicialB","CursoInicialC","SistemaAntiguo","CursoAntiguoA","CursoAntiguoB","CursoAntiguoC","SistemaAnterior","SistemaAnteriorA","SistemaAnteriorB","SistemaActual","SistemaActualA","SistemaActualB","NivelUniversitario","TecUniversitario","Licenciatura","Maestria","Doctorado","NoUniversitario","NormalSuperior","MilitarOpolicial","TecnicoInstituto","Otro","SisAntiguo","SisAntiguoA","SisAntiguoB","SisAntiguoC","SisAnterior","SisAnteriorA","SisAnteriorB","SisActual","SisActualA","SisActualB","Trabajo","TrabajoSemanaPasada","BuscarTrabajo","OficioSemanaPasada","Ocupacion","ActividadEconomica","EstadoCivil"}; 
            String sql = "SELECT * from caracteristicaspersona1";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[42];
            while(rs.next()){
                fila[0]=rs.getString("Inicial");
                fila[1]=rs.getString("CursoInicialA");
                fila[2]=rs.getString("CursoInicialB");
                fila[3]=rs.getString("CursoInicialC");
                fila[4]=rs.getString("SistemaAntiguo");
                fila[5]=rs.getString("CursoAntiguoA");
                fila[6]=rs.getString("CursoAntiguoB");
                fila[7]=rs.getString("CursoAntiguoC");
                fila[8]=rs.getString("SistemaAnterior");
                fila[9]=rs.getString("SistemaAnteriorA");
                fila[10]=rs.getString("SistemaAnteriorB");
                fila[11]=rs.getString("SistemaActual");
                fila[12]=rs.getString("SistemaActualA");
                fila[13]=rs.getString("SistemaActualB");
                fila[14]=rs.getString("NivelUniversitario");
                fila[15]=rs.getString("TecUniversitario");
                fila[16]=rs.getString("Licenciatura");
                fila[17]=rs.getString("Maestria");
                fila[18]=rs.getString("Doctorado");
                fila[19]=rs.getString("NoUniversitario");
                fila[20]=rs.getString("NormalSuperior");
                fila[21]=rs.getString("MilitarOpolicial");
                fila[22]=rs.getString("TecnicoInstituto");
                fila[23]=rs.getString("Otro");
                fila[24]=rs.getString("SisAntiguo");
                fila[25]=rs.getString("SisAntiguoA");
                fila[26]=rs.getString("SisAntiguoB");
                fila[27]=rs.getString("SisAntiguoC");
                fila[28]=rs.getString("SisAnterior");
                fila[29]=rs.getString("SisAnteriorA");
                fila[30]=rs.getString("SisAnteriorB");
                fila[31]=rs.getString("SisActual");
                fila[32]=rs.getString("SisActualA");
                fila[33]=rs.getString("SisActualB");
                fila[34]=rs.getString("Trabajo");
                fila[35]=rs.getString("TrabajoSemanaPasada");
                fila[36]=rs.getString("BuscarTrabajo");
                fila[37]=rs.getString("OficioSemanaPasada");
                fila[38]=rs.getString("Ocupacion");
                fila[39]=rs.getString("ActividadEconomica");
                fila[40]=rs.getString("EstadoCivil");
                
                
                
                model.addRow(fila);
            }
            jTable7.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Llenar();
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jRadioButton137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton137ActionPerformed
       buttonGroup44.add(jRadioButton137);
         jTextField49.setEnabled(true);
         jTextField50.setEnabled(false);
         jTextField51.setEnabled(false);
         jRadioButton138.setEnabled(true);
         jRadioButton139.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton137ActionPerformed

    private void jRadioButton138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton138ActionPerformed
        buttonGroup44.add(jRadioButton138);
         jTextField49.setEnabled(false);
         jTextField50.setEnabled(true);
         jTextField51.setEnabled(false);
         jRadioButton137.setEnabled(true);
         jRadioButton139.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton138ActionPerformed

    private void jRadioButton139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton139ActionPerformed
           buttonGroup44.add(jRadioButton139);
         jTextField49.setEnabled(false);
         jTextField50.setEnabled(false);
         jTextField51.setEnabled(true);
         jRadioButton138.setEnabled(true);
         jRadioButton139.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton139ActionPerformed

    private void jRadioButton140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton140ActionPerformed
            buttonGroup45.add(jRadioButton140);
         jTextField53.setEnabled(true);
         jTextField54.setEnabled(false);
         jTextField55.setEnabled(false);
         jRadioButton141.setEnabled(true);
         jRadioButton142.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton140ActionPerformed

    private void jRadioButton141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton141ActionPerformed
         buttonGroup45.add(jRadioButton141);
         jTextField53.setEnabled(false);
         jTextField54.setEnabled(true);
         jTextField55.setEnabled(false);
         jRadioButton140.setEnabled(true);
         jRadioButton142.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton141ActionPerformed

    private void jRadioButton142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton142ActionPerformed
        buttonGroup45.add(jRadioButton142);
         jTextField53.setEnabled(false);
         jTextField54.setEnabled(false);
         jTextField55.setEnabled(true);
         jRadioButton140.setEnabled(true);
         jRadioButton141.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton142ActionPerformed

    private void jRadioButton143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton143ActionPerformed
           buttonGroup46.add(jRadioButton143);
         jTextField56.setEnabled(true);
         jTextField57.setEnabled(false);      
         jRadioButton146.setEnabled(true);
                   // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton143ActionPerformed

    private void jRadioButton146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton146ActionPerformed
        buttonGroup46.add(jRadioButton146);
         jTextField56.setEnabled(false);
         jTextField57.setEnabled(true);      
         jRadioButton143.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton146ActionPerformed

    private void jRadioButton147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton147ActionPerformed
         buttonGroup47.add(jRadioButton147);
         jTextField58.setEnabled(true);
         jTextField59.setEnabled(false);      
         jRadioButton148.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton147ActionPerformed

    private void jRadioButton148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton148ActionPerformed
        buttonGroup47.add(jRadioButton148);
         jTextField58.setEnabled(false);
         jTextField59.setEnabled(true);      
         jRadioButton147.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton148ActionPerformed

    private void jRadioButton149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton149ActionPerformed
         buttonGroup48.add(jRadioButton149);
         jTextField60.setEnabled(true);
         jTextField61.setEnabled(false);
         jTextField62.setEnabled(false);
         jTextField63.setEnabled(false);
         jRadioButton150.setEnabled(true);
         jRadioButton151.setEnabled(true);
         jRadioButton157.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton149ActionPerformed

    private void jRadioButton150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton150ActionPerformed
          buttonGroup48.add(jRadioButton150);
         jTextField60.setEnabled(false);
         jTextField61.setEnabled(true);
         jTextField62.setEnabled(false);
         jTextField63.setEnabled(false);
         jRadioButton149.setEnabled(true);
         jRadioButton151.setEnabled(true);
         jRadioButton157.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton150ActionPerformed

    private void jRadioButton151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton151ActionPerformed
         buttonGroup48.add(jRadioButton151);
         jTextField60.setEnabled(false);
         jTextField61.setEnabled(false);
         jTextField62.setEnabled(true);
         jTextField63.setEnabled(false);
         jRadioButton149.setEnabled(true);
         jRadioButton150.setEnabled(true);
         jRadioButton157.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton151ActionPerformed

    private void jRadioButton157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton157ActionPerformed
         buttonGroup48.add(jRadioButton157);
         jTextField60.setEnabled(false);
         jTextField61.setEnabled(false);
         jTextField62.setEnabled(false);
         jTextField63.setEnabled(true);
         jRadioButton149.setEnabled(true);
         jRadioButton150.setEnabled(true);
         jRadioButton151.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton157ActionPerformed

    private void jRadioButton158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton158ActionPerformed
         buttonGroup49.add(jRadioButton158);
         jTextField64.setEnabled(true);
         jTextField65.setEnabled(false);
         jTextField66.setEnabled(false);
         jTextField67.setEnabled(false);
         jRadioButton159.setEnabled(true);
         jRadioButton160.setEnabled(true);
         jRadioButton161.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton158ActionPerformed

    private void jRadioButton159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton159ActionPerformed
         buttonGroup49.add(jRadioButton159);
         jTextField64.setEnabled(false);
         jTextField65.setEnabled(true);
         jTextField66.setEnabled(false);
         jTextField67.setEnabled(false);
         jRadioButton158.setEnabled(true);
         jRadioButton160.setEnabled(true);
         jRadioButton161.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton159ActionPerformed

    private void jRadioButton160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton160ActionPerformed
         buttonGroup49.add(jRadioButton160);
         jTextField64.setEnabled(false);
         jTextField65.setEnabled(false);
         jTextField66.setEnabled(true);
         jTextField67.setEnabled(false);
         jRadioButton158.setEnabled(true);
         jRadioButton159.setEnabled(true);
         jRadioButton161.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton160ActionPerformed

    private void jRadioButton161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton161ActionPerformed
         buttonGroup49.add(jRadioButton161);
         jTextField64.setEnabled(false);
         jTextField65.setEnabled(false);
         jTextField66.setEnabled(false);
         jTextField67.setEnabled(true);
         jRadioButton158.setEnabled(true);
         jRadioButton159.setEnabled(true);
         jRadioButton160.setEnabled(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton161ActionPerformed

    private void jRadioButton162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton162ActionPerformed
         buttonGroup50.add(jRadioButton162);
         jTextField68.setEnabled(true);
         jTextField69.setEnabled(false);
         jTextField70.setEnabled(false);
         jRadioButton163.setEnabled(true);
         jRadioButton164.setEnabled(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton162ActionPerformed

    private void jRadioButton165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton165ActionPerformed
              buttonGroup51.add(jRadioButton165); 
              jRadioButton166.setEnabled(true);
              jTextField71.setEnabled(true);
              jTextField72.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton165ActionPerformed

    private void jRadioButton163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton163ActionPerformed
         buttonGroup50.add(jRadioButton163);
         jTextField68.setEnabled(false);
         jTextField69.setEnabled(true);
         jTextField70.setEnabled(false);
         jRadioButton162.setEnabled(true);
         jRadioButton164.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton163ActionPerformed

    private void jRadioButton164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton164ActionPerformed
         buttonGroup50.add(jRadioButton164);
         jTextField68.setEnabled(false);
         jTextField69.setEnabled(false);
         jTextField70.setEnabled(true);
         jRadioButton162.setEnabled(true);
         jRadioButton163.setEnabled(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton164ActionPerformed

    private void jRadioButton166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton166ActionPerformed
          buttonGroup51.add(jRadioButton166); 
              jRadioButton165.setEnabled(true);
              jTextField71.setEnabled(false);
              jTextField72.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton166ActionPerformed

    private void jRadioButton167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton167ActionPerformed
        buttonGroup52.add(jRadioButton167); 
              jRadioButton168.setEnabled(true);
              jTextField73.setEnabled(true);
              jTextField74.setEnabled(false);  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton167ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       String UltimoHijoConVida,Ultimoparto;      
      
       if(jRadioButton194.isSelected() == true){
          UltimoHijoConVida="SI";
       }else if (jRadioButton195.isSelected() == true){
          UltimoHijoConVida="NO";   
       }else{
          UltimoHijoConVida = null;
       }
       
       if(jRadioButton196.isSelected() == true){
          Ultimoparto="En un establecimiento de salud";
       }else if (jRadioButton197.isSelected() == true){
          Ultimoparto="En un domicilio";   
       }else if (jRadioButton198.isSelected() == true){
          Ultimoparto="En otro lugar";   
       }else{
          Ultimoparto = null;
       }
       
       try {
            
            String sql1 ="insert into caracteristicaspersona2(CantHijos,NacMesUltimoHijo,NacAnioUltimoHijo,UltimoHijoConVida,Ultimoparto)"+"Values(?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareCall(sql1);
            ps.setString(1, jTextField78.getText());
            ps.setString(2, jTextField79.getText());
            ps.setString(3, jTextField80.getText());
            ps.setString(4, UltimoHijoConVida);
            ps.setString(5, Ultimoparto);
           
            int n = ps.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error" + e.getMessage());      
        } 
       
       try {
            conn = Mysql.getConnection();
            String[]titulos = {"CantHijos","NacMesUltimoHijo","NacAnioUltimoHijo","UltimoHijoConVida","Ultimoparto"}; 
            String sql = "SELECT * from caracteristicaspersona2";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[5];
            while(rs.next()){
                fila[0]=rs.getString("CantHijos");
                fila[1]=rs.getString("NacMesUltimoHijo");
                fila[2]=rs.getString("NacAnioUltimoHijo");
                fila[3]=rs.getString("UltimoHijoConVida");
                fila[4]=rs.getString("Ultimoparto");
            
                model.addRow(fila);
            }
            jTable7.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Llenar();
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jRadioButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton62ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 interfazPrincipal Ad = new interfazPrincipal();
        Ad.setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
interfazPrincipal Ad = new interfazPrincipal();
        Ad.setVisible(true);
        this.setVisible(false);               // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    interfazPrincipal Ad = new interfazPrincipal();
        Ad.setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
interfazPrincipal Ad = new interfazPrincipal();
        Ad.setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
interfazPrincipal Ad = new interfazPrincipal();
        Ad.setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
interfazPrincipal Ad = new interfazPrincipal();
        Ad.setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
interfazPrincipal Ad = new interfazPrincipal();
        Ad.setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
interfazPrincipal Ad = new interfazPrincipal();
        Ad.setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
           
        Limpiar();
       Habilitar();

       // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
      DatosJefeDeFamilia Ad = new DatosJefeDeFamilia();
        Ad.setVisible(true);
        this.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

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
            java.util.logging.Logger.getLogger(BoletaCensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoletaCensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoletaCensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoletaCensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoletaCensal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup28;
    private javax.swing.ButtonGroup buttonGroup29;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup30;
    private javax.swing.ButtonGroup buttonGroup31;
    private javax.swing.ButtonGroup buttonGroup32;
    private javax.swing.ButtonGroup buttonGroup33;
    private javax.swing.ButtonGroup buttonGroup34;
    private javax.swing.ButtonGroup buttonGroup35;
    private javax.swing.ButtonGroup buttonGroup36;
    private javax.swing.ButtonGroup buttonGroup37;
    private javax.swing.ButtonGroup buttonGroup38;
    private javax.swing.ButtonGroup buttonGroup39;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup40;
    private javax.swing.ButtonGroup buttonGroup41;
    private javax.swing.ButtonGroup buttonGroup42;
    private javax.swing.ButtonGroup buttonGroup43;
    private javax.swing.ButtonGroup buttonGroup44;
    private javax.swing.ButtonGroup buttonGroup45;
    private javax.swing.ButtonGroup buttonGroup46;
    private javax.swing.ButtonGroup buttonGroup47;
    private javax.swing.ButtonGroup buttonGroup48;
    private javax.swing.ButtonGroup buttonGroup49;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup50;
    private javax.swing.ButtonGroup buttonGroup51;
    private javax.swing.ButtonGroup buttonGroup52;
    private javax.swing.ButtonGroup buttonGroup53;
    private javax.swing.ButtonGroup buttonGroup54;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton100;
    private javax.swing.JRadioButton jRadioButton101;
    private javax.swing.JRadioButton jRadioButton102;
    private javax.swing.JRadioButton jRadioButton103;
    private javax.swing.JRadioButton jRadioButton104;
    private javax.swing.JRadioButton jRadioButton105;
    private javax.swing.JRadioButton jRadioButton106;
    private javax.swing.JRadioButton jRadioButton107;
    private javax.swing.JRadioButton jRadioButton108;
    private javax.swing.JRadioButton jRadioButton109;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton110;
    private javax.swing.JRadioButton jRadioButton111;
    private javax.swing.JRadioButton jRadioButton112;
    private javax.swing.JRadioButton jRadioButton113;
    private javax.swing.JRadioButton jRadioButton114;
    private javax.swing.JRadioButton jRadioButton115;
    private javax.swing.JRadioButton jRadioButton116;
    private javax.swing.JRadioButton jRadioButton117;
    private javax.swing.JRadioButton jRadioButton118;
    private javax.swing.JRadioButton jRadioButton119;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton120;
    private javax.swing.JRadioButton jRadioButton121;
    private javax.swing.JRadioButton jRadioButton122;
    private javax.swing.JRadioButton jRadioButton123;
    private javax.swing.JRadioButton jRadioButton124;
    private javax.swing.JRadioButton jRadioButton125;
    private javax.swing.JRadioButton jRadioButton126;
    private javax.swing.JRadioButton jRadioButton127;
    private javax.swing.JRadioButton jRadioButton128;
    private javax.swing.JRadioButton jRadioButton129;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton130;
    private javax.swing.JRadioButton jRadioButton131;
    private javax.swing.JRadioButton jRadioButton132;
    private javax.swing.JRadioButton jRadioButton133;
    private javax.swing.JRadioButton jRadioButton134;
    private javax.swing.JRadioButton jRadioButton135;
    private javax.swing.JRadioButton jRadioButton136;
    private javax.swing.JRadioButton jRadioButton137;
    private javax.swing.JRadioButton jRadioButton138;
    private javax.swing.JRadioButton jRadioButton139;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton140;
    private javax.swing.JRadioButton jRadioButton141;
    private javax.swing.JRadioButton jRadioButton142;
    private javax.swing.JRadioButton jRadioButton143;
    private javax.swing.JRadioButton jRadioButton144;
    private javax.swing.JRadioButton jRadioButton145;
    private javax.swing.JRadioButton jRadioButton146;
    private javax.swing.JRadioButton jRadioButton147;
    private javax.swing.JRadioButton jRadioButton148;
    private javax.swing.JRadioButton jRadioButton149;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton150;
    private javax.swing.JRadioButton jRadioButton151;
    private javax.swing.JRadioButton jRadioButton152;
    private javax.swing.JRadioButton jRadioButton153;
    private javax.swing.JRadioButton jRadioButton154;
    private javax.swing.JRadioButton jRadioButton155;
    private javax.swing.JRadioButton jRadioButton156;
    private javax.swing.JRadioButton jRadioButton157;
    private javax.swing.JRadioButton jRadioButton158;
    private javax.swing.JRadioButton jRadioButton159;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton160;
    private javax.swing.JRadioButton jRadioButton161;
    private javax.swing.JRadioButton jRadioButton162;
    private javax.swing.JRadioButton jRadioButton163;
    private javax.swing.JRadioButton jRadioButton164;
    private javax.swing.JRadioButton jRadioButton165;
    private javax.swing.JRadioButton jRadioButton166;
    private javax.swing.JRadioButton jRadioButton167;
    private javax.swing.JRadioButton jRadioButton168;
    private javax.swing.JRadioButton jRadioButton169;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton170;
    private javax.swing.JRadioButton jRadioButton171;
    private javax.swing.JRadioButton jRadioButton172;
    private javax.swing.JRadioButton jRadioButton173;
    private javax.swing.JRadioButton jRadioButton174;
    private javax.swing.JRadioButton jRadioButton175;
    private javax.swing.JRadioButton jRadioButton176;
    private javax.swing.JRadioButton jRadioButton177;
    private javax.swing.JRadioButton jRadioButton178;
    private javax.swing.JRadioButton jRadioButton179;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton180;
    private javax.swing.JRadioButton jRadioButton181;
    private javax.swing.JRadioButton jRadioButton182;
    private javax.swing.JRadioButton jRadioButton183;
    private javax.swing.JRadioButton jRadioButton184;
    private javax.swing.JRadioButton jRadioButton185;
    private javax.swing.JRadioButton jRadioButton186;
    private javax.swing.JRadioButton jRadioButton187;
    private javax.swing.JRadioButton jRadioButton188;
    private javax.swing.JRadioButton jRadioButton189;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton190;
    private javax.swing.JRadioButton jRadioButton191;
    private javax.swing.JRadioButton jRadioButton192;
    private javax.swing.JRadioButton jRadioButton193;
    private javax.swing.JRadioButton jRadioButton194;
    private javax.swing.JRadioButton jRadioButton195;
    private javax.swing.JRadioButton jRadioButton196;
    private javax.swing.JRadioButton jRadioButton197;
    private javax.swing.JRadioButton jRadioButton198;
    private javax.swing.JRadioButton jRadioButton199;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton71;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JRadioButton jRadioButton74;
    private javax.swing.JRadioButton jRadioButton75;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton77;
    private javax.swing.JRadioButton jRadioButton78;
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton80;
    private javax.swing.JRadioButton jRadioButton81;
    private javax.swing.JRadioButton jRadioButton82;
    private javax.swing.JRadioButton jRadioButton83;
    private javax.swing.JRadioButton jRadioButton84;
    private javax.swing.JRadioButton jRadioButton85;
    private javax.swing.JRadioButton jRadioButton86;
    private javax.swing.JRadioButton jRadioButton87;
    private javax.swing.JRadioButton jRadioButton88;
    private javax.swing.JRadioButton jRadioButton89;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadioButton90;
    private javax.swing.JRadioButton jRadioButton91;
    private javax.swing.JRadioButton jRadioButton92;
    private javax.swing.JRadioButton jRadioButton93;
    private javax.swing.JRadioButton jRadioButton94;
    private javax.swing.JRadioButton jRadioButton95;
    private javax.swing.JRadioButton jRadioButton96;
    private javax.swing.JRadioButton jRadioButton97;
    private javax.swing.JRadioButton jRadioButton98;
    private javax.swing.JRadioButton jRadioButton99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
