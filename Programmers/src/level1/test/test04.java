package level1.test;

import java.util.Arrays;

public class test04 {

	public static void main(String[] args) {
		// [실패] 코딩테스트 연습 > 연습문제 > 문자열 내 마음대로 정렬하기 
		/*
		 * 1. n번째 인덱스의 텍스트를 얻는다. 
		 * 2. 각각 오름차순으로 비교한 배열 생성 
		 * 3. 생성한 배열의 반복문
		 * 4. 중첩 반복문 실행 
		 * temp = strings[j].substring(n, n+1)
		 * if(temp.equal(arr[i]))
		 * answer[0] = temp;
		 * 
		 * s e a
		 * 0 1 2
		 * 
		 * a e s
		 * 0 1 2
		 */

		String[] str1 = {"sun", "bed", "car"};
		String[] str2 = {"abce", "abcd", "cdx"};
		
		solution(str1, 1);
		solution(str2, 2);
	}
	
	public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] text = new String[strings.length];
        
        for(int i = 0; i < text.length; i++) {
        	text[i] = strings[i].substring(n, n+1);
        }
        Arrays.sort(text);
        
        for(int i = 0; i < text.length; i++) {
        	for(int j = 0; j < strings.length; j++) {
        		String temp = strings[j].substring(n, n+1);
        		
        		if(temp.equals(text[i])) {
        			answer[i] = strings[j];
        		}
        	}
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }

}
