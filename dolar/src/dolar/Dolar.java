/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dolar;

import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Dolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

       System.out.print("Introduce la cantidad en pesos: ");
        double cantidadPesos = scanner.nextDouble();
        
        double valorDolar = 3.895;
        double cantidadDolares = cantidadPesos / valorDolar;
        
          System.out.println(cantidadPesos + " pesos son " + cantidadDolares + " dólares.");

        scanner.close();
    }


       
    }
    

