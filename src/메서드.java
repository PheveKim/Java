
public class 메서드 {
	
	public static String numbering(int init, int limit) {
		
		int i = init;
		String output = "";
		
		while(i < limit) {
			
			output += i;
			i++;
			
		}
		
		return output;
		
	}
	
	
	public static void main(String[] args) {
		
		// 메서드 numbering이 리턴한 값이 변수 result에 담긴다.
		String result = numbering(1, 5);
		System.out.println(result);
	}
	
}
