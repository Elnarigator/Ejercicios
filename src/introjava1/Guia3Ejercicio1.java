/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava1;

import java.util.Scanner;

/**
 *
 * @author Rat Carlos
 */
public class Guia3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int n1 = leer.nextInt();
        if (n1 < 10) {
            System.out.println("el numero es menor a 10");

        } else {
            System.out.println("es mayor a 10");

        }
    }
}
