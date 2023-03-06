package lesson016.InterfaceUygulama;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Util {
	
	public static String stringDegerAl(String string) {
		Scanner scanner =new Scanner(System.in);
		System.out.println(string);
		String metin= scanner.nextLine();
		return metin;
		
	}
	
	public static int intDegerAl(String sorgu) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("SAyi giriniz");
		boolean kontrol = false;
		int deger = 0;
		do {
			try {
				deger = Integer.parseInt(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println("Lütfen bir rakam değeri giriniz");
				kontrol =true;
			}
			
		} while (kontrol);
		return deger;
	}
	
	public static LocalDate stringTarih() {
		boolean kontrol  = false;
		int deger = 0;
		final DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd-MMM-yyy");
		LocalDate date = null;
		
		
		do {
			try {
				date = LocalDate.parse("2016-10-10");
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (kontrol);
		return null;
	}
	
	//How to convert string to localDate
	//Kullanıcıdan string olarak tarih alcaz (Yıl-Ay-Gun) aldıgımız degerı localDate ee cevırcez
	//Yanlsı formatatta hata fırlatalım
 	
	

}
