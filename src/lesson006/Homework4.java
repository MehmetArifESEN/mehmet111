package lesson006;

public class Homework4 {

	public static void main(String[] args) {
		
		int array1[] = { 50, 60, 3, 4, 3, 9, 8 ,7, 45, 95};
		int array2[] = { 1, 2, 50,50, 60, 3, 8, 9, 7,88,95 };
		int array3[] = new int[array1.length] ;
		
		int index= 0;
		for (int i=0;i<array1.length;i++) {
			for (int j =0; j<array2.length;j++) {
				
				if(array1[i] == array2[j]) {
					boolean isFind=false;
					for (int k= 0 ; k<array3.length; k++) {
						if(array3[k]==array1[i]) {
							isFind=true;
						}
					}
					if(isFind==false) {
					array3[index] = array1[i];
					index++;
					
					break;
					}
				}
			}
		}
		for (int i=0 ; i<index; i++) {
			System.out.print(array3[i] + " ");
		}
		

	}

}
