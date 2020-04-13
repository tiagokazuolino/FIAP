package br.sp.edu.fiap.variables;

import br.sp.edu.fiap.interfaces.IPilhaChar;

public class PilhaChar implements IPilhaChar{
	int N;
	int topo;
	char[] pilha;
	public PilhaChar(int N) {
		this.N = N;
	}

	@Override
	public void init() {
		this.topo = 0;
		this.pilha = new char[this.N];		
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
	public void push(char valor) {
		if(!isFull()) {
			this.pilha[this.topo] = valor;
			this.topo++;
		}
	}

	@Override
	public char pop() {
		if(!isEmpty()) {
			this.topo--;
			return this.pilha[this.topo];
		} else {
			return Character.MIN_VALUE;
		}
	}

	@Override
	public char top() {
		if(!isEmpty()) {
			return this.pilha[this.topo - 1];
		} else {
			return Character.MIN_VALUE;
		}
	}

}
