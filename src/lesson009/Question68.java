package lesson009;

public class Question68 {
	
	public static int sesliHarf(String str) {
	char []dizi = {'a', 'e','i','o' , 'u'};
	int sesliHarfSayisi=0;
	for(int i=0;i<str.length();i++) {
		for (int j=0;j<dizi.length;j++) {
			if(str.charAt(i)==dizi[j]) {
				sesliHarfSayisi++;
			}
		}
	}
		return sesliHarfSayisi;
	}
	
	public static void main(String[] args) {
		// Girilen kelimedeki sesli harklerin sayısını bulan methodu yazalım
		//method int dönsün marametre olarak String alacak

	}

}
