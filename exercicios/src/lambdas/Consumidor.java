package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");

		Produto p1 = new Produto("Caneta", 12.5, 0.09);
		imprimirNome.accept(p1);

		Produto p2 = new Produto("Notebook", 1232.5, 0.09);
		Produto p3 = new Produto("Lapis", 10.5, 0.09);
		Produto p4 = new Produto("Borracha", 21.5, 0.09);
		Produto p5 = new Produto("Papel", 2.5, 0.09);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);

	}

}
