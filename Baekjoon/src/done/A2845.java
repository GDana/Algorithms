package done;

import java.util.Scanner;

public class A2845 {
	public static void main(String[] args) {
		/* 파티가 끝나고 난 뒤
		 * https://www.acmicpc.net/problem/2845
		 * 
		 * 1. 상근이가 계산함 참가자의 수 : 100
		 * 2. 첫째 줄에 두개의 정수값을 받는다(nextLine())
		 * 3. 둘째 줄에 다섯개의 정수값을 배열로 받는다
		 * 4. 100 - 정수값을 출력
		 * 
		 * -1 1 900 -100 -3
		 */

		Scanner sc = new Scanner(System.in);
		int[] firstLine = new int[2];
		int[] secondLine = new int[5];
		int person;
	
		
		for(int i = 0; i < firstLine.length; i++) {
			firstLine[i] = sc.nextInt();
		}
		person = firstLine[0] * firstLine[1]; 		
		
		for(int i = 0; i < secondLine.length; i++) {
			secondLine[i] = sc.nextInt();
			System.out.println(secondLine[i] - person);
		}		
	}
}
