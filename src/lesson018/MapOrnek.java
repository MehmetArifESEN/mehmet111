package lesson018;

import java.util.HashMap;
import java.util.Scanner;

public class MapOrnek {

	public static void main(String[] args) {
		// character ve ınt tutan bır map olusruyacagoz
		//Kullanıcıdan bır kelıme alalım
		//ve gırılen kelımede hangı harften kac tane var onu yazdıralım
		
		//selamm
		//s-1
		//e-1
		//m-2
		
		HashMap <Character, Integer  > hashMap = new HashMap<Character ,Integer >();
		Scanner scanner = new Scanner(System.in);
		
		String metin =scanner.nextLine();
		
		for (int i = 0; i < metin.length(); i++) {
			char c= metin.charAt(i);
			if(hashMap.containsKey(c)) {
				hashMap.put(c,hashMap.get(c) + 1);
			}else {
				hashMap.put(c, 1);
			}
			
		}
		
		//System.out.println(hashMap);
		for (Character ch : hashMap.keySet()) {
			System.out.println(ch + " -" + hashMap.get(ch));
			
		}

	}

}
