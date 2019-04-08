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
    public static cine d=new cine(null,null);
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
        System.out.println("    8. Salir.");
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
                break;
                case 7:System.out.println("----------------------- 7 ----------------------- ");
                break;
                case 8:System.out.println("----------------------- Salir -----------------------"); 
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
    
}
