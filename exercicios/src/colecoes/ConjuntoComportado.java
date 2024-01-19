package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		// Set<String> listaAprovado = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Joao");
		listaAprovados.add("Maria");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(12);
		nums.add(100);
		nums.add(1444);

		for (int n : nums) {
			System.out.println(n);

		}
	}

}
