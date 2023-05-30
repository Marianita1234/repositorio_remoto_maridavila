/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primer_cifra;

import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Primer_cifra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero de hasta 5 cifras: ");
        int numero = scanner.nextInt();
  int primeraCifra;

        if (numero < 0) {
            numero = -numero;
        }

        if (numero < 10) {
            primeraCifra = numero;
        } else if (numero < 100) {
            primeraCifra = numero / 10;
        } else if (numero < 1000) {
            primeraCifra = numero / 100;
        } else if (numero < 10000) {
            primeraCifra = numero / 1000;
        } else {
            primeraCifra = numero / 10000;
        }

        System.out.println("La primera cifra del número introducido es: " + primeraCifra);

        scanner.close();
        
    }
    
}
