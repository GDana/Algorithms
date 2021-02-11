package baekjoon.done;

import java.util.Scanner;

public class A2914 {

	public static void main(String[] args) {
		/* ���۱�
		 * https://www.acmicpc.net/problem/2914
		 */

		Scanner sc = new Scanner(System.in);
		
		final int A = sc.nextInt();
		int I = sc.nextInt();
		final int B = (A*(I-1)) + 1;
		
		System.out.println(B);
	}

}
