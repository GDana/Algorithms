package inProgress;

import java.util.Scanner;

public class A9093 {
	public static void main(String[] args) {
		//test1();
//		test2();
	}

	/**
	 * 성공 : 시간 1044ms(평균 400 ~ 700ms)  
	 */
	public static void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- 명령의 수를 입력하세요 -----");
		//nextInt()로 받으면 다음 nextLine()에서 정상적으로 받을 수 없다.
		int length = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < length; i++) {
			System.out.println("------- 입력하세요 -------");
			StringBuilder result = new StringBuilder();
			String str = sc.nextLine();
			String[] strArr = str.split(" ");
		
			// 스왑할 단어를 메서드에 넘겨준다 
			for(int j = 0; j < strArr.length; j++) {
				result.append(swap3(strArr[j]) + " ");
			}
			
			System.out.println("result: " + result.toString());
		}
		
		System.out.println("----- 종료되었습니다 -----");
	}

	/**
	 * 성공 : 시간 1104ms(평균 400 ~ 700ms)  
	 */
	public static void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- 명령의 수를 입력하세요 -----");
		//nextInt()로 받으면 다음 nextLine()에서 정상적으로 받을 수 없다.
		int length = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < length; i++) {
			System.out.println("------- 입력하세요 -------");
			StringBuilder result = new StringBuilder();
			String str = sc.nextLine();
			String[] strArr = str.split(" ");
		
			// 스왑할 단어를 메서드에 넘겨준다 
			for(int j = 0; j < strArr.length; j++) {
				result.append(swap2(strArr[j]) + " ");
			}
			
			System.out.println("result: " + result.toString());
		}
		
		System.out.println("----- 종료되었습니다 -----");
	}
	
	/**
	 * 실패 : 메모리 초과 
	 */
	public static void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- 명령의 수를 입력하세요 -----");
		//nextInt()로 받으면 다음 nextLine()에서 정상적으로 받을 수 없다.
		int length = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < length; i++) {
			System.out.println("------- 입력하세요 -------");
			String result = "";
			String str = sc.nextLine();
			String[] strArr = str.split(" ");
		
			// 스왑할 단어를 메서드에 넘겨준다 
			for(int j = 0; j < strArr.length; j++) {
				result += swap(strArr[j]) + " ";
			}
			
			System.out.println("result: " + result);
		}
		
		System.out.println("----- 종료되었습니다 -----");
	}
	
	public static String swap3(String str) {
		StringBuilder result = new StringBuilder();
		result.append(str).reverse();
		
		return result.toString();
	}
	
	public static String swap2(String str) {
		StringBuilder result = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
	
		int index = sb.length();
		
		for(int i = index - 1; i >= 0; i--) {
			result.append(sb.charAt(i));
		}
		
		return result.toString();
	}
	
	/**
	 * 글자를 스왑하는 메서드 
	 * @param str 스왑할 단어 
	 * @return 스왑한 단어 
	 */
	public static String swap(String str) {
		String result = "";
		String[] arr = str.split("");
	
		//글자의 마지막부터 조회한다 
		for(int i = arr.length-1; i >= 0; i--) {
			result += arr[i];
		}
		
		return result;
	}
}
