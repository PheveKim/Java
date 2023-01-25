package com.ssafy.hw.step4;

import java.util.Scanner;

public class ProductValue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt(); 
		}
		
		for(int i=0; i<arr.length; i++) {
			int cnt = 0;
			int my_price = arr[i];
			
			for(int j=0; j<arr.length; j++) {
				if(arr[j] > my_price) {
					cnt++;
				}
			}
			System.out.print(cnt+1);
		}
		
		
		
		

	}

}
