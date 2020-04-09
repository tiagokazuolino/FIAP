package br.sp.edu.fiap.variables;

import br.sp.edu.fiap.interfaces.IPilhaInt;

public class PilhaInt implements IPilhaInt {
	static int N = 10;
	int[] pilha;
	int posicao;

	@Override
	public void init() {
		System.out.println("Pilha Iniciada");
		this.pilha = new int[N];
		this.posicao = 0;
	}

	@Override
	public boolean isFull() {
		if(posicao == N) {
			System.out.println("Pilha cheia!");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isEmpty() {
		if(posicao == 0) {
			System.out.println("Pilha vazia!");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void push(int value) {
		if(!isFull()) pilha[posicao] = value;
	}

	@Override
	public int pop() {
		return !isEmpty() ? pilha[posicao - 1] : -1;
	}

	@Override
	public int top() {
		return  !isEmpty() ? pilha[posicao] : -1;
	}

}
