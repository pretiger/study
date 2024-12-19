package chap01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriterExam01 {

	public static void main(String[] args) {
		File file = new File("src/main/java/chap01/test5.txt");
		try(Writer writer = new FileWriter(file);){
			writer.write("안녕하세요\n".toCharArray());
			writer.write("Hello");
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다.",2,3);
			writer.flush();
		}catch(IOException e) {}
		try(Reader reader = new FileReader(file)){
			int data;
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
		}catch(IOException e) {}
	}

}
