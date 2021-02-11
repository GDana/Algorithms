package baekjoon.done_solution;

import java.util.ArrayList;
import java.util.Scanner;

public class A1292 {
	public static void main(String[] args) {
		/*
		 * ���� Ǫ�� ���� https://www.acmicpc.net/problem/1292
		 */

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int[] arr = new int[end];
		int plag = 1;
		int n = 0;
		
		int sum = 0;
		
		for (int i = 0; i < end; i++) {
			arr[i] = plag;
			n++;
			System.out.println(plag);
			System.out.println(n);
			
			if (plag == n) {
				System.out.println("if�� , " + "plag = " + plag + ", n = " + n);
				n = 0;
				plag++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

//		for (int i = start - 1; i < end; i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);

//		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> arr = new ArrayList<>();
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int sum = 0;
//		
//		for(int i = 0; i < num2; i++) {
//			//���� ����
//			int temp = i+1;
//			
//			//���ڸ� ���� Ƚ��
//			for(int j = 0; j < temp; j++) {
////				System.out.print(temp);
//				arr.add(temp);
//				
//			}
//		}
//		
//		for(int i = 0; i < arr.size(); i++) {
//			if(i >= (num1-1) && i <= (num2-1)) {
////				System.out.print(arr.get(i));			
//				sum += arr.get(i);
//			}
//		}
//		System.out.println(sum);
	}
}
