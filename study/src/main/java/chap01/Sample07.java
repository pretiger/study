package chap01;

import lombok.Builder;
import lombok.Data;

public class Sample07 {
	public static void main(String[] args) {
		Person person = Person.builder()
										.name("빵형")
										.build();
		Person person2 = Person.builder()
										.name("빵형2")
										.color("빨강")
										.build();
		System.out.println(person.getName());
		System.out.println(person2.getName()+","+person2.getColor());
	}
}

@Builder
@Data
class Person{
	private String name;
	private int      age;
	private String manufacture;
	private String color;
	
}