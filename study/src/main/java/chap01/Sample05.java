package chap01;

public class Sample05 {

	public static void main(String[] args) {
		String strVal1 = "                 24";
		int size = 6;
		String strVal2="";
		strVal2 = String.format("%"+size+"s", strVal1.replace(" ", "")).replace(" ", "0");
		System.out.println(strVal2);
		strVal2 = String.format("%-"+size+"s", strVal1.replace(" ", "")).replace(" ", "0");
		System.out.println(strVal2);
	}

}
