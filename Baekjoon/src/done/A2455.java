package done;

import java.util.Scanner;

public class A2455 {
	public static void main(String[] args) {
		/* 지능형 기차
		 * https://www.acmicpc.net/problem/2455
		 * 
		 * 1. int max, minus, plus, curr
		 * 2. for, 4번 반복
		 * 3. 입력값 minus, plus = sc.nexint();
		 * 4. minus가 0일 때 plus == max
		 * 5. (!curr < minus)
		 * 6. plus - minus = curr
		 * 7. if(max > curr){ max = max }else{ max = curr }
		 */

		Scanner sc = new Scanner(System.in);		
		int max = 0, minus = 0, plus = 0, curr = 0;
		
		for(int i = 0; i < 4; i++) {
			minus = sc.nextInt();
			plus = sc.nextInt();
			
			if(minus == 0) {
				curr = plus;
				max = curr;
			}else {				
				curr = (curr - minus) + plus;
				
				if(max > curr) {
					max = max;
				}else {
					max = curr;
				}
			}
		}
		System.out.println(max);
	}
}

