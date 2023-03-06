package lesson017;

import java.util.Scanner;
import java.util.Stack;

public class StackOrnek2 {
	
	static Stack <Character> stack = new Stack<>();

	public static void main(String[] args) {
		
		//Parametre olarak String alan ve 
		//Girilen metnın her bır karakterını stackın ıcıne atan bır metod yazalım
		//metod ısmı palındrom olsun
		
		//java
		//j
		//a
		//v
		//a
		Scanner scanner =new Scanner(System.in) ;
		System.out.println("Bir kelime giriniz");
		
		String kelime= scanner.nextLine();
		
		palindrom(kelime);
		isPalindrom(kelime);
				

	}
	
	public static void palindrom(String name) {
		for(int i=0;i<name.length();i++) {
			stack.push(name.charAt(i));
		}
		for(Character character:stack) {
			System.out.println(character);
		}
	}
	public static boolean isPalindrom(String name) {
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!= stack.pop()) {
				return false;
			}
			
		}return true;
		
	}

}
