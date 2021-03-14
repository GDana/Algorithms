package level1.done;

public class ex27 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 짝수와 홀수 
		
		solution(3);
		solution(4);
	}
	
	public static String solution2(int num) {
		return num % 2 == 0 ? "Even": "Odd";
	}
	
	public static String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0) {
        	answer = "Even";
        }else {
        	answer = "Odd";
        }
        
        System.out.println(answer);
        
        return answer;
    }
}
