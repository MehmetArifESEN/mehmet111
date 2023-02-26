package lesson014.homeworks;

public class MainSalary {

	public static void main(String[] args) {
		
		HomeworkSalary employeer1 = new HomeworkSalary("Selim" , 1990 , 35 , 1995);
		employeer1.taxCalculate();
		employeer1.bonusCalculate();
		employeer1.salaryRaise();
		employeer1.showİnformation();

	}

}
