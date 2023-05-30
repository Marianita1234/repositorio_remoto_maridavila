/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero_inverso;

import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Numero_inverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        // Pide al usuario que ingrese los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número #" + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
          // Muestra los números en orden inverso
          System.out.println("Los números ingresados en orden inverso son:");
          for (int i = 9; i >= 0; i--) {
              System.out.println(numeros[i]);
          }
    }
    
}
