package inoutStreamExam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class StreamTest {
	public static void main(String[] args) {
//		File file = new File("src/main/java/files/test1.txt");
		File file = new File("C:\\Users\\jsm\\Downloads\\방구석 음악 천재 1-186.txt");
		File file2 = new File("src/main/java/files/test2.txt");
		int data;
		String data2;
		try(Reader r = new FileReader(file);
				BufferedReader br = new BufferedReader(r);
				Writer w = new FileWriter(file2);
				BufferedWriter bw = new BufferedWriter(w);){
			int lineCnt=0;
//			while((data=br.read())!=-1) {
//				System.out.print((char)data);
//				bw.write(data);
//			}
			while((data2=br.readLine())!=null) {
				System.out.println("line:"+lineCnt+" "+data2);
				bw.write(data2);
				bw.write('\n');
				lineCnt++;
				if(lineCnt == 15) break;
			}
		}catch(Exception e) {}
	}
}
