package done;

import java.util.Scanner;

public class A2739 {
	public static void main(String[] args) {
		/* 구구단
		 * https://www.acmicpc.net/problem/2739
		 * 
		 * 1. N 입력값을 받는다
		 * 2. 1 < N < 9 
		 * 3. N * 1 ~ 9
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		for(int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
}
