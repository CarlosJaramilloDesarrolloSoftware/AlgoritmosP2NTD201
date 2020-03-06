/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmop2nt201;

import java.util.Scanner;

/**
 *
 * @author 204
 */
public class Algoritmop2nt201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int puntajecorrectas=4,
                puntajeincorrectas=-1,
                puntajeblanco=0,
                cantIncorrectas,
                cantcorrectas,
                cantblancos;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la cantidad de respuestas ccorrectas");
        cantcorrectas=sc.nextInt();
        System.out.println("ingrese la cantidad de respuestas incorrectas");
        cantIncorrectas=sc.nextInt();
        
        //salida
        
        System.out.println("/////////*****////");
        System.out.println("tu puntuacion");
        System.out.println("/////////*****////");
        System.out.println((cantidadblanco*puntajeblanco)+(cantcorrectas*puntajecorrectas)+(cantIncorrectas*puntajeincorrectas));   
        
    }
    
}
