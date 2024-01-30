package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Joao", "da Silva",-30);
		p1.setIdade(150);
		
		System.out.println(p1.getIdade());
		System.out.println(p1.getNomeCompleto());
		System.out.println(p1); //toString
		
		
		
		

	}

}
