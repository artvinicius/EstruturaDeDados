package com.arthur.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

//	//Como adicionar um elemento no final de um vetor
//	public void adiciona(String elemento) {
//		
//		for (int i=0; i<this.elementos.length; i++) { //<<< Percorre o vetor e sempre que inicia passa uma casa no vetor
//			//Se a posição no vetor for null ele adiciona o elemento
//			if (this.elementos[i] == null) {    //<<<< Se for null ele passa para a outra linha e adiciona
//				this.elementos[i] = elemento;   //<<<< Adicionando elemento
//				break;
//			}
//		}
//	}

	// Maneira Eficaz para adicionar mais um elemento na ultima posição tratando
	// erro
	public boolean adiciona(String elementos) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elementos;
			this.tamanho++;
			return true;
		}
		return false;
	}

	// Metodo para adicionar um valor numa posição especifica

	// Sobrecarregar um metodo para modificar sua assinatura
	public boolean adiciona(int posicao, String elementos) {
		// Método para verificar se essa posição é valida
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		this.aumentaCapacidade();

		// mover todos os elementos
		for (int i = this.tamanho; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		// Atribuir o elemento para a posição
		this.elementos[posicao] = elementos;
		this.tamanho++;

		return true;
	}

	// Método para adicionar capacidade ao vetor
	// Esse código só sera ultilizado apenas qunado atingir a capacidade

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}

			this.elementos = elementosNovos;
		}
	}

	// Método de busca elemento com uma exception caso o vetor não tenha a posição

	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		return this.elementos[posicao];
	}

	// Método para verificar se o Elemento Existe
	// >> Busca Sequencial, buscando de posição em posição para ver se esse é o
	// elemento.

	public int busca(String elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		// Posição que não existe
		return -1;
	}
	// B G D E F > posição a ser removida é 1 (G)
	// 0 1 2 3 4 > tamanho é 5
	// vetor [1] = vetor[2]
	// vetor [2] = vetor[3]
	// veotr [3] = vetor[4]
	// Método remove elemento
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		for (int i = posicao; i <this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}

	// Método para exibir o tamanho do array
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		// Método para exibir apenas os elementos preenchidos no vetor

		StringBuilder s = new StringBuilder();
		s.append("[ ");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");

		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

}
