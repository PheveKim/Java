package day0126.test01_interface;

// 인터페이스의 작성은 interface 키워드 사용
public interface MyInterface {

	//모든 멤버변수는 public static final 이며 생략 가능.
	public static final int MEMBER_1 = 10;
	int MEMBER_2 = 20;
	
	//모든 메서드는 public abstract 이며 생략 가능.
	public abstract void method1();
	void method2();
	
}
