/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio_de_3notas_mariana;

import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Promedio_de_3notas_mariana {

    public static void main(String[] args) {
        double NotaT1=0,NotaT2=0,NotaT3=04;
        double PromedioNotas;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese nota trimestre 1");
        NotaT1 = teclado.nextDouble();
        System.out.println("ingrese nota trimestre 2 ");
        NotaT2 = teclado.nextDouble();
        System.out.println("ingrese nota trimestre 3");
        NotaT3=teclado.nextDouble();
        PromedioNotas = (NotaT1+NotaT2+NotaT3)/3;
        
        if(PromedioNotas<3){
            System.out.println("la nota final es "+PromedioNotas+"reprobado ");
        }
            if(PromedioNotas>=3){
                System.out.println("la nota final es "+PromedioNotas+" aprobado");
                
        }
        
        
    }
    
}
