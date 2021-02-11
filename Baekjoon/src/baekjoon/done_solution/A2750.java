package baekjoon.done_solution;

import java.util.Scanner;

public class A2750 {
	public static void main(String[] args) {
		/* �� �����ϱ�
		 * https://www.acmicpc.net/problem/2750
		 */

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}		
		
		for(int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			
			for(int j = 0; j < arr.length; j++) {
				if(temp < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}						
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
