package maraton002.soru1;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MainSoru1 {


	static HashMap<String, String> rehber = new HashMap<>(); 
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		MainSoru1 main = new MainSoru1();
		
		main.textDosyasiniOkuma();
	
		String adSoyad = main.rehberSorgulamaOlustur(); 
		
		main.numarayiYazdir(adSoyad);

	}

	public void textDosyasiniOkuma() {
 
		MainSoru1 main = new MainSoru1();
		String textDosyasi = "rehber.txt";


		try (BufferedReader reader = new BufferedReader(new FileReader(textDosyasi))) {

			String s = null;
			while ((s = reader.readLine()) != null) {
				rehber.put(main.metniDuzelt(s)[0], main.metniDuzelt(s)[1]);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadı hatası");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}

	public String[] metniDuzelt(String string) {
		String[] strTemp = string.split(";");
		String[] str = { strTemp[0].trim(), strTemp[2].trim() };
		return str;
	}

	public String rehberSorgulamaOlustur() {
		System.out.print("Lütfen telefonunu aradığınız kişinin adını giriniz: ");
		String ad = scanner.nextLine().trim();
		System.out.print("Lütfen telefonunu aradığınız kişinin soyadını giriniz: ");
		String soyad = scanner.nextLine().trim();
		
		
		String	adSoyad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase() + " " + soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();
		

		return adSoyad;
	}

	public void numarayiYazdir(String key) {
		if (null == rehber.get(key)) {
			System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
		} else {
			System.out.println(key + " isimli kişinin telefon numarası: " + rehber.get(key));
		}
	}

}
