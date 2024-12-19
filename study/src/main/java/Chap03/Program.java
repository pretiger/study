package Chap03;

import java.io.Console;

import Chap03.entity.Exam;
import Chap03.entity.NewlecExam;
import Chap03.ui.ExamConcole;
import Chap03.ui.InlineExamConsole;

public class Program {
	public static void main(String[] args) {
		Exam exam = new NewlecExam();
		ExamConcole console = new InlineExamConsole(exam);
		console.print();
	}
}
