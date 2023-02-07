package lesson006;

public class Question49 {

	public static void main(String[] args) {
		// tek sayıları farklı bbır arrayın ıcıne atalım
		int[][] matris= {
				{ 56, 23, 678, 231, 5 },
				 { 234, 21, 78, 26, 6 },
				 { 654, 33, 32, 67, 2 },
				 { 189, 35, 56, 89, 8 }, };
		
		int[][] array = new int[4][5];
for (int i=0 ; i< array.length ; i++) {
			
			for (int j=0 ; j<array[i].length ; j++) {
               if (matris[i][j] % 2 !=0 ) {
            	   array[i][j]=matris[i][j];
            	   matris[i][j]=0;
               }
              System.out.print(array[i][j] + "  ");

			}
			System.out.println();
		}

		}
}
	


