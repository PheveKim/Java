package test01;
//import java.util.Scanner;
//import java.util.Date;
//import java.util.Arrays;
import java.util.*; // 이거 한방이면 다 import됨
import java.util.logging.*;
// 하위 패키지에 있는 클래스까지 import 되는건 아니다.
// 하위 패키지라고 해도 엄연히 다른 패키지이다. 독립된 패키지이다.


public class ImportTest { // 퍼블릭으로 쓰는 이유 : 다른 패키지에서도 접근 가능하도록.
							// private, protected, default, public

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Date d = new Date();
		
		int[] arr = {1,2,3,4,5};
		Arrays.toString(arr);
		
//		java.util.logging.Logger
		Logger l = Logger.getGlobal();
		
		
	}
	
}
