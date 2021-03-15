package level1.retry;

import java.util.Arrays;

public class ex30 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 이상한 문자 만들기 
		/*
		 * 1. s를 공백 기준으로 배열 생성  
		 * 2. 배열 원소를 돈다.
		 * 3. 원소의 길이만큼 반복문을 돈다.
		 * 4. 현재 인덱스가 짝수면 
		 * 인덱스에 해당하는 문자를 대문자로 바꾼다.
		 * 5. 배열을 스트링으로 리턴 
		 */
		
		/*
		테스트 1 〉	실패 (15.12ms, 53.9MB)
		테스트 2 〉	통과 (4.13ms, 53.1MB) ㅋㅋㅋ이게 머선일이고...ㅠㅠ
		테스트 3 〉	실패 (12.66ms, 52.9MB)
		테스트 4 〉	실패 (13.04ms, 52.9MB)
		테스트 5 〉	실패 (12.25ms, 52.4MB)
		테스트 6 〉	실패 (1.72ms, 53.7MB)
		테스트 7 〉	실패 (15.86ms, 53.8MB)
		테스트 8 〉	실패 (14.48ms, 53.4MB)
		테스트 9 〉	실패 (12.49ms, 53.6MB)
		테스트 10 〉실패 (13.10ms, 52.2MB)
		테스트 11 〉실패 (13.03ms, 53.4MB)
		테스트 12 〉실패 (12.52ms, 54.8MB)
		테스트 13 〉실패 (20.43ms, 54MB)
		테스트 14 〉실패 (15.68ms, 53MB)
		테스트 15 〉실패 (13.12ms, 52.6MB)
		테스트 16 〉실패 (15.91ms, 53.2MB)
		 */
		String str = "try hello world";
		String[] arr = str.split(" ");
		
		System.out.println(arr[0].substring(0, 1).toUpperCase());
		
		solution("try hello world");	//"TrY HeLlO WoRlD"
	}

	public static String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        for(int i = 0; i < arr.length; i++) {
        	String temp = "";
        	
        	for(int j = 0; j < arr[i].length(); j++) {
        		if(j % 2 == 0) {
        			temp += arr[i].substring(j, j+1).toUpperCase();
        		}else {
        			temp += arr[i].substring(j, j+1);
        		}
        	}
        	if(i == arr.length - 1) {
        		answer = answer + temp;
        	}else {
        		answer = answer + temp + " ";        		
        	}
        }
        System.out.println(answer);
        
        return answer;
    }
}
