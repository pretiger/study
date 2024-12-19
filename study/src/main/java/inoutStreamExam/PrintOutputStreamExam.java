package inoutStreamExam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintOutputStreamExam {

	public static void main(String[] args) {
		File file1 = new File("src/main/java/files/test3.txt"); 
		File file2 = new File("src/main/java/files/test4.txt");
		try(OutputStream os = new FileOutputStream(file1);
			   PrintStream ps = new PrintStream(os);){
			ps.println(5.8);
			ps.printf("%s %f", " 안녕", 4.8);
		    ps.print("\n"+3+" bye"+ 12345+"\n");
		    ps.print("Good bye!!!");
		    ps.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(PrintStream ps = new PrintStream(file2);){
			ps.println(5.8);
			ps.printf("%s %f", " 안녕", 4.8);
			ps.print("\n"+3+" bye"+ 12345+"\n");
			ps.print("Good bye!!!");
			ps.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(PrintStream ps = System.out;){
			ps.println(5.8);
			ps.printf("%s %f", " 안녕", 4.8);
			ps.print("\n"+3+" bye"+ 12345+"\n");
			ps.print("Good bye!!!");
			ps.println();
		} 
	}

}
