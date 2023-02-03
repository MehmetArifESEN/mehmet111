package lesson03;

public class Question24 {

	public static void main(String[] args) {
		//1 den  100 e kadar çift sayıların toplamını tek sayıların toplamına oranını bulan progmramı yazalım
		double toplamt=0;
		double toplamc=0;
		for (double i=1;i<=100;i++) {
			if (i%2==0) {
				toplamc=toplamc+i;
			}else {
				toplamt=toplamt+i;
			}
		}
		System.out.println("oran: " + toplamc/toplamt);

	}

}
