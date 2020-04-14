package main;

import java.util.Scanner;

public class SalvaSenha {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int opcao;
		String encode = "\n";
		String decode = "\n";
		do {
			opcao = Menu(new Scanner(System.in));
			switch (opcao) {
			case 1:
				if (encode == "\n") {
					encode = PedirSenha(new Scanner(System.in));
					encode = new Segredo().embaralhar(encode);
					System.out.println("Sua senha esta encryptada: " + encode);
				} else {
					System.out.println("Voce não digitou uma senha ainda.");
				}
				break;
			case 2:
				if (decode == "\n" && encode != "\n") {
					decode = new Segredo().desembaralhar(encode);
					System.out.println("Sua senha descryptada: " + decode);
					encode = "\n";
				} else {
					System.out.println("Voce não digitou uma senha ainda.");
				}
				break;
			case 0:
				System.out.println("Encerrando o programa!(Codigo de Alta Performance)");
				opcao = 0;
				break;
			default:
				System.out.println("Opcao invalida programa sera encerrado.");
				opcao = 0;
				break;
			}
		} while (opcao != 0);
		tc.close();
	}
	public static int Menu(Scanner tc) {
		System.out.println("Menu:");
		System.out.println("Digite 1 para Encryptar Senha");
		System.out.println("Digite 2 para Decryptar Senha");
		System.out.println("Digite 0 para sair");
		return tc.nextInt();		
	}
	public static String PedirSenha(Scanner tc) {
		System.out.println("Digite uma senha:");
		return tc.next();
	}
}
