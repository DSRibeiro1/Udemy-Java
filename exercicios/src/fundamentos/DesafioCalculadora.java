package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		double num1;
		double num2;
		
		Scanner console = new Scanner(System.in);
		System.out.println("Digite número: ");
		num1 = console.nextDouble();
		System.out.println("Digite número: ");
		num2 = console.nextDouble();
		
		System.out.println("Digite a operação: ");
		String op = console.next();
		
		double resultado = "+".equals(op) ? num1+num2 :0;
		resultado = "-".equals(op) ? num1-num2 :resultado;
		resultado = "*".equals(op) ? num1*num2 :resultado;
		resultado = "/".equals(op) ? num1/num2 :resultado;
		resultado = "%".equals(op) ? num1%num2 :resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, op, num2, resultado);
		
		console.close();
	}
	
}			
		
		
	


