package lesson008;

import java.util.Random;
import java.util.Scanner;

public class Question65 {

	public static void main(String[] args) {
		// random sayi üret metodu yazalım burda 1 den 500 e kadar random sayı uretıcez
		//ortalama hesapla dıye bır metod yazalım
		
		//kullanıcıdan kac tane sayıyla ıslem ypamasını ıstedıgımızı soralım
		// girdiği veriye gore içeride bır array oluşturacagız ve random uretılen saıyylarını arraye atıp ortalamasını bulucaz
		Scanner scanner =new Scanner(System.in);
		System.out.println("dizi uzunluğu");
		int uzunluk = scanner.nextInt();
		double[] array = new double[uzunluk];
		
		for (int i=0 ;i<array.length; i++ ) {
			array[i] = randomSayiUret(i);
			System.out.println(array[i]);
		}
	
		System.out.println("ortalama: " + ortalamaHesapla(array));

	}
	
	public static double randomSayiUret(int i) {
		Random random= new Random();
		double sayi1= random.nextDouble(1,500);
		return sayi1;
		
	}
	
	public static double ortalamaHesapla(double [] array) {
		double toplam=0;
		double ortalama=0;
		for (int i=0; i<array.length;i++) {
			toplam+=array[i];
		}
		ortalama = toplam/array.length;
		return ortalama;
	}
		
	
	

}
