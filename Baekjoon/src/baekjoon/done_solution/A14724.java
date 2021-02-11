package baekjoon.done_solution;

import java.util.Scanner;

public class A14724 {

	public static void main(String[] args) {
		/* �����ڴ� ����?
		 * https://www.acmicpc.net/group/workbook/list/7098
		 */

		Scanner sc = new Scanner(System.in);
		
		// �����ڵ�
		String[] clubName = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
		int n = sc.nextInt();
		int[][] arr = new int[clubName.length][n];
		int[] result = new int[clubName.length];
		
		for(int i = 0; i < arr.length; i++) {		
			int temp = arr[i][0];
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();			
				
				if(temp < arr[i][j]) {
					temp = arr[i][j]; 
				}else {
					temp = temp;
				}				
				result[i] = temp;
			}
		}
		
		int temp = result[0];
		int idx = 0;
		
		for(int i = 0; i < result.length; i++) {			
			if(temp < result[i]) {
				temp = result[i];
				idx = i;
			}else {
				temp = temp;
			}			
			
		}
		System.out.println(clubName[idx]);
		
		
		// �����ڵ�
//		String[] groupName = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
//		final int N = sc.nextInt();
//		int[][] row = new int[groupName.length][N];
//		int[] arr = new int[groupName.length]; 
//		
//		for(int i = 0; i < groupName.length; i++) {
//			for(int j = 0; j < row[i].length; j++) {
//				row[i][j] = sc.nextInt();
//				
//				if(j == 4) {
//					int max = row[i][0];
//					
//					for(int k = 0; k < row[i].length; k++) {
//						if(max < row[i][k]) {
//							max = row[i][k];
//						}else {
//							max = max;
//						}
//					}
//					arr[i] = max;
//				}
//			}
//		}
//		
//		int temp = arr[0];
//		for(int i = 0; i < arr.length; i++) {
//			if(temp < arr[i]) {
//				temp = arr[i];
//			}else {
//				temp = temp;
//			}
//		}
//		System.out.println(temp);
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == temp) {
//				System.out.println(groupName[i]);
//			}
//		}
	}
}
