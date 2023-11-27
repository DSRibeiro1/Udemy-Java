package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %n %n",
				1,2,3,4);
		
		System.out.printf("Salário: R$%.2f%n",2000.34543);
		System.out.printf("Nome: %s%n","João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("\nDigite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("\nDigite o sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome,sobrenome,idade);
		
		//Encerra o Scanner
		entrada.close();

	}

}
