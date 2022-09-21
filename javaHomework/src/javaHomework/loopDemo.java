package javaHomework;

public class loopDemo {

	public static void main(String[] args) {
		for(int i=2; i<16; i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü tamamlandı.");
		
		
		int i = 1;
		while(i<16) {
			System.out.println(i);
			i++ ;
	
		}
		
		System.out.println("While döngüsü tamamlandı.");
		
		
		int x = 25;
		do {
			System.out.println(x);
			x+=2;
		} while(x<16);
		System.out.println("Do-While döngüsü tamamlandı.");
		
		
		int y = 9;
		do {
			System.out.println(y);
			y+=3;	
		} while(y<16);
		System.out.println("Do-While döngüsü tamamlandı.");

	}	
		
		
}
