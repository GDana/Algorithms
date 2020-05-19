package retry;

import java.util.ArrayList;
import java.util.Scanner;

public class A1978 {
	public static boolean isStringDouble(String s) {
        try {
               Double.parseDouble(s);
               return true;
        } catch (NumberFormatException e) {
             return false;
       }
	}
	
	public static void main(String[] args) {
		/* 소수 찾기
		 * https://www.acmicpc.net/problem/1978
		 * 
		 * 1. 첫째줄에 정수 입력(sc.nextInt())
		 * 2. 둘째줄에 첫째줄 크기만큼 정수 입력
		 * 3. 둘째줄에 입력될 값은 배열에 저장 
		 * 5. 소수를 체크하기 위해 소수 크기만큼 for문을 돈다
		 * 6. 1이 아닌 다른 인덱스 값으로 %는 0이 되지 않는다면
		 * 7. 배열에 저장될 값이 소수이기 때문에 count++ 
		 */

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int count = 0;
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			int tempCount = 0;
			
			for(int j = 1; j <= temp; j++) {
				if(temp == 1) {
					System.out.println("temp = " + temp);
					break;
				}else {					
					if((temp/j) - ((int)temp/j) == 0.0) {
//						System.out.println("정수");
						tempCount += 1;
						break;
					}else {
//						System.out.println("실수");
					}
				}
			}
			 
			if(tempCount > 2) {
				System.out.println("실수");
				break;
			}else {
				count += 1;
				System.out.println("정수 count 추가 = " + temp);
			}
		}
		
		System.out.println(count);
		
		
		// 계산한 값이 정수인지 실수인지 체크하는 로직
//		for(int i = 1; i < N; i++) {
//			int num = N / i;
//						
//			if(num - (int)num == 0.0) {
//				System.out.println("정수");
//				break;
//			}else {
//				System.out.println("실수");
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int n = sc.nextInt();
//		int count = 0;
//		boolean bool;
//		
//		for(int i = 0; i < n; i++) {
//			int temp = sc.nextInt();
//			bool = false;
//					
//			for(int j = 2; j < temp; j++) {
//				if(temp % j == 0) {
//					bool = true;
//					break;
//				}
//			}
//			
//			if(!bool && temp > 1) {
//				count++;
//			}
//		}		
//		System.out.println(count);
	}
}
