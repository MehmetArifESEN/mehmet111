package lesson001;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// girilen sayı tek mi çift mi
		System.out.println("bir sayı giriniz");
		Scanner input = new Scanner(System.in);
		
		int sayi= input.nextInt();
				if (sayi %2 ==0) {
					System.out.println("Girdiğiniz sayı çifttir.");
				}else
					System.out.println("Girdiğiniz sayı tektir.");

	}

}
