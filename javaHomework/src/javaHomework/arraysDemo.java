package javaHomework;

public class arraysDemo {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4] ; 
		ogrenciler[0] = "Ahmet" ; 
		ogrenciler[1] = "Mehmet";
		ogrenciler[2] = "Ali";
		ogrenciler[3] = "Veli";
		for(int i = 0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
