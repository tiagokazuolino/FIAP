package br.sp.edu.fiap.interfaces;

public interface IPilhaInt extends ICAP {
	void push(int value);

	int pop();

	int top();
}
