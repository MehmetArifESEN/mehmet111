package lesson017;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOrnek {

	public static void main(String[] args) {
		//Bir atane array list olusturalım
		//bu arraylistin içine manuel şehir atalım
		//bu şehirlerden an ile başlayan varsa
		//bu şehri "xxx";
		
		List <String> sehirler1=new ArrayList <String>();
		sehirler1.add("ankara");
		sehirler1.add("bursa");
		sehirler1.add("eskisehir");
		sehirler1.add("antalya");
		
//		for (String string : sehirler) {
//			if(string.toLowerCase().startsWith("an")) {
//				string ="xxx";
//			}
//			System.out.println(string);
//		}
		degerDegistirme(sehirler1);

	}
	
	public static void degerDegistirme(List<String> sehirler) {
		for (String string : sehirler) {
			if(string.toLowerCase().startsWith("an")) {
				string ="xxx";
			}
			System.out.println(string);
		}
	}

}
