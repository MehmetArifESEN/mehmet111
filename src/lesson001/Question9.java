package lesson001;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		//Harf notuna göre gecip gecmedıgını bulan program
		// 90 üstü AA
		 // 80 ve 90 arası BB
		 // 70 le 80 arası CC
		 // 60 la 70 arası DD
		 // 60 tan küçükse FF kaldı olsun
		
		System.out.println("Ortalama notunuzu giriniz.");
		Scanner input = new Scanner(System.in);
		int not= input.nextInt();
		
		if(not>=90) {
			System.out.println("AA");
			}else if(not>=80 && not<=90) {
			System.out.println("BB");	
			}else if(not>=70 && not<=80) {
			System.out.println("CC");
			}
	}


}
