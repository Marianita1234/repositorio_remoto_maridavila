/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factura;

/**
 *
 * @author Mariana
 */
public class Factura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double baseSinIVA = 3500.0;
        double tasaIVA = 0.19;
        
         double valorIVA = baseSinIVA * tasaIVA;
        double total = baseSinIVA + valorIVA;

         System.out.println("Base sin IVA: $" + baseSinIVA);
        System.out.println("IVA: $" + valorIVA);
        System.out.println("Total: $" + total);
    }
    
}
