import static java.lang.Math.PI;;  
public class Driver {
	
	static int i;
	
	static {
		//System.out.println("Static Block");
		i = 20;
	}
	
	public static void main(String[] args) {
		
		//System.out.print(i);
		//Driver driver = new Driver();
		//driver.i = 20;
		//System.out.println(driver.i);
		
		System.out.println(i);

		//System.out.println (Math.PI);
		System.out.println (PI);
	}
}
