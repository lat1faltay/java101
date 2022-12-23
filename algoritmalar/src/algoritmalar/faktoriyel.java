package algoritmalar;

import java.util.Scanner;

public class faktoriyel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("lütfen bir sayı giriniz: ");
		int number = scanner.nextInt();
		int toplam = 1;
		for (int i = number; i > 0; i--) {
			toplam*=i;

		}
		System.out.print(number + " Sayısının faktoriyeli " + toplam);
		
	}
}
