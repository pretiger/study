package Chap02;

public class Sample02 {
	public static void main(String[] args) {
		String str = "0123456789";
		String exp1 = "^[0-9]*$"; // ^:처음, $:끝, []:입력된 패턴중 한자만, *:입력된 패턴 전체 : 전체표현방식
		String exp2 = "^[\\d]*$"; //약식표현방식(숫자만 입력되었는지 확인
		String exp3 = "^[0-9-A]*$"; //숫자 이외에 -, A 입력도 허용 
		if(!str.matches(exp3)) {
			System.out.println("숫자만 입력해 주세요!");
		}else {
			System.out.println("허용된 패턴을 통과했습니다.");
		}
	}
}
