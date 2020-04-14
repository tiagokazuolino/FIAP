package variaveis;

public class PilhaChar{
	int N;
	int topo;
	char[] pilha;
	public PilhaChar(int N) {
		this.N = N;
	}
	public void init() {
		this.topo = 0;
		this.pilha = new char[this.N];		
	}
	public boolean isFull() {
		if(this.topo == N) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(this.topo == 0) {
			return true;
		} else {
			return false;
		}
	}
	public void push(char valor) {
		if(!isFull()) {
			this.pilha[this.topo] = valor;
			this.topo++;
		}
	}
	public char pop() {
		if(!isEmpty()) {
			this.topo--;
			return this.pilha[this.topo];
		} else {
			return Character.MIN_VALUE;
		}
	}
	public char top() {
		if(!isEmpty()) {
			return this.pilha[this.topo - 1];
		} else {
			return Character.MIN_VALUE;
		}
	}

}
