package lesson5;

import java.util.Random;
import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		// random int sayı üretmemiz lazım
		//randolm sayıyı üretelim 0 ile 100 arasında yazdıralım
		
		//SAyı tahmin uygulaması yapalım
		//sureklı kullanıcıdan sayıyı tahmın etmesını ısteyecegız
		// eger kullanıcının gırdıgı sayı bulması gereken sayıdan az ıse tahmınınızı yukseltın
		//fazla ise tahmininizi azaltın
		//doğru tahini kacıncı tahmın
		Random random = new Random();
		int randomnumber = random.nextInt(0,101);
		
//		int rastgele = (int) (Math.random()*100);
//		System.out.println(randomnumber);
//		System.out.println(rastgele);
		
		Scanner scanner=new Scanner(System.in);
		for (int i=0; i<101;i++ ) {
			System.out.println("Tahmininizi giriniz");
			int tahmin= scanner.nextInt();
			
			if (tahmin==randomnumber) {
				System.out.println((i+1) + ". seferde doğru tahmini buldunuz.");
			} else if (tahmin<randomnumber) {
				System.out.println("Lütfen tahmininizi yükseltiniz");
			} else if (tahmin>randomnumber) {
				System.out.println("Lütfen tahmininizi düşürünüz");
			} 
		}
		

	}

}
