/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author 204
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int puntajeCorrecto=4, puntajeIncorrecto=-1, puntajeBlanco=0,cantidadCorrecta, cantidadIncorrecta, cantidadBlanco;
        
        Scanner sc = new Scanner(System.in);
        
        //proceso
        
        System.out.println("Ingrese la cantidad de respuestas correctas ");
        cantidadCorrecta = sc.nextInt();
        
         System.out.println("Ingrese la cantidad de respuestas incorrecta ");
        cantidadIncorrecta = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de respuestas en blanco  ");
        cantidadBlanco = sc.nextInt();
        
        //salida
        System.out.println("//////******////////");
        System.out.println("Tu puntiacion");
        System.out.println("////////****////////");
        System.out.println(( cantidadBlanco*puntajeBlanco)
                +(cantidadCorrecta * puntajeCorrecto)
                + (cantidadIncorrecta * puntajeIncorrecto));
    }
    
}
