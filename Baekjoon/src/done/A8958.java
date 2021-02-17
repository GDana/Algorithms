package done;

import java.util.Scanner;

public class A8958 {
	public static void main(String[] args) {
		/* OX ����
		 * https://www.acmicpc.net/problem/8958
		 * 
		 * 1. �׽�Ʈ ���̽� Ƚ�� �Է¹޴´�
		 * 2. ���ڿ� �Է¹޴´� - nextLine()
		 * 3. ���ڿ��� 'O'�� ��� count++
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
