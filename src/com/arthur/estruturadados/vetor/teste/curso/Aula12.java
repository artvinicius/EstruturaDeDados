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
			System.out.println("Elemento n�o existe no Array");
			//Resultado
			//[A, C]
			//[A, B, C]
			//Elemento existe no Array
			
		}
		//M�todo para exibir mais a posi��o
		int pos = arrayList.indexOf("B");
		if (pos > -1) {
			System.out.println("Elemento existe " + pos);
		} else {
			System.out.println("Elemento n�o existe");
		}
		
		//Busca por posi��o
		System.out.println(arrayList.get(2));
		
		//M�todo para remove 
		arrayList.remove(0);
		arrayList.remove("B");
		System.out.println(arrayList);

		//Tamanho
		System.out.println(arrayList.size());
		
	}

}
