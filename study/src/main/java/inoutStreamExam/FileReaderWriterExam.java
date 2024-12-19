package inoutStreamExam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriterExam {

	public static void main(String[] args) {
		File file1 = new File("src/main/java/files/test3.txt");
		try(Writer writer = new FileWriter(file1);
				BufferedWriter bw = new BufferedWriter(writer);) {
			bw.write("안녕하세요");
			bw.write("\r");
			bw.write("\n");
			bw.write("반갑습니다", 2, 2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(Reader reader = new FileReader(file1);
				BufferedReader br = new BufferedReader(reader);){
			String data;
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
//			int data;
//			while((data=br.read())!=-1) {
//				System.out.print((char)data);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
