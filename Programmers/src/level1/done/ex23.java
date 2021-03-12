package level1.done;

import java.util.Arrays;

public class ex23 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > x만큼 간격이 있는 n개의 숫자 
		/*
		 * 1. n 크기를 갖는 배열을 선언한다 
		 * 2. n 크기만큼 반복문을 실행한다 
		 * 3. answer[i] = sum + x    
		 */

		solution2(2, 5);
		solution2(4, 3);
		solution2(-4, 2);
	}
	
	public static long[] solution2(int x, int n) {
		System.out.println("::::: 다른 사람 풀이 :::::");
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
	
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0;
        
        for(int i = 0; i < answer.length; i++) {
        	sum += x;
        	answer[i] = sum;
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }

}
