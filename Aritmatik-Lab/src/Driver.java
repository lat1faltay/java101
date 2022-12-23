
public class Driver {
	public static void main(String[] args) {
		/*
		int x = 10;
		float y =20f;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
		System.out.println(5%2);
		
		System.out.println(4%2);
		
		int a = 10;
		//a = a +2;
		a+=2;
		System.out.println(a);
		
		int q = 12;
		System.out.println(q++);
		System.out.println(q);
		
		*/
		
		int i = 10; // 00000000 00000000 00000000 00001010  sayının bellekteki bit karşılığı	
		int x = 4; //  00000000 00000000 00000000 00000100
		//             00000000 00000000 00000000 00000000
		
		System.out.println(i&x); // ve operatörü iki bit alt alta 1 ise 3. satıra 1 yazar
								 // 0 & 0 = 0
								 // 0 & 1 = 0 
							     // 1 & 0 = 0
								 // 1 & 1 = 1
		
		System.out.println(i|x); // veya operatörü iki bit alt alta 1 ise 3. satıra 1 yazar
								// 0 | 0 = 0
		 						// 0 | 1 = 0 
								// 1 | 0 = 0
								// 1 | 1 = 1

		
		System.out.println(x >> 1); // x sayısını bir bit sağa kaydırdık
									//00000000 00000000 00000000 00000100   sayının bitleri böyleyken en sondaki sıfır atılıyor ve başa 1 tane 0 biti ekleniyor ve tüm bitler 1 bit sağa kaydırılıyor
									//00000000 00000000 00000000 00000010  sondaki bit gitti ve başa 0 biti eklendi ve her bit 1 tane kaydırıldı
		
		System.out.println(x << 1); // burada da olay tam tersine dönüyor sola doğru sayıyı kaydırırsak  en soldaki bit atılıyor ve sağa bir tane 0 biti ekleniyor
									// 00000000 00000000 00000000 00000100
		
		
		System.out.println(~i); // tilda öperatörü 0 olan bitleri 1 ve 1 olan bitleri 0'a çevirmektedir

	}
}
