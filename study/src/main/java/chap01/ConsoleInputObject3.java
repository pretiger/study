package chap01;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject3 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		byte[] byteArray = new byte[100];
		int count = is.read(byteArray);
		String str = new String(byteArray, 0, count, Charset.forName("utf-8"));
		System.out.println(str);
		byte[] byteArray2 = new byte[100];
		int offset=3,length=6;
		int count2 = is.read(byteArray2, offset, length);
//		String str2 = new String(byteArray2, 0, offset+count2, Charset.defaultCharset());
		String str2 = new String(byteArray2, offset, count2, Charset.defaultCharset());
		System.out.println(str2);
	}
}
