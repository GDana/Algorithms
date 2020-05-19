package retry;

import java.util.Scanner;

public class A2588 {
	public static void main(String[] args) {
		/* 곱셈
		 * https://www.acmicpc.net/problem/2588
		 * 
		 * retry
		 * -(2)위치에 들어올 수를 마지막 자리부터 조회하는 방법을 어떻게 구현할 것인가
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int a, b, result;
		String c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = Integer.toString(b);
		
		for(int i = c.length(); i > 0; i--) {
//			System.out.println(c.substring(i, i+1));
			
			result = Integer.parseInt(c.substring(i-1, i));
			System.out.println(a * result);
			
//			System.out.println(b.charAt(b.length() - i));
//			c += b.charAt(b.length() - i);
//			System.out.println(Integer.parseInt(a));		
//			System.out.println(c);
			
//			System.out.println(Integer.parseInt(a) * b.charAt(b.length() - i));
		}
		result = a * b; 
		System.out.println(result);
	}
}
