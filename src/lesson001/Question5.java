package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		//Girilen Tl değerini usd çevir 1 usd 18.90
		
		System.out.println("Lütfen bir sayı giriniz");
		Scanner input = new Scanner(System.in);
		float sayi1 = input.nextFloat();
		float usd = 18.9f;
		float dolar = sayi1 / usd;
		System.out.println(dolar + "dolar");
				
		
		
		

	}

}
