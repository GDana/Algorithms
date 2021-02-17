package retry;

import java.util.ArrayList;
import java.util.Scanner;

public class A1978 {
	public static boolean isStringDouble(String s) {
        try {
               Double.parseDouble(s);
               return true;
        } catch (NumberFormatException e) {
             return false;
       }
	}
	
	public static void main(String[] args) {
		/* �Ҽ� ã��
		 * https://www.acmicpc.net/problem/1978
		 * 
		 * 1. ù°�ٿ� ���� �Է�(sc.nextInt())
		 * 2. ��°�ٿ� ù°�� ũ�⸸ŭ ���� �Է�
		 * 3. ��°�ٿ� �Էµ� ���� �迭�� ���� 
		 * 5. �Ҽ��� üũ�ϱ� ���� �Ҽ� ũ�⸸ŭ for���� ����
		 * 6. 1�� �ƴ� �ٸ� �ε��� ������ %�� 0�� ���� �ʴ´ٸ�
		 * 7. �迭�� ����� ���� �Ҽ��̱� ������ count++ 
		 */

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int count = 0;
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			int tempCount = 0;
			
			for(int j = 1; j <= temp; j++) {
				if(temp == 1) {
					System.out.println("temp = " + temp);
					break;
				}else {					
					if((temp/j) - ((int)temp/j) == 0.0) {
//						System.out.println("����");
						tempCount += 1;
						break;
					}else {
//						System.out.println("�Ǽ�");
					}
				}
			}
			 
			if(tempCount > 2) {
				System.out.println("�Ǽ�");
				break;
			}else {
				count += 1;
				System.out.println("���� count �߰� = " + temp);
			}
		}
		
		System.out.println(count);
		
		
		// ����� ���� �������� �Ǽ����� üũ�ϴ� ����
//		for(int i = 1; i < N; i++) {
//			int num = N / i;
//						
//			if(num - (int)num == 0.0) {
//				System.out.println("����");
//				break;
//			}else {
//				System.out.println("�Ǽ�");
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int n = sc.nextInt();
//		int count = 0;
//		boolean bool;
//		
//		for(int i = 0; i < n; i++) {
//			int temp = sc.nextInt();
//			bool = false;
//					
//			for(int j = 2; j < temp; j++) {
//				if(temp % j == 0) {
//					bool = true;
//					break;
//				}
//			}
//			
//			if(!bool && temp > 1) {
//				count++;
//			}
//		}		
//		System.out.println(count);
	}
}
