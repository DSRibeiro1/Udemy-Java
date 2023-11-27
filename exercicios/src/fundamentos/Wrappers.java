package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Byte --> byte
		Byte b = 100;
		
		//Short --> byte
		Short s = 1000;
		
		//Integer.parseInt(entrada.next())
		Integer i = Integer.parseInt(entrada.next());
		
		//Long --> long
		Long l = 100000L;
		
		//Float --> float
		Float f = 123.10F;
		
		//Double --> double
		Double d = 1234.5678;
				
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		System.out.println(f);
		System.out.println(d);
		
		//Boolean --> boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//Character --> char
		Character c = '#';
		System.out.println(c.toString());
		System.out.println(c +"...");
						
		entrada.close();
	}
}
