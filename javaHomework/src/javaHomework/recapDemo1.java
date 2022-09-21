package javaHomework;

public class recapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 15;
		int sayi2 = 55;
		int sayi3 = 64 ;
		int enKucukSayi = sayi1;
		
		if(enKucukSayi> sayi2) {
			enKucukSayi = sayi2 ; 
		}
		
		if(enKucukSayi> sayi3) {
			enKucukSayi = sayi3 ; 
		}
		System.out.println("En küçük sayı:" + enKucukSayi);
		
	}

}
