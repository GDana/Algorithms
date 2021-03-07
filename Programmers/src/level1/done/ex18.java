package level1.done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ex18 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 정수 내림차순으로 배치하기
		/*
		 * 1. 숫자 -> 나머지 연산 -> 숫자 배열 생성
		 * 2. 버블 정렬 
		 */
		
		/* 통과 
		테스트 1 〉	통과 (1.59ms, 52.1MB)
		테스트 2 〉	통과 (1.73ms, 53MB)
		테스트 3 〉	통과 (1.62ms, 53.1MB)
		테스트 4 〉	통과 (1.66ms, 53.2MB)
		테스트 5 〉	통과 (1.52ms, 53.2MB)
		테스트 6 〉	통과 (1.77ms, 52.6MB)
		테스트 7 〉	통과 (1.65ms, 52.3MB)
		테스트 8 〉	통과 (1.90ms, 52.6MB)
		테스트 9 〉	통과 (1.73ms, 53MB)
		테스트 10 〉	통과 (1.58ms, 51.8MB)
		테스트 11 〉	통과 (2.25ms, 51.4MB)
		테스트 12 〉	통과 (1.65ms, 52.3MB)
		테스트 13 〉	통과 (1.61ms, 52.3MB)
		테스트 14 〉	통과 (1.72ms, 52.2MB)
		테스트 15 〉	통과 (1.54ms, 51.9MB)
		테스트 16 〉	통과 (1.75ms, 51.4MB)
		 */

		//solution(118372);	//873211
		System.out.println("답: " + solution2(118372) + "\n");
		System.out.println("답: " + solution3(118372) + "\n");
	}
	
	public static long solution3(long n) {
		System.out.println("solution2에서 Collections.reverseOrder()를 적용하기 위한 버전");
		System.out.println("참조형 long -> 참조형 string -> return Long\n");
		
		String str = "";
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(String item : arr) {
			str += item;
		}
		
		return Long.parseLong(str);
	}
	
	public static long solution2(long n) {
		System.out.println("StringBuilder의 reverse() 메서드를 이용해서 푼 풀이");
		System.out.println("참조형 long -> 참조형 string -> 기본형 char[]");
		System.out.println("-> 참조형 StringBuilder의 reverse() -> return Integer\n");
		
		String str = String.valueOf(n);
		char[] c = str.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder(new String(c,0,c.length));  
        
        return Integer.parseInt(((sb.reverse()).toString()));
	}

	public static long solution(long n) {
        long answer = 0;
        ArrayList<Integer> list = new ArrayList<>(); 
        
        while(true) {
        	int temp = (int) (n % 10);
        	list.add(temp);
        	
        	if(n < 10) {
        		break;
        	}
        	
        	n = n / 10;        	
        }
        
        for(int i = 0; i < list.size()-1; i++) {
        	for(int j = list.size()-1; j > i; j--) {
        		if(list.get(j - 1) < list.get(j)) {
        			//swap
        			int temp = list.get(j);
        			list.set(j, list.get(j-1));
        			list.set(j-1, temp);
        		}
        	}
        }
        
        String str = "";
        for(Integer item : list) {
        	str += item;
        }
        answer = Long.parseLong(str);
        
        return answer;
    }
}
