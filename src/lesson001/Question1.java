package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		//javada primitive tipler nelerdir?
		//birbirinden farkı?
		
		
		//Verilen isim ve soy isim değerlerini hello (isim) (soyisim şeklinde yazdıralım)
		
		//Değişken tanımlarken
		String isim = "mehmet";
		String soyisim = "kaya";
		
		System.out.println("Hello: " + isim + " " + soyisim);
		
		//Girilen isim ve soyismini yazdıralım.
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz.");
		String isim2 = input.nextLine();
		System.out.println("Soyisim giriniz.");
		String soyisim2 = input.nextLine();
		System.out.println(isim2 + " " + soyisim2);

	}

}
