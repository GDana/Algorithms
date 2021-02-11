package baekjoon.done;

import java.util.Scanner;

public class A2443 {
	public static void main(String[] args) {
		/* ����� - 6
		 * https://www.acmicpc.net/problem/2443
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� =>");
		final int N = sc.nextInt();
		
		for(int i = 0; i <= N; i++) {
			for(int j = N-i; j < N; j++) {
				System.out.print(" ");
			}
			for(int j = i*2; j < N*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
