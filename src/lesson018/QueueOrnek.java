package lesson018;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOrnek {

	public static void main(String[] args) {
		// Bir tane String que oluşturalım
		//Kuyrugun ıcıne ısımler atalım
		//Kuyruktakı elemanları yazdıarlaım
		
		Queue <String> kuyruk = new LinkedList<String>();
		
		kuyruk.add("ahmet");
		kuyruk.offer("mehmet");
		kuyruk.add("ayse");
		kuyruk.add("fatma");
		
		System.out.println(kuyruk);
		
		//FIFO (First in first out9 ilk giren ilk cıkar mantıgı
		//Kuyruk bosalana kadar elemanalrı bosaltalım
		
		while (!kuyruk.isEmpty()) {
			System.out.println(kuyruk.poll());
		}
		
		

	}

}
