package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		// Posição da letra no indice 1 (Inicia a contagem do zero)
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";

		// Tudo maiuscula
		System.out.println(s.toUpperCase());
		//////////////////////////////////////
		System.out.println(s.concat("!!!"));
		System.out.println(s + " !!!");

		// String se inicia com
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));

		System.out.println(s.toLowerCase().startsWith("boa"));

		// String se termina com
		System.out.println(s.endsWith("tarde"));

		// Quantidade de caractere de uma String
		System.out.println(s.length());

		// Comparação igualdade
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;

		String maisUmaFrase = ("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade
				+ "\nSalario: R$ "+ salario + "\n");
		System.out.println(maisUmaFrase);

		
		// %s = String / %d = valores inteiros / %f = float
		System.out.printf("O senhor %s %s tem %d e ganha R$ %.2f reais."
							,nome, sobrenome, idade, salario);
		
		String frase = String.format("\n\nO senhor %s %s tem %d e ganha R$ %.2f reais."
				,nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		//"Frase qualquer" contém "qualquer"?
		System.out.println("Frase qualquer".contains("qualquer"));
		
		//Posição de "frase qualquer"
		System.out.println("Frase qualquer".indexOf("qualquer"));
		
		//Vai mostrar String na posição 6
		System.out.println("Frase qualquer".substring(6));
		
		////Vai mostrar String da posição 6 até 9. 
		System.out.println("Frase qualquer".substring(6,10));
	}
}
