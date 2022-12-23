
public class Driver {
	
	public static boolean test() {
		System.out.println("Test Çalıştırıldı");
		return false;
	}
	
	public static void main(String[] args) {
		boolean b = true;
		System.out.println(b);
		
		System.out.println(!b);
		System.out.println(b & true);
		
		System.out.println(b | false);
		
		System.out.println(b && test());
		System.out.println(b || test());
		
	}
}
