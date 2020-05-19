package done;

import java.util.Scanner;

public class A2523 {
	public static void main(String[] args) {
		/* º° Âï±â - 13
		 * https://www.acmicpc.net/problem/2523
		 */

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = num-i; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < num; i++) {
			for(int j = i; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
