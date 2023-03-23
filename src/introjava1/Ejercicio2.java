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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa el nombre");
        String Nombre = leer.nextLine();
        System.out.println("el nombre es "+Nombre);
    }
    
}
