package level1.done;

public class ex16 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 약수의 합 
		/**
		 * 1. n/2 의 값을 저장 
		 * 2. 1부터 n/2까지 반복문을 돈다 
		 * 3. n%i == 0 이면 
		 * 4. answer += i;  
		 */
		
		System.out.println(solution(12));
        System.out.println("-------------");
		System.out.println(solution(5));
	}

	
	public static int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n/2; i++) {
        	if(n%i == 0) {
        		System.out.print(i + " ");
        		answer += i;
        	}
        }
        
        System.out.println();
        
        return answer + n;
    }
}
