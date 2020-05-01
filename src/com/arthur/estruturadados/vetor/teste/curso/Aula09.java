package com.arthur.estruturadados.vetor.teste.curso;

import com.arthur.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
	
		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);

		//Removendo o elemento da posição 1 
		vetor.remove(1);
		System.out.println(vetor);
		
		//Resultado
		//[ B, C, E, F, G]
		//[ B, E, F, G]
		
		
		
		
		//Remover Elemento sem saber a posição que ele está 
		//Esse método Busca está criado na classe Vetor onde ele retorna um elemento caso ele n exista retora posição -1
		System.out.println("Remover elemento E");
		
		int pos = vetor.busca("E");
		if(pos >= -1) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não Existe no Vetor");
		}
		
		System.out.println(vetor);

		
		//Resultado 
		//[ B, C, E, F, G]
	    //[ B, E, F, G]
	    //Remover elemento E
	    //[ B, F, G]
	
	}

}
