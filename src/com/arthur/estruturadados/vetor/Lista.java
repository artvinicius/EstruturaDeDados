package com.arthur.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

	// Configurando tipo dinamicamente

	private T[] elementos;
	private int tamanho;

	// Mais Elegante quando for inst�nciar um Classe
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	// Tambem funciona porem � um c�digo mais complexo de ser compreendido
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	public boolean adiciona(T elementos) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elementos;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public boolean adiciona(int posicao, T elementos) {
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
			T[] elementosNovos = (T[]) new String[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}

			this.elementos = elementosNovos;
		}
	}

	// M�todo de busca elemento com uma exception caso o vetor n�o tenha a posi��o

	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}
		return this.elementos[posicao];
	}

	// >> Busca Sequencial, buscando de posi��o em posi��o para ver se esse � o
	// elemento.

	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		// Posi��o que n�o existe
		return -1;
	}

	public int ultimoIndice(T elemento) {

		// Para n�o ficar t�o custoso a memoria, vai come�ar do ultimo at� o elemento desejado
		for (int i = this.tamanho - 1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;
	}

	public boolean contem(T elemento) {
		// Maneira mais composta
		/*
		 * int pos = busca(elemento); if (pos > -1) { return true; } return false;
		 */

		// Maneira simplificada
		return busca(elemento) > -1;
	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
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