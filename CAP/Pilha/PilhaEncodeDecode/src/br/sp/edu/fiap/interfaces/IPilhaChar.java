package br.sp.edu.fiap.interfaces;

public interface IPilhaChar extends IPilha {
	void push(char valor);

	char pop();

	char top();
}
