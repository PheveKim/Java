package com.ssafy.ws.step1;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {

		System.out.println("숫자 입력 >>");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum_result = 0;
		
		for(int i=0; i<=num; i++) {
			if(i%2==0) {
				sum_result += i;
				
			}
		}
		
		
		System.out.println("1부터 " + num + "까지 수 중 짝수의 합 = " + sum_result);
		
	}

}
