package algoritmalar;

import java.util.Scanner;

public class toplama {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int toplam=0;
		int input = 0;
		do {
			System.out.print("Bir sayı giriniz: ");
			input = scanner.nextInt();
			toplam += input;
			
		}while(input != 0);
		
		System.out.print("Girilen sayıların toplamı: " + toplam);
		
	}	
	
}
