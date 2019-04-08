/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.poo.labo1.pkg10042019;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class cine {
    
    
    private String nombre;
    private String lema;
    
    

    public cine(String nombre, String lema) {
        this.nombre = nombre;
        this.lema = lema;
    }

    public cine(String nombre) {
        this.nombre = nombre;
        
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    @Override
    public String toString() {
        return "cine{" + "nombre=" + nombre + ", lema=" + lema + '}';
    }
    
    public void modificar(String nombre){
        setNombre(nombre);
    }
    
    public void modificar(String nombres,String Lemas){
        setNombre(nombres);
        setLema(Lemas);
    }
}
