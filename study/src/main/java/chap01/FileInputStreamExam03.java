package chap01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStreamExam03 {

	public static void main(String[] args) throws IOException {
		File inFile = new File("src/main/java/chap01/test2.txt");
		
		InputStream is = new FileInputStream(inFile);
		byte[] byteArray = new byte[9];
		int count;
		while((count=is.read(byteArray))!=-1) {
			String str = new String(byteArray,0,count,Charset.defaultCharset());
			System.out.print(str);
		}
		System.out.println();
		System.out.println();
		InputStream is1 = new FileInputStream(inFile);
		byte[] byteArray1 = new byte[9];
		int count1;
		while((count1=is1.read(byteArray1))!=-1) {
			String str = new String(byteArray1, 0, count1, Charset.forName("utf-8"));
			System.out.print(str);
			System.out.println("   남은바이트수 : "+is1.available());
		}
		byte[] byteArray2 = new byte[9];
		int offset=3, length=6;
		InputStream is2 = new FileInputStream(inFile);
		int count2 = is2.read(byteArray2, offset,length);
		String str = new String(byteArray2, 0, offset+count2,Charset.defaultCharset());
		System.out.println(str);
		System.out.println("남은 바이트수 : "+is2.available());
		is.close();
		is1.close();
		is2.close();
	}

}
