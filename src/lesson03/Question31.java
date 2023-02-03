package lesson03;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// Girilen sayıda hangi basamakta hangı sayı var onu bulcaz
		//375
		//birler 5
		//onlar 7
		//yuzler 8
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi=scanner.nextInt();
		int i=1;
		
				
	while (sayi>0) {
		System.out.println(i + "'lerbasamagı: " + sayi%10);
		sayi = sayi/10;
				i= i*10;
	}
	}

}
