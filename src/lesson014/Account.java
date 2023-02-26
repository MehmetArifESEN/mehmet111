package lesson014;

import java.util.Random;
import java.util.Scanner;

public class Account {
	
	private String accountNo;
	private int money;
	private boolean krediBasvurusu;
	private int istenenKrediMiktari;
	private int krediBorcu;
	private boolean krediAlindiMi;
	
	
	public Account () {
		
	}
	
	
	public Account(String accountNo, int money) {
		super();
		this.accountNo = accountNo;
		this.money = money;
	}
	
	private String randomAccountNo() {
		Random random = new Random();
		Long sayi = random.nextLong(1000, 5000);
		String accountNo =String.valueOf(sayi);
		return accountNo;
	}


//	public void depositMoney(int money) {
//		if (money>0 && money<= 10000) {
//			this.setMoney(this.getMoney()+money);
//			System.out.println(money + " para hesaba yatırıldı guncel bakiyeniz " + this.getMoney());
//		} else {
//			System.err.println("sadece 1 ile 10000 Tl arasında işkem ypaabılırısnız");
//		}
//	}
//	
//	public void withdrawMoney (int money) {
//		if (money>this.getMoney()) {
//			System.err.println("Yetersiz bakiye");
//		} else {
//			this.setMoney(this.getMoney()-money);
//			System.out.println(money + " para hesaptan çekildi guncel bakiyeniz " + this.getMoney());
//		}
//	}
	
//	public void paraYatir() {
//		Scanner scanner =  new Scanner(System.in);
//		System.out.println("İşlem ypamak istediğiniz hesabın numarasını giriniz");
//		accountNo=scanner.nextLine();
//		System.out.println("Yatırmak istediğiniz para miktarını giriniz");
//		money=Integer.valueOf(scanner.nextLine());
//		if(money>10000) {
//			System.out.println("Tek seferde bu kadar yüksek para yatıramazsınız");
//		} else {
//			balance= balance+ money;
//		}
//		
//		
//	}
//	
//	public void paraCek() {
//		Scanner scanner =  new Scanner(System.in);
//		System.out.println("İşlem ypamak istediğiniz hesabın numarasını giriniz");
//		accountNo=scanner.nextLine();
//		System.out.println("Çekmek istediğiniz para miktarını giriniz");
//		money=Integer.valueOf(scanner.nextLine());
//		if(money>balance) {
//			System.out.println("Yeterli bakiye yoktur");
//		} else {
//			balance= balance- money;
//		}
//	}
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}


	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}


	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}


	public int getIstenenKrediMiktari() {
		return istenenKrediMiktari;
	}


	public void setIstenenKrediMiktari(int istenenKrediMiktari) {
		this.istenenKrediMiktari = istenenKrediMiktari;
	}

	public int getKrediBorcu() {
		return krediBorcu;
	}

	public void setKrediBorcu(int krediBorcu) {
		this.krediBorcu = krediBorcu;
	}

	public boolean isKrediAlindiMi() {
		return krediAlindiMi;
	}

	public void setKrediAlindiMi(boolean krediAlindiMi) {
		this.krediAlindiMi = krediAlindiMi;
	}
	
	
	
	

}
