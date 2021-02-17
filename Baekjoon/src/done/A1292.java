package done;

import java.util.Scanner;

/*
 * 쉽게 푸는 문
 * https://www.acmicpc.net/problem/1292
 */
public class A1292 {
/*
 * 1. 숫자 2개를 입력받는다
 * 2. 두번째 숫자까지 반복문을 돈다.
 * 3. 중첩 반복문을 사용해서 현재 인덱스 만큼 숫자를 생성한다.
 * 4. 생성한 숫자는 배열에 넣어준다.
 * 5. 첫번째 입력받은 숫자에서부터 두번째 숫자까지 숫자를 더하는 반복문을 실행한다.
 * 6. 결과 리턴 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자를 입력받는다.
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int arr[] = new int[num2];
		
		/*
		 idx : 0 1 2 3 4 5 6 7 8 9 10
		 num : 1 2 2 3 3 3 4 4 4 4 5
		 */
		
		int flag = 1;
		int input = 1;
		
		// 두번째 숫자까지 반복문을 돈다.
		for(int i = 0; i < num2; i++) {
			arr[i] = input;
			
			if(flag == input) {
				flag = 0;
				input++;
			}
			flag++; 
		}
		
		int result = 0;
		
		for(int i = num1-1; i <= num2-1; i++) {
			result += arr[i];
		}
		
		System.out.println(result);
	}
}
