package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na Terca (V ou F)
		// Trabalho na Quarta (V ou F)

		boolean trabQuarta = false;
		boolean trabQuinta = false;

		boolean comprouTV50 = trabQuarta && trabQuinta;
		boolean comprouTV32 = trabQuarta ^ trabQuinta;
		boolean comprouSorvete = trabQuarta || trabQuinta;
		boolean maisSaudavel = comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? "+!maisSaudavel);
	}
}
