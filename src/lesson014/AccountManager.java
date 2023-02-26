package lesson014;

public class AccountManager {
	
	
	public void depositMoney(Account account ,int money) {
		if (money>0 && money<= 10000) {
			account.setMoney(account.getMoney()+money);
			System.out.println(money + " para hesaba yatırıldı guncel bakiyeniz " + account.getMoney());
		} else {
			System.err.println("sadece 1 ile 10000 Tl arasında işkem ypaabılırısnız");
		}
	}
	public void withdrawMoney (Account account ,int money) {
		if (money>account.getMoney()) {
			System.err.println("Yetersiz bakiye");
		} else {
			account.setMoney(account.getMoney()-money);
			System.out.println(money + " para hesaptan çekildi guncel bakiyeniz " + account.getMoney());
		}
	}
	
	public void showInformation(Account account) {
		System.out.println(account.getAccountNo() + " nolu hesabınızdaki güncel bakiyeniz: " + account.getMoney() );
	}

}
