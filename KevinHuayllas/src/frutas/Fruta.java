/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frutas;

/**
 *
 * @author TUF
 */
public class Fruta {
    private int idFruta;
    private String fruta;
    private double precio;

    // Constructor
    public Fruta(int idFruta, String fruta, double precio) {
        this.idFruta = idFruta;
        this.fruta = fruta;
        this.precio = precio;
    }

    // Getters y setters (puedes agregar más según tus necesidades)
    public int getIdFruta() {
        return idFruta;
    }

    public void setIdFruta(int idFruta) {
        this.idFruta = idFruta;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
