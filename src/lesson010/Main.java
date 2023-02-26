package lesson010;

public class Main {

	public static void main(String[] args) {
		
		
		Profile profil1= new Profile();
		profil1.foto= "resim.png";
		profil1.isim= "mehmet";
		profil1.kullaniciAdi= "mehmet123";
		System.out.println(profil1);
		//referansını gosterir
		System.out.println(profil1.isim);
		
		profil1.isim= "mehmet2";
		System.out.println(profil1.isim);
		
		System.out.println(profil1.postOlustur("resim2.png"));
		
	
		System.out.println(profil1.postSayisi);
		
		System.out.println(profil1.isim);
		profil1.profilIsminiGuncelle("Yasin");
		System.out.println(profil1.isim);
		
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
//		profil1.takipciCikar();
//		profil1.takipciCikar();
		System.out.println(profil1.maviTik);
		
		profil1.bilgileriGoster();
		
		System.out.println("\n***************\n");
		
		System.out.println(profil1.bilgileriGoster2());
		
		profil1.posts[0]= "resim3"; // String [] posts= {"resim3", "resim4" }
		profil1.posts[1]= "resim4";
		profil1.posts[2]= "resim5";
		profil1.posts[3]= "resim6";
		profil1.posts[4]= "resim7";
		
		System.out.println("Profil postları");
		
		for (int i=0;i<profil1.posts.length;i++) {
			if (profil1.posts[i] != null) {
				System.out.println(profil1.posts[i]);
			}
			for (String post: profil1.posts) {
				if (post != null) {
					System.out.println(post);
				}
			}
		}
		
		System.out.println("*************");
		profil1.postYazdir();
		
		
		
	
		
		

	}

}
