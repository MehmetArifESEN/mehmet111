package lesson010;

public class Profile {
	
	//attribute, property , field
	
	//gerekli attribute ları tanımlayalım
	
	public String isim;
	public int takipciSayisi;
	public int takip;
	public String foto;
	public String kullaniciAdi;
	public int postSayisi;
	public String [] posts = new String[10];
	public boolean maviTik =false;
	
	
	
	
	
	//post oluştur metodu
	// isim--> post oluşturdu desin
	public String postOlustur(String posts) {
		
		String metin= isim + " Yeni bir post oluşturdu!";
		this.postSayisi++;
		this.posts[postSayisi] = posts;
		
		return metin;
	}
	//profil ismini güncelle metodu
	//metod ısım alıcak ve ismini guncelleyecek
	
	public void profilIsminiGuncelle(String isim ) {
		this.isim=isim;
	}
	//gelen isteği kabul et metodu
	//takıpcı sayımız artacak
	public void istegiKabulEt() {
		this.takipciSayisi+=1;
		verifiedCheck();
	}
	public void takipciCikar() {
		this.takipciSayisi-=1;
		verifiedCheck();
	}
	
	//takipci satısı 5 ten fazla ise kullanıcıya mavitik verelim
	//maviTik
	
	public  void verifiedCheck() {
		if(this.takipciSayisi>5) {
			this.maviTik=true;
		}else {
			this.maviTik=false;
		}
	}
	
	//Bilgileri Göster
	//isim,takipci sayımız,mavitık,postSayisi
	public void bilgileriGoster() {
		System.out.println("İsim: " + isim + " Takipçi sayısı: " + takipciSayisi + " mavitik var mı: " + maviTik + " Post sayısı: " + postSayisi);
		
		
		
	}

	
	public String bilgileriGoster2() {
		return "Profile isim= " + isim + ", takipciSayisi= " + takipciSayisi + ", postSayisi= " + postSayisi
				+ ", maviTik= " + maviTik;
	}
	
	
	public void postYazdir() {
		for (String post: posts) {
			if (post != null) {
				System.out.println(post);
			}
		}
	}
	
	
	

}
