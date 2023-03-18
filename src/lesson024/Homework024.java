package lesson024;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Homework024 {
	
		//Toplam Satır Sayısı-->50 
		//Toplam Kelime Sayısı--> 273
		//toplam Karakter Sayısı--> 1593
		//En çok tekrar eden kelime--> kardaş
	
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		Homework024 main = new Homework024();
		
		
		main.satirSayisiHesabi();
		main.kelimeSayisiHesabi();
		main.karakterSayisiHesabi();
		main.enCokTekrarEdenKelime();

	}
	
	public void satirSayisiHesabi() {
		int satirSayisi = 0;
		
		try(BufferedReader reader = new BufferedReader(new FileReader("mars.txt"))) {
			String s = null;
			
			
				while((s=reader.readLine()) !=null) {
					satirSayisi++;
				}
			}catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Satır sayısı: " + satirSayisi);
		
	}
	
	public void karakterSayisiHesabi() {
		
		int karakterSayisi=0;
		
		try (Scanner scanner = new Scanner (new BufferedReader(new FileReader("mars.txt")))) {
			
			
			//Tum satırları nasıl okuruz?
			while(scanner.hasNextLine()) {
				String okunanSatir = scanner.nextLine();
				String[] array = okunanSatir.split(""); 
				karakterSayisi+= array.length;
				
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		}
		
		System.out.println("Karakter sayısı: " + karakterSayisi);
		
		
	}
	
	public void kelimeSayisiHesabi() {
		int kelimeSayisi = 0;
		
		try(BufferedReader reader = new BufferedReader(new FileReader("mars.txt"))) {
			String s = null;
			
			
				while((s=reader.readLine()) !=null) {
					String[] sWord = s.split(" ");
					kelimeSayisi+=sWord.length;
				}
			}catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Kelime sayısı: " + kelimeSayisi);
		
	}
	
	public void enCokTekrarEdenKelime() {
		
		HashMap<String, Integer> kelimeler = new HashMap<>(); 
		
		int maxKelime=0;
		String maxTekrar1=null;
		
		
		
		try(BufferedReader reader = new BufferedReader(new FileReader("mars.txt"))) {
			String s = null;
			
			
				while((s=reader.readLine()) !=null) {
					String[] sWord = s.split(" ");
					for (String kelime : sWord) {
						if(kelimeler.containsKey(kelime)) {
							kelimeler.put(kelime, kelimeler.get(kelime) + 1);
						} else {
							kelimeler.put(kelime, 1);
						}
					}
					
				}
			}catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for(String kelime:kelimeler.keySet()) {
			
			if(kelimeler.get(kelime) >=maxKelime && !kelime.equals("")) {
				maxKelime =kelimeler.get(kelime);
				maxTekrar1=kelime;
			}
			
			
			
		}
		
		System.out.println("En çok tekrarlanan kelime: " + maxTekrar1);
		
	}
	

}
