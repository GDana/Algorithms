package baekjoon.done;

import java.util.Scanner;

public class A10871 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10871
		Scanner sc = new Scanner(System.in);
		final int N, X;
		int [] arr;
		
		System.out.println("N���� X���� �Է��ϼ���");
		
		N = sc.nextInt();
		X = sc.nextInt();
		
		arr = new int[N];
		
		for(int i = 0; i < N; i ++) {
			arr[i] = sc.nextInt(); 
		}
		
		for(int i = 0; i < N; i ++) {
			if(arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
