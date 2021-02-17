package done_solution;

import java.util.Scanner;

public class A2864 {
	public static void main(String[] args) {
		/* 5�� 6�� ����
		 * https://www.acmicpc.net/problem/2864
		 */

		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		int str1Min = Integer.parseInt(str1.replace("6", "5"));
		int str2Min = Integer.parseInt(str2.replace("6", "5"));
		int str1Max = Integer.parseInt(str1.replace("5", "6"));
		int str2Max = Integer.parseInt(str2.replace("5", "6"));

//		System.out.println(str1Min);
//		System.out.println(str2Min);
//		System.out.println(str1Max);
//		System.out.println(str2Max);
		System.out.print(str1Min + str2Min + " ");
		System.out.print(str1Max + str2Max);
		
		
		// ������ �ڵ�
		int max = 0, min = 0;
		int num;
		String six = "";
		
		for(int i = 0; i < 2; i++) {
			num = sc.nextInt();
			String[] tempNum = Integer.toString(num).split("");
			min += min;
			
			for(int j = 0; j < tempNum.length; j++) {
				System.out.println("while��");
				int temp = num % 10;
				
				System.out.println(temp);
				
				if(temp == 6) {
					temp = num / 10;
					six = Integer.toString(temp) + "6";
					max += Integer.parseInt(six);
				}else {
					min = num;
				}
			}			
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}
