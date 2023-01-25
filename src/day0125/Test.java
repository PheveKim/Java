package day0125;

public class Test {
	public static void main(String[] args) {
		// 추상 클래스로 객체를 만들 수가 있을까요? 없다.
		// Animal a = new Animal();  x
		
		// 다형성
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Person();
		
		// 부모 클래스 타입의 변수이지만..
		// 메서드의 호출은 실제 생성된 객체가 갖고 있는 메서드가 실행됨
		a1.speak();
		a2.speak();
		a3.speak();
		
		// 추상 클래스를 쓰는 이유
		// 1. 객체가 생성되지 못하도록 막기 (그게 합리적일 때)
		// 2. 자식 클래스에서 메서드의 재정의 (오버라이드)를 강제하기 위함
		// 3. 다형성을 이용하기 위해
		// 4. 상속을 통한 코드 중복 제거
		
		
		
		a1.eat(); // 왜 안될까?
		// 안되는 것을 해결하는 방법
		// 부모클래스에 추상메서드 혹은 일반메서드를 정의해놔야
		// 부모클래스 타입으로 참조했을 때 메서드 사용 가능!
		
		// 조상 클래스에서 일반 메서드로 만드는 것 vs 추상 메서드
		// 일반메서드 -> 상속
		// 추상메서드 -> 상속
		
		// (부모클래스에서) 일반 메서드를 사용하는 경우,
		// -> 자식클래스에서 재정의 안하고 넘어갈 수 있음.
		// (부모클래스에서) 일반 메서드, 추상 메서드 둘다 안만들고
		// 자식클래스에서 독립적으로 만들어서 사용하는 경우
		// -> 다형성 활용 불가.
		
		
		System.out.println(a1 instanceof Animal);
		System.out.println(a1 instanceof Cat);
		System.out.println(a1 instanceof Dog);
		
		// instanceof 연산자
		// 객체가 해당 클래스로 만든 객체이거나
		// 객체가 해당 클래스의 조상 클래스로 만든 객체인 경우, true.
		// 자식 클래스. 전혀 상관없는 클래스로 만든 객체인 경우, false.
		
		if(a1 instanceof Cat) {
			Cat c = (Cat) a1;
			c.eat();
		}
		if(a2 instanceof Dog) {
			Dog d = (Dog) a2;
			d.eat();
		}
		if(a3 instanceof Person) {
			Person p = (Person) a3;
			p.eat();
		}
		
		
	}
	
	
}
