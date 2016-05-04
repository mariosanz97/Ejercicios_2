package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String pal;
		System.out.print("Escriba la palabra: ");
		pal = scan.nextLine();

		StringBuffer pal2 = new StringBuffer(pal);

		pal2 = pal2.reverse();

		for (int i = 0; i < pal2.length(); i++) {

			if (pal.charAt(i) == pal2.charAt(i)) {
				System.out.print("Es palindroma: " + pal + ", " + pal2);
				i = pal2.length();
			} else
				System.out.print("No es palindroma " + pal + ", " + pal2);
			i = pal2.length();

		}

	}

}
