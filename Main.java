package aiai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		int[] codigo = new int[2];
		String[] nome = new String[2];
		double[] preco = new double[2];

		for (int i = 0; i < codigo.length; i++) {
			System.out.println("Digite o codigo " + i);
			codigo[i] = e.nextInt();

			System.out.println("Digite o nome " + i);
			nome[i] = e.next();

			System.out.println("Digite o preço " + i);
			preco[i] = e.nextDouble();

		}

		for (int i = 0; i < codigo.length; i++) {
			System.out.println("Relatorio codigo " + codigo[i] + " // " + " nome " + " = " + nome[i] + " // " + " preco "
					+ preco[i]);
		}
		System.out.println("===============================================");

		for (int i = 0; i < codigo.length; i++) {
			if (codigo[i] % 2 == 0 && preco[i] > 1000) {
				System.out.println("Os produtos que sofrerão aumento são porque maior que 1000 e é par " + (preco[i] + (preco[i] * 0.18)));
			} else {
				System.out.println("não recebera aumento ");
			}

		}
		System.out.println("===============================================");

		for (int i = 0; i < codigo.length; i++) {
			if (codigo[i] % 2 == 0) {
				System.out.println("É par e vai receber aumento " + (preco[i] + (preco[i] * 0.12)));
			} else {
				System.out.println("Não recebe aumento pobre ");
			}
		}
		System.out.println("===============================================");

		for (int i = 0; i < codigo.length; i++) {
			if (preco[i] > 1000) {
				System.out.println("Vai receber um aumento porque é maior que 1000  " + (preco[i] + (preco[i] * 0.15)));
			} else {
				System.out.println("Não vai receber aumento ");
			}

		}
	}

}
