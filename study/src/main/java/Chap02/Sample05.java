package Chap02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample05 {
	public static void main(String[] args) {
		int[] num = IntStream.rangeClosed(1, 100).toArray();
		Arrays.stream(num).forEach(System.out::println);
		List<String> list = Arrays.asList("빵형", "광명컴쟁이");
		Object[] str = list.stream().toArray();
		Arrays.stream(str).forEach(System.out::println);
		Stream.of("빵형","상도","타노스")
					.forEach(System.out::println);
		Stream<String> strStream = Stream.of("kim","lee","choi");
		String[] strArry = strStream.toArray(String[]::new);
		System.out.println(Arrays.toString(strArry));
		System.out.println("=========================");
		int arrSize = list.size();
		String[] strArray = list.toArray(new String[arrSize]);
		Arrays.stream(strArray).forEach(System.out::println);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		Stream.of(strArray).forEach(System.out::println);
	}
}
