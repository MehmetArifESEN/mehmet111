package lesson011;

import java.util.Scanner;

import lesson011.helper.RandomGenerateID;

public class Main {

	public static void main(String[] args) {
		//Product sınıfı oluşturalım
		//id,price,name,stock
		//bilgileri goster metodu yazaım
		
		//degiskenler private
		//bir de boş construcyor metodu
		
		//veri tabanına kaydet --> ürün ismi + veritabanına kaydedildi
		//ürünü güncelle --> ismini guncelle parametre oalrak stıng name
		
		//Farklı paket açalım
		//o paketin içinde bir class oluşturup içinde random id oluşturacak bir metot yazalım
		//sonrasında ben her  product nesnesı oluşturdugumda  otomatık oalrak sid si oluşmus olsun
		
		
		//Sepet Sınıfı oluşturalım
		//products,total price
		
		//produckt ekle metodu
		//değerleri kullancıcadn alalım
		//aldıgımız degerler ıle product oluşturaccagız
		
		Product product1 = new Product();
		product1.setName("Asus");
		product1.bilgileriGoster();
		product1.setStock(100);
		product1.setPrice(15000);
		
		product1.bilgileriGoster();
		
		Product product2 = new Product("apple"  , 100 , 20000);
		product2.bilgileriGoster();
		
		product2.urunuGuncelle("apple2");
		product2.bilgileriGoster();
		product2.veriTabanınaKaydet("apple2");
		
		
		System.out.println("***********");
		Sepet sepet1 = new Sepet();
		System.out.println(sepet1.getIndex());
		sepet1.sepeteEkle(product2);
		System.out.println(sepet1.getIndex());
		System.out.println("***********");
		
		Sepet sepet2 = new Sepet();
		System.out.println(product2.getStock());
		System.out.println(sepet2.getTotalPrice());
		sepet2.sepeteEkle(product2);
		sepet2.sepeteEkle(product2);
		sepet2.sepeteEkle(product2);
		sepet2.sepeteEkle(product1);
		sepet2.sepeteEkle(product2);
		sepet2.sepeteEkle(product2);
		System.out.println(product2.getStock());
		System.out.println(sepet2.getTotalPrice());

		System.out.println(sepet2.getIndex());
		
		System.out.println("***************");
		Product product3 = new Product();
		System.out.println(product3.isActive());
		product3.setName("HP");
		product3.gosterimdenKaldir(product3);
		System.out.println(product3.getStock());
		
		sepet2.sepettekiUrunleriGoster();
		
		Product product4 = productEkle();
		product4.bilgileriGoster();
		sepeteEkle(product4);
	
		
		

	}
	
	public static Product productEkle() {
		System.out.println("yuklemek ıstedııgnız urunu yazınız ");
		Scanner scanner= new Scanner(System.in);
		
		Product product =new Product();
		String name = scanner.nextLine();
		
		System.out.println("Ürünün fiyatı nedir ?");
		int price = scanner.nextInt();
		System.out.println("üründe kaç stok var");
		int stock = scanner.nextInt();
		
		String code = RandomGenerateID.randomGenerateCode(name);
		product.setCode(code);
		product.setName(name);
		product.setPrice(price);
		product.setStock(stock);
		System.out.println("Ürün başaıryla oluşturuldu ID si " + product.getId() + " İsmi:" + product.getName() + " Product kodu " + product.getCode());
		
		return product;
		

		
	
	}
	
	// sepete ekle metodu yazalım
	public static void sepeteEkle(Product product) {
		Sepet sepet= new Sepet();
		sepet.sepeteEkle(product);
		sepet.sepettekiUrunleriGoster();
	}
	
	//ürün kodu
	//Apple Pro
	//App325
	// ürün oluştururken ürünün ismini allaım ve bir ürün kodu oluşturalım
	//ürünün adı sony
	//üeünün kodu-->app236
	//ürün kodu--> son365
	//ürün 
	
}
