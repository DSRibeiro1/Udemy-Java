package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
		
		UnaryOperator<Double> impostoMunicipal = null;
		UnaryOperator<Double> frete = null;
		UnaryOperator<Double> arredondar = null;
		Function<Double, String> formatar = null;
		
		Produto p = new Produto ("ipad",1232.12,0.15);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("Preco final � R$ "+preco);
		
		

	}

}
