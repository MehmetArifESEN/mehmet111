package lesson03;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// Girilen sayı için çarpım tablosunu veren programı yazalım
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi1 = scanner.nextInt();
		int carpim;
		for (int i=1;i<=10;i++) {
			carpim= sayi1 * i;
			System.out.println(sayi1 + " x " + i + " = " + carpim);
		}
		System.out.println("*****************");
		
		//iç içe kullanalım
		//bütün çarpım tablosunu yazdıralım
		
		
		for (int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
			
				System.out.println(i + " x " + j + " = " + j * i);
			}
			
			
		}

	}

}
