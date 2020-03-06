/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoejp;

import java.util.Scanner;

/**
 *
 * @author 204
 */
public class AlgoritmoEjp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int puntajeCorrectas = 4, puntajeIncorrectas = -1, puntajeBlanco = 0, cantidadCorrectas, cantidadIncorrectas, cantidadBlanco;
        
        Scanner sc = new Scanner(System.in);
        
        //proceso
        System.out.println("Ingrese cantidad de respuestas incorrectas");
        cantidadIncorrectas = sc.nextInt();
        
        System.out.println("Ingrese cantidad de respuestas correctas");
        cantidadCorrectas = sc.nextInt();
        
        System.out.println("Ingrese cantidad de respuestas en blanco");
        cantidadBlanco = sc.nextInt();
        
        
        //salida
        System.out.println("//////**********////////");
        System.out.println("Tu puntuación");
        System.out.println("//////**********////////");
        System.out.println((cantidadBlanco * puntajeBlanco)
                + (cantidadIncorrectas * puntajeIncorrectas)
                + (cantidadCorrectas * puntajeCorrectas));
    }
    
}
