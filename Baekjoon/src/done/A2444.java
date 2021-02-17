package done;

import java.util.Scanner;

public class A2444 {
	public static void main(String[] args) {
		/* ����� - 7
		 * https://www.acmicpc.net/problem/2444
		 */
		System.out.println("��ü �ֱ׷��°ɱ�?");
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		/* N = 5
		 * N*2-1 = 9
		 * 
		 * j = 0,1,2,3,4
		 * (j * 2)
		 * 0 = 0 
		 * 1 = 2
		 * 2 = 4
		 * 3 = 6
		 * 4 = 8
		 */
		
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < N-i; j++) {
				System.out.print("j");
			}
			for(int j = 0; j < i*2-1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		for(int i = 1; i < N; i++) {
			for(int j = N-i; j < N; j++) {
				System.out.print("j");
			}
			for(int j = i*2; j < (N*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
