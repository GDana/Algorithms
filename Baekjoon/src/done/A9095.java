package done;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A9095 {
	/**
	 * 1. 정수 n이 주어진다. 
	 * 	이때 활용할 수 있는 수는 1,2,3 이며 
	 *  한개 이상의 수와 합하여 정수 n을 만들어야 한다.
	 *  1 + ?
	 *  2 + ?
	 *  3 + ?
	 *  
	 * 2. 활용할 수 있는 1,2,3에 대한 경우의 수
	 *	예) n = 4 
	 *  1이 n이 되기 위해 더해야 할 수 = 3
	 * 	2가 n이 되기 위해 더해야 할 수 = 2
	 *	3가 n이 되기 위해 더해야 할 수 = 1
	 *
	 * 3. 2번에서 도출된 3,2,1을 바꿔 생각해보면, 
	 * 숫자 '3'을 만들기 위해 활용할 수 있는 1,2,3으로 만들 수 있는 경우의 수는 
	 * 	1+1+1, 1+2, 2+1, 3
	 * 총 4가지이다.
	 * 
	 * 그렇다면 숫자 '3'이 n가 되기 위해서는 
	 * 위의 경우에 수들에 각각 1씩 더해주면 
	 *  1+1+1 = 3(+1) = 4
	 *  1+2 = 3(+1) = 4
	 *  2+1 = 3(+1) = 4
	 *  3 = 3(+1) = 4
	 * 3이 되기 위한 경우의 수는 
	 * 4가 될 수 있는 경우의 수가 될 수 있다.
	 * 
	 * 
	 * [참고 링크]
	 * https://cutt.ly/JmmTMNS
	 * https://cutt.ly/wmmT2Rw
	 */
	static int[] dp = new int[11];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.println("--- 횟수 입력 ---");
		int length = Integer.parseInt(br.readLine());
		
		//bottom-up, 132ms
//		dp[0] = 0;
//		dp[1] = 1;
//		dp[2] = 2;
//		dp[3] = 4;
//		
//		for(int j = 4; j < dp.length; j++) {
//			dp[j] = dp[j-1] + dp[j-2] + dp[j-3]; 
//		}
		
		for(int i = 0; i < length; i++) {
			int target = Integer.parseInt(br.readLine());
			
			//bottom-up
//			bw.write(String.valueOf(dp[target]) + "\n");
			
			//top-down
			bw.write(String.valueOf(topDown(target) + "\n"));
		}
		
		bw.flush();
	}
	
	/*
	 * top-down, 148ms
	 */
	public static int topDown(int target) {
		if(target == 1) return 1;
		if(target == 2) return 2;
		if(target == 3) return 4;
		
		dp[target] = topDown(target-1) + topDown(target-2) + topDown(target-3);
		
		return dp[target];
	}
}
