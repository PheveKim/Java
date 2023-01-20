package test03_default_2;

import test03_default.Person;

public class PersonTest {

	public static void main(String args[]) {
		Person p1 = new Person();
		// 다른 클래스에(PersonTest) 에 있어도,
		// 같은 패키지이므로 default 속성에 접근가능!
		// p1.name = "김성규";
		// 다른 패키지에 있으면 default 속성 접근 불가!
		
		
	}
	
}
