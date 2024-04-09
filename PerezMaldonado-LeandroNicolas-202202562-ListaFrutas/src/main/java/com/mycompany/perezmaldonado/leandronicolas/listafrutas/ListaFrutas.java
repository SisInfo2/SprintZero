/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perezmaldonado.leandronicolas.listafrutas;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author PC
 */
public class ListaFrutas{
    /**Atributos ListaFrutas**/
    public ArrayList<Fruta> frutas = new ArrayList<Fruta>();
    public String nombre;
    
    public ListaFrutas(String nombre){
        this.nombre = nombre;
    }
    /**Metodos ListaFrutas**/
    public void aniadirFruta(Fruta e){
        //Si la liga contiene al equipo no hay necesidad de volverlo a poner
        if(existe(frutas,e,0) == false){
            //Si el equipo cumple con los requisitos
            frutas.add(e);
        for (int i = 0; i < frutas.size(); i++) {
            for (int j = 1; j < (frutas.size() - i); j++) {
                if ((frutas.get(j - 1)).precio > (frutas.get(j)).precio) {
                    Fruta temp = new Fruta("temp",0);
                    temp = frutas.get(j - 1);
                    
                    frutas.set(j - 1, frutas.get(j));

                    frutas.set(j, temp);
                }
            }
        }
        
        }
    }
    
    public void eliminarFruta(String nombre){
        Iterator i = frutas.iterator();
        while(i.hasNext()){
            Fruta e = (Fruta)i.next();
            if(e.nombre.equals(e.nombre)){
                i.remove();
                System.out.println("Fruta eliminada de la lista");
            }
        }
    }   
    
    public static boolean existe(ArrayList<Fruta> frutas, Fruta e, int i) {
        if(i>=frutas.size()){
            return  false;
        }else{
            
            if(e.equals(frutas.get(i))){
                return  true;    
            }else{
                return  existe(frutas, e, i+1);
            }
        }
        
    }
    
    
}
