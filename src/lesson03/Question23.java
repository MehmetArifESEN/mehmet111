package lesson03;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		//Girilen sayının faktöriyelini bulan program
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi1 = scanner.nextInt();
		int carpim=1;
		for (int i=1;i<=sayi1;i++) {
			carpim= carpim*i;
			
		}
		
		System.out.println("faktöriyel sonucu: " + carpim);

	}

}
