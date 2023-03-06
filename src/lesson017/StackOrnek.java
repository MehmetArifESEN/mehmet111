package lesson017;

import java.util.Stack;

public class StackOrnek {

	public static void main(String[] args) {

		//Stack---> (LİFO) last in first out
		//Bi tane stack oluşturalım
		//Bi kac tane int deger atalım
		//Bu stacki yazdıralım
		
		//Stack bosalana kadar butun elemanları cıkartalım
		//Cıkartılan her elemanı yazdıralım
		
		Stack<Integer> stack1 = new Stack<>();
		
		stack1.add(1);
		stack1.add(2);
		stack1.add(5);
		stack1.add(3);
		stack1.add(100);
		
		while(!stack1.isEmpty()) {
			System.out.println(stack1.pop());
			
		}
		
		//100 den kucuk degerlerı toplayıp stackten cıkartalım
		//100 den buyuklerı de farklı bır stackın ıcıne atalım
		//hep toplamı hem de yenıs tacı yazdıralım
		
//		Stack<Integer> stackKucuk = new Stack<>();
//		int toplam=0;
//		for (Integer i : stack1) {
//			if(i<100) {
//				toplam=toplam + i;
//				stack1.remove(i);
//				
//				
//			}else {
//				stackKucuk.add(i);
//				
//			}
//			
//		}
//		System.out.println(toplam + " " + stackKucuk);
		
		

	}

}
