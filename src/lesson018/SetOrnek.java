package lesson018;

import java.util.HashSet;
import java.util.Scanner;

public class SetOrnek {

	public static void main(String[] args) {
		// 2 tane set olusturalım
		//tekrara edenler, etmeyenler
		//Kullanıcıdan bır kelıme alacagız
		//eger tekrar edene harf varsa tekrara edenler setıne alalım
		//ve tekrar etmeyenlerden cıkartalım
		
		//tekarar edenlerı ve etmıyenlerı yazdıralım
		
		//java
		//tekarae edenler--> a
		//tekarar etmeyenler j,v
		
		HashSet<Character> tekrarEdenler = new HashSet<Character>();
		HashSet<Character> tekrarEtmeyenler = new HashSet<Character>();
		
		Scanner scanner = new Scanner(System.in);
		
		String metin =scanner.nextLine();
		
		for(int i=0;i<metin.length();i++) {
			
			for (int j=i+1 ; j<metin.length();j++) {
				if(metin.charAt(i)==metin.charAt(j)) {
					tekrarEdenler.add(metin.charAt(i));
				}
				
			}if (!tekrarEdenler.contains(metin.charAt(i))) {
				tekrarEtmeyenler.add(metin.charAt(i));
			}
		}
			System.out.println(tekrarEdenler);
			System.out.println(tekrarEtmeyenler);
		

	}

}
