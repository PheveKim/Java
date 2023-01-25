package day0125;

// 1. 굳이 객체 생성할 필요 없음
// 2. 추상 메서드를 갖는 클래스
// 3. abstract 키워드


abstract public class Animal {
	// 추상 메서드
	// 1. abstract 키워드
	// 2. ;으로 종료
	// - {} 블록이 없음. 내용(구현부) 없음.
	
	abstract public void speak();
	// 1. 접근제한자 : public, (default), protected, private
	// 2. 그외제한자(지정예약어) : static, final, abstract
	// 1 과 2 순서는 서로 상관이 없음.
	
	abstract public void eat();
	
	public static int a = 10;
	static public int b = 20;
	
	
}
