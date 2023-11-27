package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		// Conversao implicita
		double a = 1;
		System.out.println(a);

		// Conversao explicita (CAST)
		float b = (float) 1.2343;
		System.out.println(b);

		int c = 340;
		byte d = (byte) c;
		System.out.println(d);

		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
	}
}
