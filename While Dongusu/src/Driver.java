import java.sql.Date;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		int i = 0;
		while(i < 10) {
			System.out.println (i);
			i++;
		} 
		*/
		/*
		while(true) {
			System.out.println(new Date(0));
			Thread.sleep(10000);
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			//String text = scanner.nextLine();
			//System.out.println(text.toUpperCase());
			
			int i = scanner.nextInt();
			System.out.print(Math.pow(i, 2));
			
		}
		
	}
} 
