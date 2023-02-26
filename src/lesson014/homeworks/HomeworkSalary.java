package lesson014.homeworks;

public class HomeworkSalary {
	
	// Maaş, Vergi, Bonus, Maaşı artımı hesaplayan bir program
		// Sınıfın attributeleri
		// name, salary, workHours(Çalıştığı saat), hireYear(İşe Giriş Yılı)
		// tax(vergi), bonus(mesai ücreti)
		// salaryRaise(Maaş artırımı)
		// tax methodu--> eğer çalışanın maaşı 2000 tl den az ise
		// vergi uygulanmayacak, fazla ise maaşının %5 i kadar vergisi olacak
		// bonus metodu--> eğer haftada 40 saatten fazla çalıştıysa
		// çalıştığı saat başına 30 tl maaşa bonus uygulanacak
		// ve ne kadar bonus aldığı hesaplanacak
		// raiseSalary--> işe girdiği yıla göre maaş artışı yapılacak
		// şuanki yıl 2022, 10 yıldan az ise %5, 10- 20 yıl arasında %10
		// 20 yıldan fazla ise %15 zam yapılca
	
	private String name;
	private double salary;
	private double workHours;
	private int hireYear;
	private double tax;
	private double bonus;
	private double raiseSalary;
	public static final int YEAR=2022;
	private double newSalary;
	
	
	
	public HomeworkSalary (String name, double salary, double workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	
	
	public HomeworkSalary() {
		super();
	}
	

	public void taxCalculate() {
		
		if(salary< 2000) {
			tax=0;
//			System.out.println("Maaşınız vergi dilimine girmiyor.");
		}
		else {
			setTax(getSalary()/20);
//			System.out.println("Vergi borcunuz: " + tax);
		}
		
	}
	
	public void bonusCalculate() {
		if (getWorkHours() > 40 ) {
			setBonus((getWorkHours()-40) * 30);
			
		 
		}
		
	}
	
	public void salaryRaise() {
		if((YEAR-getHireYear())>20) {
			setRaiseSalary(getSalary()*0.15);
		}else if ((YEAR-getHireYear())>=10 && (YEAR-getHireYear())<=20) {
			setRaiseSalary(getSalary()*0.1);
		}else {
			setRaiseSalary(getSalary()*0.05);
			
		}
	}
	
	public void showİnformation() {
		System.out.println("Adınız: " + getName());
		System.out.println("Maaşı: " + getSalary());
		System.out.println("Çalışma saati: " + getWorkHours());
		System.out.println("Başlangıç yılı: " + getHireYear());
		System.out.println("Vergi borcunuz: " + getTax());
		System.out.println("Bonus: " + getBonus());
		System.out.println("Maaş artışı: " + getRaiseSalary());
		setSalary((getSalary()-getTax())+getBonus());
		setNewSalary(getSalary()+getRaiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + getSalary() + " Toplam maaş: " + getNewSalary()); 
	}
	
	
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getWorkHours() {
		return workHours;
	}
	
	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}
	
	public int getHireYear() {
		return hireYear;
	}
	
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}



	public double getTax() {
		return tax;
	}



	public void setTax(double tax) {
		this.tax = tax;
	}



	public double getBonus() {
		return bonus;
	}



	public void setBonus(double bonus) {
		this.bonus = bonus;
	}



	public double getRaiseSalary() {
		return raiseSalary;
	}



	public void setRaiseSalary(double raiseSalary) {
		this.raiseSalary = raiseSalary;
	}



	public double getNewSalary() {
		return newSalary;
	}



	public void setNewSalary(double newSalary) {
		this.newSalary = newSalary;
	}



	@Override
	public String toString() {
		return "HomeworkSalary [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear="
				+ hireYear + ", tax=" + tax + ", bonus=" + bonus + ", raiseSalary=" + raiseSalary + "]";
	}
	
	
	
	
 }
