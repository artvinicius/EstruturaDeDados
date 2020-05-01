package com.arthur.estruturadados.vetor.teste.curso;

import com.arthur.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {

		Lista<String> vetor = new Lista<String>(1);

		vetor.adiciona("Elemento");

		System.out.println(vetor);

		// Para Adcionar outro tipo Ex: Contato

		Lista<Contato> vetor1 = new Lista<Contato>(1);

		Contato c1 = new Contato("Contato 1", "81 9999 9999", "Contato1@gmail.com");

		vetor1.adiciona(c1);

		System.out.println(vetor1);

	}

}
