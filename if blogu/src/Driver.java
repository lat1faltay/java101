import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		/*
		int number = 10;
		
		boolean result = number > 0;
		
		
		if (result) {
			System.out.println("Number pozitif bir sayıdır");
		}else {
			System.out.println("Number negatif bir sayıdır");
		}
		System.out.println("Burası her zaman çalıştırılacaktır");
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen sayı giriniz: ");
		int i =scanner.nextInt();
		if(i % 2 ==0) {
			System.out.println("sayı çifttir");
		}else {
			System.out.println("sayı tektir");
		}
		
		
		
		int number = 75;
		
		if(number < 100) {
			System.out.println("Sayı 100'den küçük");
			if(number >50) {
				System.out.println("Sayı 50'den büyük");
			}
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("giriş: ");
		int number = scanner.nextInt();
		
		if(number < 100 && number >=10) {
			System.out.print("girdiğiniz sayı 2 basamaklı");
		}else if(number < 1000 && number >= 100){
			System.out.println("Girdiğiniz sayı 3 basamaklıdır");
		}else if(number < 10000 && number >= 1000){
			System.out.println("Girdiğiniz sayı 4 basamaklıdır");
		}
		
		
		
		
	}
}
