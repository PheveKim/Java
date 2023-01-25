package com.ssafy.ws.step5;

import java.util.Arrays;
import java.util.Scanner;

import sun.security.util.AuthResources_sv;

public class EmergencyEscape {

    public static void main(String[] args){
		
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int N = scanner.nextInt();
    	int[] arr_v = new int[N];
    	int[] arr_h = new int[N];
    	for(int i=0; i<N; i++) {
    		arr_v[i] = scanner.nextInt(); 
    	}
    	for(int i=0; i<N; i++) {
    		arr_h[i] = scanner.nextInt(); 
    	}
    	
    	// 3가지 경우에 대해 할 계획. 2분 -> 3분 -> 4분 순서대로.
    	
    	
    	int is_out = 0;
    	
    	// 2분
    	for(int i=0; i<N-2; i++) {
    		int height_diff = 0;
        	int velocity_av = 0;
        	
    		//속도 평균
    		velocity_av = (arr_v[i] + arr_v[i+1])/2; 
    		
    		
    		//고도 차이
    		height_diff = arr_h[i] - arr_h[i+2];
    		
    		if(velocity_av >= 1100 && height_diff >= 2000) {
    			System.out.println(i+3);
    			is_out = 1;
    			break;
    		}
    	}
    	
    	if(is_out != 1) {
    		// 3분
        	for(int i=0; i<N-3; i++) {
        		int height_diff = 0;
            	int velocity_av = 0;
            	
        		//속도 평균
        		velocity_av = (arr_v[i] + arr_v[i+1] + arr_v[i+2])/3; 
        		
        		
        		//고도 차이
        		height_diff = arr_h[i] - arr_h[i+3];
        		
        		
        		if(velocity_av >= 1000 && height_diff >= 3000) {
        			System.out.println(i+4);
        			is_out = 1;
        			break;
        		}
        	}
    	}
    	
    	if(is_out != 1) {
    		// 4분
        	for(int i=0; i<N-4; i++) {
        		int height_diff = 0;
            	int velocity_av = 0;
            	
        		//속도 평균
        		velocity_av = (arr_v[i] + arr_v[i+1] + arr_v[i+2] + arr_v[i+3])/4; 
        		
        		
        		//고도 차이
        		height_diff = arr_h[i] - arr_h[i+4];
        		
        		if(velocity_av >= 900 && height_diff >= 4000) {
        			System.out.println(i+5);
        			is_out = 1;
        			break;
        		}
        	}
    	}
    	if(is_out == 0) System.out.println(-1);
    	
    	
    	
    }

}
