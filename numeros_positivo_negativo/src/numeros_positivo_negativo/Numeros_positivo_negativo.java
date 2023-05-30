/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros_positivo_negativo;

import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Numeros_positivo_negativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner entrada = new Scanner(System.in);

        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        int numero;
        
          System.out.println("Ingresa diez números:");

        for (int i = 1; i <= 10; i++) {
            numero = entrada.nextInt();

            if (numero >= 0) {
                cantidadPositivos++;
            } else {
                cantidadNegativos++;
            }
        }
         System.out.println("Cantidad de números positivos: " + cantidadPositivos);
        System.out.println("Cantidad de números negativos: " + cantidadNegativos);
    }
}
    
    

