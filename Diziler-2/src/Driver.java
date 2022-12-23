import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		/*
		int[] [] numbers = new int[2][3];
		numbers[0][0]=1;
		numbers[0][1]=2;
		numbers[0][2]=3;
		
		numbers[1][0]=4;
		numbers[1][1]=5;
		numbers[1][2]=6;
				
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers[0][1]);
		
		for (int i=0; i<2;i++) {
			for (int j = 0; j<3; j++) {
				System.out.println(numbers[i][j]);
				

			}
		}
		*/
		
	String [] [] ogrenciler = new String [3][3];
	
	ogrenciler [0][0] = "Deniz";
	ogrenciler [0][1] = "Ece";
	ogrenciler [0][2] = "Aslı";		
	
	ogrenciler [1][0] = "Merve";
	ogrenciler [1][1] = "İrem";
	ogrenciler [1][2] = "Belinay";
	
	ogrenciler [2][0] = "Nur";
	ogrenciler [2][1] = "Sude";
	ogrenciler [2][2] = "Gizem";
	
	for(int q = 0; q<ogrenciler.length; q++) {
		for(int s = 0; s<ogrenciler[q].length; s++) {
			System.out.print(q + " " + s + ": ");
			System.out.println(ogrenciler[q][s]);
		}
	}
		
	}

}
