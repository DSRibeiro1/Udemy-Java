package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		double total = 0;
		int quantidadeNotas = 0;

		while (nota != -1) {
			System.out.println("Digite nota (ou - 1 p/ sair ): ");
			nota = entrada.nextDouble();

			if (nota >= 0 && nota <= 10) {
				total += nota;
				quantidadeNotas++;
			} else if (nota != -1) {
				System.out.println("Nota inválida");
			}

		}

		double media = total / quantidadeNotas;
		System.out.println("Media: " + media);

		entrada.close();

	}

}
