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
//			//Se a posi��o no vetor for null ele adiciona o elemento
//			if (this.elementos[i] == null) {    //<<<< Se for null ele passa para a outra linha e adiciona
//				this.elementos[i] = elemento;   //<<<< Adicionando elemento
//				break;
//			}
//		}
//	}

	// Maneira Eficaz para adicionar mais um elemento na ultima posi��o tratando
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

	// Metodo para adicionar um valor numa posi��o especifica

	// Sobrecarregar um metodo para modificar sua assinatura
	public boolean adiciona(int posicao, String elementos) {
		// M�todo para verificar se essa posi��o � valida
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}
		this.aumentaCapacidade();

		// mover todos os elementos
		for (int i = this.tamanho; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		// Atribuir o elemento para a posi��o
		this.elementos[posicao] = elementos;
		this.tamanho++;

		return true;
	}

	// M�todo para adicionar capacidade ao vetor
	// Esse c�digo s� sera ultilizado apenas qunado atingir a capacidade

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}

			this.elementos = elementosNovos;
		}
	}

	// M�todo de busca elemento com uma exception caso o vetor n�o tenha a posi��o

	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}
		return this.elementos[posicao];
	}

	// M�todo para verificar se o Elemento Existe
	// >> Busca Sequencial, buscando de posi��o em posi��o para ver se esse � o
	// elemento.

	public int busca(String elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		// Posi��o que n�o existe
		return -1;
	}
	// B G D E F > posi��o a ser removida � 1 (G)
	// 0 1 2 3 4 > tamanho � 5
	// vetor [1] = vetor[2]
	// vetor [2] = vetor[3]
	// veotr [3] = vetor[4]
	// M�todo remove elemento
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}
		
		for (int i = posicao; i <this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}

	// M�todo para exibir o tamanho do array
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		// M�todo para exibir apenas os elementos preenchidos no vetor

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
