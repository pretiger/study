package Chap02;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample03 {

	public static void main(String[] args) {
		String target = "sample@smaple.com,test@test.co.kr,example@example.kr,"
				+ "school@school.org,apple@apple.com";
		String regex = "([\\w]+@[\\w]+.com)";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(target);
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
