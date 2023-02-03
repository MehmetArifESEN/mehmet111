package lesson4;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		//Verilen kelimenin harflerini alt alta yazdıralım
		//java
		//j
		//a
		//v
		//a
		
		String metin="Java";
//		for (int i =0; i<metin.length() ; i++) {
//			System.out.println(metin.charAt(i));
//		}
		
		//kullanıcıdan bir string deger alalım
		//aldıgımız değer
		//java
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen bir sayı gırınız");
		int x = scanner.nextInt();
		if (x>=0 && x<4) {
			System.out.println(metin.charAt(x));
		}else {
			System.out.println("Lütfen geçerli bir sayı giriniz");
		}
		
		

	}

}
