package ejercicios;

import java.util.Scanner;

public class ejercicioo4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Lista de lapabras: ");
		String pal1 = scan.nextLine();

		String[] pal2 = pal1.split(" ");

		for (int i = 0; i < pal1.length(); i++) {
			System.out.println(pal1);
			i=pal1.length();

		}
		
		

	}
}
