import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		if(x > y) {
			System.out.println("x, y'den büyüktür");			
		}else {
			System.out.println("x, y'den küçüktür");		
		}
		
		
		System.out.println(x > y ? "X, Y'den büyüktür" : "X, Y'den küçüktür");
		
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println(x>i ? "X, İ'den büyüktür":"X, İ'den küçüktür");
		
		
		
		
		
		
	}
}
