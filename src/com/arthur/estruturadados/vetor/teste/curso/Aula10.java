package com.arthur.estruturadados.vetor.teste.curso;

import com.arthur.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
	
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "81 9999 9999", "Contato1@gmail.com");
		Contato c2 = new Contato("Contato 2", "81 8888 8888", "Contato2@hotmai.com");
		Contato c3 = new Contato("Contato 3", "81 7777 7777,", "Contato3@yahoo.com");
		
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		//Verificando se o elemento existe no vetor
		int pos = vetor.busca(c1);
		if(pos > -1) {
			System.out.println("Elemento Existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
		
	}
	
	//Melhorar a classe para deixar ela mais generica 
	// Generalizar o tipo do vetor
}
