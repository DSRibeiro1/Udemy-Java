package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		
		//Com Final eu transformo variavel em constante.
		// Por conven��o toda constante deve ser escrita em maiuscula
		final double PI = 3.14159;
		
		double area = PI*raio*raio;
				
		System.out.println(PI*raio*raio);
		System.out.println(area);
		
		raio = 10;
		area = PI*raio*raio;
		System.out.println("�rea: "+area+"m�");
	}
}


