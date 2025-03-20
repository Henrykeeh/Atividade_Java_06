package lista_1_EX_1;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		int primeiroValor, segundoValor;

		System.out.println("Digite o primeiro valor do intervalo: ");
		primeiroValor = lerScanner.nextInt();

		System.out.println("Digite o segundo valor do intervalo: ");
		segundoValor = lerScanner.nextInt();
		lerScanner.close();

		for (int contador = primeiroValor; contador < segundoValor; contador++) {
			if (contador % 3 == 0 && contador % 5 == 0) {
				System.out.println(contador + " é multiplo de 3 e 5.");
			}
		}

		if (primeiroValor > segundoValor) {
			System.out.println("O intervalo é inválido! " + primeiroValor + " é maior que " + segundoValor + "!");
		}

		else if (primeiroValor == segundoValor) {
			System.out.println("O intervalo é inválido! Valores iguais!");
		}
	}
}
