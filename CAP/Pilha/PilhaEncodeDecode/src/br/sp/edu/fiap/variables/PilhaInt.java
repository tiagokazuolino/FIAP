package br.sp.edu.fiap.variables;

import br.sp.edu.fiap.interfaces.IPilhaInt;

public class PilhaInt implements IPilhaInt {
	int N;
	int topo;
	int[] pilha;
	public PilhaInt(int N) {
		this.N = N;
	}

	@Override
	public void init() {
		this.topo = 0;
		this.pilha = new int[this.N];		
	}

	@Override
	public boolean isFull() {
		if(this.topo == N) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isEmpty() {
		if(this.topo == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void push(int valor) {
		if(!isFull()) {
			this.pilha[this.topo] = valor;
			this.topo++;
		}
	}

	@Override
	public int pop() {
		if(!isEmpty()) {
			this.topo--;
			return this.pilha[this.topo];
		} else {
			return -1;
		}
	}

	@Override
	public int top() {
		if(!isEmpty()) {
			return this.pilha[this.topo - 1];
		} else {
			return -1;
		}
	}

}
