package lesson002;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		//girilen 3 sayıyı buyukten kucuge sıralayan program
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Birinci sayıyı giriniz");
		int sayi1= scanner.nextInt();

		System.out.println("ikinci sayıyı giriniz");
		int sayi2= scanner.nextInt();
		
		System.out.println("üçüncü sayıyı giriniz");
		int sayi3= scanner.nextInt();
		
		if(sayi1<=sayi2) {
			if(sayi2<=sayi3) {
				System.out.println("sayi3>sayi2>sayi1");
			}else if(sayi3<=sayi1 ) {
				System.out.println("sayi2>sayi1>sayi3");
			}else if (sayi1<sayi3) {
				System.out.println("sayi2>sayi3>sayi1");
			}
		}
//		if (sayi2<sayi1) {
//			if(sayi3 <=sayi2) {
//				System.out.println("sayi1>sayi2>sayi3");
//			}else if(sayi3<=sayi1) {
//				System.out.println("sayi1>sayi3>sayi2");
//			}else if(sayi1)
//		}
	
	}

}
