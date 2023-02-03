package lesson002;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// Girilen char değerinin alfabenin içinde var mı yok mu
		//a A
		//7 ? . '
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir karakter giriniz ");
		char ch = scanner.next().charAt(0);
		
		int asciiCode = ch;
		if (asciiCode>=65 && asciiCode<=90 ) {
			System.out.println("Alfabetik");
		}
		else if (asciiCode>= 97 && asciiCode<=122) {
			System.out.println("Alfabetik");
		}
		else {
			System.out.println("alfabetil değildir");
		}
		

	}

}
