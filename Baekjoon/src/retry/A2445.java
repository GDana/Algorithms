package retry;

import java.util.Scanner;

public class A2445 {
	public static void main(String[] args) {
		/* 별 찍기 - 8
		 * https://www.acmicpc.net/problem/2445
		 * 
		 * retry 
		 * -역방향을 구현할 떄마다 머리가 막히는 원인
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
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
		
		// 되는 코드2
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
		
		// 되는 코드1
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
		
		// 실패했던 코드
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
