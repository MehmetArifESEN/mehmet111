package lesson009;

public class Question67 {
	
	public static int kacTaneKucuk (int[] array, int sayi) {
		
		if (array.length<0 || array.length>100) {
			System.out.println("array uzunlugu hatalı");
		}
		
		if(sayi<0||sayi>100) {
			System.out.println("sayi hatalı");
		}
		
		for (int number:array) {
			if(number<0||number>100) {
				System.out.println("arrayin elemanları hatalı");
			}
			
		}
		int sayac=0;
		for (int i=0 ; i<array.length; i++) {
			if(sayi>array[i]) {
				sayac++;
			}
		}
		
		
		return sayac;
	}

	public static void main(String[] args) {
		// Cosenio
		
		//girilen sayı arraydeki kac tane sayıdan buyuk oldugunu bulan metod
		//array uzunlugu 1 ile 100 arasında olacak
		// girilen sayı 1 ile 100 arasında olacak
		//arrayın ıcındekım sayılarda 1 ıle 100 arasında olcak
		//method ınt bır deger doncek
		
		int[] myNum = { 1, 3, 4, 6, 9 };
		//buyukleriSay(myNum,6); //--> 3
		//buyukleriSay(myNum,3); //--> 1
		
		System.out.println(kacTaneKucuk(myNum,7));

	}

}
