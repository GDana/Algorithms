package level2.retry;

public class ex06 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 땅따먹기 

		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		solution2(land);
	}
	
	static int solution3(int[][] land) {
		int answer = 0;
		/*
		 * 동적계획법으로 풀어야 함
		| 1 | 2 | 3 | 5 |
		| 5 | 6 | 7 | 8 |
		| 4 | 3 | 2 | 1 |

		| 1 | 2 | 3 | 5 |
		| 10 | 11 | 12 | 8 |
		| 4 | 3 | 2 | 1 |
		 */
		
		
		return answer;
	}
	
	static int solution2(int[][] land) {
		/**
		 테스트 1 〉	실패 (0.31ms, 52.7MB)
		테스트 2 〉	실패 (0.29ms, 53MB)
		테스트 3 〉	실패 (0.31ms, 52.8MB)
		테스트 4 〉	실패 (0.28ms, 53.4MB)
		테스트 5 〉	실패 (0.29ms, 52.5MB)
		테스트 6 〉	실패 (0.29ms, 53MB)
		테스트 7 〉	실패 (0.31ms, 53MB)
		테스트 8 〉	실패 (0.30ms, 52.7MB)
		테스트 9 〉	실패 (0.26ms, 53.3MB)
		테스트 10 〉	실패 (0.28ms, 52.1MB)
		테스트 11 〉	실패 (0.30ms, 53MB)
		테스트 12 〉	실패 (0.29ms, 53.4MB)
		테스트 13 〉	실패 (0.28ms, 55.9MB)
		테스트 14 〉	실패 (0.32ms, 52.6MB)
		테스트 15 〉	실패 (0.30ms, 52.8MB)
		테스트 16 〉	실패 (0.27ms, 54.6MB)
		테스트 17 〉	실패 (0.29ms, 52.4MB)
		테스트 18 〉	실패 (0.28ms, 52.4MB)
		
		테스트 1 〉	실패 (12.20ms, 86.6MB)
		테스트 2 〉	실패 (11.11ms, 85.5MB)
		테스트 3 〉	실패 (10.18ms, 86MB)
		테스트 4 〉	실패 (10.62ms, 86MB)
		 */
        int answer = 0;
        int idx = 0;
        int count = 0;
        
        for(int i = 0; i < land.length; i++) {
        	int big = land[i][0];
        	int tempIdx = 0;
        	
        	System.out.println("count: " + count);
        	for(int j = 1; j < land[i].length; j++) {
        		if(count == 1) {
        			if(idx == j) continue;
        		}
        		
        		if(count > 1) {
        			count = 0;
        		}
        		
				if (idx != j && big < land[i][j]) {
					big = land[i][j];
					tempIdx = j;
				}
        	}
        	
        	count++;
        	idx = tempIdx;
        	answer += big;
        	System.out.println("현재 행에서 가장 큰 값: " + big);
        	System.out.println("현재 행에서 가장 큰 값의 인덱스: " + tempIdx);
        	System.out.println("결과값: " + answer);        	
        }
        

        return answer;
    }

	static int solution(int[][] land) {
		/**
		테스트 1 〉	실패 (0.24ms, 53.4MB)
		테스트 2 〉	실패 (0.25ms, 53.5MB)
		테스트 3 〉	실패 (0.25ms, 53.3MB)
		테스트 4 〉	실패 (0.26ms, 54.4MB)
		테스트 5 〉	실패 (0.25ms, 53MB)
		테스트 6 〉	실패 (0.26ms, 53.4MB)
		테스트 7 〉	실패 (0.27ms, 52.8MB)
		테스트 8 〉	실패 (0.17ms, 54.6MB)
		테스트 9 〉	실패 (0.24ms, 54.5MB)
		테스트 10 〉	실패 (0.25ms, 54.4MB)
		테스트 11 〉	실패 (0.27ms, 52.4MB)
		테스트 12 〉	실패 (0.29ms, 52.6MB)
		테스트 13 〉	실패 (0.25ms, 53.4MB)
		테스트 14 〉	실패 (0.26ms, 52.9MB)
		테스트 15 〉	실패 (0.27ms, 52.7MB)
		테스트 16 〉	실패 (0.26ms, 52.7MB)
		테스트 17 〉	실패 (0.27ms, 52.4MB)
		테스트 18 〉	실패 (0.17ms, 53.8MB)
		
		테스트 1 〉	실패 (12.12ms, 94MB)
		테스트 2 〉	실패 (9.84ms, 86.6MB)
		테스트 3 〉	실패 (8.08ms, 86.1MB)
		테스트 4 〉	실패 (10.43ms, 86.7MB)
		 */
		/*
		 1. 첫번째 행의 첫번째 원소를 저장한다 (int big)
		 2. 다음 원소의 값이 저장한 값보다 크다면 큰 값을 저장한다 
		 3. 그리고 저장한 값의 인덱스도 저장한다 (int idx)
		 4. 두번째 행이 시작되기 전에 answer += big; big = 0; 으로 할당 및 초기화를 시켜준다.
		 5. idx와 big에 저장하려는 현재 원소의 인덱스가 동일하지 않다면 
		 	두번째 행의 첫번째 원소를 저장한다(1번과 동일)
		 6. 나머지 로직은 동일 
		 */
        int answer = 0;
        int idx = 0;
        int count = 0;
        
        for(int i = 0; i < land.length; i++) {
        	int big = land[i][0];
        	int tempIdx = 0;
        	count++;
        	
        	for(int j = 1; j < land[i].length; j++) {
        		if(count > 2) {	
        			count = 0;	//연속적으로 나왔었다면 초기화 
        		}else {
	        		if(idx != j) {
	        			if(big < land[i][j]) {
	        				big = land[i][j];
	        				tempIdx = j;        				
	        			}
	        		}
        		}
        	}
        	if(count < 2) {
        		idx = tempIdx;
        	}
        	
        	answer += big;
        	System.out.println("현재 행에서 가장 큰 값: " + big);
        	System.out.println("현재 행에서 가장 큰 값의 인덱스: " + tempIdx);
        	System.out.println("결과값: " + answer);
        }
        

        return answer;
    }
}
