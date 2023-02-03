package lesson03;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// Girilen sayının 5 in kuvveti olup olmadığını bulan program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi=scanner.nextInt();
		boolean kontrol= true;
		
		if (sayi==0 ) {
			System.out.println("Sıfırdan farklı bir değer giriniz.");
		}else {
			while(kontrol==true) {
				if(sayi %5 ==0) {
					sayi=sayi/5;
					if(sayi==1) {
						System.out.println("5 in kuvvetidir.");
						kontrol=false;
					}
				}else {
					System.out.println("5 in kuvveti değildir");
					kontrol=false;
				}
			}
		}
				
		
//		if(Math.log(sayi)%Math.log(5)==0) {System.out.println("sayı 5in kuvvetidir");}else {System.out.println("sayı 5in kuvveti değildir");}

	}

}
