package inProgress;

import java.util.Scanner;

public class A2753 {
	public static void main(String[] args) {
		/* 윤년
		 * https://www.acmicpc.net/problem/2753
		 * 
		 * 수도코드
		 * 1. int 입력값을 받는다
		 * 2. 입력값이 4의 배수이거나 100의 배수이면
		 * 3. 0
		 * 4. 아니면 1
		 */

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year < 4000 && year >= 1) {			
			if(year % 4 == 0) {			
				if(year % 100 != 0 || year % 400 == 0) {
					System.out.println(1);
				}
			}else {
				System.out.println(0);
			}		
		}
	}
}
