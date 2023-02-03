package lesson4;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		// Girilen sayının mükemmel sayı olup olmadıgınını bulan program
		//bölenlerının toplamı kendısını veren sayı
		//6
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi=scanner.nextInt();
		int toplam=0;
		
		for (int i=1 ; i <sayi; i++) {
			if(sayi%i==0) {
				toplam=toplam +i;
				
			}else
				continue;
		}
		if (sayi==toplam) {
			System.out.println("Sayı mükemmeldir");
		}else {
			System.out.println("Sayı kükemmel değildir");
		}
		
				;

	}

}
