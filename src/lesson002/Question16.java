package lesson002;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		//kullanıcıdan aldığımız sayı haftanın hangi gününe denk geliyor
		//bu gün hafta sonu mu hafta içi mi
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("günün sayısını giriniz ");
		
		int gun = scanner.nextInt();
		
		
		
		switch (gun) {
		case 1:
			System.out.println("Pazartesi");
			if(gun>5) {
				System.out.println("Haftasonu");
			}else if(gun<=5) {
			System.out.println("Haftaiçi");
			}
			break;
			
		case 2:
			System.out.println("Salı");
			if(gun>5) {
				System.out.println("Haftasonu");
			}else if(gun<=5) {
			System.out.println("Haftaiçi");
			}
			break;
			
		case 3:
			System.out.println("Çarşamba");
			if(gun>5) {
				System.out.println("Haftasonu");
			}else if(gun<=5) {
			System.out.println("Haftaiçi");
			}
			break;
			
		case 4:
			System.out.println("Perşembe");
			if(gun>5) {
				System.out.println("Haftasonu");
			}else if(gun<=5) {
			System.out.println("Haftaiçi");
			}
			break;
			
		case 5:
			System.out.println("Cuma");
			if(gun>5) {
				System.out.println("Haftasonu");
			}else if(gun<=5) {
			System.out.println("Haftaiçi");
			}
			break;
			
		case 6:
			System.out.println("Cumartesi");
			if(gun>5) {
				System.out.println("Haftasonu");
			}else if(gun<=5) {
			System.out.println("Haftaiçi");
			}
			break;case 7:
				System.out.println("Pazar");
				if(gun>5) {
					System.out.println("Haftasonu");
				}else if(gun<=5) {
				System.out.println("Haftaiçi");
				}
				break;
			default:
				System.out.println("1 ila 7 arası bir sayı giriniz");
				break;

	}
	}

}
