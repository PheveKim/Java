import java.lang.reflect.Array;
import java.util.Arrays;

public class 배열의복사 {
	public static void main(String[] args) {
		
		
		int[] scores = new int[] {29,45,67,84,92}; //
		scores[scores.length - 1] = 44;
		System.out.println(Arrays.toString(scores));
		
		
		// 배열의 복사 방법 1
		int[] newscores = new int[10];
		for(int i=0; i<scores.length; i++) {
			newscores[i]= scores[i]; 
		}
		System.out.println(Arrays.toString(newscores));
		
		// 배열의 복사 방법 2
		int[] newscores2 = Arrays.copyOf(scores, scores.length*2);
		System.out.println(Arrays.toString(newscores2));
				
		
		
		
				
	}
}
