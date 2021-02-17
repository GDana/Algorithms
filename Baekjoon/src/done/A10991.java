package done;

import java.util.Scanner;

public class A10991 {
	public static void main(String[] args) {
		/* �� ��� - 16
		 * https://www.acmicpc.net/problem/10991
		 */

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < N-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i*2-1; k++) {
				if(k == 0 || k == i*2-2 || k % 2 == 0){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
