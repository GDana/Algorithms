package done_solution;

import java.util.Scanner;

public class A2577 {
	public static void main(String[] args) {
		/* ������ ����
		 * https://www.acmicpc.net/problem/2577
		 */

		Scanner sc = new Scanner(System.in);
		final int A, B, C;
		int multi;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		multi = A * B * C;
		
		System.out.println(multi);
		
		String[] arr = Integer.toString(multi).split("");
		
		for(int i = 0; i < 10; i++) {		
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				int temp = Integer.parseInt(arr[j]);
				
				if(i == temp) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		// �ٸ� Ǯ��
//		Scanner sc = new Scanner(System.in);
//		final int A, B, C;
////		int multi;
//		
//		A = sc.nextInt();
//		B = sc.nextInt();
//		C = sc.nextInt();
//		
//		int[] counts = new int[10];
//        int multi = A * B * C;
//        
//        while (multi > 0) {
//        	System.out.println(multi);
//        	System.out.println(counts[multi % 10]);
//            counts[multi % 10]++;
//            System.out.println(counts[multi % 10]);
//            multi /= 10;
//        }
//         
//        for (int i = 0; i < counts.length; ++i) {
//            System.out.println(counts[i]);
//        }
	}
}
