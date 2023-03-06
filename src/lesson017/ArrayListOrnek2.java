package lesson017;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListOrnek2 {
	public static void main(String[] args) {
		
		//1 tane cift sayilar
		//1 tane tek sayilar arraylisti acalım
		
		//1 den 100 e kadar 35 tane random sayı üretelim
		//üretilen sayılardan tekleri tekArrayListine
		//cifteride ciftArrayListine atalım
		
		ArrayList<Integer> teksayilar = new ArrayList<>();
		ArrayList<Integer> ciftsayilar = new ArrayList<>();
		
		for (int i = 0; i < 35; i++) {
			Random random = new Random();
			int sayi = random.nextInt(0,101);
			if(sayi%2== 0) {
				
			}
			
		}
		
	}

}
