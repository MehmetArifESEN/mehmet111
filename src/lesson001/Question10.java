package lesson001;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		//girilen 3 sayıdan en büyüğü
		System.out.println("bir sayı giriniz");
		Scanner input = new Scanner(System.in);
		int sayi1= input.nextInt();

		System.out.println("ikinci sayıyı giriniz");
		int sayi2= input.nextInt();
		
		System.out.println("üçüncü sayıyı giriniz");
		int sayi3= input.nextInt();
		
		int enBuyuk = sayi1;
		if(sayi2>enBuyuk) {
			enBuyuk= sayi2;
		}
		if(sayi3>enBuyuk) {
			enBuyuk=sayi3;
		}
		System.out.println("En büyük sayi --->" + enBuyuk);

	}

}
