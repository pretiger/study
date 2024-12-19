package Chap03.ui;

import Chap03.entity.Exam;

public class InlineExamConsole implements ExamConcole {

	private Exam exam;
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}
	@Override
	public void print() {
		System.out.printf("total : %d, average: %f \n", exam.total(), exam.average());
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
