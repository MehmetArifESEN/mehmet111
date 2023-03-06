package lesson018;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek2 {

	public static void main(String[] args) throws InterruptedException {
		// Bir tane queue oluşturalım
		// 10-12 tane isim queueya
		// daha sonra 1-10 arasın bir sayı üretcez bu sayi bizim pide sayımız
		// pide yazdıralım
		//kuyruga göre pideleri dağıtıcaz pideler bittiğinde pideler bitti yazdıralım
		// pideyi alan kişileri kuyruktan çıkarcaz
		// pideyi alamayan kişileir yazdıralım
		
		Queue <String> pideKuyrugu = new LinkedList<String>();
		Random random = new Random();
		
		pideKuyrugu.add("ahmet");
		pideKuyrugu.add("mehmet");
		pideKuyrugu.add("sezer");
		pideKuyrugu.add("ayse");
		pideKuyrugu.add("fatma");
		pideKuyrugu.add("orcun");
		pideKuyrugu.add("ozberk");
		pideKuyrugu.add("ilker");
		pideKuyrugu.add("eda");
		pideKuyrugu.add("mahmut");
		
		int pide = random.nextInt(1,10);
		
		for(int i =0;i<pide; i++) {
			System.out.println(pideKuyrugu.poll() + " pidesini aldı");
			Thread.sleep(1000);
		}
		System.out.println(pideKuyrugu);
		
		for (String string : pideKuyrugu) {
			System.out.println(string + " pidesini alamadı");
		}
		
		
	}

}
