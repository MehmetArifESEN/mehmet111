package lesson007;

public class Question59 {
	
	public static int[] tekSayilarDizi(int[][] dizi) {
		int sayac=0;
		int []tekSayilar = new int [dizi.length*dizi[0].length];
		for( int i=0;i<dizi.length; i++ ) {
			for (int j=0;j<dizi[i].length;j++) {
				if (dizi[i][j] %2 != 0) {
					tekSayilar[sayac] = dizi[i][j];
					sayac++;
				}
			}
		}
		return tekSayilar;
	}
	
	public static void yazdir(int[] dizi) {
		
		for( int j =0; j<dizi.length;j++) {
			if (dizi[j] !=0) {
				System.out.println(dizi[j] + " ");
			}
		}
	}

	public static void main(String[] args) {
		// 2 farklı metod
		// paraeetre olarak dizi [array] aldıgı dızıdekı tek elemanları fakrlı bır dızıye atacak
		
		// diğre metod da tek sayıların oldugu dızıyı ekrana yazdıracak
		
		int[][] matris = { { 56, 23, 678, 231, 5 }, 
				{ 234, 21, 78, 26, 6 }, 
				{ 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };
		int [] tekler = tekSayilarDizi(matris);
		yazdir(tekler);

	}

}
