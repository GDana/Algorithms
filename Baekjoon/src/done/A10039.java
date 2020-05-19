package done;

import java.util.Scanner;

public class A10039 {

	public static void main(String[] args) {
		/* 평균 점수
		 * https://www.acmicpc.net/problem/10039
		 * 
		 * 1. 배열로 5명의 점수를 받는다 ->sc.nextInt();
		 * 2. 점수는 5 의 배수여야 한다 -> % 5 == 0
		 * 3. 5명의 점수 / 5 을 출력한다
		 */

		Scanner sc = new Scanner(System.in);
		int score, avl = 0;
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			score = sc.nextInt();
			
			if(score % 5 == 0) {
				if(score < 40) {
					score = 40;
				}
			}
			avl += score;
		}
		System.out.println(avl / 5); 
	}

}
