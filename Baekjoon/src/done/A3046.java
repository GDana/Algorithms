package done;

import java.util.Scanner;

public class A3046 {
	public static void main(String[] args) {
		/* R2
		 * https://www.acmicpc.net/problem/3046
		 * 
		 * 1. 입력값으로 두 정수(int R1, S)를 받는다
		 * 2. R2 = (S*2) - R1
		 */

		Scanner sc = new Scanner(System.in);
		final int R1, R2, S;
		
		R1 = sc.nextInt();
		S = sc.nextInt();
		R2 = (S*2) - R1;
		
		System.out.println(R2);
	}
}
