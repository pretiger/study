package chap01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderWriterExam {

	public static void main(String[] args) {
		File file = new File("src/main/java/chap01/test6.txt");
		try(Writer writer = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(writer);){
			bw.write("안녕하세요\n".toCharArray());
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("반갑습니다.",2,3);
			bw.flush();
		}catch(IOException e) {}
		try(Reader reader = new FileReader(file);
				BufferedReader br = new BufferedReader(reader);){
			int data;
			while((data=br.read())!=-1) {
				System.out.print((char)data);
			}
		}catch(IOException e) {}
		System.out.println();
		try(Reader reader = new FileReader(file);
				BufferedReader br = new BufferedReader(reader);){
			String data;
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
		}catch(IOException e) {}
	}
}
