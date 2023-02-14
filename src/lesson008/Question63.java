package lesson008;

public class Question63 {

	public static void main(String[] args) {
		// parametre oalrak iki tane array alan
		// ve aldıgı arraylerı toplayıp farklı bır arrayın ıcınde saklayan metod
		
		//toplamları yazıdırıcaz
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		int[] array2 = { 1, 2, 3, 4, 5, 6 };
		
		int [] toplam = arrayToplam(array1, array2);
		
		for(int i =0 ; i<array2.length;i++) {
			System.out.println(toplam[i] + " ");
		}

	}
	
 	public static int[]  arrayToplam(int[] array1 ,int [] array2) {
 		
 		int [] toplam = new int[array1.length];
 		for (int i=0; i<array1.length; i++) {
 			toplam[i] = array1[i] + array2 [i];
 		}
 		return toplam;
 		
 	
 	}

}
