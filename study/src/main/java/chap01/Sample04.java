package chap01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Sample04 {
	
	public static void main(String[] args) throws IOException {
		File file = new File("src/main/java/chap01/Test.txt");
			InputStream is = new FileInputStream(file);
			InputStream is2 = new FileInputStream(file);
			int data;
			while((data = is.read()) != -1) {
				System.out.println("문자 : "+(char)data+" , 남은바이트수 : "+is.available());
			}
			System.out.println();
			System.out.println("=======================================");
			while((data = is2.read())!=-1) {
				System.out.print((char)data);
			}
	}
}
