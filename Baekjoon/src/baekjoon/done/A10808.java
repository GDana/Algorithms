package baekjoon.done;

import java.util.Scanner;

public class A10808 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10808
		Scanner sc = new Scanner(System.in);		
		System.out.println("�Է��ϼ���");
		
		char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'	};
		int[] result = new int [26];
		String str = sc.next();
		
//		System.out.println(str.charAt(0));
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < a.length; j++) {
				if(str.charAt(i) == a[j]) {
					result[j]++;
				}
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");			
		}
		
		/* 1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
		 * 1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0 
		 */
	}
}
