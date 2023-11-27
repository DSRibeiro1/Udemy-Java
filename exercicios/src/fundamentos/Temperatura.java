package fundamentos;

//Duplicar linha: ctrl alt para cima ou para baixo
//Mover linha: alt para cima ou para baixo

public class Temperatura {
	public static void main(String[] args) {
		// (°F-32) X 5/9 = °C

		final int DIF = 32; 
		final double FATOR = 5.0/9.0;
		double fahreheit = 86;
		double celsius = (fahreheit - DIF)*FATOR;
		System.out.println("O resultado é: "+celsius+"C°");
		
		fahreheit = 0;
		celsius = (fahreheit - DIF)*FATOR;
		System.out.println("O resultado é: "+celsius+"C°");
		
	}
} 

	