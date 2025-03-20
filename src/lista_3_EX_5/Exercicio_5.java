package lista_3_EX_5;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		int numerosInteiros = 1, somaNumerosInteiros = 0;
		
		Scanner lerScanner = new Scanner(System.in);
		
		do {
			System.out.println("Digite o valor desejado para armazenamento no sistema: ");
			System.out.println("Digite 0 caso deseje sair.");
			
			numerosInteiros = lerScanner.nextInt();
			
			if (numerosInteiros >= 0) {
				somaNumerosInteiros = somaNumerosInteiros + numerosInteiros;
			}
		}
		
		while(numerosInteiros != 0);
		System.out.println("A soma de todos os valores positivos digitados é: "+ somaNumerosInteiros);
	}

}
