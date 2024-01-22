package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Joao";
		compra1.adicionarItem("Caneta", 20, 10);
		compra1.adicionarItem(new Item("Papel", 10, 10.21));
		compra1.adicionarItem(new Item("Tesoura", 30, 41.11));

		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());

		//S� para mostrar a rela��o bidirecional!!!
		double total = compra1.itens.get(0).compra.itens.get(1)
				.compra.obterValorTotal();
		
		System.out.println("Total: R$ "+total);
		

	}

}
