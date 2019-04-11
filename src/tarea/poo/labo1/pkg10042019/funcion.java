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
    private int N_funcion;
    private String Pelicula;
    
    public funcion(String Dia,int funcion,String pelicula){
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
    
    public int getN_funcion(){
        return N_funcion;
    }
    public void setN_funcion(int numero){
        this.N_funcion=numero;
        
    }
    
    public String getPelicula(){
        return Pelicula;
    }
    public void setPelicula(String nombrePeli){
        this.Pelicula=nombrePeli;        
    }

    @Override
    public String toString() {
        return "funcion{" + "Dia=" + Dia + ", N_funcion=" + N_funcion + ", Pelicula=" + Pelicula + '}';
    }
    
}
