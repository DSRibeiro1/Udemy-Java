package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	public Data() {
		dia = 1;
		mes = 1;
		ano = 1970;

	}

	public Data(int diaInicio, int mesInicio, int anoInicio) {
		diaInicio = dia;
		mesInicio = mes;
		anoInicio = ano;
	}

	String obterDataFormatada() {

		return String.format("%d/%d/%d", dia, mes, ano);
	}

	void imprimirDataFormatada1() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}

	void imprimirDataFormatada2() {
		System.out.println(obterDataFormatada());
	}

}
