package chap01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sample09 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Tom");
		list.add("Lisa");
		list.add("Maria");
		System.out.println("=========1.향상된 for문");
		for(String name : list) System.out.println(name);
		
		System.out.println("==========2.일반 for문");
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
		System.out.println("==========3.forEach문");
		list.forEach(x -> System.out.println(x));
		
		System.out.println("===========4.Iterator");
		Iterator it1 = list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("===========5.Iterator(Lamda)");
		Iterator it2 = list.iterator();
		it2.forEachRemaining(x->System.out.println(x));

		System.out.println("===========6.Iterator(참조메서드)");
		Iterator it3 = list.iterator();
		it3.forEachRemaining(System.out::println);
		
		System.out.println("===========7.order");
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.toString());
	}
}
