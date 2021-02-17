package inProgress;

import java.util.Scanner;

public class A2753 {
	public static void main(String[] args) {
		/* ����
		 * https://www.acmicpc.net/problem/2753
		 * 
		 * �����ڵ�
		 * 1. int �Է°��� �޴´�
		 * 2. �Է°��� 4�� ����̰ų� 100�� ����̸�
		 * 3. 0
		 * 4. �ƴϸ� 1
		 */

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year < 4000 && year >= 1) {			
			if(year % 4 == 0) {			
				if(year % 100 != 0 || year % 400 == 0) {
					System.out.println(1);
				}
			}else {
				System.out.println(0);
			}		
		}
	}
}
