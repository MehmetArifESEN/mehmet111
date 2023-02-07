package lesson006;

import java.util.Scanner;

public class Question47 {

	public static void main(String[] args) {
		// ikiye ikilik bir arry oluşturalım
		//bu arrayın ıcıne ısımler yazdıracagız
		//isimleri kullanıcıdan alacagız
		//cıktı oalrak
		//1. grup
		// ali 
		//mehmet
		//2, grup 
		//ahmet
		//hakan
		
		
		
		String[][] grupListe = new String [2][2];
		Scanner scanner = new Scanner(System.in);
		for (int i=0 ; i< grupListe.length ; i++) {
			
			for (int j=0 ; j<grupListe[i].length ; j++) {
				
				System.out.println("isim: ");
				String isim = scanner.nextLine();
				grupListe[i][j] = isim;
			}
		}
		for(int i=0;i<grupListe.length;i++) {
			System.out.println(i+1 + ". Grup");
			for (int j=0; j<grupListe[i].length;j++) {
				System.out.println(grupListe[i][j]);
			}
		}
		
		
		

	}

}
