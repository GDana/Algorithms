package baekjoon.done;

import java.util.Scanner;

public class A2442 {

	public static void main(String[] args) {
		/* �� ��� - 5
		 * https://www.acmicpc.net/problem/2442
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���");
		final int N = sc.nextInt();
		
		for(int i = 1; i <= N ; i++) {
			for(int j = 0; j < N-i; j++)
//				System.out.print(j);
				System.out.print(" ");
			for(int k = 0; k < i*2-1; k++)
//				System.out.print(k);
				System.out.print("*");
			System.out.println();
		}
		
		sc.close();
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < N-i; j++) {	// ����
//				System.out.print(" ");				
//			}
//			for(int k = 0; k <= i; k++) {	// *
//				System.out.print("*");
//			}
//			for(int m = 0; m < i; m++) {	// *
//				System.out.print("*");
//			}
//			for(int l = 0; l < N-i; l++) {	// ����
//				System.out.print(" ");				
//			}
//			System.out.print("\n");
//		}		
	}
}
