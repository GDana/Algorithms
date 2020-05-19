package retry;

import java.util.Scanner;

public class A1110 {
	public static void main(String[] args) {
		/* 더하기 사이클
		 * https://www.acmicpc.net/problem/1110
		 * 
		 *  1. 숫자 입력값 따로 분리
		 *  2. 
		 */

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int number = num;
		int count = 0;
		
         
        do {
            number = number % 10 * 10 + (number / 10 + number % 10) % 10;
            count++;
        } while (num != number);
		
        System.out.println(count);
	}
}
