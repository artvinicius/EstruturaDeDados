package com.arthur.estruturadados.vetor.teste.curso;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList();

		arrayList.add("A");
		arrayList.add("C");

		System.out.println(arrayList);

		arrayList.add(1, "B");

		System.out.println(arrayList);

		boolean existe = arrayList.contains("A");

		if (existe) {
			System.out.println("Elemento existe no Array");
		} else {
			System.out.println("Elemento não existe no Array");
			//Resultado
			//[A, C]
			//[A, B, C]
			//Elemento existe no Array
			
		}
		//Método para exibir mais a posição
		int pos = arrayList.indexOf("B");
		if (pos > -1) {
			System.out.println("Elemento existe " + pos);
		} else {
			System.out.println("Elemento não existe");
		}
		
		//Busca por posição
		System.out.println(arrayList.get(2));
		
		//Método para remove 
		arrayList.remove(0);
		arrayList.remove("B");
		System.out.println(arrayList);

		//Tamanho
		System.out.println(arrayList.size());
		
	}

}
