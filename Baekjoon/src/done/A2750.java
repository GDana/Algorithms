package done;

import java.util.Scanner;

public class A2750 {
	public static void main(String[] args) {
		/* 수 정렬하기
		 * https://www.acmicpc.net/problem/2750
		 * 
		 * 자료구조 '삽입 정렬' 실습을 위해 다시 풀어봄
		 */
		
		/* 수도코드
		 * 1. N개 줄에 숫자를 입력받는다 ->배열로 저장
		 * 2. 숫자는 엔터로 구분된다
		 * 3. 비교대상이 될 숫자를 저장한다 ->arr[1]
		 * 4. 비교대상보다 -1작은 인덱스를 가진 값을 비교대상과 비교한다
		 * 5. 크다면 비교대상의 위치에 저장한다
		 * 6. 4번보다 +1큰 인덱스자리에 비교대상의 값을 저장한다(즉 변화가 자리 변동이 없는 것)
		 */

		Scanner sc = new Scanner(System.in);
	
		final int N = sc.nextInt();
		int arr [] = new int[N];
		
		// 1번
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
				
		for(int j = 1; j < arr.length; j++) {
			// 3번
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
