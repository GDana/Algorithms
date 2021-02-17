package done;

import java.util.ArrayList;
import java.util.Scanner;

public class A5543 {
	public static void main(String[] args) {
		/* ��ٳ���
		 * https://www.acmicpc.net/problem/5543
		 */
		
		Scanner sc = new Scanner(System.in);
//		ArrayList <Integer> arr = new ArrayList<>();
		int[] main = new int[3];
		int[] side = new int[2];
		int min = 0;
		
		for(int i = 0; i < main.length; i++) {
			main[i] = sc.nextInt();
		}
		for(int i = 0; i < side.length; i++) {
			side[i] = sc.nextInt();
		}
		
		for(int i = 0; i < main.length; i++) {			
			for(int j = 0; j < side.length; j++) {
				int temp = (main[i] + side[j]) - 50;
				
//				System.out.println(temp);
				
				if(min == 0) {
					min = temp;
				}
				
				if(min < temp) {
//					System.out.println("if�� = " + min);
					min = min;
				}else{
//					System.out.println("temp�� �� ���� = " + temp);
					min = temp;
				}
			}
		}
		
		System.out.println(min);
	}
}
