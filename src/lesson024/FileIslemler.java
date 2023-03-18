package lesson024;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIslemler {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		int secim;
		
		do {
			
			menuyuGoster();
			secim = Integer.parseInt(scanner.nextLine());
			
			
			switch (secim) {
			case 1:
				try {
					dosyaOlustur(FileSabitler.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					metinYaz(FileSabitler.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				
				try {
					metniOku(FileSabitler.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				break;
			case 4:
	
				break;
		
			default:
				break;
			}
			
		} while (secim!=0);
	}
	
	
		
		
	
	public static void menuyuGoster() {
		System.out.println("0- Çıkış");
		System.out.println("1- Dosya Yarat");
		System.out.println("2- Ekle");
		System.out.println("3- Okuma");
		System.out.println("4-Dosya Silme");
		System.out.println("Lütfen işlem seçiniz...");
	}
	
	public static void dosyaOlustur(File file) throws Exception {
		if (file.exists()) {
			throw new Exception("Bu dosya onceden olusturulmustur");
			
		} else {
			System.out.println("dosya olusturuluyor");
			file.createNewFile();
		}
		
//		try {
//			FileWriter file = new FileWriter(FileSabitler.file);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	}
	
	public static void metinYaz(File file) throws Exception {
		if (file.exists()) {
			FileWriter fileWriter = null ;
			System.out.println("Eklemek istediğiniz metni giriniz");
			String text = scanner.nextLine();
			try {
				fileWriter = new FileWriter (file , true);
				
				fileWriter.write(text + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				fileWriter.close();
			}
			
		} else {
			throw new Exception("Dosya bulunamadı");
		}
	}
	
	public static void metniOku(File file) throws Exception {
		if (file.exists()) {
			FileReader fileReader = null;
			String text = null;
			char char2;
			try {
				fileReader = new FileReader(file);
				for(int i = 0; i<fileReader.read()-1; i++) {
					char2=(char)i;
					text+= char2 + "\n";
					System.out.println(text);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				fileReader.close();
			}
			
			
		}  else {
			throw new Exception("Dosya bulunamadı");
		}
	}

}
