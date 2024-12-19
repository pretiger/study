package Chap02;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Sample04 {
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Runnable 매개변수 및 반환값 없음");
		r.run();
		
		Supplier<String> s = () -> "Supplier 매개변수 없으나 반환값 있음";
		System.out.println(s.get());
		
		Consumer<String> c = (x) -> System.out.printf("%s 는 1개의 매개변수는 있지만 반환할 자료형은 없습니다.", x.toUpperCase());
		c.accept("Consumer");
		
		Predicate<Integer> p = x -> (x % 2) == 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n 숫자를 입력하세요 : ");
		System.out.println("Predicate 매개변수 1에 반환형 있음 : "+p.test(sc.nextInt()));
	}
}
