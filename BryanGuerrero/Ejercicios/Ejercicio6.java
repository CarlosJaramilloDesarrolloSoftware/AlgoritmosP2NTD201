/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, d = 0, u = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        num = sc.nextInt();

        if (num < 100) {

            d = (num / 10);
            u = num - (d * 10);

            System.out.println(d + " : Decena(s)");
            System.out.println(u + " : Unidad(es)");
        } else {
            System.out.println("Error! ... Número con más de 2 cifras...");

        }

    }
}
