/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author gurm01
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int contador = 10, contletras = 0, contconso = 0;
        char letra;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= contador; i++) {

            System.out.print("Introduzca letra " + i + " :");
            letra = sc.next().charAt(0);

            if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
                contletras++;
            } else {
                contconso++;
            }

        }
        System.out.print("Total de letras ingresadas: " + contletras);
        System.out.print("Total de consonantes ingresadas: " + contconso);

    }

}
