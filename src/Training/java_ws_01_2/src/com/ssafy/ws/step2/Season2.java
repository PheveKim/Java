package com.ssafy.ws.step2;

import java.util.Scanner;

public class Season2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		while(i<3) {
			System.out.println("월 입력>>");	
			int num = scanner.nextInt();
			
			switch (num) {
			case 1: System.out.println(num + "월은 겨울입니다.");
					break;
			case 2: System.out.println(num + "월은 겨울입니다.");
					break;
			case 3: System.out.println(num + "월은 봄입니다.");
					break;
			case 4: System.out.println(num + "월은 봄입니다.");
					break;
			case 5: System.out.println(num + "월은 봄입니다.");
					break;
			case 6: System.out.println(num + "월은 여름입니다.");
					break;
			case 7: System.out.println(num + "월은 여름입니다.");
					break;
			case 8: System.out.println(num + "월은 여름입니다.");
					break;
			case 9: System.out.println(num + "월은 가을입니다.");
				 	break;
			case 10: System.out.println(num + "월은 가을입니다.");
				 	 break;
			case 11: System.out.println(num + "월은 가을입니다.");
			 		 break;
			case 12: System.out.println(num + "월은 겨울입니다.");
				 	 break;

			default:
					break;
			}
			
			i++;
			
		}
	}

}
