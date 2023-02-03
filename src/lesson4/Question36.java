package lesson4;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		// Verilen kelimenin içinde kaç tane "e" olduğunu bulan algotimayi yazalım
		Scanner scanner=new Scanner(System.in);
		System.out.println("metin giriniz");
		String text = scanner.nextLine();
		int counter=0;
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)=='e') {
				counter++;
			}
		}
		System.out.println(counter);
		
		String upperText = text.toUpperCase();
		System.out.println(upperText);
		String lowerText = text.toLowerCase();
		System.out.println(lowerText);
		

	}

}
