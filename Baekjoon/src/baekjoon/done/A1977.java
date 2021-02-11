package baekjoon.done;

import java.util.ArrayList;
import java.util.Scanner;

public class A1977 {
	public static void main(String[] args) {
		/* ����������
		 * https://www.acmicpc.net/problem/1977
		 */		

//		int a = (int)Math.round(Math.sqrt(4.0));
//		int b = (int) Math.sqrt(4.0);
//		System.out.println(a);
//		System.out.println(b);
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> sqrtNumArr = new ArrayList<>();
		int m = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
//		int m = sc.nextInt();
//		int n = sc.nextInt();
		int sum = 0;
		
//		System.out.println(m);
//		System.out.println(n);
		
		for(int i = 1; i <= 100; i++) {
			int temp = i * i; 
			
			if((temp >= m) && (temp <= n)) {
//				System.out.println(temp);
				sqrtNumArr.add(temp);
			}
		}
		
		for(int j = 0; j < sqrtNumArr.size(); j++) {
			sum += sqrtNumArr.get(j);
		}
		
		if(sqrtNumArr.size() == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(sqrtNumArr.get(0));
		}
		
		// ������ �ڵ�
//		int sum = 0;
//		int min = 0;
//		
//		for(int i = M; i <= N; i++) {			
//			int temp = (int)(Math.sqrt(i));
//			
//			for(int j = 1; j < i; j++) {	
//				if(temp == j) {
//					sum += i;
//					
//					if(min == 0) {
//						min = i;						
//					}else if(min < i) {
//						min = min;
//					}
//					break;					
//				}
//			}
//		}
//		
//		if(sum == 0) {
//			System.out.println(-1);
//		}else {
//			System.out.println(sum);
//			System.out.println(min);
//		}
	}
}
