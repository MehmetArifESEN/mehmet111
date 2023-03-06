package lesson015;

public class VipPerson  extends Person{
	
	private int vipNo;

	public VipPerson(String name, String surname, int age, int vipNo) {
		super(name, surname, age);
		this.vipNo=vipNo;
	}

	public int getVipNo() {
		return vipNo;
	}

	public void setVipNo(int vipNo) {
		this.vipNo = vipNo;
	}
	
	

}
