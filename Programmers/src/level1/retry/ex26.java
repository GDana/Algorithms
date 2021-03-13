package level1.retry;

import java.util.Arrays;

public class ex26 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 최대공약수와 최소공배수
		/*
		 * 1. 최대공약수를 구한다 
		 * 2. 최대공약수를 구하면 공배수를 구할 수 있다. (	n * m / 최대공약수)
		 * 3. 공약수가 1과 자기자신밖에 없는 경우를 고려해야 한다. 
		 * 
		 * 1. n, m 둘 중에 작은 수로 2 ~ n크기 만큼 반복문을 돌린다. 
		 * 2. i로 나눠지는 수를 저장한다.
		 * 3. 2 ~ m 크기 만큼 반복문을 돌린다.
		 * 4. j로 나눠지는 수가 저장한 i와 같을 때 break;
		 * 5. 만약 num == 0 같다면 최대공약수는 1 
		 */
		
		//solution(3, 12);
		//solution(2, 5);
	}

	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int num = 0;
        
        if(n / 2 == 1 || n % 2 > 0) {
        	num = 1;
        	answer[0] = num;
        }else {
	        //최대공약수 구하기 
	        for(int i = 2; i <= n; i++) {
	        	if(n % i == 0) {
	        		num = i;
	        		break;
	        	}
	        }
	        for(int j = 2; j <= m; j++) {
	        	if(m % j == 0 && num == j) {
	        		break;
	        	}
	        }
        }
        
        System.out.println("최대공약수: " + num);
        
        //최대공배수 구하기
        if(num == n) {
        	answer[0] = 1;
        }else {
        	answer[0] = num;        	
        }
        answer[1] = (n * m) / num;
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}
