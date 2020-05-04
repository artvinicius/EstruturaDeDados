package com.arthur.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.arthur.estruturadados.vetor.Lista;

public class Exer002 {

	public static void main(String[] args) {

		//Com array list
		
		ArrayList<String> arraylist = new ArrayList<String>(5);
		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("C");
		
		//lastIndexOf > exibir a posição do elemento no Array
		System.out.println(arraylist.lastIndexOf("C"));
		
		
		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
	
	
	System.out.println(lista.ultimoIndice("C"));
	
	}

}
