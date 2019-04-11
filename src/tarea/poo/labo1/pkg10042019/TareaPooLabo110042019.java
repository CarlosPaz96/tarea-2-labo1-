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
import java.util.Scanner;
import java.util.ArrayList;

public class TareaPooLabo110042019 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<cine> Cinee=new ArrayList<cine>();
    public static ArrayList<funcion> sabadoo= new ArrayList<funcion>();
    public static ArrayList<funcion> domingoo= new ArrayList<funcion>();
    public static cine d=new cine(null,null);
    public static Scanner xD=new Scanner(System.in);
    public static Scanner lol=new Scanner(System.in);
    public static boolean antonio=true;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        Scanner y=y = new Scanner(System.in);
        
        boolean flag=true;
        while (flag){
        System.out.println("-------------------------------------");
        System.out.println("|               Menu                |");
        System.out.println("-------------------------------------");
        System.out.println("    1. Poner nombre de cine");
        System.out.println("    2. Poner nombre y Lema del cine");
        System.out.println("    3. Ver informacion del cine");
        System.out.println("    4. Editar nombre del cine");
        System.out.println("    5. Editar nombre y lema del cine");
        System.out.println("    6. Ingresar Nueva Funcion");
        System.out.println("    7. Editar Funcion ya existente.");
        System.out.println("    8. Ver cartelera");
        System.out.println("    9. Salir.");
        System.out.println("-------------------------------------");
        int op=x.nextInt();
        if (op<1 || op>8) {
            System.out.println("No existe esta opcion, intente de nuevo");
            
        } else{
            switch(op){
                case 1:System.out.println("----------------------- 1 -----------------------");
                    cineNombreLema(op);
                break;
                case 2:System.out.println("----------------------- 2 ----------------------- ");
                    cineNombreLema(op);
                break;
                case 3:System.out.println("----------------------- 3 ----------------------- ");
                    System.out.println("Nombre: "+Cinee.get(0).getNombre()+" Lema: "+Cinee.get(0).getLema());
                break;
                case 4:System.out.println("----------------------- 4 ----------------------- ");
                    System.out.println("ingrese nuevo nombre:");
                    Cinee.get(0).modificar(y.nextLine());
                    
                break;
                case 5:System.out.println("----------------------- 5 ----------------------- ");
                    System.out.println("Ingrese Nuevo Nombre:");
                    String nombrex=y.nextLine();
                    System.out.println("Ingrese Nuevo Lema:");
                    String Lemay=y.nextLine();
                    Cinee.get(0).modificar(nombrex, Lemay);
                break;
                case 6:System.out.println("----------------------- 6 ----------------------- ");
                    IngresarFuncion();
                break;
                case 7:System.out.println("----------------------- 7 ----------------------- ");
                editarFuncion();
                
                break;
                case 8:System.out.println("----------------------- 8 ----------------------- ");
                    break;
                case 9:System.out.println("----------------------- Salir -----------------------"); 
                    flag=false;
                
                break;
                        
        }
        }
        }
        
    }//main
    public static void cineNombreLema(int occion){
        Scanner y=new Scanner(System.in);
        if (occion==1){
            System.out.println("Ingrese Nombre del cine:");
            String nombree=y.nextLine();
            cine c=new cine(nombree);
            Cinee.add(c);
            
        }
        if (occion==2){
            System.out.println("Ingrese Nombre del cine:");
            String nombree=y.nextLine();
            System.out.println("Ingrese Lema del cine:");
            String lemaa=y.nextLine();
            cine c=new cine(nombree,lemaa);
            Cinee.add(c);
            
            
        }
    }
    public static void IngresarFuncion(){
        Scanner x=new Scanner(System.in);
        Scanner y=new Scanner(System.in);
        System.out.println("Solo puede ingresar 3 funciones por dia");
        System.out.println("----> Seleccione el dia en el que decea ingresar la funcion:");
        System.out.println("            1. Sabado");
        System.out.println("            2. Domingo");
        int dia= x.nextInt();
        String Dia=null;
        System.out.println("Nombre de la pelicula:");
        String peli=y.nextLine();
        switch (dia){
            case 1: Dia="Sabado";
            int tamannoSabado=sabadoo.size();
            int NFS=tamannoSabado+1;
            if(tamannoSabado==3){System.out.println("Las funciones para este dia ya estan completas");}
            else{
            funcion p=new funcion(Dia,NFS,peli);
            sabadoo.add(p);
                System.out.println(sabadoo.toString());
                System.out.println("Funcion agregada con exito");
        }
            break;
            case 2: Dia="Domingo";
            int tamannoDomingo=domingoo.size();
            int NFD=tamannoDomingo+1;
            if(tamannoDomingo==3){System.out.println("Las funciones para este dia ya estan completas");}
            else{
            funcion p=new funcion(Dia,NFD,peli);
            domingoo.add(p);
                System.out.println(domingoo.toString());
                System.out.println("Funcion agregada con exito");
            break;
                
            }
    }
    
}
    public static void editarFuncion(){
        Scanner x=new Scanner(System.in);
        Scanner y=new Scanner(System.in);
        System.out.println("Seleccione el dia de la funcion que decea editar:");
        System.out.println("            1. Sabado");
        System.out.println("            2. Domingo");
        int dia= x.nextInt();
        String Dia=null;
        System.out.println("numero de la fincion:");
        int num=y.nextInt();
        if (dia==1){
            if(sabadoo.size()>=num){
                System.out.println("La pelicula actual es: "+sabadoo.get(num-1).getPelicula());
                System.out.println("Que Pelicula decea ingresar: ");
                String pelicula=xD.nextLine();
                sabadoo.get(num-1).setPelicula(pelicula);
                //System.out.println(sabadoo.get(num-1));
                System.out.println("Pelicual cambiada con exito");
            }
            else{
                System.out.println("no existe la funcion");
            }
        }
        if (dia==2){
            if(domingoo.size()>=num){
                System.out.println("La pelicula actual es: "+domingoo.get(num-1).getPelicula());
                System.out.println("Que Pelicula decea ingresar: ");
                String pelicula=xD.nextLine();
                domingoo.get(num-1).setPelicula(pelicula);
                //System.out.println(sabadoo.get(num-1));
                System.out.println("Pelicual cambiada con exito");
            }
            else{
                System.out.println("no existe la funcion");
            }
        }
    }
    
    
}
