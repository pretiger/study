package chap01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInOutStreamExam {

	public static void main(String[] args) {
		File file = new File("src/main/java/chap01/test4.dat");
		try(OutputStream os = new FileOutputStream(file);
			   DataOutputStream dos = new DataOutputStream(os);) {
			dos.writeInt(32);
			dos.writeDouble(42.32);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(InputStream is = new FileInputStream(file);
				DataInputStream dis = new DataInputStream(is);) {
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
