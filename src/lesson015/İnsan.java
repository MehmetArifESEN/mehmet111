package lesson015;

public class İnsan {
	
	private String name;
	private String tcNo;
	
	
	
	
	public İnsan(String name, String tcNo) {
		super();
		this.name = name;
		this.tcNo = tcNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	@Override
	public String toString() {
		return "İnsan [name=" + name + ", tcNo=" + tcNo + "]";
	}
	
	public void bilgileriGoster() {
		System.out.println(toString());
	}
	

}
