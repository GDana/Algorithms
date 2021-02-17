package done;

import java.util.Scanner;

public class A2845 {
	public static void main(String[] args) {
		/* ��Ƽ�� ������ �� ��
		 * https://www.acmicpc.net/problem/2845
		 * 
		 * 1. ����̰� ����� �������� �� : 100
		 * 2. ù° �ٿ� �ΰ��� �������� �޴´�(nextLine())
		 * 3. ��° �ٿ� �ټ����� �������� �迭�� �޴´�
		 * 4. 100 - �������� ���
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
