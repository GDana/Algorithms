package level1.done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class ex11 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 문자열 내림차순으로 배치하기 
		/**
		 * 1. 대문자인 문자열을 잘라서 저장한 list 배열을 생성 및 초기화한다.
		 * 2. list 배열을 내림차순으로 정렬한다.
		 * 3. 소문자만 남겨진 문자열을 split("") 으로 자른 배열을 생성한다.
		 * 4. 소문자 배열을 내림차순 정렬한다.
		 * 5. answer = 소문자 배열 + list 배열 
		 * 
		 */

		String str = "Zbcdefg";
		char[] ch = str.toCharArray();
		//System.out.println(Arrays.toString(ch));
		Arrays.sort(ch);
		
		String b = new StringBuilder(new String(ch)).reverse().toString();
		
		System.out.println(b);
		//System.out.println(solution(str));
		System.out.println(reverseStr2(str));
		//System.out.println(reverseStr(str));
		
		/*
		if('z' > 'Z') {
			System.out.println("소문자가 더 큼");
		}else {
			System.out.println("이 가설이 아닌가 봄");
		}
		*/
	}
	
	public static String reverseStr2(String str){
	    char[] sol = str.toCharArray();
	    System.out.println(Arrays.toString(sol));
	    Arrays.sort(sol);
	    String temp = new String(sol);
	    System.out.println("temp: " + temp);
	    
	    return new StringBuilder(new String(sol)).reverse().toString();
    }
	
	public static StringBuilder reverseStr(String str){
	    String[] sol = str.split("");
	    Arrays.sort(sol, Collections.reverseOrder());
	    
	    
	    return new StringBuilder(sol.toString());
	    //return new StringBuilder(new String(sol)).reverse().toString();
    }
	
	public static String solution(String s) {
        String answer = "";
        ArrayList<String> upperList = new ArrayList<>();
        ArrayList<String> lowerList = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++) {
        	String temp = s.substring(i, i+1);
        	
        	if(temp.toLowerCase().equals(temp)) {	//대문자인 temp를 거르기 위함
        		upperList.add(temp);
        	}else {
        		lowerList.add(temp);
        	}
        }
        
        Collections.reverse(upperList);
        ListIterator li = upperList.listIterator(); 
        while(li.hasNext()){ 
        	System.out.print(li.next()); // edcba 
        }

        
        
        /*
        String[] upperArr = new String[upperList.size()];
        String[] lowerArr = new String[lowerList.size()];
       
        for(int i=0; i<upperArr.length; i++) {
        	upperArr[i] = upperList.get(i);
        }
        
        for(int i=0; i<lowerArr.length; i++) {
        	lowerArr[i] = lowerList.get(i);
        }
        
        Arrays.sort(upperArr, Collections.reverseOrder());
        Arrays.sort(lowerArr, Collections.reverseOrder());
        
        for(String u : upperArr) {
        	answer += u;
        }
        
        for(String l : lowerArr) {
        	answer += l;
        }*/
        
        return answer;
    }

}
