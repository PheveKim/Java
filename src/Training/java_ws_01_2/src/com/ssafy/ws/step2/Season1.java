package com.ssafy.ws.step2;
import java.util.Scanner;

public class Season1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//3~5월은 봄, 6~8월은 여름, 9~11월은 가을, 12~2월은 겨울로 한다.
		
		for(int i=0; i<3; i++) {
			System.out.println("월 입력>>");
			
			int num = scanner.nextInt();
			
			if (num>2 && num<6) System.out.println(num + "월은 봄입니다.");
			else if (num>5 && num<9) System.out.println(num + "월은 여름입니다.");
			else if (num>8 && num<12) System.out.println(num + "월은 가을입니다.");
			else if (num>11 && num<3) System.out.println(num + "월은 겨울입니다.");
	
		}
		
		
		
	}

}
