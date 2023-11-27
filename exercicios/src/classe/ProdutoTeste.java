package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto("notbook",234.21);
		// p1.nome = "notbook";
		// p1.preco = 234.21;
		//p1.desconto = 0.25;

		var p2 = new Produto();
		p2.nome = "caneta preta";
		p2.preco = 12;
		Produto.desconto = 0.50;

		System.out.println(p1.nome + " "+ p1.precoComDesconto());
		System.out.println(p2.nome + " " +p2.precoComDesconto());

		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p1.precoComDesconto(0.1);
		double mediaCarrinho = precoFinal1 + precoFinal2 / 2;

		System.out.printf("Média do carrinho: R$%.2f.", mediaCarrinho);

	}

}
