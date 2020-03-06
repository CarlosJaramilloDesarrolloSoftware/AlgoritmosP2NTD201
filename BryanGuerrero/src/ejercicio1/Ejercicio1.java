/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author 204
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int puntajeCorrectas=4,
            puntajeIncorrectas=-1,
            puntajeBlanco=0,
            cantidadCorrectas,
            cantidadIncorrectas,
            cantidadBlanco;
        
        Scanner sc= new Scanner (System.in);
        
        System.out.print("Ingrese cantidad de respuestas correctas: ");
        cantidadCorrectas=sc.nextInt();
        
        System.out.print("Ingrese cantidad de respuestas incorrectas: ");
        cantidadIncorrectas=sc.nextInt();
        
        System.out.print("Ingrese cantidad de respuestas en blanco: ");
        cantidadBlanco=sc.nextInt();
        
        System.out.println("Tu puntuación Es: ");
        System.out.print("Puntaje de respuestas en blanco: "+ (cantidadBlanco*puntajeBlanco) + "\n"
                + " Puntaje de respuestas correctas: " +(cantidadCorrectas*puntajeCorrectas) + "\n"
                + " Puntaje de respuestas incorrectas: "+ (cantidadIncorrectas*puntajeIncorrectas) +"\n");
    }
    
}
