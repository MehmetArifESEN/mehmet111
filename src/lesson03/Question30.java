package lesson03;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		// Girilen sayıya kadar tek olan sayıların toplamını bulan program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz");
		int sayi= scanner.nextInt();
		int toplamt=0;
		for (int i =1;i<=sayi;i++) {
			if (i%2!=0) {
				toplamt += i;
			}
				
		}
		System.out.println("toplam: " + toplamt);
		
		System.out.println("********************");
		
		System.out.println("lütfen bir sayı giriniz");
		int sayi2= scanner.nextInt();
		int toplam=0;
		while(sayi2!=0) {
			if(sayi2%2!=0) {
			toplam = toplam + sayi2;
				
			}
			
			sayi2--;
		}
		
		System.out.println(toplam);

	}

}
