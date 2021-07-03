package inProgress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A11726 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		int size = 4;
//		
//		int[] dp = new int[size+1];
//		dp[0] = 1;
//		dp[1] = 1;
//		
//		if(size >= 2) {
//			for(int i = 2; i <= size; i++) {
//				dp[i] = (dp[i-1]) + (dp[i-2]) % 10007;
//			}
//		}
//		
//		System.out.println(dp[size]);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		
		int result = tile(target);
		System.out.println(result);
	}
	
	public static int tile(int size) {
		int[] dp = new int[size+1];
		dp[0] = 1;
		dp[1] = 1;
		
		if(size >= 2) {
			for(int i = 2; i <= size; i++) {
				dp[i] = (dp[i-1]) + (dp[i-2]) % 10007;
			}
		}
		
		return dp[size];
	}
}
