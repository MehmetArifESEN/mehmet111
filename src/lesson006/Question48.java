package lesson006;

public class Question48 {

	public static void main(String[] args) {
		// Verilen 2 matristeki sayıları toplayan program
		//toplanan sayıları 2 ye 3 luk yenı bır matrıse atalım
		
		int[][] matris1 = {{5,6,2}, {9,1,6}};
		int[][] matris2 = {{3,4,1}, {1,3,6}};
		int[][] array = new int[2][3];
		
for (int i=0 ; i< array.length ; i++) {
			
			for (int j=0 ; j<array[i].length ; j++) {
               array[i][j]= matris1[i][j]+matris2[i][j];
               System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}


	}

}
