package oo.encapsulamento;

public class Pessoa {

	private String sobrenome;
	private int idade;
	private String nome;

	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public Pessoa(int idade) {
		setIdade(idade);
		// this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 130)
			this.idade = novaIdade;
	}
	
	public String getNomeCompleto () {
		return getNome() +" "+getSobrenome();
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() +" "+ getSobrenome() +". Idade: " + getIdade() + " anos";

	}

}
