package lesson008;

public class Question61 {
	
	public static void asalMi (int sayi) {
		int sayac=0;
		for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        
       
    
	}

	public static void main(String[] args) {
		// 1 den 1000 e kadar olan sayıların asal olanlarını bulan metodu yazalım
		//asalMi metodunu yazıcaz, bu metotta sadece sayı asal mı dıye bakıyoruz
		//daha sonra maınde for dongusune sokup bulucaz
		
		for (int sayi=2 ; sayi<1001; sayi++) {
			asalMi(sayi);
		}

	}

}
