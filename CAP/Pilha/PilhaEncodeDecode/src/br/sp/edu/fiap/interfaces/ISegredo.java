package br.sp.edu.fiap.interfaces;

public interface ISegredo {
	String encode(String valor);

	String decode(String valor);
	
	String stackUp(String valor, int inicio, int fim);
	
	String unstack(String valor, int inicio, int fim);
}
