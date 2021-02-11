package baekjoon.done;

import java.util.Scanner;

public class A2438 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2438
		Scanner sc = new Scanner(System.in);
		
		final int T;
		
		T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			for(int k = T; k > i+1; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {				
				System.out.print('*');
			}
			System.out.println("");
		}
	}
}
