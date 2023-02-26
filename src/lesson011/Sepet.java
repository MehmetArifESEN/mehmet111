package lesson011;

public class Sepet {
	
	private Product[] sepet;
	private int totalPrice;
	private int index=0;
	
	
	//her urun ekledıgımde sepetın total priec artacak
	//her urun ekledıgımde productın stocku azalması gerekıyor
	//10 taneden fazla alırsa kullacııya bılgı verelım
	
	//product sınıfının içinde bir değişken tutalım
	//ürünün aktif mi pasif mi olduğu
	
	//aktif olan ürünü gösterimden kaldırsın
	//boolean isActive=true;
	
	
	//sepetteki ürübleri göster metodu yazalım
	//for veya for each
	//!- ürün ismi
	//2- ürün isim
	//null degerlerı yazmayalım
	
	
	public Sepet() {
		this.sepet= new Product[10];
	}
	
	public void  sepeteEkle(Product product) {
		if(product.getStock() >0) {
			
		
		if (index>=10) {
			System.out.println("sepette yer kalmadı");
			
		}else {
			
		
		sepet[index] = product;
		index++;
		this.totalPrice+=product.getPrice();
		product.setStock(product.getStock()-1);
		if(product.getStock()<=0) {
			product.gosterimdenKaldir(product);
		}
		
		}
		}
		else {
			System.out.println("Ürün stoğu bitmiştir");
		}
	
		
		
	}
	
	public void sepettekiUrunleriGoster() {
		int i=0;
		for(Product product : sepet) {
			if(product!=null) {
				System.out.println(++i + " " + product.getName());
				
			}
		}
	}


	public Product[] getSepet() {
		return sepet;
	}


	public void setSepet(Product[] sepet) {
		this.sepet = sepet;
	}
	
	public int getIndex() {
		return index;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
