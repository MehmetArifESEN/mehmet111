package lesson022;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiOrnek2 {
	
	
			//User sınıfı oluşturalım
			// id ve name
			//toString yazalım
			//bilgileriGoster methodu olsun
			//mainde users diye liste oluşturalım
			//bu lısteye bır kac tane user atalım

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		users.add(new User("Ahmet" , 1));
		users.add(new User("aslı" , 2));
		users.add(new User("zeynep" , 4));
		users.add(new User("deniz" , 5));
		users.add(new User("mehmet" , 6));
		users.add(new User("Ahmet" , 8));
		
		users.stream().forEach(user -> System.out.println(user.toString()));
		users.stream().forEach(user ->user.bilgileriGoster());
		
		//id si 3 ten buyuk olanları bır lısteye atalım
		//ve bu lıste ıcındekı userların bılgılerını goster methodu yazdıralım
		
		List<User> uctenBuyukUser = users.stream().filter(user-> user.getId()>=3).collect(Collectors.toList());
		uctenBuyukUser.forEach(user-> user.bilgileriGoster());
		
		//id si 3 ten kucuklerı set alalım
		System.out.println("3 ten kucukler");
		Set<User> uctenKucukler = users.stream().filter(user-> user.getId()<3).collect(Collectors.toSet());
		uctenKucukler.forEach(User::bilgileriGoster);
		//How to convert list to set
		
		//ismi ahmet olanları lsıteye atalım
		List<User> ahmetler = users.stream().filter(user-> user.getName().equals("Ahmet")).toList();
		ahmetler.forEach(User::bilgileriGoster);
		
		//Her bir user için yeni bir user nesnesı olusturalım
		//parametre olarak ID ve isimlerini alsınlar ve isimlerinin sonuna "!!" ekleyelım
		//Yeni listede yazdıralımq
		

	}

}
