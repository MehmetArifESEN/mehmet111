package lesson018;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;;

public class MapOrnek2 {

	public static void main(String[] args) {
		
		String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
		int[] notlar = { 60, 80, 70 };
		
		HashMap <String, Integer> notMap = new HashMap<String ,Integer>();
		// Linked Hashmapı arastır
		//Nasıl calısıyor
		for (int i =0; i<ogrenci.length; i++) {
			notMap.put(ogrenci[i], notlar[i]);
			
		}
		System.out.println(notMap);
		
		for (java.util.Map.Entry<String, Integer> entry  :  notMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		
		}
		
		//2
		//Her ogrencının 3 notu olacak
		HashMap <String, int[]> map2 = new HashMap<String ,int[]>();
		int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };
		
		for (int i = 0; i < notlar2.length; i++) {
			map2.put(ogrenci[i], notlar2[i]);
			
		}
		System.out.println(map2);
		
		for ( java.util.Map.Entry<String, int[]> entry : map2.entrySet()) {
			System.out.println(entry.getKey());
			for(int i=0 ; i<entry.getValue().length; i++) {
			System.out.println(entry.getValue()[i] + " ");
			}
		
		}
		
		//3
		//Ayse, notlarListesi
		//Ayse 50 50 60
		System.out.println("*****************************");
		HashMap <String, List<Integer>> map3= new HashMap<>();
		int[][] notlar3 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };
		for (int i=0; i<notlar3.length; i++) {
			
			List<Integer> listNotlar = new ArrayList<>();
			for (int j=0 ; j<notlar3[i].length;j++) {
				listNotlar.add(notlar3[i][j]);
			}
			map3.put(ogrenci[i], listNotlar);
		}
		
		System.out.println(map3);
		
		
		
		
		
		
		

	}

}
