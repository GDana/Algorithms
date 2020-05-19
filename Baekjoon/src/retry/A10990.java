package retry;

import java.util.Scanner;

public class A10990 {
	public static void main(String[] args) {
		/* º° Âï±â - 15
		 * https://www.acmicpc.net/problem/10990
		 */

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int j = N-i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
				if(j == 0 || j == i*2-2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}			
			System.out.println();
		}
		
//		for(int i = 1; i <= N; i++) {
//			for(int j = 0; j < N-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k < N; k++) {
//				if(k == N-i) {
//					System.out.print("*");
//				}
//			}			
//			System.out.println();
//		}
		
	}
}
