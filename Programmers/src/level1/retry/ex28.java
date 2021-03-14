package level1.retry;

public class ex28 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 정수 제곱근 판별 
		/*
		 * 1. num = n / 2
		 * 2. num - curr 값이 음수가 아니라면 1부터 계속 빼준다. 
		 * 3. 음수가 되는 curr 값이 제곱근 
		 */

		System.out.println(solution(121));
		System.out.println(solution(3));
	}

	public static long solution(long n) {
        long answer = 1;
        n = n / 2;
        
        while(true) {
        	n = n - answer;
        	
        	if(n < 2) {
        		break;
        	}
        	
        	answer++;
        }
        if(answer == 1) {
        	return -1;
        }
        answer++;
        
        return answer*answer;
    }
}
