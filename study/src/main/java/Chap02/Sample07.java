package Chap02;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample07 {

	public static void main(String[] args) {
		String[] strArr = {"kim", "park", "choi", "lee"};
		int[] intArr = {1,2,3,4};
		double[] douArr = {1.2, 2.3, 3.4, 4.1};
		
		Stream<String> strStream = Arrays.stream(strArr);
		IntStream           intStream = Arrays.stream(intArr);
		DoubleStream    douStream = Arrays.stream(douArr);
		
		strStream.forEach(System.out::println);
		intStream.forEach(System.out::println);
		douStream.forEach(System.out::println);

	}

}
