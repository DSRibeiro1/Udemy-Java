package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if(velocidadeAtual +getDelta() > VELOCIDADE_MAXIMA) {
		velocidadeAtual = VELOCIDADE_MAXIMA;
	}
		velocidadeAtual +=getDelta();
	}

	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	public String toString() {
		return "Velocidade atual �: "+velocidadeAtual +"km/h";
	}

}
