package com.arthur.estruturadados.vetor.labs;

import com.arthur.estruturadados.vetor.Lista;

public class Exer001 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("E"));
	}

}
