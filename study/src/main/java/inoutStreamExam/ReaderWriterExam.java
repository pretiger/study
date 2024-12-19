package inoutStreamExam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class ReaderWriterExam {

	public static void main(String[] args) {
		File file = new File("src/main/java/files/test5.txt");
		try(Writer writer = new FileWriter(file); 
				BufferedWriter bw = new BufferedWriter(writer)){
			bw.write("Hello!!!");
			bw.write("\n"+234+"\n");
			bw.write("안녕하세요!");
			bw.write("\n");
			bw.write("반갑습니다", 2, 3);
			bw.write("\n");
		}catch(IOException e){}

		try(	BufferedReader br = new BufferedReader(new FileReader(file));){
//			String str;
//			PrintWriter pw = new PrintWriter(System.out, true);
//			while((str = br.readLine())!=null) {
//				pw.println(str);
//			}
			
//			int data;
//			while((data=br.read())!=-1) {
//				System.out.print((char)data);
//			}
			
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
		}catch (Exception e) {}
	}

}
