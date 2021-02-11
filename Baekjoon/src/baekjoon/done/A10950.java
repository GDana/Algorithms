package baekjoon.done;

import java.util.Scanner;

public class A10950 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10950
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int [] arr = new int[num];
	
		for(int i = 0; i < num; i++) {
			final int A, B;
			
			A = scan.nextInt();
			B = scan.nextInt();
			
			arr[i] = A + B;
			continue;
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
