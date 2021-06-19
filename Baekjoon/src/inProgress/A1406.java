package inProgress;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class A1406 {

	public static void main(String[] args) {
		/**
		 * 1. 명령어 순서를 담을 스택 생성
		 * 2. 위의 스택을 실행할 스택 생성 및 push
		 * 3. 명령어를 Pop으로 꺼내서 StrinBuilder에 담는다 
		 * 4. switch ~ case문으로
		 * 	L, D, B, P $ 명령어 생성 
		 */
		/*
		StringBuilder initStr = new StringBuilder();
		initStr.append("abcd");
		int length = initStr.length();
		System.out.println(length);
		System.out.println(initStr.insert(length, "y"));
		*/	
		
		Scanner sc = new Scanner(System.in);
		StringBuilder initStr = new StringBuilder();
		
		Stack<String> command = new Stack<>();
		Stack<String> run = new Stack<>();
		initStr.append(sc.nextLine());

		int length = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < length; i++) {
			command.push(sc.nextLine());
		}
		for(int i = 0; i < length; i++) {
			run.push(command.pop());
		}

		int index = initStr.length();
		
		for(int i = 0; i < length; i++) {
			String str = run.pop();
			String commandStr = str.substring(0, 1);
			
			switch(commandStr) {
			case "L" :
				if(index != 0) {
					index--;
					break;					
				} else {
					break;
				}
			case "D" :
				if(index != initStr.length()) {
					index++;
					break;					
				} else {
					break;
				}
			case "B" : 
				if(index != 0) {
					initStr.delete(index-1, index);
					index--;
					break;
				} else {
					break;
				}
			case "P" :
				String temp = str.substring(2);
				initStr.insert(index, temp);
				index++;
				break;
			}
		}
		
		System.out.println(initStr.toString());
			
	}

}
