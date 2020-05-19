package done;

import java.util.Scanner;

public class A9550 {
	public static void main(String[] args) {
		/* 아이들은 사탕을 좋아해
		 * https://www.acmicpc.net/problem/9550
		 * 
		 * 1. 사탕 종류 N, 최소 먹을 양 K, 손님 카운트 count = 0;
		 * 2. 테스트 케이스 T만큼 돈다
		 * 3. 사탕 개수 N만큼 돈다
		 * 4. 사탕 a, 사탕 b, 사탕 c에 대한 각각의 개수를 받는다
		 * 5. count += 각 사탕 개수를 K로 나눈 몫  
		 * 6. 최종 리턴값 count
		 */

		Scanner sc = new Scanner(System.in);
		
		final int T;
		
		T = sc.nextInt();
	
		for(int i = 0; i < T; i++) {
			int count = 0;
			final int N = sc.nextInt();
			final int K = sc.nextInt();
			
			for(int j = 0; j < N; j++) {
				int temp;
				
				temp = sc.nextInt();				
				count += (temp / K);
			}
			System.out.println(count);
		}		
	}
}
