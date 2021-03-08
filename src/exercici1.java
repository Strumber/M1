
public class exercici1 {

	public static void main(String[] args) {
		// NIVELL 1
		// FASE 1 creo variables i les mostro concatenades
		System.out.println("FASE 1");
		String nom = "Jordi";
		String cognom1 = "Albiol";
		String cognom2 = "Raurell";
		int dia = 8;
		int mes = 03;
		int any = 1971;
		
		System.out.println(nom + cognom1 + cognom2);
		System.out.println(dia + "/" + mes + "/" + any);

		// FASE 2 anys de trasp�s des de l' any que vas n�ixer
		System.out.println("FASE 2");
		final int ANYini = 1948;
		int Traspas = 0;
		
		for (int x = ANYini; x <= any; x++) {
			if ((x % 4 == 0) && ((x % 100 != 0) || (x % 400 == 0))) {
				System.out.println("Any de trap�s: " + x);
				Traspas++;
			} else {
			}
		}
		System.out.println("Des de l' any : " + ANYini + " fins l' any que vas n�ixer, el " + any + " ,hi han hagut : "
				+ Traspas + " anys de trap�s");

		// FASE 3 anys de neixement de trasp�s ?
		System.out.println("FASE 3");
		Boolean anyNeix = false;
		String si = "l' any que vas neixer va ser una any de trap�s";
		String no = "l' any que vas neixer No va ser un any de trap�s !!!";
		for (int x = ANYini; x <= any; x++) {
			if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))) {
				anyNeix = true;
				Traspas++;
			} else {
			}
		}
		if (anyNeix == true) {
			System.out.println(si);
		} else {
			System.out.println(no);
		}
		// FASE 4 Strings junts
		System.out.println("FASE 4");
		String NomCog = nom + " " + cognom1 + " " + cognom2;
		String data = dia + "/" + mes + "/" + any;
		System.out.println("El meu nom es " + NomCog);
		System.out.println("Vaig neixer el " + data);
		if (anyNeix == true) {
			System.out.print(si);
		} else {
			System.out.println(no);
		}
		// NIVELL 2
		// Casting
		System.out.println("_________________");
		System.out.println("NIVELL 2");
		double num = 3.1416;
		System.out.println("Variable Double " + num);
		int n1 = (int) num;
		System.out.println("Cast de Double a int " + n1);
		float n2 = (float) num;
		System.out.println("Cast de Double a float " + n2);
		String n3 = Double.toString(num);
		System.out.println("Cast de Double a String " + n3);

		// NIVELL 3
		// Array
		System.out.println("_________________");
		System.out.println("NIVELL 3");
		int[] level3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Array Original ");
		for (int i = 0; i < level3.length; i++)
			System.out.println(level3[i]);// imprimir l' array original

		int auxlevel3;
		for (int i = 0; i < level3.length / 2; i++) {
			auxlevel3 = level3[i];
			level3[i] = level3[level3.length - 1 - i];
			level3[level3.length - 1 - i] = auxlevel3;
		}
		System.out.println("_________________");
		System.out.println("Array invertida");
		for (int i = 0; i < level3.length; i++)
			System.out.println(level3[i]);// imprimir l' array original

		



	}

}
