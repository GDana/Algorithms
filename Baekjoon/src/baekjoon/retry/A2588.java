package baekjoon.retry;

import java.util.Scanner;

public class A2588 {
	public static void main(String[] args) {
		/* ����
		 * https://www.acmicpc.net/problem/2588
		 * 
		 * retry
		 * -(2)��ġ�� ���� ���� ������ �ڸ����� ��ȸ�ϴ� ����� ��� ������ ���ΰ�
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
		int a, b, result;
		String c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = Integer.toString(b);
		
		for(int i = c.length(); i > 0; i--) {
//			System.out.println(c.substring(i, i+1));
			
			result = Integer.parseInt(c.substring(i-1, i));
			System.out.println(a * result);
			
//			System.out.println(b.charAt(b.length() - i));
//			c += b.charAt(b.length() - i);
//			System.out.println(Integer.parseInt(a));		
//			System.out.println(c);
			
//			System.out.println(Integer.parseInt(a) * b.charAt(b.length() - i));
		}
		result = a * b; 
		System.out.println(result);
	}
}
