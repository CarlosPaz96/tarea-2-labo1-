/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.poo.labo1.pkg10042019;

/**
 *
 * @author Hp
 */
public class funcion {
    private String Dia;
    private String N_funcion;
    private String Pelicula;
    
    public funcion(String Dia,String funcion,String pelicula){
        this.Dia=Dia;
        this.N_funcion=funcion;
        this.Pelicula=pelicula;
    }
    
    public String getDia(){
        return Dia;
    }
    
    public void setDia(String dia){
        this.Dia=dia;
    }
    
    public String getN_funcion(){
        return N_funcion;
    }
    public void setN_funcion(String numero){
        this.N_funcion=numero;
        
    }
    
    public String getPelicula(){
        return Pelicula;
    }
    public void setPelicula(String nombrePeli){
        this.Pelicula=nombrePeli;        
    }
    
}
