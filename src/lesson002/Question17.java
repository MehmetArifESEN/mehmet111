package lesson002;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		//Girilen karakterin asci kodunu bulan program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir karakter giriniz ");
		char ch = scanner.next().charAt(0);
		
		int asciiCode = ch;
		System.out.println("asciKodu " + asciiCode);

	}

}
