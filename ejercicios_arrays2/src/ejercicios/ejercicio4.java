package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Palabra del 1 jugador: ");
		String pal1 = scan.nextLine();

		System.out.print("Palabra del 2 jugador: ");
		String pal2 = scan.nextLine();

		if (pal1.charAt(pal1.length() - 1) == pal2.charAt(1)
				&& pal1.charAt(pal1.length() - 2) == pal2.charAt(0)) {
			System.out.println("La cadena esta bien");
		}

	}
}
