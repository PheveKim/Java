package com.ssafy.ws.step4;

import java.util.Scanner;

public class AirCrashes {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		
		int max = arr[0];
		int last = arr[arr.length-1];
		int less = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		for(int i=arr.length-1; i>0; i--) {
			if(last > arr[i]) {
				less = arr[i];
				break;
			}
		}
		
		if(less == -1) System.out.println(less);
		else System.out.println(max - less);
		
		
	}
}
