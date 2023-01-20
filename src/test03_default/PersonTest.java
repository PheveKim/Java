package test03_default;

public class PersonTest {

	public static void main(String args[]) {
		Person p1 = new Person();
		// 다른 클래스에(PersonTest) 에 있어도,
		// 같은 패키지이므로 default 속성에 접근가능!
		p1.name = "김성규";
		
		
		
	}
	
}
