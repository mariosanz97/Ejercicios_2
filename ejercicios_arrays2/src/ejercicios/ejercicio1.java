package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce la cadena de letras: ");
		String palabras = scan.nextLine();
		System.out.println("");

		int minusculas = 0;
		int mayusculas = 0;

		// Comprobar si son mayusculas o minusculas y contar las minusculas y
		// mayusculas

		for (int i = 0; i < palabras.length(); i++) {

			if (palabras.charAt(i) >= 'A' && palabras.charAt(i) <= 'Z') {
				mayusculas++;
			} else
				minusculas++;

		}

		System.out.println("Hay " + mayusculas + " mayusculas");
		System.out.println("Hay " + minusculas + " minusculas");

	}

}
