package done;

import java.util.Scanner;

public class A8958 {
	public static void main(String[] args) {
		/* OX 퀴즈
		 * https://www.acmicpc.net/problem/8958
		 * 
		 * 1. 테스트 케이스 횟수 입력받는다
		 * 2. 문자열 입력받는다 - nextLine()
		 * 3. 문자열이 'O'일 경우 count++
		 * 4. result + count 
		 */

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < num; i++) {
			String[] str = sc.nextLine().split("");
			int count = 0, result = 0;
			
			for(int j = 0; j < str.length; j++) {
				if(str[j].equals("O")) {
					count++;
					result += count;
				}else {
					count = 0;
				}
			}
			System.out.println(result);
		}
	}
}
