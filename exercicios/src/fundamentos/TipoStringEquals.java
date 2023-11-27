package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");

		String s = new String("2");

		System.out.println("2" == s);
		System.out.println("2".equals(s));

		Scanner console = new Scanner(System.in);
		String s2 = console.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		console.close();
	}
}
