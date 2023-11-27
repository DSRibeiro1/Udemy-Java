package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia, X";
		//Substitui
		s = s.replace("X", "Senhora");
		
		//Maiuscula
		s = s.toUpperCase();
		
		//Concatena
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String x = "Leo";
		System.out.println(x.toUpperCase());
		
		String y = "Bom dia, X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem operador Ponto "."
		int a = 3;
		System.out.println(a);
	}
}
