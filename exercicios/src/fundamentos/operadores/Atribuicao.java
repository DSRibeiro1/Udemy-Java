package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		//c = c + b;
		c+=b;
		
		//c = c + b;
		c -=b;
		
		// c = c * b;
		c*=b;
		
		// c = c /a;
		c/= a;
		
		// c = c % 2 (0,1)
		c %=2;
		System.out.println(c);
	}
}
