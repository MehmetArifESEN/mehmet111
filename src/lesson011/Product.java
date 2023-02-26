package lesson011;

import lesson011.helper.RandomGenerateID;

public class Product {
	
	private String id;
	private int price;
	private String name;
	private int stock;
	private boolean isActive=true;
	private String code;
	
	
	
	
	//Overloading ısımler aynı ama parametreler farklı olması durumunda çalışması durumu
	public Product() {
		
		this.id= RandomGenerateID.randomOlustur();
	
		
		
	}
	
	public Product(String name ,int stock , int price) {
		System.out.println("Product sınıfının 4 parametrelı conrtuctoru calıstı");
		this.name = name;
		this.id = RandomGenerateID.randomOlustur();
		this.stock=stock;
		this.price=price;
		this.code=RandomGenerateID.randomGenerateCode(name);
		
		
	}
	
	
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getId() {
		return id;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if(price<0) {
			System.out.println("Lütfen 0 dan buyuk degeler gırınız");
			this.price=0;
		}else {
			this.price = price;
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStock() {
		
		
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void bilgileriGoster() {
		System.out.println(toString());
	}
	
	public void gosterimdenKaldir(Product product) {
		
		if(product.getStock()<=0) {
			setActive(false);
			System.out.println(product.getName() + " adlı urun gosterımden kaldırıldı");
			
		}
		
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", stock=" + stock + "]";
	}
	
	public void veriTabanınaKaydet(String name) {
		
		System.out.println(getName() + " ürünü veritabanına kaydedildi");
		
	}
	
	public void urunuGuncelle(String name) {
		System.out.println(this.name + " ürünün ismi : " + name + " olarak guncellendı");
		setName(name);
		
		
	}
	
	
	

}
