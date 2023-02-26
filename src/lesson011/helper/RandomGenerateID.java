package lesson011.helper;

import java.util.Random;

import lesson011.Product;

public class RandomGenerateID {
	
	public static String randomOlustur () {
		Random random = new Random();
		long sayi = random.nextLong(100000,999999);
		String s=Long.toString(sayi);
		return s;
		
		
	}
	public static String randomGenerateCode(String name) {
		Random random = new Random();
		int sayi = random.nextInt(100,999);
		String code=name.substring(0,3) + Integer.toString(sayi);
		return code;
		
		
	}
	//String buılderlı cozum
//	public static String generateProductCode(String productName) {Random random = new Random();StringBuilder sb = new StringBuilder();sb.append(productName.substring(0,3));sb.append(Integer.toString(random.nextInt(100,1000)));return sb.toString();}
	
}
