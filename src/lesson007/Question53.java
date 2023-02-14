package lesson007;

import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {
		//iki kez üst üste klavyeden aynı sayı gırılene kadar dongu devaö edecel
		// üst üste iki sayı girildiğinde 
		// o zamana kadar girilen sayıların rotamalamsını veren program
		
		Scanner scanner =new Scanner(System.in);
		int toplam=0;
		int sayi=0;
		int eskiSayi =0;
		int sayac=0;
		
		
		do {
			sayi= scanner.nextInt();
			toplam=toplam+sayi;
			eskiSayi=sayi;
			sayac++;
			
		} while (sayi==eskiSayi);
		System.out.println(toplam/sayac);

	}

}
