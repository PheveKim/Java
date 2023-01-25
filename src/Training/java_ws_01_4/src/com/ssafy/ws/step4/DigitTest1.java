package com.ssafy.ws.step4;

import java.util.Scanner;



/**
 * 가위,바위,보 게임을 하는 클래스
 */
public class DigitTest1 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		
		System.out.println("번호를 입력하세요.");
		int num = scanner.nextInt();
		int win_cnt = 4 - num;
		int user = 0;
		int user_win_cnt = 0;
		int computer_win_cnt = 0;
		
		
		
		
		while(true) {
			
			System.out.print("가위바위보 중 하나 입력 :");
			String input = scanner.next();
			int computer = (int) (Math.random() * 3) + 1;
			switch(input) {
				case "가위": user = 1; 
					break;
				case "바위": user = 2;
					break;
				case "보": user = 3;
					break;
				default:
					break;
			}
			
			if(user==1 && computer==3) {
				user_win_cnt++;
				System.out.println("이겼습니다.");
			}
			else if(user==3 && computer==1){
				computer_win_cnt++;
				System.out.println("졌습니다.");
			}
			else{
				if(user < computer) {
					computer_win_cnt++;
					System.out.println("졌습니다.");
				}
				else if(user > computer) {
					user_win_cnt++;
					System.out.println("이겼습니다.");
				}
				else System.out.println("비겼습니다.");
			}
			
			if(user_win_cnt >= win_cnt || computer_win_cnt >= win_cnt) break;
			
		}
		
		if(user_win_cnt > computer_win_cnt) System.out.println("### 당신의 승리!!!");
		else System.out.println("### 컴퓨터 승!!!");
		
		
		
	}
}
