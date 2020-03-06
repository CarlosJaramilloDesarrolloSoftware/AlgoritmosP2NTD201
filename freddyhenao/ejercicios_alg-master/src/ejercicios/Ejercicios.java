/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.io.PrintStream;
import java.util.Scanner;


/**
 *
 * @author 204
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Entrada 
    
    int PuntajeCorrectas = 4, 
        Puntajeincorrectas=-1, 
        PuntajeBlanco=0, 
        CantidadCorrectas,
        CantidadIncorrectas,
        CantidadBlancos;
    
    Scanner sc= new Scanner(System.in);
    
    //proceso
    
    System.out.print("Ingrese la Cantidad de Respuestas Correctas: ");
    CantidadCorrectas=sc.nextInt();
    System.out.print("Ingrese la Cantidad de Respuestas Incorrectas: ");
    CantidadIncorrectas=sc.nextInt();
    System.out.print("Ingrese la Cantidad de Respuestas Blanco: ");
    CantidadBlancos=sc.nextInt();
    
    System.out.print("Tu Punctuacion es:  ");
    System.out.print("Puntaje en Blanco es:"+(CantidadBlancos*PuntajeBlanco)+
            "Puntaje de Respuesetas  Correctas= "+
            (CantidadCorrectas*PuntajeCorrectas)+"  Puntaje de Respuesetas Incorrectas= "+
            (CantidadIncorrectas*Puntajeincorrectas));
    
    
     
    
    
    
    
    
                
      }  
}
