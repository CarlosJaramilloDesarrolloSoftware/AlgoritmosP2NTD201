/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a, b,c;
        Scanner sc= new Scanner (System.in);
        
        
        System.out.print("Ingrese lado A: ");
        a=sc.nextInt();
        
        System.out.print("Ingrese lado B: ");
        b=sc.nextInt();
        
        System.out.print("Ingrese lado C: ");
        c=sc.nextInt();
        
        if((c<a+b) && (b<a+c) && (a==b && b==c) && (a==c && c==b)&&(b==c && c==a)){
            System.out.print("Es un triángulo equilatero");
        }
        else {
            
            if ((c<a+b) && (b<a+c) &&(a<b+c)&&(a!=b && b!=c) && (a!=c && c!=b)&&(c!=a && a!=b))
            {
                System.out.print("Es un triángulo escaleno");
            }
            else{
                if((c<a+b)&&(b<a+c)&&(a<b+c)&& (a==b)||(a==c)||(b==c)){
                    
                    System.out.print("Es un triángulo isóceles");
                }
                else{
                    
                     System.out.print("No es un triángulo");
                    
                }
                
            }
        }

    }
    
}
