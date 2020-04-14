package br.sp.edu.fiap.interfaces;

public interface ISegredo {
	String encode(String valor);

	String decode(String valor);
	
	String inverter(String palavra);
}
