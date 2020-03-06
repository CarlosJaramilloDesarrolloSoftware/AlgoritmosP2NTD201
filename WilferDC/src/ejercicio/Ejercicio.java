/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author 204
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Entrada
        
        int puntajeCorrectas=4,
        puntajeIncorrectas=-1,
        puntajeBlanco=0,
        cantidadCorrectas, 
        cantidadIncorrectas, 
        cantidadBlanco;
        
        Scanner sc= new Scanner (System.in);
        
        // proceso
        
        System.out.print("ingrese cantidad de respuestas incorrectas");
        cantidadIncorrectas=sc.nextInt();
        
        System.out.print("ingrese cantidad de respuestas correctas");
        cantidadCorrectas=sc.nextInt();
        
        System.out.print("ingrese cantidad de respuestas en blanco");
        cantidadBlanco=sc.nextInt();
        
        //salida
        
        System.out.print("tu puntuacion es: ");
        System.out.print("puntaje en blanco: "+ (cantidadBlanco*puntajeBlanco)+ "\n"
        + "puntuacion de respuestas correctas: "+ (cantidadCorrectas*puntajeCorrectas)+ "\n"
        + "puntuacion de respuestas incorrectas: "+ (cantidadIncorrectas*puntajeIncorrectas)); 
      
    }
    
}
