package baekjoon.done;

import java.util.Scanner;

public class A2010 {
	public static void main(String[] args) {
		/* �÷���
		 * https://www.acmicpc.net/problem/2010 
		 * 
		 * 1. ��Ƽ�� ������ �Է¹޴´�
		 * 2. ������ŭ for���� ����
		 * 3. �� ��Ƽ���� ����� �Է¹޴´�
		 * 4. �Է°� �� ���� ū ���� ���
		 * 
		 * 3 = 6
		 * 5
		 * 2
		 * 1
		 * 
		 * 3
		 * 2
		 * 6
		 * 4
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			max += temp;
		}
		System.out.println(max - (n - 1));
	}
}
