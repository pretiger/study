package inoutStreamExam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class InOutStreamExam02 {

	public static void main(String[] args) {
		File file1 = new File("src/main/java/files/test3.txt");
		File file2 = new File("src/main/java/files/test4.txt");
		try(InputStream is = new FileInputStream(file1);
				BufferedInputStream bis = new BufferedInputStream(is);
			   OutputStream os = new FileOutputStream(file2);
				BufferedOutputStream bos = new BufferedOutputStream(os);){
			int count;
			byte[] byteArray1 = new byte[1000];
			while((count = bis.read(byteArray1))!=-1) {
				String str = new String(byteArray1, 0, count, Charset.defaultCharset());
				System.out.print(str);
				bos.write(byteArray1);
				bos.flush();
			}
			System.out.println();
		}catch(IOException e) {}
	}

}
