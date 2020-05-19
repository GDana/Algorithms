package done_solution;

import java.util.Scanner;

public class A1110 {
	public static void main(String[] args) {
		/* 더하기 사이클
		 * https://www.acmicpc.net/problem/1110
		 * 
		 * 26 / 2 + 6 = 8
		 * 68 / 6 + 8 = 14
		 * 84 / 8 + 4 = 12
		 * 42 / 4 + 2 = 6
		 * 26, 4
		 * 
		 * 1. int N을 받는다
		 * 2. 입력받은 수의 각 자리수를 구한다
		 * 3. 먼저 나온 자릿수는 second, first 에 저장한다
		 * 4. second의 1의 자리수 구해서 String result 에 저장
		 * 5. first + second의 1의 자리수 구해서 result 에 저장
		 * 6. count++
		 * 7. 2 ~ 6반복
		 * 8. Integer.parseInt(result) == N값과 같다면 count 출력 
		 */
		
		Scanner sc = new Scanner(System.in);
		int first = 0, second = 0, count = 0;
		final int N = sc.nextInt();
				
		int sum = N;		
		
		while(true) {
			int temp = 0;
			
			// 2 + 6 각 자리수 구하기
			second = sum % 10;	//6
			sum = sum / 10;
			first = sum % 10;	//2
			// 2 + 6 = 8
			sum = first + second;
			// 8의 1의 자리수 구하기
			temp = sum % 10;
			
			String result = Integer.toString(second) + "" + Integer.toString(temp);
			count++;
			sum = Integer.parseInt(result);
			
			if(N == sum) {
				System.out.println(count);
				break;				
			}
		}				
	}
}
