package chap01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamExam01 {

	public static void main(String[] args) throws IOException {
		File inFile = new File("src/main/java/chap01/test3.txt");
		OutputStream os = new FileOutputStream(inFile);
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');
		os.flush();
		os.close();
		OutputStream os2 = new FileOutputStream(inFile, true);
		byte[] byteArray1 = "Hello!".getBytes();
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();
		OutputStream os3 = new FileOutputStream(inFile, true);
		byte[] byteArray2 = "Better the last smile than the first laught".getBytes();
		os3.write(byteArray2, 7, 8);
		os3.write('\n');
		os3.flush();
		os3.close();
	}

}
