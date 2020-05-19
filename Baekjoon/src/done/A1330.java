package done;

import java.util.Scanner;

public class A1330 {
	public static void main(String[] args) {
		/* 두 수 비교하기
		 * https://www.acmicpc.net/problem/1330
		 * 
		 * 수도코드
		 * 1. '숫자 + 공백 + 숫자'를 입력받는다
		 * 2. 공백을 제거한다(split)
		 * 3. 두 숫자를 비교한 값을 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		String strNum;
		String[] arr;
		int a, b;
		
		strNum = sc.nextLine();
		arr = strNum.split(" ");
		
		a = Integer.parseInt(arr[0]);
		b = Integer.parseInt(arr[1]);
		
		if(a < b) {
			System.out.println("<");
		}else if(a > b) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}
	}
}
