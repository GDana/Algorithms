package dataStructrue;

import java.util.Scanner;

public class A2751 {
	public static void main(String[] args) {
		/* 수 정렬하기 2
		 * https://www.acmicpc.net/problem/2751
		 * 
		 * 자료구조 : 병합 정렬
		 */
		
		/*
		 *  1. 배열 길이의 1/2로 각각 쪼개는 left, right를 만든다
		 *  2. left, right 배열을 순서대로 조회해서 정렬하는 함수를 만든다
		 *  3. 정렬하다가 left < right 을 더이상 수행할 원소가 없을 때.... 리턴? 
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
