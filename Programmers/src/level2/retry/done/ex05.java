package level2.retry.done;

public class ex05 {

	public static void main(String[] args) {
		// 코딩테스 연습 > 연습문제 > 숫자의 표현 
		/**
		 * 1*5 + 2*4 + 3 = 5+8+3 = 16
		 * 1+5 + 2+3 + 4 = 6 + 5 + 4
		 * 
		 */
		
		solution(15);
	}
	
	public static int solution2(int n) {
		/**
		//정확성 테스트 
	 	테스트 1 〉	통과 (0.03ms, 52.4MB)
		테스트 2 〉	통과 (0.13ms, 53.8MB)
		테스트 3 〉	통과 (0.10ms, 52.3MB)
		테스트 4 〉	통과 (0.09ms, 52.8MB)
		테스트 5 〉	통과 (0.04ms, 52.9MB)
		테스트 6 〉	통과 (0.02ms, 52.9MB)
		테스트 7 〉	통과 (0.07ms, 52.6MB)
		테스트 8 〉	통과 (0.06ms, 53.3MB)
		테스트 9 〉	통과 (0.02ms, 52.6MB)
		테스트 10 〉	통과 (0.16ms, 52.4MB)
		테스트 11 〉	통과 (0.19ms, 53.8MB)
		테스트 12 〉	통과 (0.06ms, 51.9MB)
		테스트 13 〉	통과 (0.11ms, 53.5MB)
		테스트 14 〉	통과 (0.10ms, 52.6MB)
		
		// 효율성 테스트
		테스트 1 〉	통과 (1.95ms, 53.1MB)
		테스트 2 〉	통과 (0.68ms, 53.1MB)
		테스트 3 〉	통과 (1.33ms, 53.8MB)
		테스트 4 〉	통과 (1.34ms, 52.9MB)
		테스트 5 〉	통과 (1.46ms, 52.2MB)
		테스트 6 〉	통과 (1.52ms, 51.9MB)
		 */
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	int temp = 0;
        	
        	for(int j = i; j <= n; j++) {
        		temp += j;
        		
        		if(temp == n) {
        			answer++;
        			break;
        		}else if(temp > n) {
        			break;
        		}
        	}
        }
        
        System.out.println("answer: " + answer);
        
        return answer;
    }

	public static int solution(int n) {
		/**
		//정확성 테스트 
	 	테스트 1 〉	통과 (0.02ms, 53.3MB)
		테스트 2 〉	통과 (3.83ms, 52.9MB)
		테스트 3 〉	통과 (2.70ms, 53.1MB)
		테스트 4 〉	통과 (1.67ms, 53.3MB)
		테스트 5 〉	통과 (0.45ms, 52.5MB)
		테스트 6 〉	통과 (0.03ms, 52.2MB)
		테스트 7 〉	통과 (1.54ms, 52.6MB)
		테스트 8 〉	통과 (0.99ms, 52.6MB)
		테스트 9 〉	통과 (0.05ms, 52MB)
		테스트 10 〉	통과 (4.87ms, 52.6MB)
		테스트 11 〉	통과 (4.05ms, 53.1MB)
		테스트 12 〉	통과 (3.23ms, 52.9MB)
		테스트 13 〉	통과 (3.98ms, 52.1MB)
		테스트 14 〉	통과 (1.93ms, 51.8MB)
		
		// 효율성 테스트
		테스트 1 〉	실패 (시간 초과)
		테스트 2 〉	실패 (시간 초과)
		테스트 3 〉	실패 (시간 초과)
		테스트 4 〉	실패 (시간 초과)
		테스트 5 〉	실패 (시간 초과)
		테스트 6 〉	실패 (시간 초과)
		 */
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	int temp = 0;
        	
        	for(int j = i; j <= n; j++) {
        		temp += j;
        		
        		if(temp == n) {
        			answer++;
        			break;
        		}
        	}
        }
        
        System.out.println("answer: " + answer);
        
        return answer;
    }
}
