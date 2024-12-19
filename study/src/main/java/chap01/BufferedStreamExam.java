package chap01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamExam {

	public static void main(String[] args) {
		File originalFile = new File("D:\\novel\\(완)따뜻한 바다의 제국\\tmp\\love2.jpg");
		File copy1 = new File("D:\\novel\\(완)따뜻한 바다의 제국\\tmp\\copy1.jpg");
		File copy2 = new File("D:\\novel\\(완)따뜻한 바다의 제국\\tmp\\copy2.jpg");
		long time1,time2,start,end;
		start = System.nanoTime();
		try(InputStream is = new FileInputStream(originalFile);
			  OutputStream os = new FileOutputStream(copy1);) {
			int data;
			while((data=is.read())!=-1) {
				os.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("without BufferedStream : "+time1);
		
		start = System.nanoTime();
		try(InputStream is = new FileInputStream(originalFile);
				BufferedInputStream bis = new BufferedInputStream(is);
				OutputStream os = new FileOutputStream(copy2);
				BufferedOutputStream bos = new BufferedOutputStream(os);) {
				int data;
				while((data=bis.read())!=-1) {
					bos.write(data);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			end = System.nanoTime();
			time2 = end - start;
			System.out.println("with BufferedStream : "+time2);
			System.out.println("속도차이 : "+time1/time2);
	}
}
