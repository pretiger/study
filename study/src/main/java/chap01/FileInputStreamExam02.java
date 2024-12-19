package chap01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExam02 {

	public static void main(String[] args) throws IOException {
		File inFile = new File("src/main/java/chap01/Test.txt");
		InputStream is = new FileInputStream(inFile);
		byte[] byteArray = new byte[9];
		int count;
		while((count=is.read(byteArray))!=-1) {
			for(int i=0; i < count; i++)
				System.out.print((char)byteArray[i]);
			System.out.println("     남은 바이트수 : "+is.available());
		}
	}

}
