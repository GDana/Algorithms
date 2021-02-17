package inProgress;

import java.util.Scanner;

public class A14720 {

	public static void main(String[] args) {
		/* ���� ����
		 * https://www.acmicpc.net/problem/14720
		 */

		Scanner sc = new Scanner(System.in);
		
		/* ����2, ���� �ڵ�
		 * 1. ���� �� N�� �Է� �޴´�
		 * 2. �� ���Ը��� �Ĵ� ���� ������ N�� ��ŭ �Է¹޴´�
		 * 3. '0,1,2,0'�� ������ ���� �迭 arr�� �����Ѵ�.
		 * 4. arr�� ������ ������ �������� ������ ��ġ �Ѵٸ�
		 * 5. count += 1;
		 */
		
		
		int n = sc.nextInt();
	    int[] array = new int[n];
	    int[][] dp = new int[n][3];
	 
	    for (int i = 0; i < n; i++) {
	        array[i] = sc.nextInt();
	        System.out.print(array[i] + " ");
	    }
	    System.out.println();
	 
	    if (array[0] == 0) {
	        dp[0][0] = 1;
	    }
	    
//	    for (int i = 0; i < dp.length; i++) {
//	    	for (int j = 0; j < dp[i].length; j++) {
//	    		System.out.println("dp[" + i + "][" + j + "] = " + dp[i][j]);
//	    	}
//	    }
	    
	    for (int i = 1; i < n; i++) {
	        int milk = array[i];
	 
	        // i = 1
	        // dp[i][0] = milk(1)
	        // 1 == 0�� false
	        // dp[i-1][0] = milk(1)
	        dp[i][0] = milk == 0 ? dp[i - 1][2] + 1 : dp[i - 1][0];	
	        System.out.println("dp[" + i + "][0] = " + dp[i][0]);
	        
	        // i = 1
	        // dp[i][0] = milk(1), dp[i][2](0) < dp[i][0](1)
	        // 1 == 1 && 0 < 1
	        // dp[i - 1][0] + 1 = milk(1)
	        dp[i][1] = milk == 1 && dp[i][2] < dp[i][0] ? dp[i - 1][0] + 1 : dp[i - 1][1];
	        System.out.println("dp[" + i + "][1] = " + dp[i][1]);
	        
	        dp[i][2] = milk == 2 && dp[i][0] < dp[i][1] ? dp[i - 1][1] + 1 : dp[i - 1][2];
	        System.out.println("dp[" + i + "][2] = " + dp[i][2]);
	    }
	    System.out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));
		
		
		// ���� ������ �ڵ�2
//		final int N;
//		int[] arr = new int[3];
//		int count = 0;
//		
//		N = sc.nextInt();
//		int[] milkStore = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			milkStore[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < milkStore.length; i++) {
////			System.out.println(i);
//			for(int j = 0; j < arr.length; j++) {
////				System.out.println(j);
//				if(milkStore[i] == j) {
//					count += 1;
//				}else {
////					System.out.println("continue");
//					continue;
//				}
//			}
//		}
//		System.out.println(count);
		
		
		// ���� ������ �ڵ�
//		int[] base = {0, 1, 2};
//		int count = 0;
//		final int N = sc.nextInt();
//
//		
//		for(int j = 0; j < base.length; j++) {
//			int temp = sc.nextInt();
//			if(temp == base[j]) {
//				count++;
//				break;
//			}
//		}	
//		
//		System.out.println(count);
	}

}
