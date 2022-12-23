import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. sayı: ");
		float x = Float.parseFloat(scanner.nextLine());
		System.out.print("2. sayı: ");
		float y = Float.parseFloat(scanner.nextLine());
		System.out.print("İşlem: ");
		
		char islem = scanner.nextLine().charAt(0);
		
		System.out.println(	"x");
		System.out.println(	"y");
		System.out.println(	"islem");
		
		
		switch(islem) {
		case '+':
			System.out.println("Sonuc: " + ( x + y ));
			break;
		case '-':
			System.out.println("Sonuc: " + ( x - y ));
			break;
		case '*':
			System.out.println("Sonuc: " + ( x * y ));
			break;
		case '/':
			System.out.println("Sonuc: " + ( x / y ));
			break;
		default:
			System.out.println("Bilinmeyen operatör");
			break;
		
		}
		
		
	}
	
}
