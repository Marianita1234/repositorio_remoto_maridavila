/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide;

import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);

        System.out.print("Ingresa un número:");
        int num= sc .nextInt();
          
            
      // Imprime los números en orden ascendente
         
     
      
      // Imprime los números en orden descendente
            for (int i=1; i<= num;i++) {
             for  (int j = 1; j<=i;j++){
                System.out.print(j + " ");
                // Salto de línea para pasar a la siguiente fila
            }
             
             System.out.println();
            }
             }
     }
            
                

        
        

        
    

        
    
    

