package inProgress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A11726 {
	/**
	 * 다이나믹 프로그래밍 
	 * - 규칙을 찾아 규칙으로 하여금 점화식을 세우는 것 
	 * 
	 * 11726, 2xn 타일링
	 * - 반복해서 더하는 서로 다른 값이  
	 *   조금만 커지면 선언한 자료형보다 커질 수 있기 때문에 
	 *   overflow를 막기 위해 나머지 값을 구함으로써 결과값을 조절한다.
	 *   
	 * - 조건에 주어진 2x1, 1x2 타일이 핵심 
	 * - n이 3이든 4이든 무엇으로 주어지든 2x1, 1x2로 만들 수 있는 기본 모양을 경우의 수로 친다.
	 * - 점화식에 사용할 기본 모양이 될 수 없는 예 
	 * (n이 3일 경우) 
	 * 1x2 타일을 3개 연달아 붙이는건 결국 1x2로 그릴 수 있는 모양이기 때문에 중복되어서 경우의 수가 될 수 없다. 
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		
		/**
		 * bottom-up(반복문, 상향식)
		 */
//		int[] dp = new int[target+1];
//		dp[0] = 1;
//		dp[1] = 1;
//		dp[2] = 2;
//		
//		for(int i = 3; i <= target; i++) {
//			dp[i] = (dp[i-1]) + (dp[i-2]) % 10007;
//		}
//        
//		System.out.println(dp[target]);
		
		//재귀 
		System.out.println(tile(target));
	}
	
	/**
	 * top-down(재귀, 메모제이션) 
	 */
	public static int tile(int target) {
		int[] dp = new int[1001];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i <= target; i++) {
			dp[i] = (tile(i-1) + tile(i-2)) % 10007;
		}
		
		return dp[target];
	}
}
