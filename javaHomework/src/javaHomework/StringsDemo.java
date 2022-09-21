package javaHomework;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün okul çok yorucuydu.";
		System.out.println(mesaj);
		System.out.println("Eleman sayısı :" + mesaj.length());
		System.out.println("5.Eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Eve gelir gelmez uyudum."));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char [] karakterler = new char[5] ;
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("ok"));
		System.out.println(mesaj.lastIndexOf("u"));
		
		
		System.out.println(mesaj.replace(' ' , '-'));
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

	}

}
