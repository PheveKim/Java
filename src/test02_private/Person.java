package test02_private;


// class 는 public 아니면 default
public class Person {

	private String name;
	private int age;
	
	
	public static void main(String args[]) {
		Person p1 = new Person();
		p1.name = "김성규";
		// 자기 자신이므로 접근 가능!
	}
	
}
