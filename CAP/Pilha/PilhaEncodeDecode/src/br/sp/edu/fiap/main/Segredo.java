package br.sp.edu.fiap.main;

import br.sp.edu.fiap.interfaces.ISegredo;

public class Segredo implements ISegredo{
	static char[] original = new char[] {'a','s','r','e','i','o','u'};
	static char[] troca = new char[] {'@','$','*','&','!','(','+'};
	@Override
	public String encode(String valor) {
		char[] palavra = valor.toCharArray();
		for (int i = 0; i < palavra.length; i++) {
			for(int j = 0; j < original.length; j++) {
				if(palavra[i] == original[j]) {
					palavra[i] = troca[j];
				}
			}
		}
		return new String(palavra);
	}

	@Override
	public String decode(String valor) {
		char[] palavra = valor.toCharArray();
		for (int i = 0; i < palavra.length; i++) {
			for(int j = 0; j < troca.length; j++) {
				if(palavra[i] == troca[j]) {
					palavra[i] = original[j];
				}
			}
		}
		return new String(palavra);
	}

	@Override
	public String stackUp(String valor, int inicio, int fim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unstack(String valor, int inicio, int fim) {
		// TODO Auto-generated method stub
		return null;
	}

}
