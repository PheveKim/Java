import java.util.Arrays;

public class 빈도수구하기 {
	public static void main(String[] args) {
		
		int[] arr = {6,3,4,6,3,4,6,3,6,3};
		int[] count = new int[10]; // 카운팅 배열
		// count 배열의 길이는 arr배열의 최댓값의 + 1.
		
		System.out.println(Arrays.toString(count));
		for(int i=0; i<arr.length; i++) {
			
			count[arr[i]]++;
			
		}
		
		System.out.println(Arrays.toString(count));
		
		
		
	}
}
