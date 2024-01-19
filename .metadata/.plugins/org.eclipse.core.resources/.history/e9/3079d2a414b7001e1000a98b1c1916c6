package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Maria");
		lista.add(u1);
		
		lista.add(new Usuario("Joao"));
		lista.add(new Usuario("Paulo"));
		lista.add(new Usuario("Silvio"));
		lista.add(new Usuario("Mauro"));
		
		System.out.println(lista.get(3)); //acesso pelo indice
		
		System.out.println(lista.remove(1));
		System.out.println(lista.remove(new Usuario("Silvio")));
		
		System.out.println("Tem? "+lista.contains(new Usuario("Mauro")));
		System.out.println("Tem? "+lista.contains(u1));
		
		for (Usuario u: lista) {
			System.out.println(u.nome);
			
		}

	}

}
