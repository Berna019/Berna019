/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect1;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Proyect1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        int numero2;
        
        System.out.println("Ingresa el primero número");
        Scanner num1 = new Scanner (System.in);
        numero1 = num1.nextInt();
        System.out.println("Ingresa el segundo número");
        Scanner num2 = new Scanner(System.in);
        numero2 = num2.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de los dos números es: " + suma);
    }
    
}
