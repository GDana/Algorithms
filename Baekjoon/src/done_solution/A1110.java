package done_solution;

import java.util.Scanner;

public class A1110 {
	public static void main(String[] args) {
		/* ���ϱ� ����Ŭ
		 * https://www.acmicpc.net/problem/1110
		 * 
		 * 26 / 2 + 6 = 8
		 * 68 / 6 + 8 = 14
		 * 84 / 8 + 4 = 12
		 * 42 / 4 + 2 = 6
		 * 26, 4
		 * 
		 * 1. int N�� �޴´�
		 * 2. �Է¹��� ���� �� �ڸ����� ���Ѵ�
		 * 3. ���� ���� �ڸ����� second, first �� �����Ѵ�
		 * 4. second�� 1�� �ڸ��� ���ؼ� String result �� ����
		 * 5. first + second�� 1�� �ڸ��� ���ؼ� result �� ����
		 * 6. count++
		 * 7. 2 ~ 6�ݺ�
		 * 8. Integer.parseInt(result) == N���� ���ٸ� count ��� 
		 */
		
		Scanner sc = new Scanner(System.in);
		int first = 0, second = 0, count = 0;
		final int N = sc.nextInt();
				
		int sum = N;		
		
		while(true) {
			int temp = 0;
			
			// 2 + 6 �� �ڸ��� ���ϱ�
			second = sum % 10;	//6
			sum = sum / 10;
			first = sum % 10;	//2
			// 2 + 6 = 8
			sum = first + second;
			// 8�� 1�� �ڸ��� ���ϱ�
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
