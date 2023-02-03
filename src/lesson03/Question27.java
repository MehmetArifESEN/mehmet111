package lesson03;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// Girilen sayının basamaklarının toplamını bulalım
		//127--> 1 + 2 + 7 = output 10
		//do while
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi=scanner.nextInt();
		
		int toplam=0;
				
	
		do {
			toplam=toplam + (sayi%10);
			sayi=sayi/10;
			
			
			
		} while (sayi>0);
		System.out.println(toplam);
		
		
		

	}

}
