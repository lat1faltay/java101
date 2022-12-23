package algoritmalar;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ortalama {
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Kaç adet sayı girilecek: ");
		int sayi = scanner.nextInt();
		int[] sayilar =new int[sayi];
		
		for (int i = 0; i<sayilar.length; i++) {
			sayilar[i] = random.nextInt(100);
		}
		
		System.out.print(Arrays.toString(sayilar));
		
		float f=0.f;
		for(int i=0; i<sayilar.length;i++) {
			f+=sayilar[i];
		}
		
		System.out.print("Sayıların toplamı: " + f);
		System.out.println();
		System.out.print("Sayıların ortalaması: " + (f/sayilar.length));
	}
}
