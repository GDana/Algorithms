package done;

import java.util.Scanner;

public class A10039 {

	public static void main(String[] args) {
		/* ��� ����
		 * https://www.acmicpc.net/problem/10039
		 * 
		 * 1. �迭�� 5���� ������ �޴´� ->sc.nextInt();
		 * 2. ������ 5 �� ������� �Ѵ� -> % 5 == 0
		 * 3. 5���� ���� / 5 �� ����Ѵ�
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
