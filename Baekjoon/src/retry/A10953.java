package retry;

import java.util.ArrayList;
import java.util.Scanner;

public class A10953 {
	public static void main(String[] args) {
		/* A + B - 6
		 * https://www.acmicpc.net/problem/10953
		 * 
		 * retry 
		 * -A, B�� ���� �޴� �Ϳ� ���Ͽ�
		 * -������� ���ڸ� ���� ���ΰ�
		 */
		Scanner sc = new Scanner(System.in);

		final int T;
		int a, b;
		String line;

		T = sc.nextInt();
				
		for(int i = 0; i < T; i++) {
			line = sc.next();
			a = Integer.parseInt(line.substring(0,1));
			b = Integer.parseInt(line.substring(2));
			System.out.println(a+b);
		}
	}
}

