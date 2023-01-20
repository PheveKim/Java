package Super;

public class Student extends Person {

	String major;
	
	public Student(String name, int age, String major) {
		super(name, age); //부모의 것을 받아옴
		this.major = major;
	}
	
	public void study() {
		System.out.println("공부를 한다.");
	}
		
}
