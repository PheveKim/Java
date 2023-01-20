
public class 최소값최대값구하기 {
	public static void main(String[] args) {
		
		
		int[] arr = new int[] {21,3,45,67,12,1,45,90,102,30,504};
		
		
		// 최소값
		int min = arr[0]; // 첫번째 원소를 최소값이라고 가정.
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) min = arr[i];
		}
		System.out.println(min);
		
		// 최대값
		int max = arr[0]; 
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		System.out.println(max);
	}
}
