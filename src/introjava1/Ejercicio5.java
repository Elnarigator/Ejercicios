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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().

Scanner leer = new Scanner (System.in);
System.out.println("ingresa un numero entero");
int num = leer.nextInt();
System.out.println("el doble del numero es "+(num*2)+" El tripe es " + (num*3)+" y la raiz cuadrada del numero es "+ (Math.sqrt(num)));
        
    }
    
}
