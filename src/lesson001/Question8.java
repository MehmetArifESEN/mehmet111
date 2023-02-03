package lesson001;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		//Kenarları girilen üçgenin nasıl bir üçgen olduğunu bulan program
		
		System.out.println("bir kenar uzunluğu giriniz");
		Scanner input = new Scanner(System.in);
		int kenar1= input.nextInt();

		System.out.println("ikinci kenar uzunluğunu giriniz");
		int kenar2= input.nextInt();
		
		System.out.println("üçüncü kenar uzunluğunu giriniz");
		int kenar3= input.nextInt();
		
		if(kenar1== kenar2 && kenar2 == kenar3) {
			System.out.println("eşkenar üçgendir");
		}else if(kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3) {
			System.out.println("ikizkenar üçgendir");
		}else {
			System.out.println("çeşitkenar üçgendir");
		}
	
	}

}
