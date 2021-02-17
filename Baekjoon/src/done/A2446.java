package done;

import java.util.Scanner;

public class A2446 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2446
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j  < i; j++) {
				System.out.print(" ");
			}
			for(int j = i*2; j < N*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2; i <= N; i++) {
			for(int j = i; j  < N; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
