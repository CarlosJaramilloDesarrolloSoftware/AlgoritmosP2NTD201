/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosp2;

import java.util.Scanner;

/**
 *
 * @author 204
 */
public class AlgoritmosP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicite número de respuestas,muestre puntaje final , correctas 4puntos, incorrectas -1, blanco 0
        
        //ENTRADA DE DATOS
        int respuestasCorrectas ;
        int respuestasIncorrectas;
        int respuestasBlanco;
        int puntajeCorrecta = 4;
        int puntajeIncorrecta = -1;
        int puntajeBlanco = 0;
        
        Scanner sc = new Scanner(System.in);
        
        //FLUJO , LOS CÁLCULOS
        System.out.println("Ingresar cantidad de respuestas incorrectas");
        respuestasIncorrectas = sc.nextInt();
        
        System.out.println("Ingresar cantidad de respuestas correctas");
        respuestasCorrectas = sc.nextInt();
        
        System.out.println("Ingresar cantidad de respuestas en blanco");
        respuestasBlanco = sc.nextInt();
        
        //SALIDA
        System.out.println("Tu puntuación : ");
       
        System.out.println((respuestasCorrectas * puntajeCorrecta)
                +(respuestasIncorrectas * puntajeIncorrecta)
                + (respuestasBlanco * puntajeBlanco ));
        
        
        
        
        
    }
    
}
