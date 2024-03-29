package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	public Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1,10,1970);

	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		//final String formato = "%d/%d/%d";
		//return String.format(formato, dia, mes, ano);

		return String.format("%d/%d/%d", dia, mes, ano);
	}

	void imprimirDataFormatada1() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}

	void imprimirDataFormatada2() {
		System.out.println(obterDataFormatada());
	}

}
