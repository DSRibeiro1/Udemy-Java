package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Informe o primeiro sal�rio: ");
		String valor1 = console.next().replace(",", ".");
		
		System.out.println("\nInforme o segundo sal�rio: ");
		String valor2 = console.next().replace(",", ".");
		
		System.out.println("\nInforme o terceiro sal�rio: ");
		String valor3 = console.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		System.out.println("M�dia dos sal�rios �: R$"
				+(salario1+salario2+salario3)/3);
						
		console.close();
	}
}
