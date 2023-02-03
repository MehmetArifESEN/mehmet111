package lesson5;

import java.util.Scanner;

public class HomeworkDizi {

	public static void main(String[] args) {
		// 2 ve 4 kaç kere gecıyor
		//hangisi daha falza
		
		//output--> 4 ler 2 lerden daha fazla dizinin içerisinde 4 tane 4 var
		int[] array = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8 };
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Lütfen ilk sorgulamak istediğiniz sayıyı giriniz");
		int num1=scanner.nextInt();
		System.out.println("Lütfen ikinci sorgulamak istediğiniz sayıyı giriniz");
		int num2=scanner.nextInt();
		
		int sayac2=0;
		int sayac4=0;
		
		for(int i =0; i<array.length;i++ ) {
			if(array[i]==num1) {
				sayac2++;
			}else if (array[i]==num2) {
				sayac4++;
			}
		}
		System.out.println(sayac2 + " tane " +  num1 +" var."  );
		System.out.println(sayac4 +  " tane " +  num2 +" var."  );
		
		if(sayac4>sayac2) {
			System.out.println(num2 + "ler daha fazla");
		}else if (sayac2>sayac4) {
			System.out.println(num1 +  " ler daha fazla");
		}


	}

}
