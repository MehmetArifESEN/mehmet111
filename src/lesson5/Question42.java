package lesson5;

public class Question42 {

	public static void main(String[] args) {
		int[] sayilar = {2,4,10,5};
		
		//bu sayı çiftdir ve bu sayı tekdir şeklinde çıktı alan ve dizideki tüm sayıların toplamını veren program
		//dizinin içindeki elemanların toplamını yazdıralım
		
		int tektoplam=0;
		int cifttoplam=0;
		for (int i=0 ; i<sayilar.length ; i++) {
			if (sayilar[i]%2==0) {
				cifttoplam= cifttoplam+ sayilar[i];
				System.out.println(sayilar[i] + "çiftdir");
			}else if (sayilar[i]%2!=0) {
				tektoplam= tektoplam+ sayilar[i];
				System.out.println(sayilar[i] + "tektir");
			}
			
		}
		 System.out.println("sayıların toplamı: " + (tektoplam+cifttoplam));

	}

}
