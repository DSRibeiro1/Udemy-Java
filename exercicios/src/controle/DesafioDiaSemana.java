package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite dia da semana: ");
		String semana = entrada.next();

		if (semana.equalsIgnoreCase("Domingo"))
			System.out.println(1);
		else if (semana.equalsIgnoreCase("Segunda"))
			System.out.println(2);
		else if ("Terca".equalsIgnoreCase(semana) || semana.equalsIgnoreCase("Terça"))
			System.out.println(3);
		else if (semana.equalsIgnoreCase("Quarta"))
			System.out.println(4);
		else if (semana.equalsIgnoreCase("Quinta"))
			System.out.println(5);
		else if (semana.equalsIgnoreCase("Sexta"))
			System.out.println(6);
		else if ("sabado".equalsIgnoreCase(semana) || semana.equalsIgnoreCase("Sábado"))
			System.out.println(7);
		else
			System.out.println("Inválido");

		entrada.close();

	}
}
