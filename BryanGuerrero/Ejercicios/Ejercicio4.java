/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int produccion,
            diferencia;
            Scanner sc= new Scanner (System.in);
            
            System.out.print("Ingrese la cantidad de unidades producidas por el empleado en la semana (L-S): ");
            produccion=sc.nextInt();

            
                if(produccion>=100){
                   System.out.print("Felicitaciones! ...El empleado recibirá incentivos");
            }
                else{
                    diferencia=100-produccion;
                    System.out.print("El empleado no recibirá incentivos, le faltaron: "+diferencia+" unidad(es)");
                }
    }
}