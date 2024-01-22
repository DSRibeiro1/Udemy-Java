package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> items = new ArrayList<>();

	void adicionarItem(Produto p, int qtde) {
		this.items.add(new Item(p, qtde));

	}

	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto (nome, preco);
		this.items.add(new Item (produto, qtde)); 

	}

	double obterValorTotal() {
		double total = 0;

		for (Item item : items) {
			total += item.quantidade * item.produto.preco;

		}
		return total;
	}
}
