package chap01;

import java.util.stream.IntStream;

public class Sample03 {

	public static void main(String[] args) {
		IntStream intStream = IntStream.rangeClosed(1, 10);
        intStream.limit(5)
            .forEach(System.out::println);
	}
}
