package chap01;

public class Sample06 {
	public static void main(String[] args) {
		Data data1 = new Data();
		Data data2 = new Data();
		data1.setName("빵형");
		data2.setName("빵형");
		if(data1 == data2) {
			System.out.println("data1과 data2는 주소가 같습니다.");
		}else {
			System.out.println("data1과 data2는 주소가 다릅니다.");
		}
		if(data1.equals(data2)) {
			System.out.println("data1과 data2는 값이 같습니다.");
		}else {
			System.out.println("data1과 data2는 값이 다릅니다.");
		}
		
	}
}
