package chap01;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject1 {
	public static void main(String[] args) throws IOException {
		System.out.print("영문자를 입력하세요 : ");
		InputStream is = System.in;
		int data;
		while((data=is.read())!='\r') {
			System.out.println("읽은 데이터 : "+(char)data+", 남은바이트수 : "+is.available());
		}
		System.out.println(data); // '\r' 13
		System.out.println(is.read()); //'\n' 10
	}
}
