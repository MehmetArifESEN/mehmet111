package lesson03;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// Kullanıcıdan sureklı sayı alacagız
		//kullanıcı 0 a basınca aldıgımız sayıların çarpımını yazacagız
		Scanner scanner = new Scanner(System.in);
		int sayi;
		int carpim=1;
		do {
			System.out.println("lütfen bir sayı giriniz");
        	sayi= scanner.nextInt();
        	if (sayi==0)
        		break;
        	carpim=carpim*sayi;
        	
			
		} while (sayi!=0);
		
		System.out.println(carpim);
        	
		

	}

}
