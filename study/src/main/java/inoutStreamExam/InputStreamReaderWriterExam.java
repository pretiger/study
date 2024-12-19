package inoutStreamExam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class InputStreamReaderWriterExam {

	public static void main(String[] args) {
		File file1 = new File("C:\\Users\\jsm\\Downloads\\"+args[0]);
		File file2 = new File("C:\\Users\\jsm\\Downloads\\"+args[1]);
		try(InputStream is = new FileInputStream(file1);
			   InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			   BufferedReader br = new BufferedReader(isr);
			   OutputStream os = new FileOutputStream(file2);
				OutputStreamWriter osw = new OutputStreamWriter(os, "MS949");
			   BufferedWriter bw = new BufferedWriter(osw);){
				int data;
				while((data = isr.read())!=-1) {
					bw.write(data);
				}
		}catch(IOException e) {}
		
	}
}
