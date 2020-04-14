package br.sp.edu.fiap.main;

import javax.swing.JOptionPane;

import br.sp.edu.fiap.interfaces.IPilhaInt;
import br.sp.edu.fiap.variables.PilhaInt;

public class Principal {

	public static void main(String[] args) {
		int opcao;
		IPilhaInt pilha = new PilhaInt();
		pilha.init();
		JOptionPane.showMessageDialog(null, "Fila iniciada para 10 posicoes");
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"\nMenu:\n\n" + "Digite 1 para POP\n\n" + "Digite 2 para PUSH\n\n"
							+ "Digite 3 para TOP\n\n" + "Digite 0 para sair\n\n"));
			switch (opcao) {
				case 1 :
					if (!pilha.isEmpty()) {
						JOptionPane.showMessageDialog(null,
								"Foi [" + pilha.pop() + "] removido com sucesso!");
					} else {
						JOptionPane.showMessageDialog(null, "Pilha esta vazia.");
					}
					break;
				case 2 :
					if (!pilha.isFull()) {
						pilha.push(Integer.parseInt(JOptionPane
								.showInputDialog("Digite numeros inteiros positivos: ")));
					} else {
						JOptionPane.showMessageDialog(null, "Pilha esta cheia.");
					}
					break;
				case 3 :
					if (pilha.top() != Integer.MIN_VALUE) {
						JOptionPane.showMessageDialog(null,
								"Seu numero no topo é: " + pilha.top());
					} else {
						JOptionPane.showMessageDialog(null, "Pilha esta vazia.");
					}
					break;
				default :
					JOptionPane.showMessageDialog(null,
							"Opcao invalida programa sera encerrado.");
					opcao = 0;
					break;
			}
		} while (opcao != 0);
	}

}
