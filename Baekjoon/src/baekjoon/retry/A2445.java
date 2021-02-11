package baekjoon.retry;

import java.util.Scanner;

public class A2445 {
	public static void main(String[] args) {
		/* �� ��� - 8
		 * https://www.acmicpc.net/problem/2445
		 * 
		 * retry 
		 * -�������� ������ ������ �Ӹ��� ������ ����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		final int N = sc.nextInt();
		
		for(int i = 1; i < N; i++) {
			for(int j = N-i; j < N; j++) {
				System.out.print("*");
			}
			for(int j = i*2; j < N*2; j++) {
				System.out.print(" ");				
			}
			for(int j = N-i; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �Ǵ� �ڵ�2
//		for(int i = 1; i <= N; i++) {
//			for(int j = 0; j <= N-i; j++) {
//				System.out.print("*");
//			}
//			for(int j = 1; j < i*2-1; j++) {
//				System.out.print(" ");				
//			}
//			for(int j = 0; j <= N-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// �Ǵ� �ڵ�1
		for(int i = 1; i <= N; i++) {
			for(int j = i; j <= N; j++) {
				System.out.print("*");
			}
			for(int j = 1; j < i*2-1; j++) {
				System.out.print(" ");				
			}
			for(int j = i; j <= N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �����ߴ� �ڵ�
//		for(int i = 0; i <= N; i++) {
//			for(int j = i; j < N; j++) {
//				System.out.print("*");
//			}
//			for(int j = i; j < i*2-1; j++) {
//				System.out.print(" ");				
//			}
//			for(int j = i; j < N; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	System.out.println(1 < -1);
		
		sc.close();

	}

}
