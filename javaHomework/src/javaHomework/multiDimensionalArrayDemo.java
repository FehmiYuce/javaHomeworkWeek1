package javaHomework;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String sehirler[][] = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "İzmir";
		sehirler[0][2] = "Van";
		sehirler[1][0] = "Muş";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Sivas";
		sehirler[2][0] = "Çorum";
		sehirler[2][1] = "Iğdır";
		sehirler[2][2] = "Ankara";
		
		for(int i=0; i<=2; i++) {
			System.out.println("--------------------");
			for(int j=0; j<=2; j++) {
				System.out.println(sehirler[i] [j]);
			}
		}

	}

}
