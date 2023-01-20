import java.net.NetworkInterface;

public class 이차원배열 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		int[][] raggedArr = new int[3][]; //.. 행마다 열개수가 다름
		raggedArr[0] = new int[4];
		raggedArr[1] = new int[3];
		raggedArr[2] = new int[5];
		
		
		for(int r=0; r<3; r++) {
			for(int c=0; c<4; c++) {
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
		
		
	}
}
