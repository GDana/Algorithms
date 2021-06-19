package inProgress;

import java.util.Scanner;
import java.util.Stack;

public class A9012 {
	public static void main(String[] args) {
		test2();
	}
	
	/**
	 * 성공 : 24ms  
	 */
	public static void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- 데이터의 수를 입력하세요. -----");
		int count = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < count; i++) {
			System.out.println("------- 괄호 문자열을 입력하세요. -------");
			Stack <String> stack = new Stack<>();
			StringBuilder sb = new StringBuilder();
			sb.append(sc.nextLine());
			
			int length = sb.length();
			
			for(int j = 0; j < length; j++) {
				String str = sb.substring(j, j+1);
				
				if(str.equals("(")) {
					stack.push(str);									
				} else if(str.equals(")")) {
					if(!stack.empty()) {
						
						if(stack.peek().equals("(")) {
							stack.pop();						
						} else {
							stack.push(str);
						}
					} else {
						stack.push(str);
					}
				}
			}
			
			if(stack.empty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	
	/**
	 * 성공 : 228ms  
	 */
	public static void test1() {
		/*
		 * 1. 데이터의 수를 입력받는다.
		 * 2. "("가 나오면 +1
		 * 3. ")"가 나오면 -1
		 * 4. 마지막에 0이 되지 않으면 "NO"
		 * 5. 0이면 "YES" 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- 데이터의 수를 입력하세요. -----");
		int count = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < count; i++) {
			System.out.println("------- 괄호 문자열을 입력하세요. -------");
			int result = 0;

			StringBuilder sb = new StringBuilder();
			sb.append(sc.nextLine());
			
			int length = sb.length();
			
			for(int j = 0; j < length; j++) {
				
				if(sb.substring(j, j+1).equals("(")) {
					result += 1;
				} else if(sb.substring(j, j+1).equals(")")) {
					result -= 1;
				} 
				
				if(result < 0) {
					break;
				}
			}
			
			if(result == 0) {
				System.out.println("YES");				
			} else {
				System.out.println("NO");
			}
		}
	}
}
