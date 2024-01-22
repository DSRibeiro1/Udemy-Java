package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto("Notebook", 1), 1000);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Lapis", 2, 100);
		compra2.adicionarItem(new Produto("Impressora", 2), 1500);

		Cliente cliente = new Cliente("joao");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2); 

		System.out.println(cliente.obterValorTotal());

	}

}
