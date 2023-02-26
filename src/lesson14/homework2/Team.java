package lesson14.homework2;

public class Team {
	private String name;
	private int puan;
	private int cashbox;
	
	
	
	
	
	
	public Team(String name, int puan, int cashbox) {
		super();
		this.name = name;
		this.puan = puan;
		this.cashbox = cashbox;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return puan;
	}
	public void setScore(int puan) {
		this.puan = puan;
	}
	public int getCashbox() {
		return cashbox;
	}
	public void setCashbox(int cashbox) {
		this.cashbox = cashbox;
	}
	
	
	
	

}
