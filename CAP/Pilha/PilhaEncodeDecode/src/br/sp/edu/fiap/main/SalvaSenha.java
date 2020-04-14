package br.sp.edu.fiap.main;

import br.sp.edu.fiap.interfaces.IPilhaChar;
import br.sp.edu.fiap.interfaces.ISalvaSenha;
import br.sp.edu.fiap.variables.PilhaChar;

public class SalvaSenha implements ISalvaSenha{

	@Override
	public String inverter(String palavra) {
		char[] p = palavra.toCharArray();
		IPilhaChar pilha = new PilhaChar(p.length);
		pilha.init();
		
		for (int i = 0; i < p.length; i++) {
			if(!pilha.isFull()) {
				pilha.push(p[i]);
			}
		}
		for (int i = 0; i < p.length; i++) {
			if(!pilha.isEmpty()) {
				p[i] = pilha.pop();
			}
		}
		return new String(p);
	}

}
