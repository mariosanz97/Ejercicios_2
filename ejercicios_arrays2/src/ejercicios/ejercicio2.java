package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce la frase: ");
		String frase = scan.nextLine();

		System.out.print("Que caracter quieres contar: ");
		String car = scan.nextLine();

		int contador = 0;
//contador de caracteres
		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == car.charAt(0)) { // ==car.charAt(0) -->  para que te lea el primer caracter introducido
				contador++;
			}

		}
		System.out.println("Hay " + contador);

	}

}
