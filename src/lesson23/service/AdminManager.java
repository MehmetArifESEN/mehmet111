package lesson23.service;

import lesson23.entity.data.User;
import lesson23.entity.database.DataBase;
import lesson23.entity.enums.EStatus;
import lesson23.util.Util;

public class AdminManager {
	
	
	public void getAll() {
		for(User user: DataBase.getUserList()) {
			System.out.println(user);
		}
		//DataBase.getUserList().forEach(user-> System.out.println(user.toString()));
	}
	
	public void getUserByActive() {
		System.out.println("Aktive edilmiş kullanıcılar...");
		for(User user: DataBase.getUserList()) {
			if(user.geteStatus()==EStatus.ACTIVE) {
				System.out.println(user);
			}
			
		}
		//DataBase.getUserList().forEach(user-> System.out.println(user.toString()));
	}
	
	public void getUserByPending() {
		System.out.println("Onay bekleyen kullanıcılar...");
		for(User user: DataBase.getUserList()) {
			if(user.geteStatus()==EStatus.PENDING) {
				System.out.println(user);
			}
		}
		//DataBase.getUserList().forEach(user-> System.out.println(user.toString()));
	}
	
	private User userIdKontrol(String id) {
		for (int i = 0; i < DataBase.getUserList().size(); i++) {
			if (DataBase.getUserList().get(i).getEmail().equals(id)) {
				return DataBase.getUserList().get(i);
			}
		}
		System.out.println("User Bulunamadı");
		return null;
	}
	
	public void setActive() {
		//kimi aktive edicez
		
		String id = Util.stringDegerAl("aktive etmek istediğiniz kullanıcının ID'si: " );
		User user = userIdKontrol(id);
		if(user!= null) {
			user.seteStatus(EStatus.ACTIVE);
		} 
	}

}
