package lesson4;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		// kullanıcıdan e maıl password repassword alalım
		//e maili kontrol edeceğiz @hotmail.com , @outlook.com var mı ?
		//e mailiniz formata uygun değildir
		
		
		//password repassword
		//ikisi aynı değilse passwordler uyuşmuyo
		//password min 8 karakter olsun
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kullanıcı adı:");
		String mail2 = scanner.nextLine();
		if(mail2.contains("@hotmail.com") || mail2.contains("@outlook.com") )  {
			
		}
		
		System.out.println("\n*********\n");
		
		//Alternatif
		
//		boolean check = true ;
//		while(check) {
//			System.out.println("mail girin: ");
//			String mail = scanner.nextLine();
//			
//			
//			if (!(mail.contains("@hotmail.com"))|| (mail2.contains("@outlook.com") ) ) {
//				System.out.println("e mail formatına uygun değildir");
//			}else {
//				while(check2) {
//				System.out.println("şifrenizi girin: ");
//				String password =scanner.nextLine();
//					
//				System.out.println("tekrar şifrenizi girin: ");
//				String rePassword =scanner.nextLine();
//					if(password.equals(rePassword) && (password.length() >=8) ) {
//						System.out.println("Giriş yaptınız --");
//					}
//				}
//			}
//		
//		}
		
	}
}
