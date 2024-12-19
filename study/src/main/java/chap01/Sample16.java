package chap01;

import java.util.Random;

public class Sample16 {

	public static void main(String[] args) {
		Random random = new Random();
		
		  int num = random.nextInt(3)+1; // 0~1 => 1~3
		  System.out.println("Random1 값 : "+num); int num2 = (int)(Math.random()*3)+1;
		  System.out.println("Random2 값: "+num2);
		 
	}

}
