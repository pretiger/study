package inoutStreamExam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InOutStreamExam01 {

	public static void main(String[] args) {
		File file1 = new File("src/main/java/files/test1.txt");
		File file2 = new File("src/main/java/files/test2.txt");
		
		int data;
		try(InputStream is = new FileInputStream(file1);
			   OutputStream os = new FileOutputStream(file2);){
			while((data = is.read()) != -1) {
				System.out.print((char)data);
				os.write(data);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File file3 = new File("src/main/java/files/test3.txt");
		File file4 = new File("src/main/java/files/test4.txt");
		int data2;
		try(InputStream is2 = new FileInputStream(file3);
				BufferedInputStream bis = new BufferedInputStream(is2);
				OutputStream os2 = new FileOutputStream(file4);
				BufferedOutputStream bos = new BufferedOutputStream(os2);){
			while((data2 = bis.read()) != -1) {
				bos.write(data2);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
