package day0126.test03_multiple_implements;

public class Test {
	public static void main(String[] args) {
		Duck d = new Duck();
		Eagle e = new Eagle();
		
		// d. => fly, swim, hunt 셋 다 보여요.
		
		// 다형성
		AbleToFly f = d;
		// f. => fly밖에 안보여요.
	}
}
