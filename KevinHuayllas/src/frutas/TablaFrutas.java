/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frutas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TUF
 */
public class TablaFrutas{
    private ArrayList<Fruta> frutas;
    private DefaultTableModel tableModel;
    private JTable tabla;
    private JButton btnAgregar;

    public TablaFrutas() {
        frutas = new ArrayList<>();
        tableModel = new DefaultTableModel(new Object[]{"ID", "Fruta", "Precio",""}, 0);
        tabla = new JTable(tableModel);

        // Crear botones para agregar, eliminar y editar filas
         btnAgregar = new JButton("Agregar");
//        JButton btnEliminar = new JButton("Eliminar");
//        JButton btnEditar = new JButton("Editar");
//
//        btnAgregar.addActionListener(e -> agregarFila());
//        btnEliminar.addActionListener(e -> eliminarFila());
//        btnEditar.addActionListener(e -> editarFila());

        // Configurar el diseño de la interfaz
//        add(new JScrollPane(tabla), BorderLayout.CENTER);

//        JPanel panelBotones = new JPanel(new FlowLayout());
//        panelBotones.add(btnAgregar);
//        panelBotones.add(btnEliminar);
//        panelBotones.add(btnEditar);
//        add(panelBotones, BorderLayout.SOUTH);

//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(600, 400);
//        setLocationRelativeTo(null);
//        setVisible(true);
    }

    private void agregarFila() {
        // Implementación para agregar una nueva fruta a la tabla
        // Por ejemplo:
        // Fruta nuevaFruta = new Fruta(1, "Manzana", 2.5);
        // frutas.add(nuevaFruta);
        // tableModel.addRow(new Object[]{nuevaFruta.getIdFruta(), nuevaFruta.getFruta(), nuevaFruta.getPrecio()});
    }

    private void eliminarFila() {
        // Implementación para eliminar una fruta de la tabla
        // Por ejemplo:
        // int filaSeleccionada = tabla.getSelectedRow();
        // if (filaSeleccionada != -1) {
        //     frutas.remove(filaSeleccionada);
        //     tableModel.removeRow(filaSeleccionada);
        // }
    }

    private void editarFila() {
        // Implementación para editar los datos de una fruta en la tabla
        // Por ejemplo:
        // int filaSeleccionada = tabla.getSelectedRow();
        // if (filaSeleccionada != -1) {
        //     Fruta frutaEditada = frutas.get(filaSeleccionada);
        //     // Actualiza los valores de frutaEditada según la edición del usuario
        //     tableModel.setValueAt(frutaEditada.getFruta(), filaSeleccionada, 1);
        //     tableModel.setValueAt(frutaEditada.getPrecio(), filaSeleccionada, 2);
        // }
    }
    
    public JTable getTable(){
        return this.tabla;
    }
    
    public JButton getButton(){
        return this.btnAgregar;
    }
}
