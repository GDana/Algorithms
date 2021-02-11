package baekjoon.done_solution;

import java.util.Scanner;

public class A5565 {
	public static void main(String[] args) {
		/* ������
		 * https://www.acmicpc.net/problem/5565
		 * 
		 * 1. �Է°��� �迭�� ��´� - sc.nextInt();
		 * 2. �迭[1] ~ �迭[9] ���� ���� ���� temp�� ����
		 * 3. �迭[0] ~ temp �� ���� ����Ѵ�
		 */

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(i >= 1) {
				temp += arr[i]; 				
			}
		}
		System.out.println(arr[0] - temp);
		
		
		// �ٸ� Ǯ��
//		Scanner sc = new Scanner(System.in);
//		int result = sc.nextInt();
//		
//		for(int i = 0; i < 9; i++) {
//			result -= sc.nextInt();
//		}
//		
//		System.out.println(result);
	}
}
