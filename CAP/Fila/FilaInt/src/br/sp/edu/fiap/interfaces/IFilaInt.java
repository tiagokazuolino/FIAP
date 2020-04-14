package br.sp.edu.fiap.interfaces;

public interface IFilaInt extends ICAP {
	void enqueue(int value);

	int dequeue();

	int first();
}
