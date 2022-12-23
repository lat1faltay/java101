package algoritmalar;

import java.util.Arrays;
import java.util.Scanner;

public class tekcift {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("kaç adet sayı girilecek: ");
		int sayiAdedi =  scanner.nextInt();
		int[] sayilar = new int[sayiAdedi];
		
		for(int i=0; i< sayilar.length; i++) {
			System.out.print("Sayı: ");
			sayilar[i] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(sayilar));
		
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + " Sayı çifttir");
			}else {
				System.out.println(sayilar[i] + " Sayı tektir");
			}
		}
		
	}
}
