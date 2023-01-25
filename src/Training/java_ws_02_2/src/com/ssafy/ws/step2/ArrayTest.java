package com.ssafy.ws.step2;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] num_arr = {10,9,8,7,6,5,4,3,2,1};
		for(int i=0; i<num_arr.length; i++) {
			System.out.print(num_arr[i]);
		}
		
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		String[] arr = new String[num];
		
		
		for(int i=0; i<num; i++) {
			String food = scanner.next();
			arr[i] = food; 
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
