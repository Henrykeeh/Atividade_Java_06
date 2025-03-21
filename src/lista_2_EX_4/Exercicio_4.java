package lista_2_EX_4;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		int participantes = 0, idade = 0;
		int identidadeGenero, mulherCis = 0, homemCis = 0, naoBinario = 0, mulherTrans = 0, homemTrans = 0, outros = 0;
		int pessoaDesenvolvedora, backend = 0, frontend = 0, mobile = 0, fullstack = 0;
		boolean continuar = true;
		float mediaIdades, somaIdades = 0;
		int mulheresFrontend = 0, homensMobileMaiores40 = 0, naoBinariosFullstackMenores30 = 0;

		while (continuar) {
			System.out.println("Preencha com os dados do colaborador: ");

			System.out.println("Idade: ");
			idade = lerScanner.nextInt();
			somaIdades = somaIdades + idade;

			System.out.println("Digite o número que represente a identidade de gênero correspondente: ");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			identidadeGenero = lerScanner.nextInt();

			System.out.println("Digite o número que represente a função de pessoa desenvolvedora correspondente: ");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - Fullstack");
			pessoaDesenvolvedora = lerScanner.nextInt();

			participantes = participantes + 1;

			if (identidadeGenero == 1 && pessoaDesenvolvedora == 2) {
				mulheresFrontend = mulheresFrontend + 1;
			}

			if (identidadeGenero == 4 && pessoaDesenvolvedora == 2) {
				mulheresFrontend = mulheresFrontend + 1;
			}

			if (idade > 40 && identidadeGenero == 2 || identidadeGenero == 5 && pessoaDesenvolvedora == 3) {
				homensMobileMaiores40 = homensMobileMaiores40 + 1;
			}

			if (idade < 30 && identidadeGenero == 3 && pessoaDesenvolvedora == 4) {
				naoBinariosFullstackMenores30 = naoBinariosFullstackMenores30 + 1;
			}
			switch (identidadeGenero) {
			case 1:
				mulherCis = mulherCis + 1;

			case 2:
				homemCis = homemCis + 1;

			case 3:
				naoBinario = naoBinario + 1;

			case 4:
				mulherTrans = mulherTrans + 1;

			case 5:
				homemTrans = homemTrans + 1;

			case 6:
				outros = outros + 1;
				
			default:
				System.out.println("Valor referente a Identidade de Gênero inválido!");
			}
			switch (pessoaDesenvolvedora) {
			case 1:
				backend = backend + 1;

			case 2:
				frontend = frontend + 1;

			case 3:
				mobile = mobile + 1;

			case 4:
				fullstack = fullstack + 1;
				
			default:
				System.out.println("Valor referente a função inválido!");
			}
			System.out.println("Deseja continuar com a leitura de dados de mais um colaborador? (S/N)");
			continuar = lerScanner.next().equalsIgnoreCase("s");
		}
		mediaIdades = somaIdades / participantes;
		System.out.println("De acordo com o cadastro realizado: ");
		System.out.println("A quantidade de pessoas desenvolvedoras Backend é: " + backend);
		System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend é: " + mulheresFrontend);
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile e maiores de 40 anos é: "
				+ homensMobileMaiores40);
		System.out.println("O número de Não Binários desenvolvedores Fullstack e menores de 30 anos é: "
				+ naoBinariosFullstackMenores30);
		System.out.println("O número total de participantes desta pesquisa foi: " + participantes);
		System.out.printf("A idade média dos participantes da pesquisa é: %.2f", mediaIdades);
	}

}
