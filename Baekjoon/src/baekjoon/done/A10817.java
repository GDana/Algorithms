package baekjoon.done;

import java.util.Scanner;

public class A10817 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10817
		Scanner scan = new Scanner(System.in);
		final int A, B, C;
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		
		/*
		 * A < B < C	// C < B < A
		 * A < C < B // B < C < A
		 * C < A < B // B < A < C
		 */
		
		if(A <= B && B <= C) {
			System.out.println(B);
		}else if(C <= B && B <= A) {
			System.out.println(B);
		}else if(A <= C && C <= B) {			
			System.out.println(C);
		}else if(B <= C && C <= A) {
			System.out.println(C);
		}else if(C <= A && A <= B) {			
			System.out.println(A);
		}else if(B <= A && A <= C) {
			System.out.println(A);
		}
	}
}
