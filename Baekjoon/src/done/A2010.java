package done;

import java.util.Scanner;

public class A2010 {
	public static void main(String[] args) {
		/* 플러그
		 * https://www.acmicpc.net/problem/2010 
		 * 
		 * 1. 멀티탭 개수를 입력받는다
		 * 2. 개수만큼 for문을 돈다
		 * 3. 각 멀티탭이 몇구인지 입력받는다
		 * 4. 입력값 중 가장 큰 값을 출력
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
