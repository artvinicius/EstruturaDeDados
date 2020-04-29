package com.arthur.estruturadados.vetor.teste.curso;

import com.arthur.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");

		//Passando o nome do elemento para ele informa qual a posição no vetor
		System.out.println(vetor.busca("elemento 1"));
		System.out.println(vetor.busca("elemento 4"));
		
	}

}
