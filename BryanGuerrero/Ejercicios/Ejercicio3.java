/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad1,
                edad2,
                diferencia;

       
            Scanner sc= new Scanner (System.in);
            
            System.out.print("Ingrese edad del primer hermano: ");
            edad1=sc.nextInt();
            
            System.out.print("Ingrese edad del segundo hermano: ");
            edad2=sc.nextInt();
            
                if(edad1>edad2){
                   diferencia=edad1-edad2;
                   System.out.print("El primer hermano es mayor con una diferencia de: "+diferencia+" año(s)");

            }
                else{
                    diferencia=edad2-edad1;
                    System.out.print("El segundo hermano es mayor con una diferencia de: "+diferencia+" año(s)");
                }
    }
}