package br.sp.edu.fiap.variables;

import br.sp.edu.fiap.interfaces.IPilhaInt;

public class PilhaInt implements IPilhaInt {
	static int N = 10;
	int[] pilha;
	int topo;

	@Override
	public void init() {
		this.pilha = new int[N];
		this.topo = 0;
	}

	@Override
	public boolean isFull() {
		if (topo == N) {
			System.out.println("Pilha cheia!");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isEmpty() {
		if (topo == 0) {
			System.out.println("Pilha vazia!");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void push(int value) {
		if (!isFull()) {
			pilha[topo] = value;
			topo++;
		}
	}

	@Override
	public int pop() {
		if (!isEmpty()) {
			topo--;
			return pilha[topo];
		} else {
			return -1;
		}
	}

	@Override
	public int top() {
		return !isEmpty() ? pilha[topo - 1] : Integer.MIN_VALUE;
	}

}
