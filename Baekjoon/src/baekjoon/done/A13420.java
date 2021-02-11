package baekjoon.done;

import java.util.Scanner;

public class A13420 {
	public static void main(String[] args) {
		/* ��Ģ����
		 * https://www.acmicpc.net/problem/13420
		 * 
		 * 1. �׽�Ʈ ������ �Է� �޴´�
		 * 2. �� �ึ�� �������� ���еǾ��� ���ڿ� ��ȣ�� �־�����
		 * 3. ���ڸ� �ڸ� �迭�� �����Ѵ�
		 * 4. ������ ���� ��´� temp
		 * 5. temp�� �Է¹��� ������� �ٸ��� 'wrong answer'
		 * 6. ������ 'correct'
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
