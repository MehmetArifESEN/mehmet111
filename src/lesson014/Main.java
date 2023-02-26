package lesson014;

public class Main {

	public static void main(String[] args) {
		//Account sınıfınmız olsun attrıbutelerı
		// anccount no , money
		
		//paraYaitr(); para eklenecek
		//paraCekMetodu(); para dusecek
		
		//Para yatir() cıktısı 100 yl taırdınız guncel bakıyenız 100
		
		AccountManager accountManager = new AccountManager();
		AdminManager adminManager = new AdminManager();
		Account account = new Account();
		account.setAccountNo("55446611");
		account.setMoney(500);
		Account account3 = new Account();
		//Account account2 = new Account("9889741" , 600);
		
//		account.withdrawMoney(100);
//		account.withdrawMoney(100);
//		account.withdrawMoney(100);
//		account.withdrawMoney(100);
//		account.withdrawMoney(100);
//		account.withdrawMoney(100);
//		account.depositMoney(500);
//		account.depositMoney(50000);
		
		
		//AccountManager sınıfı oluşturalım
		//Metodları AccountManager kısmına taşıyalım
		
		
		accountManager.depositMoney(account, 200);
		accountManager.withdrawMoney(account, 200);
		accountManager.withdrawMoney(account, 550);
		
		//AccountManager sınıfında bilgileri goster metodu yazalım
		//hesap no ve guncel bakiye
		
		//User sınıfı oluşturalım
		//Name surname , mail , account
		//mainde user oluştururken bırde accountu verelim
		
		
		//Kullanıcıdan adıgımız name ve surname degerı ıle otomatıık maıl olusturacagız
		//X banka
		//name.surname@xbanka.com
		
		//Account olarka bir kredi başvurusunda bulunalım
		//krediyi çekecegi accountu ve ne kadar kredı ıstıyorsa mıkratı bleırtsın
		
		//private boolean krediBasvurusu
		//private int istenenKrediMiktari
		
		//AdminManager sınıfı olusturaım
		//Kredi basvurusu onayla;
		//kredi basvurusunun olması lazım
		//bızım hesabımızı cekmek ıstedıgımız kadar kredı mıktarı hesabımızza dussun
		
		//krediBorcunuOde();
		//dışarıdan nakit odeme
		//eger userın cekmıs oldugu kredı yoksa veya kredı basvurusu reddeıdlmısse işeminizi gercklestıremıyoruz
		//cekilmis kredi varsa parametre olarak gıtıdgımız mıkrat kadar odeme yapmıs olalım ve kredı kartı borcundan dusulsun
		
		//----
		//hesaptanKrediBorcunuOde();
		accountManager.showInformation(account);
		accountManager.showInformation(new Account("9889741" , 600));
		
		
		User user1= new User("Ali" , "Kaya" , "alikaya@hotmail.com" , account);
		System.out.println(user1.getAccount().getMoney());
		
		User user2 = new User();
		user2.setEmail("asd@gmail.com");
		user2.setName("mehmet");
		user2.setName("Kaya");
		user2.setAccount(account);
		System.out.println(user2.getAccount().getMoney() + " " + user2.getEmail());
		UserManager userManager= new UserManager();
		User user3 =new User();
		userManager.createEmail(user3);
		System.out.println(account.isKrediBasvurusu());
		userManager.krediBasvurusundaBulun(account, 10000);
		System.out.println(account.isKrediBasvurusu());
		System.out.println(user1.getAccount().isKrediBasvurusu());
		adminManager.krediBasvurusunuOnayla(account);
		System.out.println(user1.getAccount().getMoney());
		adminManager.krediBasvurusunuOnayla(account);
		user3.setAccount(account3);
		System.out.println(account3.getMoney());
		userManager.krediBasvurusundaBulun(account3, 25000);
		adminManager.krediBasvurusunuOnayla(account3);
		//adminManager.krediBasvurusunuReddet(account3);
		accountManager.showInformation(account3);
		userManager.krediBorcuOde(account3, 5000);
		userManager.krediBorcuOde(account3, 15000);
		userManager.krediBorcuOde(account3, 5000);
		userManager.krediBorcuOde(account3, 100);
		System.out.println(account3.getKrediBorcu());
		System.out.println(account3.getMoney());
		userManager.hesaptanKrediBorcunuOde(account3, 500);
		System.out.println(account3.getMoney());
		
		
		System.out.println("*****************");
		
		

	}

	

}
