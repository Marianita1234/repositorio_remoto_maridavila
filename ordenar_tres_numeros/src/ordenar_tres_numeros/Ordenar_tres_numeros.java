/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenar_tres_numeros;

import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Ordenar_tres_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int numero3 = scanner.nextInt();
        
        System.out.println("Números introducidos: " + numero1 + ", " + numero2 + ", " + numero3);

        int temp;

       if (numero1 > numero2) {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        if (numero2 > numero3) {
            temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }

        if (numero1 > numero2) {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

            
            System.out.println("Números ordenados: " + numero1 + ", " + numero2 + ", " + numero3);

        scanner.close();
    }
    
}
