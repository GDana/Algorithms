package sort;

import java.util.Scanner;

public class A2750 {
	public static void main(String[] args) {
		/* �� �����ϱ�
		 * https://www.acmicpc.net/problem/2750
		 * 
		 * �ڷᱸ�� : ���� ���� 
		 */
		
		/* �����ڵ�
		 * 1. N�� �ٿ� ���ڸ� �Է¹޴´� ->�迭�� ����
		 * 2. ���ڴ� ���ͷ� ���еȴ�
		 * 3. �񱳴���� �� ���ڸ� �����Ѵ� ->arr[1]
		 * 4. �񱳴�󺸴� -1���� �ε����� ���� ���� �񱳴��� ���Ѵ�
		 * 5. ũ�ٸ� �񱳴���� ��ġ�� �����Ѵ�
		 * 6. 4������ +1ū �ε����ڸ��� �񱳴���� ���� �����Ѵ�(�� ��ȭ�� �ڸ� ������ ���� ��)
		 */

		Scanner sc = new Scanner(System.in);
	
		final int N = sc.nextInt();
		int arr [] = new int[N];
		
		// 1��
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
				
		for(int j = 1; j < arr.length; j++) {
			// 3��
			int temp = arr[j];
			int k;
			
			for(k = j-1; k >= 0 && arr[k] > temp; k--) {
				arr[k+1] = arr[k];
			}
			arr[k+1] = temp;
		}
		
		numPirnt(arr);
	}
	
	static void numPirnt(int arr []) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
