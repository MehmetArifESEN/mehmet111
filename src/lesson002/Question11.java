package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		//Dairenin çevresini ve alanını hesaplayan bir program
		//r değeri kullanıcıdan pi= 3.14
		
		System.out.println("Yarıçapı giriniz");
		Scanner input = new Scanner(System.in);
		float rcap= input.nextFloat();
		
		float pi = 3.14f;
		
		float alan = (pi*rcap*rcap);
		float cevre = (pi*rcap*2);
		System.out.println("alan: " + alan + "cevre: " + cevre);
				

	}

}
