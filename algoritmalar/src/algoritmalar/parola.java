package algoritmalar;

import java.util.Scanner;

public class parola {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String parola = "";

		do {
			System.out.print("Bir parola giriniz: ");
			parola = scanner.nextLine();
		}while(!parola.equals("1234"));
		System.out.print("Hoşgeldiniz");
	}
}
