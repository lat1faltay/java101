package algoritmalar;

import java.util.Scanner;

public class daire {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen yarıçapı giriniz: ");
		int yaricap = scanner.nextInt();
		
		// alan pi * r2
		// çevresi 2 piR
		
		float alan = (float)(Math.PI * Math.pow(yaricap, 2));
		float cevre = (float)( 2 * (Math.PI *  yaricap));
		System.out.println("alan: " + alan);
		System.out.println("çevre: " + cevre);
	}
}
