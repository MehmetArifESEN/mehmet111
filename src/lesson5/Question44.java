package lesson5;

import java.util.Arrays;

public class Question44 {

	public static void main(String[] args) {
		
		int[] sayilar = {-2,-4,10,5,4,5,-5} ;
		int count =0;
		for(int i =0;i<sayilar.length;i++) {
			if(sayilar[i]<0) {
				count ++;
			}
		}
		
		int[]negatifSayilar = new int [count];
		int index=0;
		for(int i=0; i<sayilar.length;i++) {
			if(sayilar[i]<0) {
				negatifSayilar[index++]= sayilar[i];
			}
		}
		for(int i :negatifSayilar) {
			System.out.println(i);
			
		}
//		System.out.println(Arrays.toString(negatifSayilar));

	}

}
