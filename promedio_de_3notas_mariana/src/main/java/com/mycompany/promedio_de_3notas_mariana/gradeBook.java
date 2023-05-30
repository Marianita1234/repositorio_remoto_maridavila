/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.promedio_de_3notas_mariana;

/**
 *
 * @author Mariana
 */
public class gradeBook {
  private String nombreCurso;
	
	
	
	
	
	
	/**
	 * @return the nombreCurso
	 */
	public String getNombreCurso() {
		return nombreCurso;
	}






	/**
	 * @param nombreCurso the nombreCurso to set
	 */
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}






	public void displayMessage() {
		System.out.println("Bienvenido al sistema de Notas: " + getNombreCurso());
	}  
}
