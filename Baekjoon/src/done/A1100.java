package done;

import java.util.Scanner;

public class A1100 {
	public static void main(String[] args) {
		/* го╬А д╜
		 * https://www.acmicpc.net/problem/1100
		 */

		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[8][8];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			String[] temp = sc.next().split("");
			
			for(int j = 0; j < temp.length; j++) {
				arr[i][j] = temp[j];
				
				if(i % 2 == 0 && j % 2 == 0) {
					if(arr[i][j].equals("F")) {
						count++;						
					}
				}
				if(i % 2 == 1 && j % 2 == 1) {
					if(arr[i][j].equals("F")) {
						count++;						
					}
				}
			}
		}
		

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	
		System.out.println(count);
	}
}
