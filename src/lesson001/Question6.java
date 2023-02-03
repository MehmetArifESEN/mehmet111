package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		//kullanıcıdan alınan vıze fınallerle geçip geçemediğini hesaplayın
		// vize %40 final %60 50 not gecer 50 den kucukse kalır
		System.out.println("Vize notunu giriniz.");
		Scanner input = new Scanner(System.in);
		float vize = input.nextFloat();
		
		System.out.println("Final notunu giriniz");
		float final1 = input.nextFloat();
		float not = (vize*0.4f) + (final1*0.6f);
		
		if (not < 50) {
			System.out.println("dersten kaldınız");
		} else
			System.out.println("dersten geçtiniz");
		
		

	}

}
