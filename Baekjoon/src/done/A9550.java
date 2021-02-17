package done;

import java.util.Scanner;

public class A9550 {
	public static void main(String[] args) {
		/* ���̵��� ������ ������
		 * https://www.acmicpc.net/problem/9550
		 * 
		 * 1. ���� ���� N, �ּ� ���� �� K, �մ� ī��Ʈ count = 0;
		 * 2. �׽�Ʈ ���̽� T��ŭ ����
		 * 3. ���� ���� N��ŭ ����
		 * 4. ���� a, ���� b, ���� c�� ���� ������ ������ �޴´�
		 * 5. count += �� ���� ������ K�� ���� ��  
		 * 6. ���� ���ϰ� count
		 */

		Scanner sc = new Scanner(System.in);
		
		final int T;
		
		T = sc.nextInt();
	
		for(int i = 0; i < T; i++) {
			int count = 0;
			final int N = sc.nextInt();
			final int K = sc.nextInt();
			
			for(int j = 0; j < N; j++) {
				int temp;
				
				temp = sc.nextInt();				
				count += (temp / K);
			}
			System.out.println(count);
		}		
	}
}
