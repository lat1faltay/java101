import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		boolean sonuc = 9!=9;
		System.out.println(sonuc);
		
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		
		System.out.println(str1 == str2); // == operatörü bellekteki alanı karşılaştırır, String bir primitive type olmadığından dolayı bellekteki alanları faklıdır ve dolayısıyla sonuç false çıkmaktadır 
		
		System.out.println(str1.equals(str2)); //equals metodu == operatörünün aksine string'in içeriğini karşılaştırır ve bu nedenle sonuç true değerini alır ayrıca equals sadece string'ler için kullanılır.
	}

}
