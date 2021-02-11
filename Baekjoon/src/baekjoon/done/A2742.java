package baekjoon.done;

import java.util.Scanner;

public class A2742 {
	public static void main(String[] args) {
		//https://www.acmicpc.net/problem/2742
		Scanner scan = new Scanner(System.in);
		final int N;
		
		N = scan.nextInt();
		for(int i = 0; i < N; i++) {
			System.out.println(N - i);
		}
	}
}
