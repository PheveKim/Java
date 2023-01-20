import java.util.Arrays;
import java.util.Scanner;

public class 배열과반복문 {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] scores = new int[5]; //
		
		
		for(int i=0; i<scores.length; i++) {
			scores[i] = scanner.nextInt(); 
		}
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(i+1+"번째 점수는 :"+scores[i]);	
		}
		System.out.println(scores);
		
		// Arrays.toString 을 이용한 배열 출력
		System.out.println(Arrays.toString(scores));
		
		
		// 평균
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum/scores.length);
		
		
		
		
		
		
	}

}
