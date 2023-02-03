package lesson002;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		//dışarıdan iki tane sayısal deger alalım int olarak
		//iki sayının toplamı çift ise true degılse false yazdıralım
		//en sonrada sayıların toplamının yarısını yazdıralım
		
		
		Scanner input = new Scanner(System.in);
		
		boolean tekMi;
		
		System.out.println("1. sayıyı giriniz");
		int sayi1= input.nextInt();
		System.out.println("2. sayıyı giriniz");
		int sayi2= input.nextInt();
		int toplam =sayi1 + sayi2;
		
		if(toplam %2==0) {
			tekMi=true;
		}
		else {
			tekMi = false;
		}
		
		System.out.println(tekMi);
		System.out.println(toplam/2);
		
		
		System.out.println("\n\n******\n\n");
		
		boolean durum = (toplam %2==0 );
		System.out.println(durum);
		System.out.println(toplam/2);
		

	}

}
