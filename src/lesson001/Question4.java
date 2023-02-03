package lesson001;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		//verilen 2 sayının hangisini büyük olduğunu bulan program
		
		System.out.println("Lütfen bir sayı giriniz");
		
		Scanner input = new Scanner(System.in);
		int sayi1 = input.nextInt();
		
		System.out.println("İkinci sayıyı giriniz.");
		int sayi2 = input.nextInt();
		
		if (sayi1 > sayi2); {
			System.out.println("büyük" + sayi1);
			
		}
		
		
	}
}
