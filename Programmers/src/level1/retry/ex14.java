package level1.retry;

public class ex14 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 소수 찾기 
		/*
		 * 1. 2부터 n까지 반복문을 돈다.
		 * 2. i가 1이 아닐 때 
		 * 3. 2부터 i 전까지 반복문을 돈다.
		 * 4. i%j == 0 이라면 break
		 * 5. 그렇지 않으면 answer += 1;
		 * -->잘못된 알고리즘 
		 */
		

		System.out.println(solution2(10));
		System.out.println(solution2(5));
	}
	
	public static int solution2(int n) {
        int answer = 0;
        
        for(int i = n; i > 1; i--) {
        	int j = 0;
        	
        	for(j = 2; j < i; j++) {
        		if(i % j == 0) {
        			break;
        		}
        	}
        	
        	if(i == j) {
        		answer += 1;
        	}
        }
        
        return answer;
    }

	public static int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
        	for(int j = 2; j <= i; j++) {
        		if(i != j && i%j == 0) {
        			break;
        		}else if(i == j && i/j == 1) {
        			answer += 1;        			
        		}
        	}
        }
        return answer;
    }
}
