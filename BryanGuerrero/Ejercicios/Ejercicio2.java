/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                // TODO code application logic here
        int partidosGanados,
            partidosPerdidos,
            partidosEmpatados,
            ppganados=3,
            ppempatados=1,
            ppperdidos=0,
            puntos;
        
       String nombre="";

  
        Scanner sc= new Scanner (System.in);
        
        
        System.out.print("Ingrese nombre del equipo: ");
        nombre=sc.nextLine();
        System.out.print("Ingrese cantidad de partidos ganados: ");
        partidosGanados=sc.nextInt();
        
        System.out.print("Ingrese cantidad de partidos empatados: ");
        partidosEmpatados=sc.nextInt();
        
        System.out.print("Ingrese cantidad de partidos perdidos: ");
        partidosPerdidos=sc.nextInt();
        
        
        puntos=(partidosGanados*ppganados)+(partidosEmpatados*ppempatados)+(partidosPerdidos*ppperdidos);
        
        System.out.print("El equipo "+nombre+" obtuvo un total de "+puntos+" puntos");
        
        
        
    }
    
}
