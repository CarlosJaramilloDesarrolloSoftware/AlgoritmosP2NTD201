/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_crud;

import java.util.Scanner;

/**
 *
 * @author 204
 */
public class Ejercicio_CRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int puntajeCorrectas = 4, 
                puntIncorrectas = -1, 
                puntBlanco =0, 
                cantCorrectas, 
                cantIncorrectas, 
                cantBlanco;
        Scanner sc = new Scanner(System.in);
        
        
        //Proceso:
        System.out.println("Ingrese cantidad de respuestas incorrectas");
        cantIncorrectas = sc.nextInt();
        
        System.out.println("Ingrese cantidad de respuestas correctas");
        cantCorrectas = sc.nextInt();
       
        System.out.println("Ingrese cantidad de respuestas en blanco");
        cantBlanco = sc.nextInt();
        
        
        //Salida
        System.out.println("///////**************/////////");
        System.out.println("Tu puntuación");
        System.out.println("///////**************/////////");
        System.out.println((cantBlanco * puntBlanco)
                + (cantCorrectas * puntajeCorrectas)
                + (cantIncorrectas * puntIncorrectas));
        
        
        
        
        
    }
    
}
