package level1.retry.done;

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
		System.out.println(solution(36));
		
		
		/*
		double d = Math.sqrt(4);		
		System.out.println("d: " + d);
		d += 1;
		System.out.println("d * d: " + Math.round(d*d));
		if(d % 1 == 0) {
			System.out.println("d % 1 == " +  d % 1);
		}else {
			System.out.println("d % 1 != 0" +  d % 1);
		}
		*/
	}
	
	public static long solution1(long n) {
		System.out.println("::::: 다시 풀기(1) :::::");		
		/*
		 * 1. 제곱근 구하기 
		 * 2. 실수인지 체크하기 
		 * 실수이면 -1, +1한 정수를 제곱하여 리턴 
		 */
        long answer = 0;
        
        double d = Math.sqrt(n);
        boolean b;
        
        if(d % 1 == 0) { //정수 
			//System.out.println("d % 1 == " +  d % 1);
        	d += 1;
			answer = Math.round(d*d);
		}else {	//실수 
			//System.out.println("d % 1 != 0" +  d % 1);
			answer = -1;
		}
        
        return answer;
    }

	public static long solution(long n) {
		System.out.println("::::: 처음 제출했던 코드 :::::");
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
