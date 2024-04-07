/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package censo;
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
public class FuncionesAdministrador extends javax.swing.JFrame {
    DefaultTableModel model;    
    Connection conn;
    Statement sent;
    Mysql enlace = new Mysql();
    Connection conect = enlace.getConnection();
    public FuncionesAdministrador() {
        initComponents();
         setLocationRelativeTo(null);
        conn=Mysql.getConnection(); 
        mostrarDatos();
        mostrarDatos1();
        mostrarDatos2();
        mostrarDatos3();
        mostrarDatos4();  
        mostrarDatos5();
        mostrarDatos6();
         mostrarDatos7();
    }

   public void mostrarDatos(){
   try {
            conn = Mysql.getConnection();
            String[]titulos = {"codMunicipal", "Distrito", "CiudadComunidad", "ZonaCensal", "Sector", "Ciudad", "Localidad", "Zona", "Avenida", "Piso", "NroDepartamento", "NumeroOrden", "NumeroVivienda", "NrPuerta", "NomEdificio","Mujeres", "Hombres", "TotalPersonas"}; 
            String sql = "SELECT * FROM ubicaciongeografica";
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
            jTable1.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
   }
   
   public void mostrarDatos1(){
    try {
            conn = Mysql.getConnection();
            String[]titulos = {"Vivienda", "Observacion", "MaterialConstruccion", "revoque", "TechoVivienda", "MaterialMasUsado","ProveerAgua", 
                "AguaEnLaVivienda", "ServicioSanitario", "TieneDesague", "EnergiaElectrica", "Combustible", "CuartoDeCocina"}; 
            String sql = "SELECT * from vivienda";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[13];
            while(rs.next()){
                fila[0]=rs.getString("Vivienda");
                fila[1]=rs.getString("Observacion");
                fila[2]=rs.getString("MaterialConstruccion");
                fila[3]=rs.getString("revoque");
                fila[4]=rs.getString("TechoVivienda");
                fila[5]=rs.getString("MaterialMasUsado");
                fila[6]=rs.getString("ProveerAgua");
                fila[7]=rs.getString("AguaEnLaVivienda");
                fila[8]=rs.getString("ServicioSanitario");
                fila[9]=rs.getString("TieneDesague");
                fila[10]=rs.getString("EnergiaElectrica");
                fila[11]=rs.getString("Combustible");
                fila[12]=rs.getString("CuartoDeCocina");
                
               
               
                
                model.addRow(fila);
            }
            jTable2.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    
   }
   
   
    void mostrarDatos2(){
         try {
            conn = Mysql.getConnection();
            String[]titulos = {"deViaje", "CantPersonas", "nomPersona", "sexo", "AñoSalida", "EdadSalida", "Residencia"}; 
           
            String sql = "SELECT * FROM emigracioninterlacional";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[7];
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
   }
   public void mostrarDatos3(){
   try {
            conn = Mysql.getConnection();
            String[]titulos = {"Muerte", "CantMuertes", "nomPersonaF", "EdadPersona", "sexo", "PerMayor"}; 
            String sql = "SELECT * FROM mortalidad";
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
   }
   public void mostrarDatos4(){
     try {
            conn = Mysql.getConnection();
            String[]titulos = {"dificult", "nomPersona", "EdadPersona", "sexo", "discapacidad"}; 
           
            String sql = "SELECT * FROM dificultadpermanente ";
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
   }
   public void mostrarDatos5(){
   try {
            conn = Mysql.getConnection();
            String[]titulos = {"relacion", "Sexo", "Edad", "RegistroCivil", "Carnet"}; 
           
            String sql = "SELECT * FROM caracteristicaspersona";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[5];
            while(rs.next()){
                fila[0]=rs.getString("relacion");
                fila[1]=rs.getString("Sexo");
                fila[2]=rs.getString("Edad");
                fila[3]=rs.getString("RegistroCivil");
                fila[4]=rs.getString("Carnet");
               
                
                
                model.addRow(fila);
            }
            jTable6.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
   }
   public void mostrarDatos6(){
   try {
            conn = Mysql.getConnection();
            String[]titulos = {"Inicial", "CursoInicialB", "TrabajoSemanaPasada", "Ocupacion", "EstadoCivil"}; 
            String sql = "SELECT * FROM caracteristicaspersona1 ";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[5];
            while(rs.next()){
                fila[0]=rs.getString("Inicial");
                fila[1]=rs.getString("CursoInicialB");
                fila[2]=rs.getString("TrabajoSemanaPasada");
                fila[3]=rs.getString("Ocupacion");
                fila[4]=rs.getString("EstadoCivil");
               
                
                
                model.addRow(fila);
            }
            jTable7.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
   }
   public void mostrarDatos7(){
    try {
            conn = Mysql.getConnection();
            String[]titulos = {"CantHijos", "NacMesUltimoHijo", "NacAnioUltimoHijo", "UltimoHijoConVida", "Ultimoparto"}; 
           
            String sql = "SELECT * FROM caracteristicaspersona2";
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
            jTable8.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
   }
   public void actualizado(){
   int fila = jTable1.getSelectedRow();
   int codMunicipal = Integer.parseInt(this.jTable1.getValueAt(fila, 0).toString());
   String Distrito = jTable1.getValueAt(fila, 1).toString();
   String CiudadComunidad = jTable1.getValueAt(fila, 2).toString();
   String ZonaCensal = jTable1.getValueAt(fila, 3).toString();
   String Sector = jTable1.getValueAt(fila, 4).toString();
   String Ciudad = jTable1.getValueAt(fila, 5).toString();
   String Localidad = jTable1.getValueAt(fila, 6).toString();
   String Zona = jTable1.getValueAt(fila, 7).toString();
   String Avenida = jTable1.getValueAt(fila, 8).toString();
   int Piso = Integer.parseInt(this.jTable1.getValueAt(fila, 9).toString());
   int NroDepartamento = Integer.parseInt(this.jTable1.getValueAt(fila, 10).toString());
   String NumeroOrden = jTable1.getValueAt(fila, 11).toString();
   int NumeroVivienda = Integer.parseInt(this.jTable1.getValueAt(fila, 12).toString());
   int NrPuerta = Integer.parseInt(this.jTable1.getValueAt(fila, 13).toString());
   String NomEdificio = jTable1.getValueAt(fila, 14).toString();
   int Mujeres = Integer.parseInt(this.jTable1.getValueAt(fila, 15).toString());
   int Hombres = Integer.parseInt(this.jTable1.getValueAt(fila, 16).toString());
   int TotalPersonas = Integer.parseInt(this.jTable1.getValueAt(fila, 17).toString());
   try{
   PreparedStatement actu = conect.prepareStatement("UPDATE ubicaciongeografica SET Distrito='"+Distrito+"',CiudadComunidad='"+CiudadComunidad+"',ZonaCensal='"+ZonaCensal+"',Sector='"+Sector+"',Ciudad='"+Ciudad+"',Localidad='"+Localidad+"',Zona='"+Zona+"',Avenida='"+Avenida+"',Piso='"+Piso+"',NroDepartamento='"+NroDepartamento+"',NumeroOrden='"+NumeroOrden+"',NumeroVivienda='"+NumeroVivienda+"',NrPuerta='"+NrPuerta+"',NomEdificio='"+NomEdificio+"',Mujeres='"+Mujeres+"',Hombres='"+Hombres+"',TotalPersonas='"+TotalPersonas+"' WHERE codMunicipal='"+codMunicipal+"'");
   actu.executeUpdate();
   mostrarDatos();
   
   }catch(Exception e){
   JOptionPane.showMessageDialog(null, e + "NO se logro actualizar");
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setDoubleBuffered(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CodMunicipal");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Numero de orden de la Vivienda");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depositphotos_56626097-stock-photo-search-icon-green-button (1).jpg"))); // NOI18N
        jButton6.setText("BUSCAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jButton9.setText("CONTEO BOLETAS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depositphotos_56626097-stock-photo-search-icon-green-button (1).jpg"))); // NOI18N
        jButton14.setText("BUSCAR");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Numero de boleta en la vivienda");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depositphotos_56626097-stock-photo-search-icon-green-button (1).jpg"))); // NOI18N
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(267, 267, 267))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButton9))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UBICACION GEOGRAFICA", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Vivienda datos");

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
        jScrollPane2.setViewportView(jTable2);

        jButton10.setText("CONTEO BOLETAS");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depositphotos_56626097-stock-photo-search-icon-green-button (1).jpg"))); // NOI18N
        jButton15.setText("MOSTRAR");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VIVIENDA", jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Nombre de la persona que viajo");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depositphotos_56626097-stock-photo-search-icon-green-button (1).jpg"))); // NOI18N
        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton11.setText("CONTEO BOLETAS");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EMIGRACION", jPanel4);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Nombre de la persona que fallecio");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depositphotos_56626097-stock-photo-search-icon-green-button (1).jpg"))); // NOI18N
        jButton5.setText("BUSCAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jButton12.setText("CONTEO BOLETAS");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(43, 43, 43)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MORTALIDAD", jPanel5);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Nombre de la persona con discapacidad");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depositphotos_56626097-stock-photo-search-icon-green-button (1).jpg"))); // NOI18N
        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jButton13.setText("CONTEO BOLETAS");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(51, 51, 51)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton13))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        jTabbedPane1.addTab("DISCAPACIDAD", jPanel6);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Edad de la Persona");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depositphotos_56626097-stock-photo-search-icon-green-button (1).jpg"))); // NOI18N
        jButton17.setText("BUSCAR");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("CONTEO BOLETAS");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jButton18))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CARACTERISTICAS P", jPanel7);

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Ocupacion de la Persona");

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depositphotos_56626097-stock-photo-search-icon-green-button (1).jpg"))); // NOI18N
        jButton19.setText("BUSCAR");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton21.setText("CONTEO BOLETAS");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTable7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jButton21)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CARAC P1", jPanel8);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Cantidad de Hijos");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/depositphotos_56626097-stock-photo-search-icon-green-button (1).jpg"))); // NOI18N
        jButton20.setText("BUSCAR");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton22.setText("CONTEO BOLETAS");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jTable8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jTable8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jButton22)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CARAC P2", jPanel9);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1050, 410));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/censotransparente-removebg-preview (3).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("LLENAR FORMULARIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 153, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura1-removebg-preview (1).png"))); // NOI18N
        jButton16.setText("PREV");
        jButton16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 660, 110, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 400, 300, 210));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("LLENAR DATOS DE ENCUESTADOR");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("DATOS ESTADISTICOS");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 643, -1, -1));

        jButton24.setText("JEFES DE ZONA");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton24MouseClicked(evt);
            }
        });
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 260, -1));

        jButton26.setText("JEFES DE FAMILIA");
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton26MouseClicked(evt);
            }
        });
        jPanel1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 260, -1));

        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura1-removebg-preview (1).png"))); // NOI18N
        jButton23.setText("MENU");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 660, -1, 50));

        jButton27.setText("REGISTRO DE ADMINITRADORES");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 260, -1));

        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton25.setText("MODIFICAR UB GEOGRAF");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jButton25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton25KeyReleased(evt);
            }
        });
        jPanel1.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 210, 30));

        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton28.setText("MODIFICAR VIVIENDA");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 180, 30));

        jButton30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton30.setText("MODIFICAR EMIGRACIÓN");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, -1, -1));

        jButton29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton29.setText("MODIFICAR MORTALIDAD");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 690, 210, -1));

        jButton31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton31.setText("MODIFICAR DISCAPACIDAD");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 690, -1, -1));

        jButton32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton32.setText("MODIFICAR CARACTERISTICAS");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, 200, 30));

        jButton33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton33.setText("MODIFICAR CARACTERISTICAS P1");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 690, -1, -1));

        jButton34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton34.setText("MODIFICAR CARACTERISTICAS P2");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 690, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-wallpaper (5).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setDoubleBuffered(true);
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1345, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          BoletaCensal Ad = new BoletaCensal();
        Ad.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         try {
            conn = Mysql.getConnection();
            String[]titulos = {"BOLETAS LLENADAS CAPITULO A"}; 
            String sql = "SELECT COUNT(*) AS cant FROM ubicaciongeografica";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
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
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            try {
            conn = Mysql.getConnection();
            String[]titulos = {"codMunicipal", "Distrito", "CiudadComunidad", "ZonaCensal", "Sector", "Ciudad", "Localidad", "Zona", "Avenida", "Piso", "NroDepartamento", "NumeroOrden", "NumeroVivienda", "NrPuerta", "NomEdificio","Mujeres", "Hombres", "TotalPersonas"}; 
            String sql = "SELECT * FROM ubicaciongeografica WHERE NumeroOrden = " + jTextField2.getText() + "";
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
            jTable1.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"BOLETAS LLENADAS CAPITULO B"}; 
            String sql = "SELECT COUNT(*) AS cant FROM vivienda";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[1];
            while(rs.next()){
                fila[0]=rs.getString(1);
 
                model.addRow(fila);
            }
            jTable2.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"BOLETAS LLENADAS CAPITULO C"}; 
            String sql = "SELECT COUNT(*) AS cant FROM emigracioninterlacional";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[1];
            while(rs.next()){
                fila[0]=rs.getString(1);
 
                model.addRow(fila);
            }
            jTable3.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       try {
            conn = Mysql.getConnection();
            String[]titulos = {"BOLETAS LLENADAS CAPITULO D"}; 
            String sql = "SELECT COUNT(*) AS cant FROM mortalidad";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[1];
            while(rs.next()){
                fila[0]=rs.getString(1);
 
                model.addRow(fila);
            }
            jTable4.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"BOLETAS LLENADAS CAPITULO E"}; 
            String sql = "SELECT COUNT(*) AS cant FROM dificultadpermanente";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[1];
            while(rs.next()){
                fila[0]=rs.getString(1);
 
                model.addRow(fila);
            }
            jTable5.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"codMunicipal", "Distrito", "CiudadComunidad", "ZonaCensal", "Sector", "Ciudad", "Localidad", "Zona", "Avenida", "Piso", "NroDepartamento", "NumeroOrden", "NumeroVivienda", "NrPuerta", "NomEdificio","Mujeres", "Hombres", "TotalPersonas"}; 
            String sql = "SELECT * FROM ubicaciongeografica WHERE codMunicipal = " + jTextField1.getText() + "";
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
            jTable1.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"Vivienda", "Observacion", "MaterialConstruccion", "revoque", "TechoVivienda", "MaterialMasUsado","ProveerAgua","AguaEnLaVivienda", "ServicioSanitario", "TieneDesague", "EnergiaElectrica", "Combustible", "CuartoDeCocina"}; 
            String sql = "SELECT * from vivienda";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[13];
            while(rs.next()){
                fila[0]=rs.getString("Vivienda");
                fila[1]=rs.getString("Observacion");
                fila[2]=rs.getString("MaterialConstruccion");
                fila[3]=rs.getString("revoque");
                fila[4]=rs.getString("TechoVivienda");
                fila[5]=rs.getString("MaterialMasUsado");
                fila[6]=rs.getString("ProveerAgua");
                fila[7]=rs.getString("AguaEnLaVivienda");
                fila[8]=rs.getString("ServicioSanitario");
                fila[9]=rs.getString("TieneDesague");
                fila[10]=rs.getString("EnergiaElectrica");
                fila[11]=rs.getString("Combustible");
                fila[12]=rs.getString("CuartoDeCocina");
                
               
               
                
                model.addRow(fila);
            }
            jTable2.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
            RegistroAdministrador Ad = new RegistroAdministrador();
        Ad.setVisible(true);
        this.setVisible(false);     // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           try {
            conn = Mysql.getConnection();
            String[]titulos = {"deViaje", "CantPersonas", "nomPersona", "sexo", "AñoSalida", "EdadSalida", "Residencia"}; 
           
            String sql = "SELECT * FROM emigracioninterlacional WHERE nomPersona = " + jTextField5.getText() + "";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[7];
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          try {
            conn = Mysql.getConnection();
            String[]titulos = {"Muerte", "CantMuertes", "nomPersonaF", "EdadPersona", "sexo", "PerMayor"}; 
            String sql = "SELECT * FROM mortalidad WHERE nomPersonaF = " + jTextField6.getText() + "";
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
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               try {
            conn = Mysql.getConnection();
            String[]titulos = {"dificult", "nomPersona", "EdadPersona", "sexo", "discapacidad"}; 
           
            String sql = "SELECT * FROM dificultadpermanente WHERE nomPersona = " + jTextField7.getText() + "";
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"relacion", "Sexo", "Edad", "RegistroCivil", "Carnet"}; 
           
            String sql = "SELECT * FROM caracteristicaspersona WHERE Edad = " + jTextField4.getText() + "";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[5];
            while(rs.next()){
                fila[0]=rs.getString("relacion");
                fila[1]=rs.getString("Sexo");
                fila[2]=rs.getString("Edad");
                fila[3]=rs.getString("RegistroCivil");
                fila[4]=rs.getString("Carnet");
               
                
                
                model.addRow(fila);
            }
            jTable6.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"BOLETAS LLENADAS CAPITULO F"}; 
            String sql = "SELECT COUNT(*) AS cant FROM caracteristicaspersona";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[1];
            while(rs.next()){
                fila[0]=rs.getString(1);
 
                model.addRow(fila);
            }
            jTable6.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       try {
            conn = Mysql.getConnection();
            String[]titulos = {"Inicial", "CursoInicialB", "TrabajoSemanaPasada", "Ocupacion", "EstadoCivil"}; 
            String sql = "SELECT * FROM caracteristicaspersona1 WHERE Ocupacion = " + jTextField9.getText() + "";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[5];
            while(rs.next()){
                fila[0]=rs.getString("Inicial");
                fila[1]=rs.getString("CursoInicialB");
                fila[2]=rs.getString("TrabajoSemanaPasada");
                fila[3]=rs.getString("Ocupacion");
                fila[4]=rs.getString("EstadoCivil");
               
                
                
                model.addRow(fila);
            }
            jTable7.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    try {
            conn = Mysql.getConnection();
            String[]titulos = {"CantHijos", "NacMesUltimoHijo", "NacAnioUltimoHijo", "UltimoHijoConVida", "Ultimoparto"}; 
           
            String sql = "SELECT * FROM caracteristicaspersona2 WHERE CantHijos = " + jTextField8.getText() + "";
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
            jTable8.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"BOLETAS LLENADAS CAPITULO F1"}; 
            String sql = "SELECT COUNT(*) AS cant FROM caracteristicaspersona1";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[1];
            while(rs.next()){
                fila[0]=rs.getString(1);
 
                model.addRow(fila);
            }
            jTable7.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"BOLETAS LLENADAS CAPITULO F2"}; 
            String sql = "SELECT COUNT(*) AS cant FROM caracteristicaspersona2";
            model = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[1];
            while(rs.next()){
                fila[0]=rs.getString(1);
 
                model.addRow(fila);
            }
            jTable8.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
            DatosEncuestador Ad = new DatosEncuestador();
        Ad.setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            conn = Mysql.getConnection();
            String[]titulos = {"codMunicipal", "Distrito", "CiudadComunidad", "ZonaCensal", "Sector", "Ciudad", "Localidad", "Zona", "Avenida", "Piso", "NroDepartamento", "NumeroOrden", "NumeroVivienda", "NrPuerta", "NomEdificio","Mujeres", "Hombres", "TotalPersonas"}; 
            String sql = "SELECT * FROM ubicaciongeografica WHERE NumeroVivienda = " + jTextField3.getText() + "";
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
            jTable1.setModel(model);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        DatosEstadisticos DE = new DatosEstadisticos();
        DE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseClicked
        // TODO add your handling code here:
        DatosJefeDeZona en = new DatosJefeDeZona();
        en.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton24MouseClicked

    private void jButton26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseClicked
        // TODO add your handling code here:
        DatosJefeDeFamilia jf = new DatosJefeDeFamilia();
        jf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton26MouseClicked

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
interfazPrincipal da = new interfazPrincipal();
        da.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
      RegistroAdministrador da = new RegistroAdministrador();
        da.setVisible(true);
        this.setVisible(false);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
       actualizado();    
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton25KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton25KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25KeyReleased

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
int fila1 = jTable2.getSelectedRow();
   String Vivienda = jTable2.getValueAt(fila1, 0).toString();
   String Observacion = jTable2.getValueAt(fila1, 1).toString();
   String MaterialConstruccion = jTable2.getValueAt(fila1, 2).toString();
   String revoque = jTable2.getValueAt(fila1, 3).toString();
   String TechoVivienda = jTable2.getValueAt(fila1, 4).toString();
   String MaterialMasUsado = jTable2.getValueAt(fila1, 5).toString();
   String ProveerAgua = jTable2.getValueAt(fila1, 6).toString();
   String AguaEnLaVivienda = jTable2.getValueAt(fila1, 7).toString();
   String ServicioSanitario = jTable2.getValueAt(fila1, 8).toString();
   String TieneDesague = jTable2.getValueAt(fila1, 9).toString();
   String EnergiaElectrica = jTable2.getValueAt(fila1, 10).toString();
   String Combustible = jTable2.getValueAt(fila1, 11).toString();
   String CuartoDeCocina = jTable2.getValueAt(fila1, 12).toString();
   
   try{
   PreparedStatement actu = conect.prepareStatement("UPDATE vivienda SET Observacion='"+Observacion+"',MaterialConstruccion='"+MaterialConstruccion+"',revoque='"+revoque+"',TechoVivienda='"+TechoVivienda+"',MaterialMasUsado='"+MaterialMasUsado+"',ProveerAgua='"+ProveerAgua+"',AguaEnLaVivienda='"+AguaEnLaVivienda+"',ServicioSanitario='"+ServicioSanitario+"',TieneDesague='"+TieneDesague+"',EnergiaElectrica='"+EnergiaElectrica+"',Combustible='"+Combustible+"',CuartoDeCocina='"+CuartoDeCocina+"' WHERE Vivienda='"+Vivienda+"'");
   actu.executeUpdate();
   mostrarDatos1();
   
   }catch(Exception e){
   JOptionPane.showMessageDialog(null, e + "NO se logro actualizar");
   }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
      int fila2 = jTable3.getSelectedRow();
   String deViaje = jTable3.getValueAt(fila2, 0).toString();
   String CantPersonas = jTable3.getValueAt(fila2, 1).toString();
   String nomPersona = jTable3.getValueAt(fila2, 2).toString();
   String sexo = jTable3.getValueAt(fila2, 3).toString();
   String AñoSalida = jTable3.getValueAt(fila2, 4).toString();
   String EdadSalida = jTable3.getValueAt(fila2, 5).toString();
   String Residencia = jTable3.getValueAt(fila2, 6).toString();
  
   
   try{
   PreparedStatement actu = conect.prepareStatement("UPDATE emigracioninterlacional SET deViaje='"+deViaje+"',CantPersonas='"+CantPersonas+"',sexo='"+sexo+"',AñoSalida='"+AñoSalida+"',EdadSalida='"+EdadSalida+"',Residencia='"+Residencia+"' WHERE nomPersona='"+nomPersona+"'");
   actu.executeUpdate();
   mostrarDatos2();
   
   }catch(Exception e){
   JOptionPane.showMessageDialog(null, e + "NO se logro actualizar");
   }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
       int fila1 = jTable4.getSelectedRow();
   String Muerte = jTable4.getValueAt(fila1, 0).toString();
   String CantMuertes = jTable4.getValueAt(fila1, 1).toString();
   String nomPersonaF = jTable4.getValueAt(fila1, 2).toString();
   String EdadPersona = jTable4.getValueAt(fila1, 3).toString();
   String sexo = jTable4.getValueAt(fila1, 4).toString();
   String PerMayor = jTable4.getValueAt(fila1, 5).toString();
   
   
   try{
   PreparedStatement actu = conect.prepareStatement("UPDATE mortalidad SET Muerte='"+Muerte+"',nomPersonaF='"+nomPersonaF+"',EdadPersona='"+EdadPersona+"',sexo='"+sexo+"',PerMayor='"+PerMayor+"' WHERE CantMuertes='"+CantMuertes+"'");
   actu.executeUpdate();
   mostrarDatos1();
   
   }catch(Exception e){
   JOptionPane.showMessageDialog(null, e + "NO se logro actualizar");
   }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
   int fila1 = jTable5.getSelectedRow();
   String dificult = jTable5.getValueAt(fila1, 0).toString();
   String nomPersona = jTable5.getValueAt(fila1, 1).toString();
   String EdadPersona = jTable5.getValueAt(fila1, 2).toString();
   String sexo = jTable5.getValueAt(fila1, 3).toString();
   String discapacidad = jTable5.getValueAt(fila1, 4).toString();
   
   try{
   PreparedStatement actu = conect.prepareStatement("UPDATE dificultadpermanente SET dificult='"+dificult+"',nomPersona='"+nomPersona+"',sexo='"+sexo+"',discapacidad='"+discapacidad+"' WHERE EdadPersona='"+EdadPersona+"'");
   actu.executeUpdate();
   mostrarDatos4();
   
   }catch(Exception e){
   JOptionPane.showMessageDialog(null, e + "NO se logro actualizar");
   }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
         int fila1 = jTable6.getSelectedRow();
   String relacion = jTable6.getValueAt(fila1, 0).toString();
   String Sexo = jTable6.getValueAt(fila1, 1).toString();
   String Edad = jTable6.getValueAt(fila1, 2).toString();
   String RegistroCivil = jTable6.getValueAt(fila1, 3).toString();
   String Carnet = jTable6.getValueAt(fila1, 4).toString();
  
 
   try{
   PreparedStatement actu = conect.prepareStatement("UPDATE caracteristicaspersona SET relacion='"+relacion+"',Sexo='"+Sexo+"',RegistroCivil='"+RegistroCivil+"',Carnet='"+Carnet+"' WHERE Edad='"+Edad+"'");
   actu.executeUpdate();
   mostrarDatos5();
   
   }catch(Exception e){
   JOptionPane.showMessageDialog(null, e + "NO se logro actualizar");
   }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
      int fila1 = jTable7.getSelectedRow();
   String Inicial = jTable7.getValueAt(fila1, 0).toString();
   String CursoInicialB = jTable7.getValueAt(fila1, 1).toString();
   String TrabajoSemanaPasada = jTable7.getValueAt(fila1, 2).toString();
   String Ocupacion = jTable7.getValueAt(fila1, 3).toString();
   String EstadoCivil = jTable7.getValueAt(fila1, 4).toString();
  
 
   try{
   PreparedStatement actu = conect.prepareStatement("UPDATE caracteristicaspersona1 SET Inicial='"+Inicial+"',TrabajoSemanaPasada='"+TrabajoSemanaPasada+"',Ocupacion='"+Ocupacion+"',EstadoCivil='"+EstadoCivil+"' WHERE CursoInicialB='"+CursoInicialB+"'");
   actu.executeUpdate();
   mostrarDatos6();
   
   }catch(Exception e){
   JOptionPane.showMessageDialog(null, e + "NO se logro actualizar");
   }  // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
      int fila1 = jTable8.getSelectedRow();
   String CantHijos = jTable8.getValueAt(fila1, 0).toString();
   String NacMesUltimoHijo = jTable8.getValueAt(fila1, 1).toString();
   String NacAnioUltimoHijo = jTable8.getValueAt(fila1, 2).toString();
   String UltimoHijoConVida = jTable8.getValueAt(fila1, 3).toString();
   String Ultimoparto = jTable8.getValueAt(fila1, 4).toString();
  
 
   try{
   PreparedStatement actu = conect.prepareStatement("UPDATE caracteristicaspersona2 SET NacMesUltimoHijo='"+NacMesUltimoHijo+"',NacAnioUltimoHijo='"+NacAnioUltimoHijo+"',UltimoHijoConVida='"+UltimoHijoConVida+"',Ultimoparto='"+Ultimoparto+"' WHERE CantHijos='"+CantHijos+"'");
   actu.executeUpdate();
   mostrarDatos7();
   
   }catch(Exception e){
   JOptionPane.showMessageDialog(null, e + "NO se logro actualizar");
   }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionesAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionesAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionesAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionesAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionesAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
