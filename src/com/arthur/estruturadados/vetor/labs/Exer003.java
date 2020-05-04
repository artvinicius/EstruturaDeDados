package com.arthur.estruturadados.vetor.labs;

import com.arthur.estruturadados.vetor.Lista;

public class Exer003 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		
		System.out.println(lista);
		
		lista.remove("A");
		
		System.out.println(lista);
		
		lista.remove("D");
		
		System.out.println(lista);
		
		lista.remove("C");
		
		System.out.println(lista);
	}

}
