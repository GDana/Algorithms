package done;

import java.util.Scanner;

public class A2522 {
	public static void main(String[] args) {
		/* 별 찍기 - 12
		 * https://www.acmicpc.net/problem/2522
		 * 
		 * 1. 입력값을 받는다
		 * 2. 열 = 입력값
		 * 3. 행 = 입력값
		 * 4. 역행 = 입력값 -1
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < num-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < num; i++) {
			for(int j = num-i; j < num; j++) {
				/*
				 * 2 < 3 = 1
				 * 1 < 3 = 2
				 */
				System.out.print(" ");
			}
			for(int k = 0; k < num-i; k++) {
				/*
				 * 0 < 2 = 2
				 * 1 < 1 = 1 
				 */
				System.out.print("*");
			}
			System.out.println();
		}
	
		sc.close();
	}
}
