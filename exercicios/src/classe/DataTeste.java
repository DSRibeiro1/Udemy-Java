package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		d1.ano = 2022;
		// d1.dia = 10;
		// d1.mes = 11;
		// d1.ano = 2022;

		var d2 = new Data (21, 11, 2021);
		// d2.dia = 21;
		// d2.mes = 11;
		// d2.ano = 2021;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		d1.imprimirDataFormatada1();
		d2.imprimirDataFormatada2();

	}

}
