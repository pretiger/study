package chap01;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject2 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		int data;
		while((data=is.read())!='\r') {
			System.out.print((char)data);
		}
		is.read();
		System.out.println();
		System.out.println();
		byte[] byteArray = new byte[100];
		int count = is.read(byteArray);
		for(int i=0;i<count;i++) 
			System.out.print((char)byteArray[i]);
		System.out.println("  : count = "+count);
		byte[] byteArray2 = new byte[100];
		int offset=3,length=5;
		int count2 = is.read(byteArray2, offset, length);
		for(int i=0;i<offset+count2;i++) {
			System.out.print((char)byteArray2[i]);
		}
		System.out.println("   : count = "+count2);
	}
}
