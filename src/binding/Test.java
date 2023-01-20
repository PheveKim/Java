package binding;

public class Test {
	
	public static void main(String[] args) {
		Student st = new Student("박사홍", 28, "자바");
		st.eat(); // 필요하다면 자식 클래스에서 부모의 메서드를 재정의 할 수 있다.
		
		// 다형성
		Person st2 = new Student("양명균", 29, "자바");
		Person st3 = new Person("a", 29);
//		Student st4 = new Person("b", 29);  // 형변환 느낌. float -> double
		st2.eat(); // 1.음식을 먹는다 2.지식을 먹는다 3.서울7반 조윤영
		st3.eat();
		
	}

}
