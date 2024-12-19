package chap01;

import java.util.Scanner;

public class Sample11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		System.out.printf("입력값 :[%s] \n 글자수 : %d \n", in.toUpperCase().trim(), in.trim().length());
	}

}
