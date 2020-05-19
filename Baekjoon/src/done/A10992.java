package done;

import java.util.Scanner;

public class A10992 {
	public static void main(String[] args) {
		/* º° Âï±â - 17
		 * https://www.acmicpc.net/problem/10992
		 */

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < N-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
				if(j == 0 || j == i*2-2) {
					System.out.print("*");
				}else if(i == N) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}						
			}
			System.out.println();
		}
	}
}
