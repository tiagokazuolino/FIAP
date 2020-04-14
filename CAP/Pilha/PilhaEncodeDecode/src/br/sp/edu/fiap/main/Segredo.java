package br.sp.edu.fiap.main;

import br.sp.edu.fiap.interfaces.IPilhaChar;
import br.sp.edu.fiap.interfaces.ISegredo;
import br.sp.edu.fiap.variables.PilhaChar;

public class Segredo implements ISegredo {
	static char[] original = new char[] { 'a', 's', 'r', 'e', 'i', 'o', 'u' };
	static char[] troca = new char[] { '@', '$', '*', '&', '!', '(', '+' };
	public String encode(String valor) {
		String transform = valor.replaceAll("[#]", "\n#\n");
		transform = transform.replaceAll("[_]", "\n_\n");
		String[] palavras = transform.split("[\\n]");
		String resultado = "";
		for (int i = 0; i < palavras.length; i++) {
			if (palavras[i] != "\n") {
				resultado += inverter(palavras[i]);
			}
		}		
		char[] frase = resultado.toCharArray();		
		for (int i = 0; i < frase.length; i++) {
			for (int j = 0; j < original.length; j++) {
				if (frase[i] == original[j]) {
					frase[i] = troca[j];
				}
			}
		}		
		return new String(frase);
	}
	public String decode(String valor) {
		String transform = valor.replaceAll("[#]", "\n#\n");
		transform = transform.replaceAll("[_]", "\n_\n");
		String[] palavras = transform.split("[\\n]");
		String resultado = "";
		for (int i = 0; i < palavras.length; i++) {
			if (palavras[i] != "\n") {
				resultado += inverter(palavras[i]);
			}
		}
		char[] frase = resultado.toCharArray();
		for (int i = 0; i < frase.length; i++) {
			for (int j = 0; j < troca.length; j++) {
				if (frase[i] == troca[j]) {
					frase[i] = original[j];
				}
			}
		}
		return new String(frase);
	}
	public String inverter(String palavra) {
		char[] p = palavra.toCharArray();
		IPilhaChar pilha = new PilhaChar(p.length);
		pilha.init();
		for (int i = 0; i < p.length; i++) {
			if (!pilha.isFull()) {
				pilha.push(p[i]);
			}
		}
		for (int i = 0; i < p.length; i++) {
			if (!pilha.isEmpty()) {
				p[i] = pilha.pop();
			}
		}
		return new String(p);
	}
}
