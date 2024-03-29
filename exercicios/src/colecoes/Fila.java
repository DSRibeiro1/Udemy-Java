package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		// Offer e add adicionam elementos na fila
		// A diferen�a � comportamento de quando a fila est� cheia

		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lan�a uma exce��o
		fila.add("Joao");
		fila.offer("Maria");
		fila.add("Joana");
		fila.offer("Sara");

		// Peek e element -> obter o proximo elemento da fila (sem remover)
		// A diferen�a � comportamento de quando a fila est� vazia

		fila.peek();
		fila.peek(); // retorna false
		fila.element();
		fila.element(); // lan�a uma exce��o

		// Poll e remove -> obtem o proximo elemento da fila e remove
		// A diferen�a � comportamento de quando a fila est� vazia

		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains();

	}

}
