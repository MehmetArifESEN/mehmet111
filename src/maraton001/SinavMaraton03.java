package maraton001;

public class SinavMaraton03 {

	public static void main(String[] args) {
		karakterSayici("Bugün hava çok güzel" , 'g');
		

	}
	public static int karakterSayici(String kelime , char c) {
		int sayac=0;
		String kelime1 = kelime.toLowerCase();
	
			for(int i=0;i<kelime1.length(); i++) {
				if(kelime1.charAt(i)== c) {
					sayac++;
					
				}
			}
			
			System.out.println(sayac);
		return sayac;
	}

}
