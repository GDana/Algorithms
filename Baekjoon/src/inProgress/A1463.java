package inProgress;

import java.util.Scanner;

public class A1463 {
	public static void main(String[] args) {
		/* 1�� ����� 
		 * https://www.acmicpc.net/problem/1463
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int two = 0;
		int three = 0;
		
		int temp = n;

		while (temp > 1) {
			if (temp % 2 == 0) {
				temp /= 2;
				two++;
			} else {
				temp -= 1;
				two++;
			}
		}
		while (n > 1) {
			if (n % 3 == 0) {
				n /= 3;
				three++;
			} else {
				n -= 1;
				three++;
			}
		}
		System.out.println(two);
		System.out.println(three);
		if(two < three) {
			System.out.println(two);
		}else {
			System.out.println(three);
		}
	}
}
