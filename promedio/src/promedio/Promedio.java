/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio;

import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner entrada = new Scanner(System.in);

        int suma = 0;
        int contador = 0;
        int numero;
        
         System.out.println("Ingresa los números positivos para calcular su promedio (ingresa un número negativo para salir):");

        do {
            numero = entrada.nextInt();

            if (numero >= 0) {
                suma += numero;
                contador++;
                 }
        } while (numero >= 0);

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los " + contador + " números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números positivos");
        }
    }
}
            
            
    
    

