/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_impar;

import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Par_impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        
         // Solicitar los números
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            
              }

        // Mostrar los números con su clasificación
        for (int i = 0; i < 8; i++) {
             System.out.print(numeros[i] + " es ");
            if (numeros[i] % 2 == 0) {
                System.out.println("par");
            } else {
                  System.out.println("impar");
            }
        }
                    
                    
    }
    
}
