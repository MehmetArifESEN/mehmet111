package lesson006;import java.lang.reflect.Array;

public class Question52 {

	public static void main(String[] args) {
		// verilen 2 arrayde tekrar eden sayıları bulalım
		int array1[] = { 50, 60, 3, 4, 3, 9, 8 ,7, 45, 95};
		int array2[] = { 1, 2, 50, 60, 3, 8, 9, 7,88,95 };
		
		for(int i=0; i<array1.length ;i++) {
			for(int j =0; j<array2.length;j++) {
				if (array1[i]==array2[j]) {
					System.out.print(array1[i] + " ");
				}
			}
		}

	}

}
