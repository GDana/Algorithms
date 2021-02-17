package done;

import java.util.Scanner;

public class A1330 {
	public static void main(String[] args) {
		/* �� �� ���ϱ�
		 * https://www.acmicpc.net/problem/1330
		 * 
		 * �����ڵ�
		 * 1. '���� + ���� + ����'�� �Է¹޴´�
		 * 2. ������ �����Ѵ�(split)
		 * 3. �� ���ڸ� ���� ���� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		String strNum;
		String[] arr;
		int a, b;
		
		strNum = sc.nextLine();
		arr = strNum.split(" ");
		
		a = Integer.parseInt(arr[0]);
		b = Integer.parseInt(arr[1]);
		
		if(a < b) {
			System.out.println("<");
		}else if(a > b) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}
	}
}
