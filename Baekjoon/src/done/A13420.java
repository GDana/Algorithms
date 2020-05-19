package done;

import java.util.Scanner;

public class A13420 {
	public static void main(String[] args) {
		/* 사칙연산
		 * https://www.acmicpc.net/problem/13420
		 * 
		 * 1. 테스트 개수를 입력 받는다
		 * 2. 각 행마다 공백으로 구분되어진 숫자와 기호가 주어진다
		 * 3. 문자를 자른 배열로 연산한다
		 * 4. 연산한 값을 담는다 temp
		 * 5. temp와 입력받은 결과값과 다르면 'wrong answer'
		 * 6. 같으면 'correct'
		 */
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {			
			String[] arr = sc.nextLine().split(" ");			
			long val1 = Long.parseLong(arr[0]);
			long val2 = Long.parseLong(arr[2]);
			long result = Long.parseLong(arr[4]);
			
			long temp = 0;
			switch(arr[1]) {
			case "+":
				temp = val1 + val2;
				break;
			case "-":
				temp = val1 - val2;
				break;
			case "*":
				temp = val1 * val2;
				break;
			case "/":
				temp = val1 / val2;
				break;			
			}
			
			if(temp == result) {
				System.out.println("correct");
			}else {
				System.out.println("wrong answer");
			}
		}
	}
}
