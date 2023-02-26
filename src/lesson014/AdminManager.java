package lesson014;

public class AdminManager {

	public void krediBasvurusunuOnayla(Account account) {

		if (account.isKrediBasvurusu()) {
			System.out.println("kredi basvurunuz oynaylanmıstır");
			account.setMoney(account.getMoney() + account.getIstenenKrediMiktari());
			account.setKrediBorcu(account.getIstenenKrediMiktari());
			account.setKrediAlindiMi(true);
			
			account.setKrediBasvurusu(false);
			account.setIstenenKrediMiktari(0);
		} else {
			System.err.println("kredi basvurunuz bulunmamaktadır!");
		}

	}

	public void krediBasvurusunuOnayla(User user) {
		// Kredi başvurusu var mı yok mu?
		 if (user.getAccount().isKrediBasvurusu()) {
		System.out.println("Kredi Başvurnuz Onaylanmıştır. ");
		user.getAccount().setMoney(user.getAccount().getMoney() + user.getAccount().getIstenenKrediMiktari());
		user.getAccount().setKrediBasvurusu(false);
		}else {
			
			System.out.println("kredi basvurunuz yoktur");
			
		}
	 }
	public void krediBasvurusunuReddet(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi Başvurnuz Reddedilmiştir. ");
			account.setKrediBasvurusu(false);
			account.setIstenenKrediMiktari(0);
		} else {
			System.out.println("Kredi Başvurusu Yok");
		}
	}

}
