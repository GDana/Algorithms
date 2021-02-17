package sort;

import java.util.Scanner;

public class A2751 {
	public static void main(String[] args) {
		/* �� �����ϱ� 2
		 * https://www.acmicpc.net/problem/2751
		 * 
		 * �ڷᱸ�� : ���� ����
		 */
		
		/*
		 *  1. �迭 ������ 1/2�� ���� �ɰ��� left, right�� �����
		 *  2. left, right �迭�� ������� ��ȸ�ؼ� �����ϴ� �Լ��� �����
		 *  3. �����ϴٰ� left < right �� ���̻� ������ ���Ұ� ���� ��.... ����? 
		 */
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int [] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
	}
	
	public static void merge(int arr[], int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		int temp[] = new int[arr.length];
		
		while(i <= mid && j <= right) {
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			}
		}
	}
}
