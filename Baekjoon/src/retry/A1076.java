package retry;

import java.util.ArrayList;
import java.util.Scanner;

public class A1076 {
	public static void main(String[] args) {
		/* ����
		 * https://www.acmicpc.net/problem/1076 
		 * 
		 * retry
		 * -����° ���� ������� ���� �� ���ΰ�?(���� �õ��ߴ� �迭 �ϵ��ڵ�) 
		 */
		
	
		Scanner sc = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("black");
		list.add("brown");
		list.add("red");
		list.add("orange");
		list.add("yellow");
		list.add("green");
		list.add("blue");
		list.add("violet");
		list.add("grey");
		list.add("white");
		
		int a, b;
		long c;
		long result;
		
		a = list.indexOf(sc.next()) * 10;
		b = list.indexOf(sc.next());
		c = list.indexOf(sc.next());
		
		result = (long)((a + b) * Math.pow(10, c));
		System.out.println(result);
		

		// ��Ÿ�� ����
//		String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
//		int[] num = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
//		String a, b, c;
//		long result;
//		
//		a = sc.next();
//		b = sc.next();
//		c = sc.next();
//
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i].equals(a)){
//				a = "" + i;
//			}else if(arr[i].equals(b)){
//				b = "" + i;
//			}else if(arr[i].equals(c)){
//				c = "" + num[i];
//			}
//		}
//		result = ((Integer.parseInt(a) * 10) + Integer.parseInt(b)) * Integer.parseInt(c);
//		System.out.println(result);
	}
}
