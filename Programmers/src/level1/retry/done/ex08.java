package level1.retry.done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ex08 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 문자열 내 마음대로 정렬하기 
		/**
		 * 1. strings[n]를 담은 idxArr 배열 생성 
		 * 2. idxArr를 오름차순으로 정렬한 ascArr 배열 생성 
		 * 3. ascArr을 돌면서 중첩 반복문으로 idxArr을 돌면서 
		 * ascArr가 idxArr에서 위치한 인덱스를 찾아낸다.
		 * 4. 인덱스를 찾으면 (바깥 반복문 i, 중첩 반복문 j)
		 * ascArr[i] = strings[j]
		 */

		String[] str1 = {"sun", "bed", "car"};
		String[] str2 = {"abce", "abcd", "cdx"};
		
		solution1(str1, 1);
		//solution2(str2, 2);
	}
	
	
	public static String[] solution1(String[] strings, int n) {
		System.out.println("::::: 다시 풀기(1) :::::");		
        String[] answer = new String[strings.length];
        
        for(int i = 0; i < strings.length; i++) {
        	String temp = strings[i].substring(n, n+1); 
        	strings[i] = temp + strings[i];
        	
        	//System.out.println(strings[i]);
        }
        Arrays.sort(strings);
        
        for(int i = 0; i < strings.length; i++) {
        	answer[i] = strings[i].substring(1, strings[i].length());
        	
        	//System.out.println(strings[i]);
        }
                
        return answer;
    }
	public static String[] solution(String[] strings, int n) {
		System.out.println("::::: 처음 제출했던 코드 :::::");
        String[] answer = new String[strings.length];
        String[] idxArr = new String[strings.length];
        String[] ascArr = new String[strings.length];
        
        for(int i=0; i<strings.length; i++) {
        	idxArr[i] = strings[i].substring(n, n+1);
        }        
        ascArr = Arrays.copyOfRange(idxArr, 0, idxArr.length);
        Arrays.sort(ascArr);
        
        for(int i=0; i<ascArr.length; i++) {
        	String temp = strings[0];
        	
        	for(int j=0; j<idxArr.length; j++) {
        		if(ascArr[i].equals(idxArr[j])) {
        			//System.out.println("ascArr[i]: " + ascArr[i] + " strings[j]: " + strings[j]);
        			answer[i] = strings[j];
        		}
        	}
        }
       
        return answer;
    }
}
