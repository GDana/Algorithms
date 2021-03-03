package level1.done;

import java.util.Arrays;

public class ex13 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 서울에서 김서방 찾기
		/*
		 * 1. seoul 배열을 반복문 돈다.
		 * 2. "Kim"과 같다면 현재 index를 반환한다.
		 * 3. "김서방은" + index + "에 있다"
		 */

		String[] seoul = {"Jane", "Kim"};
		
		System.out.println(solution(seoul));
		
		System.out.println("\n::::: 다른 사람 풀이 :::::");
		System.out.println("int java.util.List.indexOf(Object o)");
		System.out.println(Arrays.asList(seoul).indexOf("Kim"));
		System.out.println("int java.lang.String.indexOf(String str)");
		System.out.println("Kim".indexOf("m"));	
	}

	public static String solution(String[] seoul) {
        String answer = "";
        
        int idx = 0;
        for(idx = 0; idx < seoul.length; idx++) {
        	if(seoul[idx].equals("Kim")) {
        		break;
        	}
        }
        
        return "김서방은 " + idx + "에 있다";
    }
}
