package Chap02;

import java.util.Arrays;
import java.util.stream.Stream;

public class Sample08 {

	public static void main(String[] args) {
		String[] str1 = {"kim","choi","lee","park"};
		String[] str2 = {"Corder", "Engineer","Teacher","Singer"};
		Stream<String[]> stm1 = Stream.of(str1,str2);
		Stream.of(str1,str2).forEach(x->System.out.println(Arrays.toString(x)));
		System.out.println("-----------------------------");
		stm1.flatMap(Arrays::stream).forEach(System.out::println);
		System.out.println("=============================");
		Stream.of(str1,str2).flatMap(s -> Arrays.stream(s)).forEach(System.out::println);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		Stream<Object> stm2 = Stream.of(str1,str2).flatMap(Arrays::stream);
		String[] strArr = stm2.toArray(String[]::new);
		System.out.println(Arrays.toString(strArr));
		System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		String[] strArr2 = Stream.of(str1,str2).flatMap(Arrays::stream).toArray(x -> new String[x]);
		System.out.println(Arrays.toString(strArr2));
		for(String s : strArr2) {
			System.out.printf("%s \t", s);
		}
	}

}
