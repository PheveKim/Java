import java.util.Arrays;

public class 자바순열조합 {

	static int N;
	static int R;
	static int[] input; //길이 N 뽑을 대상
	static int[] numbers;//길이 R 뽑힌 것
	static boolean[] isSelect; //선택된거 기억

	public static void main(String[] args) {
		N = 4;
		R = 3;

		input = new int[N];
		isSelect = new boolean[N];
		numbers = new int[R];

		for (int i = 0; i < N; i++) {
			input[i] = i;
		}
		
		perm(0);
		System.out.println();
		combi(0, 0);
		System.out.println();
		subset(0);
	}

	public static void combi(int cnt, int start) {
		if (cnt == R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		for (int i = start; i < N; i++) {
			numbers[cnt] = input[i];
			combi(cnt + 1, i + 1);
		}
	}

	public static void perm(int cnt) {
		if (cnt == R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = 0; i < N; i++) {
			if (isSelect[i])
				continue;
			numbers[cnt] = input[i];
			isSelect[i] = true;
			perm(cnt + 1);
			isSelect[i] = false;

		}

	}
	
	public static void subset(int idx) {
		if(idx==N) {
			for(int i = 0 ; i < N ; i++) {
				System.out.print(isSelect[i]?input[i]+", ":"");
			}
			System.out.println();
			return;
		}
		isSelect[idx] = true;
		subset(idx+1);
		isSelect[idx] = false;
		subset(idx+1);
	}
}