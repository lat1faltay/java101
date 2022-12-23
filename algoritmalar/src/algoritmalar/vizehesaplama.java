package algoritmalar;

import java.util.Scanner;

public class vizehesaplama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vize notu: ");
		int vizeNotu = scanner.nextInt();
		System.out.println("Final notu");
		int finalNotu = scanner.nextInt();
		
		float ortalama = ((vizeNotu * 0.4f) + (finalNotu*0.6f));
		
		if(ortalama >= 50 && finalNotu >=50){
			System.out.print("Ortalamanız " + ortalama + " dersi geçmek için yeterli");
		}else {
			System.out.print("Ortalamanız " + ortalama + " dersi geçmek için yeterli değil");
		}
	}
}
