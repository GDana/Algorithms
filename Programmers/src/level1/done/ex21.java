package level1.done;

public class ex21 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 하샤드 수 
		/*
		 * x의 각 자릿수를 구한다
		 * 나머지 연산의 값이 0이 아니면 false
		 * 
		 *  1. x가 10보다 작을 때까지 나머지 연산을 한다.
		 *  2. 나머지 연산으로 반환된 값을 더한다.
		 *  3. x/더한 값 != 0이면 false 반환  
		 *  
		 */

		//solution(10);
		solution(12);
		//solution(11);
		//solution(13);
	}
	
	public static boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int sum = 0;
        
        while(true) {
        	sum += num % 10;
        	num = num / 10;
        	
        	System.out.print(num + ", " + sum);
        	if(num < 10) {
        		sum += num;
        		System.out.print(num + ", " + sum);
        		break;
        	}
        }
        if(x % sum != 0) {
        	answer = false;
        }
        
        System.out.println();
        System.out.println(x + "의 모든 자릿수의 합은 " + sum + "이므로 " + answer);
        
        return answer;
    }
}
