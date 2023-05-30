/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.promedio_de_3notas_mariana;

/**
 *
 * @author Mariana
 */
import java.util.Scanner;
public class grade_Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		
		gradeBook planillaNotas = new gradeBook();
		
		System.out.println("Escriba el nombre del curso");
		String nombreCurso = lector.nextLine();
		
		planillaNotas.setNombreCurso(nombreCurso);
		
		planillaNotas.displayMessage();
	}
    
}
