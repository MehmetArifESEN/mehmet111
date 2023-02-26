package lesson014;

import java.util.Scanner;

public class UserManager {
	
	private final static String emailFormat="@xbanka.com";
	
	public void createEmail(User user) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Adınız: ");
		user.setName(scanner.nextLine());
		System.out.println("Soyadınız: ");
		user.setSurname(scanner.nextLine());
		
		user.setEmail(user.getName().toLowerCase().replace(" ", ".")+"."+user.getSurname()+emailFormat);
		System.out.println(user.getEmail());
		
		
	}
	
	public void generetaAutoEmail(User user) {
		user.setEmail(
		 user.getName()
		 .toLowerCase().replace(" ", ".") +'.' +
		 user.getSurname().toLowerCase() + emailFormat );
		}
	
	public void otomatikEmailOlustur(User user) {
		String otomatikOlusanEmail = user.getName().toLowerCase().replaceAll(" ", (".")).concat("." + user.getSurname().toLowerCase().replace(' ', ('.'))) + emailFormat;
		
		
		user.setEmail(otomatikOlusanEmail);
		
	}
	
	public void krediBasvurusundaBulun(Account account , int para) {
		
		account.setKrediBasvurusu(true);
		account.setIstenenKrediMiktari(para);
		
		System.out.println(para + " Değerinde kredi basvurusu yaptınız");
		System.out.println("Lütfen onay bekleyin.");
		
		
		
	}
	
	public void krediBorcuOde(Account account, int taksit) {
		if (account.isKrediAlindiMi()) {
			if(account.getKrediBorcu()<taksit) {
				System.out.println("Kart borcunuz yatırılan mıktardan fazla");
			}
			account.setKrediBorcu(account.getKrediBorcu()-taksit);
			System.out.println(taksit + "kadar ucret odemenız gerceklestı.Guncel borcunuz" + account.getKrediBorcu());
		}  else {
	System.out.println("Kredi Borcunu Bulunmamakta");
		}
		
	}
	
	public void hesaptanKrediBorcunuOde(Account account , int taksit) {
		if(account.isKrediAlindiMi()) {
		if(account.getMoney()>= taksit) {
			account.setKrediBorcu(account.getKrediBorcu()-taksit);
			account.setMoney(account.getMoney()-taksit);
			System.out.println(taksit + "Hesaptan odeme yaptınız guncel borcunuz: " + account.getKrediBorcu());
			System.out.println("Hesabınızdaki bakiye: " + account.getMoney());
		} else {
			System.out.println("Bakiyeniz yetersiz");
		}
		}else {
			
		}
	}

}
