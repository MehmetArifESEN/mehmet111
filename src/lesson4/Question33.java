package lesson4;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// Klavyeden girilen 0 ile 100 arasında 100 dahil 5 adet sayıdan en büyük ve en küçük olanınnı bulan program
		
		
		
		
		Scanner scanner= new Scanner(System.in);
		int enBuyuk=0;
		int enKucuk=101;
		for (int i= 1;i<=5;i++) {
			System.out.println("sayı giriniz");
			int sayi=scanner.nextInt();
			if((sayi<=100 &&  sayi>=0)) {
				
			
			if (sayi>enBuyuk) {
				enBuyuk=sayi;
			}if (sayi<enKucuk) {
				enKucuk=sayi;
				
			} else {
				continue;
			}
			
			}else  {
				System.out.println("Lütfen geçerli bir sayı giriniz");
				i--;
			}
			
		}
		System.out.println("en küçük sayı: " + enKucuk + " en büyük sayı: " + enBuyuk);

	}

}
