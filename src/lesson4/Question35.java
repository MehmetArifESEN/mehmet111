package lesson4;

public class Question35 {

	public static void main(String[] args) {
		// Java,Spring,postgre,React vigullerden ayırıp asagı dogru yaz
		
		String text ="Java,Spring,Postgre,React";
		String[] programlar = text.split(","); 
		for (int i=0 ;i<4; i++) {
			System.out.println(programlar[i]);
			
		}
		
		System.out.println("**********\n");
		
		//Alternatif
		String stringText ="Java,Spring,Postgre,React";
		int index=0;
		
		for (int i =0;i< stringText.length();i++) {
			if(stringText.charAt(i)== ',') {
				System.out.println(stringText.substring(index,i));
				//index = 0 ,i= 4
				index = i+1;
			}
		}
		System.out.println(stringText.substring(index));

	}

}
