package lesson008;

import java.util.Scanner;

public class Question62 {
	
	public static void  mailControl(String mail) {
		
		if (mail.indexOf("@")==-1) {
			
			System.out.println("Lütfen mailinizi kontrol ediniz");
		}
		else if(mail.contains("hotmail.com") || mail.contains("gmail.com") )  {
			
			System.out.println("Mailiniz onaylandı");
		}else {
			System.out.println("Lütfen mailinizi kontrol ediniz");
		}
		
	}
	
	public static boolean passwordKontrol(String password, String rePassword) {
		boolean check1 = true;
		
		if (password.equals(rePassword)) {
			
		} else {
			check1 = false;
		}
		return check1;
	}
	
//	public static void login () {
//		if (passwordKontrol("asd", "klm") && mailControl(mail)) {
//			System.out.println("giriş yaptınız");
//		}
//		else {
//			System.out.println("bilgiler yanlış");
//		}
//	}

	public static void main(String[] args) {
		// 2 metot yazcaz
		//1- kullanıcıdan aldıdıgımız e maıl degerını kontrol edelım dogru formatta mı dıye
		//@ var mı
		// eger varsa hotmail. com mu gmail.com mu
		
		//password ve repassword bunların uyusup uyusmadıgını kontrol edınız
		
		System.out.println("Mail giriniz");
		Scanner scanner= new Scanner(System.in);
		String mail= scanner.nextLine();
		mailControl(mail);
		passwordKontrol("asd", "klm");
		
		

		
	}

}
