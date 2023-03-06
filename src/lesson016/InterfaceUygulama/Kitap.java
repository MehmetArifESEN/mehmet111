package lesson016.InterfaceUygulama;

public class Kitap {
	
	private String name;
	private String yazar;
	private int price;
	
	
	public Kitap(String name, String yazar, int price) {
		super();
		this.name = name;
		this.yazar = yazar;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getYazar() {
		return yazar;
	}


	public void setYazar(String yazar) {
		this.yazar = yazar;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Kitap [name=" + name + ", yazar=" + yazar + ", price=" + price + "]";
	}
	
	
	

}
