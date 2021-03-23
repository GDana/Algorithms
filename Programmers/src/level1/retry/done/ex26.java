package level1.retry.done;

import java.util.Arrays;

public class ex26 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 최대공약수와 최소공배수
		/*
		 * 1. 최대공약수를 구한다 
		 * 2. 최대공약수를 구하면 공배수를 구할 수 있다. (	n * m / 최대공약수)
		 * 3. 공약수가 1과 자기자신밖에 없는 경우를 고려해야 한다. 
		 * 
		 * 
		 * 1. sum = n % 2, sum = n % 2
		 * 2. sum > 1 라면 n, m은 약수로 
		 * 		answer[0] = 1
		 * 		answer[1] = n * m; 
		 * 3. 2번이 false라면 n 또는 m 둘 중 하나가 약수이거나 약수가 아니므로 
		 * 로직 실행 
		 * 
		 * 틀린 알고리즘 
		 * 1. n, m 둘 중에 작은 수로 2 ~ n크기 만큼 반복문을 돌린다. 
		 * 2. i로 나눠지는 수를 저장한다.
		 * 3. 2 ~ m 크기 만큼 반복문을 돌린다.
		 * 4. j로 나눠지는 수가 저장한 i와 같을 때 break;
		 * 5. 만약 num == 0 같다면 최대공약수는 1 
		 */
		
		solution2(3, 12);	//3, 12		
		solution2(2, 5);	//1, 10
	}
	
	public static int[] solution2(int n, int m) {
		System.out.println("::::: 다시 풀기(1) :::::");
		int[] answer = new int[2];
		int a = n;
		int b = m;
		int r, q;
		
		int lcm = 1;
		
		while(true) {
			//q = a / b;
			r = a % b;
			//System.out.println(a + " = " + q + " * " + b + " + " + r);
			
			if(r == 0) {
				break;
			}
			
			a = b;
			b = r;
		}
		
		if(b == 1) {
			System.out.println("서로소이다 " + b);
		}else {
			System.out.println("최대공약수는 " + b + "이다.");
		}		
		lcm = (n * m) / b;
		System.out.println("최대공배수는 " + lcm + "이다.");
		
		answer[0] = b;
		answer[1] = lcm;
		
		System.out.println(Arrays.toString(answer));
		return answer;
	}
	
	public static int[] solution1(int n, int m) {
		int[] answer = new int[2];
		int sum = 0;
		
		sum = n % 2;
		sum += m % 2;
		System.out.println("sum: " +  sum);
		
		if(sum > 1) {
			System.out.println("if");
			answer[0] = 1;
		}else {
			System.out.println("else");
			int num = 0;
			
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
	        
	        answer[0] = num;
		}
		
		answer[1] = (n * m) / answer[0];
		System.out.println(Arrays.toString(answer));
		
		return answer;
	}

	public static int[] solution(int n, int m) {
		System.out.println("::::: 틀린 풀이 :::::");
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
