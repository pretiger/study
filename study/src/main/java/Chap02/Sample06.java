package Chap02;

import java.util.function.Supplier;

import lombok.Getter;
import lombok.NoArgsConstructor;

public class Sample06 {
	public static void main(String[] args) {
		Supplier<Name> s = Name::new;
		Name name1 = s.get();
		System.out.println(name1.getName());

	}

}

@Getter
@NoArgsConstructor
class Name {
	String name = "빵형";
	
}
