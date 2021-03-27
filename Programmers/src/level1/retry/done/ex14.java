package level1.retry.done;

import java.util.Arrays;

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
		

		System.out.println(solution4(10));	//4
		//System.out.println(solution4(5));	//3
		
	}
	
	public static int solution4(int n) {
		System.out.println("::::: 다시 풀기(2) :::::");
        int answer = 0;
        int[] number = new int[n+1];
        
        //2부터 n까지의 수를 배열에 넣는다.
        for(int i=2; i<=n; i++) {
            number[i] = i;
        }
        
        for(int i = 2; i <= n; i++) {	//i는 소수가 될 수 있는 2~n까지의 수 
        	if(number[i] == 0) continue;	//만약 i == 4라면 2의 배수이며 소수가 아니기 때문에 저장된 값이 '0'일 것이다. 이럴경우를 위하여 continue 처리.
        	
        	for(int j = 2 * i; j <= n; j += i) {	//i의 배수들은 모두 0으로 저장 
        		number[j] = 0;
        		//System.out.println("j: " + j + ", n: " + n + ", i: " + i);
        	}
        }
        /*
        for(int i = 0; i < number.length; i++) {
        	System.out.print(number[i] + " ");
        }
        */
        for(int i = 0; i < number.length; i++) {
        	if(number[i] != 0) {
        		answer++;
        	}
        }
        
        
        return answer;
    }
	
	public static int solution3(int n) {
		System.out.println("::::: 다시 풀기(1) :::::");
		System.out.println("시간 초과로 실패 ");
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
        	boolean flag = true;
        	
        	for(int j = 2; j < i; j++) {
        		if(i % j == 0) {
        			flag = false;
        			break;
        		}
        	}
        	if(flag) answer++;        	
        }
        System.out.println("answer: " + answer);
        
        return answer;
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
		System.out.println("::::: 처음 제출했던 코드 :::::");
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