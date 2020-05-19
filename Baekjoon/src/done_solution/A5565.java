package done_solution;

import java.util.Scanner;

public class A5565 {
	public static void main(String[] args) {
		/* 영수증
		 * https://www.acmicpc.net/problem/5565
		 * 
		 * 1. 입력값을 배열에 담는다 - sc.nextInt();
		 * 2. 배열[1] ~ 배열[9] 까지 더한 값을 temp에 저장
		 * 3. 배열[0] ~ temp 한 값을 출력한다
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
		
		
		// 다른 풀이
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
