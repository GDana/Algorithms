package level1.done;

public class ex17 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 자릿수 더하기 
		/*
		 * 숫자 -> 문자열 -> 문자열 배열 -> 숫자 연산 
		 * 숫자 -> StringBuilder, new String(Integer.toString(숫자) -> chartAt()  
		 * 
		 */
		

		//solution2(123);
		//solution2(987);
		System.out.println(String.valueOf(123).length());
		System.out.println(String.valueOf(123).substring(0, 1));
		
		/* solution() : StringBuilder를 사용한 풀이 
		테스트 1 〉	통과 (0.06ms, 52MB)
		테스트 2 〉	통과 (0.06ms, 51.6MB)
		테스트 3 〉	통과 (0.06ms, 52.1MB)
		테스트 4 〉	통과 (0.06ms, 52MB)
		테스트 5 〉	통과 (0.06ms, 52.2MB)
		테스트 6 〉	통과 (0.05ms, 51.9MB)
		테스트 7 〉	통과 (0.06ms, 52.4MB)
		테스트 8 〉	통과 (0.06ms, 51.8MB)
		테스트 9 〉	통과 (0.04ms, 51.7MB)
		테스트 10 〉	통과 (0.04ms, 52.5MB)
		테스트 11 〉	통과 (0.06ms, 51.9MB)
		테스트 12 〉	통과 (0.07ms, 51.9MB)
		테스트 13 〉	통과 (0.07ms, 52.1MB)
		테스트 14 〉	통과 (0.06ms, 52.1MB)
		테스트 15 〉	통과 (0.07ms, 52.8MB)
		테스트 16 〉	통과 (0.06ms, 52.6MB)
		테스트 17 〉	통과 (0.06ms, 52.4MB)
		테스트 18 〉	통과 (0.06ms, 52MB)
		테스트 19 〉	통과 (0.06ms, 51.9MB)
		테스트 20 〉	통과 (0.06ms, 53.3MB)
		테스트 21 〉	통과 (0.04ms, 53.2MB)
		 */
		
		/* solution2() : String을 사용한 풀이 
		테스트 1 〉	통과 (0.03ms, 52.4MB)
		테스트 2 〉	통과 (0.03ms, 54.2MB)
		테스트 3 〉	통과 (0.03ms, 52.8MB)
		테스트 4 〉	통과 (0.03ms, 53.2MB)
		테스트 5 〉	통과 (0.05ms, 52.3MB)
		테스트 6 〉	통과 (0.05ms, 52MB)
		테스트 7 〉	통과 (0.03ms, 52.6MB)
		테스트 8 〉	통과 (0.03ms, 51.9MB)
		테스트 9 〉	통과 (0.03ms, 53MB)
		테스트 10 〉	통과 (0.03ms, 52.7MB)
		테스트 11 〉	통과 (0.03ms, 52.6MB)
		테스트 12 〉	통과 (0.04ms, 55.2MB)
		테스트 13 〉	통과 (0.05ms, 52.5MB)
		테스트 14 〉	통과 (0.03ms, 52.3MB)
		테스트 15 〉	통과 (0.04ms, 51.4MB)
		테스트 16 〉	통과 (0.04ms, 52.7MB)
		테스트 17 〉	통과 (0.04ms, 52.2MB)
		테스트 18 〉	통과 (0.05ms, 52.1MB)
		테스트 19 〉	통과 (0.06ms, 52.1MB)
		테스트 20 〉	통과 (0.05ms, 52.4MB)
		테스트 21 〉	통과 (0.03ms, 51.4MB)
		 */
	}
	
	public static int solution2(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        
        for(int i = 0; i < str.length(); i++) {
        	int tmp = Integer.parseInt(str.substring(i, i+1));
        	answer += tmp;
        	System.out.print(tmp + " ");
        }
        System.out.println("\nanswer: " + answer + "\n");
        return answer;
    }

	public static int solution(int n) {
        int answer = 0;
        StringBuilder str = new StringBuilder(Integer.toString(n));
        
        for(int i = 0; i < str.length(); i++) {
        	int tmp = Integer.parseInt(str.substring(i, i+1));
        	answer += tmp;
        	System.out.print(tmp + " ");
        }
        System.out.println("\nanswer: " + answer + "\n");
        return answer;
    }
}
