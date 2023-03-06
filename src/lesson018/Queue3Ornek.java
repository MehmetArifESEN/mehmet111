package lesson018;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue3Ornek {

	public static void main(String[] args) {
		Queue <Musteri> musteriQueue = new PriorityQueue<Musteri>();
		
		musteriQueue.offer(new Musteri("mustafa" , 20));
		musteriQueue.offer(new Musteri("ali" , 30));
		musteriQueue.offer(new Musteri("bugra" , 100));
		musteriQueue.offer(new Musteri("mehmet" , 40));
		musteriQueue.offer(new Musteri("aslıe" , 90));
		musteriQueue.offer(new Musteri("zeynep" , 25));
		
		//Musterileri yas oncelıgıne gore ıslemlerını yapıp kuyruktn cıkacak
		// yası buyuk olanlar ılk sırada yer alacak
		//yasa gore bır sıralama yapıcaz
		
		//Comparable
		
		

	}

}
