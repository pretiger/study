package chap01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExam01 {

	public static void main(String[] args) throws IOException {
		File inFile = new File("src/main/java/chap01/Test.txt");
		InputStream is = new FileInputStream(inFile);
		int data;
		while((data=is.read()) != -1) {
			System.out.println("읽은 문자 : "+(char)data+" , 남은 바이트수 : "+is.available());
		}
		is.close();
	}

}
