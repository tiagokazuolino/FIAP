package br.sp.edu.fiap.main;

import br.sp.edu.fiap.interfaces.ISalvaSenha;
import br.sp.edu.fiap.interfaces.ISegredo;

public class Segredo implements ISegredo {
	static char[] original = new char[] { 'a', 's', 'r', 'e', 'i', 'o', 'u' };
	static char[] troca = new char[] { '@', '$', '*', '&', '!', '(', '+' };

	@Override
	public String encode(String valor) {
		ISalvaSenha salva = new SalvaSenha();
		String transform = valor.replaceAll("[#]", "\n#\n");
		transform = transform.replaceAll("[_]", "\n_\n");
		String[] palavras = transform.split("[\\n]");
		String resultado = "";

		for (int i = 0; i < palavras.length; i++) {
			if (palavras[i] != "\n") {
				resultado += salva.inverter(palavras[i]);
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

	@Override
	public String decode(String valor) {
		ISalvaSenha salva = new SalvaSenha();
		String transform = valor.replaceAll("[#]", "\n#\n");
		transform = transform.replaceAll("[_]", "\n_\n");
		String[] palavras = transform.split("[\\n]");
		String resultado = "";

		for (int i = 0; i < palavras.length; i++) {
			if (palavras[i] != "\n") {
				resultado += salva.inverter(palavras[i]);
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
}
