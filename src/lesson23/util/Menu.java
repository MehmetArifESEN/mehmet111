package lesson23.util;

import lesson23.entity.data.User;
import lesson23.service.AdminManager;
import lesson23.service.UserManager;

public class Menu {
	
	UserManager userManager;
	AdminManager adminManager;
	
	public Menu() {
		userManager =new UserManager();
		adminManager = new AdminManager();
	}
	
	public void menu() {
		System.out.println("1- Admin Menu");
		System.out.println("2- User işlemleri");
		System.out.println("3- Kayıt Ol");
		int key = Util.intDegerAlma("Yapmak istediğiniz işlem");
		switch (key) {
		case 1:
			adminMenu();
			break;
		case 2:
			userLogin();
			break;
			
		case 3:
			userManager.register();
			break;

		default:
			break;
		}
	}

	private void userLogin() {
		String mail = Util.stringDegerAl("Mail: ");
		String password =Util.stringDegerAl("Password: ");
		
		User user = userManager.userMailKontrol(mail);
		
		
		boolean kontrol = userManager.userSifreKontrol(password);
		if (user != null && kontrol) {
			userMenu(user);
		}
		
		//User user =new User(mail, password);
		//userMenu(user);
		
		
	}

	private void adminMenu() {
		System.out.println("1- Tüm kullanıcıları listele");
		System.out.println("2- Kullanıcıları aktif et");
		System.out.println("3- Aktif kullanıcıları listele");
		System.out.println("4- Onay bekleyen kullanıcıları listele");
		System.out.println("5- Ana Menu");
		int key = Util.intDegerAlma("Yapmak istediğiniz işlem");
		switch (key) {
		case 1:
			adminManager.getAll();
			
			break;
		case 2:
			adminManager.setActive();
			break;
		case 3:
			adminManager.getUserByActive();;
			break;
		case 4:
			adminManager.getUserByPending();
			break;

		default:
			break;
		}
		
	}
	
	private void userMenu(User user) {
		System.out.println("DM At");
		int key = Util.intDegerAlma("Yapmak istediğiniz işlem");
		switch (key) {
		case 1:
			System.out.println("DM atıldı" + user.getEmail());
			
			break;
		case 2:
		
			break;

		default:
			break;
		}
		
		
	}

}
