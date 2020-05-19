package retry;

import java.util.Scanner;

public class A11050 {
	static long choose(int n, int m) {
		if(n == m || m == 0) {
			return 1;
		}
		
		return choose(n - 1, m - 1) + choose(n - 1, m);
		
	}
	public static void main(String[] args) {
		/* 이항 계수 1
		 * https://www.acmicpc.net/problem/11050
		 */
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(choose(a, b));
	}
}
