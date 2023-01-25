package com.ssafy.ws.step3;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
	
		
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		System.out.println("");
		
		
		int arr[] = new int[N];
		
		for(int i=0; i<M; i++) {
			int cnt = 1;
			int num = scanner.nextInt();
			while(num * cnt <= N) {
				if(arr[num * cnt-1] == 0) arr[num * cnt-1] = 1;
				else arr[num * cnt-1] = 0;
				cnt++;
			}
			
			
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(arr[i]);
		}
		
		
	}
}
