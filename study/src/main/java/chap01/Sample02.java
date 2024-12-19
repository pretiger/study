package chap01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

public class Sample02 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		list.forEach(System.out::print);
		System.out.println("--------------------");
		List<List<Integer>> list2 = Lists.partition(list, 3);
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		List<Integer> list3 = new ArrayList<>(list);
		list3.add(9);
		System.out.println(list3);
		List<List<Integer>> list4 = Lists.partition(list3, 2);
		System.out.println(list4.size());
		System.out.println(list4.get(0));
		System.out.println(list4.get(1));
		System.out.println(list4.get(2));
		System.out.println(list4.get(3));
		System.out.println(list4.get(4));
	}

}
