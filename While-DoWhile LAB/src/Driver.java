import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		
		
		
		 !!!   BURADA YILDIZLARLA ÜÇGEN YAPTIK 
		 int starCount = scanner.nextInt();
		
		
		int i=1;
		while(i <= starCount) {
			
			int j = 0;
			
			while(j<i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;		
		}
		
		long total = 0;
		while(true) {
			int x = scanner.nextInt();
			if(x==0) {
				break;
			}
			total += x;
		}
		System.out.println(total);
		
		*/
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		/*
		int x = 0;
		int y = 100;
		
		while(x<y) {
			if(x%2==0) {
				System.out.println(x);
			}
			x++;
		}
		*/
		/*
		float average = 0.0f;
		int count = 0;
		while(true) {
			int number = scanner.nextInt();
			if (number ==0) break;
			count++;
			average += number;
		}
		System.out.println(average / count);
		*/
		
		int positiveCount = 0;
		int negativeCount = 0;
		
		while(true) {
			int x = scanner.nextInt();
			if(x>0) {
				positiveCount++;
			}else if (x < 0) {
				negativeCount--;
			}else {
				break;
			}
		}
		
		System.out.println("POS: " + positiveCount);
		System.out.println("Neg: " + negativeCount);
		
		
		
		
		
		
		
	}
}
