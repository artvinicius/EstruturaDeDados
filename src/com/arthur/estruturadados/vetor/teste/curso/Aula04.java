package com.arthur.estruturadados.vetor.teste.curso;

import com.arthur.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");

		
		// Exibir o tamanho do array
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.toString());
		
	}
	
	
	

}
