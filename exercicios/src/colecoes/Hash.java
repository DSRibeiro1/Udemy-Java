package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("joao"));
		usuarios.add(new Usuario("maria"));
		usuarios.add(new Usuario("jose"));
		
		boolean resultado = usuarios.contains(new Usuario("joao"));
		System.out.println(resultado);

	}

}
