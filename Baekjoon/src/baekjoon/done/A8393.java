package baekjoon.done;

import java.util.Scanner;

public class A8393 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/8393
		Scanner scan = new Scanner(System.in);
		int n;
		int result = 0;

		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			result = result + i;
		}
		System.out.println(result);
	}
}
