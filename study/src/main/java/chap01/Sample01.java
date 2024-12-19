package chap01;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

public class Sample01 {

	public static void main(String[] args) {
		String[] str = {"1","2","3","4","5","6","7","8"};
		List<String> list = Arrays.asList(str);
		list.forEach(System.out::print);
		List<List<String>> list2 = Lists.partition(list, 3);
		System.out.println("list2 의 사이즈 : "+list2.size());
		System.out.println("====================");
		list2.get(0).forEach(System.out::print);
		System.out.println("====================");
		list2.get(1).forEach(System.out::print);
		System.out.println("====================");
		list2.get(2).forEach(System.out::print);
	}

}
