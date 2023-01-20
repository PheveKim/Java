package binding;

public class Student extends Person {

	String major;
	
	// 파라미터가 있는 생성자를 만들어줘야 한다.
	public Student(String name, int age, String major) {
		super(name, age); // 부모 클래스의 생성자를 호출
		this.major = major;
	}
	
	public void study() {
		System.out.println("공부를 한다.");
	}
	
	public void eat() {
		System.out.println("지식을 먹는다");
	}
}
