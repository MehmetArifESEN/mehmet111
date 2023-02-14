package maraton001;

public class SinavMaraton02 {

	public static void main(String[] args) {
		int sayiDizisi[] = {1,3,6,7,3,3,3,4,8,9};
		tekrarSayi(sayiDizisi);

	}
	public static void  tekrarSayi(int[] array) {
		int sayac=1;
		for(int i = 0; i < array.length; i++) {  
			if (sayac!=1) {
				System.out.println(array[i-1] + " sayısı " + sayac + " kez tekrar ediyor.");
				break;
				
			}
            for(int j = i + 1; j < array.length; j++) {  
                if(array[i] == array[j])  
                   sayac++;  
            }  
             
        }
		if (sayac==1) {
       	 System.out.println("Tekrar eden sayı yoktur");
       	
       }
		 
		
	}

}
