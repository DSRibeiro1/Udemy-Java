package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 6.6;
		notasAlunoA[1] = 7.0;
		notasAlunoA[2] = 9.2;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		;

		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA / notasAlunoA.length);

		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 7.6, 6.6, notaArmazenada, 10 };

		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoA.length);

	}

}
