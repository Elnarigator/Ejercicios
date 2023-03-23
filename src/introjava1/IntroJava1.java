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
public class IntroJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      System.out.println("Ingresa un numero");
      int num = leer.nextInt();
      System.out.println("Ingresa otro numero");
      int num2 = leer.nextInt();
      int suma= num+num2;
      System.out.println("la suma es "+ suma);
      

    }
    
}
