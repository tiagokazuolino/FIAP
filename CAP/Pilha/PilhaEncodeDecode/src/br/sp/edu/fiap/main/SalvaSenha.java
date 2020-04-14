package br.sp.edu.fiap.main;

import javax.swing.JOptionPane;

public class SalvaSenha {
	public static void main(String[] args) {
		int opcao;
		String encode = "\n";
		String decode = "\n";
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("\nMenu:\n\n" + "Digite 1 para Encryptar Senha\n\n"
					+ "Digite 2 para Decryptar Senha\n\n" + "Digite 0 para sair\n\n"));
			switch (opcao) {
			case 1:
				if (encode == "\n") {
					encode = JOptionPane.showInputDialog("Digite uma senha: ");
					encode = new Segredo().encode(encode);
					JOptionPane.showMessageDialog(null, "Sua senha esta encryptada: " + encode);
				} else {
					JOptionPane.showMessageDialog(null, "Voce não digitou uma senha ainda.");
				}
				break;
			case 2:
				if (decode == "\n" && encode != "\n") {
					decode = new Segredo().decode(encode);
					JOptionPane.showMessageDialog(null, "Sua senha descryptada: " + decode);
					encode = "\n";
				} else {
					JOptionPane.showMessageDialog(null, "Voce não digitou uma senha ainda.");
				}
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado por usa meu programa!(T.K.L)");
				opcao = 0;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida programa sera encerrado.");
				opcao = 0;
				break;
			}
		} while (opcao != 0);
	}
}
