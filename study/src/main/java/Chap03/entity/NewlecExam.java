package Chap03.entity;

public class NewlecExam implements Exam {

	int eng;
	int kor;
	int math;
	int com;
	
	@Override
	public int total() {
		return eng+kor+math+com;
	}

	@Override
	public float average() {
		return total() / 4.0f;
	}



}
