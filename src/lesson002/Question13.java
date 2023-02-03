package lesson002;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		
		
		//telefoma kod gelecek bunları bız tanımlayacagız
		//kullanıcıdan maıle ve gelen kodu ısteyecegız
		// kodlar uyuşuyorsa kayıt oldunuz
		//mail hatalı telefon hatalı veya ıkısıde hatalı 
		//kullanıcıyı bılgılendır.
		
		Scanner scanner = new Scanner(System.in);
		int kodtel = 1234;
		int kodmail= 4321;
		
		int kodtel1,kodmail1;
		
		System.out.println("Telefona gelen kodu giriniz");
		kodtel1=scanner.nextInt();
		
		System.out.println("maile gelen kodu giriniz");
		kodmail1=scanner.nextInt();
		
		if (kodtel==kodtel1 && kodmail==kodmail1) {
			System.out.println("sisteme kayıt oldunuz");
		}
		else if (kodtel!=kodtel1 && kodmail==kodmail1) {
		     System.out.println("Telefon kodunuz yanlış");
		}
		else if (kodtel==kodtel1 && kodmail!=kodmail1) {
			System.out.println("Mail kodunuz yanlış");
		}
		else {
			System.out.println("Girdiğiniz kodlar uyuşmuyor");
		}
		
		
		
		
		
		
		
		
		
	}
}
