package lesson022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Kisi kisi1 = new Kisi("ahmet" , 51, ECinsiyet.ERKEK);
		Kisi kisi2 = new Kisi("ali" , 25, ECinsiyet.ERKEK);
		Kisi kisi3 = new Kisi("Zeynep" , 18, ECinsiyet.KADIN);
		Kisi kisi4 = new Kisi("defne", 42, ECinsiyet.KADIN);
		Kisi kisi5 = new Kisi("aslı",32,ECinsiyet.KADIN);
		
		List<Kisi> kisiler = new ArrayList<>();
		
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		kisiler.add(kisi4);
		kisiler.add(kisi5);
		
		//Kadın olanları farklı bır lısteye atalım
		System.out.println("Kadınlar");
		
		List<Kisi> kadinlar= kisiler.stream().filter(kisi->kisi.getCinsiyet()==ECinsiyet.KADIN).collect(Collectors.toList());
		kadinlar.forEach(kisi-> System.out.println(kisi));
		
		//Kişileri yaşlarına gore sıralayalım
		//
		
		Collections.sort(kisiler,Comparator.comparing(Kisi::getAge).thenComparingInt(Kisi::getAge));
		System.out.println(kisiler);
		
		
		List<Kisi> sortedList = kisiler.stream().sorted(Comparator.comparingInt(Kisi::getAge).reversed()).collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		
		
		//isim ve age degerleını bır hasmap yapısına atalım
		
		Map<String,Integer> kisiMap= kisiler.stream().collect(Collectors.toMap(kisi-> kisi.getName(), kisi->kisi.getAge()));
		kisiMap.forEach((key,value)-> System.out.println(key+ " " + value));
		
		
		
	

	}

}
