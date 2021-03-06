package level1.retry.done;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Arrays;

public class ex15 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 시저 암호 
		// 다시풀기 완료  
		/*
		 * s를 공백을 포함해 문자열 배열에 담는다
		 * 배열 원소를 16진수로 변환
		 * 변환한 값을 숫자로 변환
		 * temp = 숫자로 변환값 + n
		 * answer += temp를 String으로 변환한 값
		 * 
		 * 고려사항
		 * 1. 공백을 밀어도 공백
		 * 2. 대소문자 구분
		 */
		
		/*
		char a = 'a';
		String str = Integer.toHexString((int)a);
		int numA = Integer.parseInt(str);
		System.out.println(str + 1);
		System.out.println(numA + 1);
		*/
		
		/*
		//String to HexString (String -> byte[] -> BigInteger -> HexString)
		String a2 = (new BigInteger("a".getBytes())).toString(16);	//61
		int numA2 = Integer.parseInt(a2);		//62
		System.out.println(a2 + 1);	//611
		System.out.println(numA2 + 1);	//62
		
		// HexString to String (HexString -> BigInteger -> byte[] -> String)
		String s = new String((new BigInteger(a2, 16)).toByteArray());	//a
		System.out.println(s);	//a		
		System.out.println(Arrays.toString("a B z".split("")));	//[a,  , B,  , z]
		System.out.println();
				
		char c = 0x61;
		int d = (int)c + 1;
		//String str = Character.toString(c);
		String str = Integer.toString(d);
		String s2 = new String((new BigInteger(Integer.toString(d), 16)).toByteArray());
		System.out.println(c);
		
		System.out.println(d);
		System.out.println(Integer.toString(d, 16));
		System.out.println(new String(Integer.toHexString(d)));
		*/
		
		
		
		solution5("AB", 1);	//BC	
		solution5("z", 1);
		solution5("a B z", 4);	//e F d		
	}
	
	public static String solution999(String s, int n) {
		System.out.println("::::: 다른 사람 풀이 :::::");
		/*
		테스트 1 〉	통과 (0.03ms, 52.3MB)
		테스트 2 〉	통과 (0.05ms, 52.2MB)
		테스트 3 〉	통과 (0.04ms, 52.4MB)
		테스트 4 〉	통과 (0.03ms, 52.8MB)
		테스트 5 〉	통과 (0.04ms, 52.3MB)
		테스트 6 〉	통과 (0.04ms, 51.9MB)
		테스트 7 〉	통과 (0.04ms, 52.2MB)
		테스트 8 〉	통과 (0.09ms, 52.2MB)
		테스트 9 〉	통과 (0.04ms, 55.1MB)
		테스트 10 〉	통과 (0.04ms, 52.1MB)
		테스트 11 〉	통과 (0.06ms, 52.6MB)
		테스트 12 〉	통과 (0.04ms, 52.4MB)
		테스트 13 〉	통과 (1.84ms, 53.5MB)
		 */
		StringBuilder sb = new StringBuilder();
		 
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);	//문자열 각 자리를 charAt()으로 참조 
 
			if (ch >= 'a' && ch <= 'z') {	//문자가 소문자인지 체크 
				ch = (char) (ch + n);		//거리 n만큼 더한다. 
				//System.out.println("ch: " +  ch);
				if (ch > 'z') {		//더한 값이 'z'를 넘는다면 
					ch -= 26;
					//System.out.println("ch > z: " + ch);
				}
			} else if (ch >= 'A' && ch <= 'Z') {	//문자가 대문자인지 체크 
				ch = (char) (ch + n);		//거리 n만큼 더한다. 
				if (ch > 'Z')
					ch -= 26;
			}
 
			sb.append(ch);
		}
		System.out.println(sb.toString());
 
		return sb.toString();
	}
	
	public static String solution5(String s, int n) {
		System.out.println("::::: 다시 풀기(4) :::::");
		System.out.println("solution4 코드 개선");
		/*
		테스트 1 〉	통과 (14.70ms, 53.3MB)
		테스트 2 〉	통과 (17.10ms, 53.5MB)
		테스트 3 〉	통과 (14.59ms, 53.2MB)
		테스트 4 〉	통과 (12.79ms, 53.7MB)
		테스트 5 〉	통과 (12.62ms, 54MB)
		테스트 6 〉	통과 (14.64ms, 52.6MB)
		테스트 7 〉	통과 (12.59ms, 52.5MB)
		테스트 8 〉	통과 (12.61ms, 53.7MB)
		테스트 9 〉	통과 (12.55ms, 53.5MB)
		테스트 10 〉	통과 (13.23ms, 52.6MB)
		테스트 11 〉	통과 (13.61ms, 53.4MB)
		테스트 12 〉	통과 (14.22ms, 54.7MB)
		테스트 13 〉	통과 (40.28ms, 71.1MB)
		*/
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
        	System.out.println("(char)arr[i] + n=" + (char)(arr[i] + n));
        	
        	if(arr[i] >= 'a' && arr[i] <= 'z') {
        		arr[i] = (char) (arr[i] + n);
        		
        		if(arr[i] > 'z') {	//소문자보다 큰 아스키코드가 들어온다면
        			arr[i] = (char) (arr[i] - 26);
        		}
        	}else if(arr[i] >= 'A' && arr[i] <= 'Z') {
        		arr[i] = (char) (arr[i] + n);
        		
        		if(arr[i] > 'Z') {
        			arr[i] = (char) (arr[i] - 26);
        		}
        	}
        	
        	answer += (char)arr[i];	//대소문자 이외의 값(빈값)
        	
        	/*
        	if(arr[i] == 'z' || arr[i] == 'Z') {
        		arr[i] = (char) (arr[i] - (25 - (n - 1)));
        		answer += (char)arr[i];
        	}
        	else {	
        		/*
        		1. 대문자보다 소문자의 아스키코드 값이 크다
        		2. 대문자보다 작거나, 대문자보다 크고 소문자보다 작거나, 소문자보다 큰 아스키코드가 들어오면 안된다.
        		
        		answer += (char)(arr[i] + n);
        	}
        	*/        	
        }
        System.out.println(answer);
        
        return answer;
    }
	
	public static String solution4(String s, int n) {
		System.out.println("::::: 다시 풀기(3) :::::");
		System.out.println("string -> char -> string");
		System.out.println("a-z, A-Z 이외의 값은 고려하지 않은 코드");
		
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
        	System.out.println("(char)arr[i] + n=" + (char)(arr[i] + n));
        	
        	if(arr[i] == ' ') {
        		answer += ' ';
        	}else if(arr[i] == 'z' || arr[i] == 'Z') {
        		arr[i] = (char) (arr[i] - (25 - (n - 1)));
        		answer += (char)arr[i];
        	}
        	else {
        		answer += (char)(arr[i] + n);
        	}
        }
        System.out.println(answer);
        
        return answer;
    }
	
	public static String solution3(String s, int n) {
		System.out.println("::::: 다시 풀기(2) :::::");
		System.out.println("string -> char -> string");
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
        	System.out.println("(char)arr[i] + n=" + (char)(arr[i] + n));
        	if(arr[i] == ' ') {
        		answer += ' ';
        	}else if(arr[i] == 'z' || arr[i] == 'Z') {
        		arr[i] = (char) (arr[i] - (25 - (n - 1)));
        		answer += (char)arr[i];
        	}
        	else {
        		answer += (char)(arr[i] + n);
        	}
        }
        System.out.println(answer);
        
        return answer;
    }

	public static String solution2(String s, int n) {
		System.out.println("::::: 다시 풀기(1) :::::");
		System.out.println("string -> char -> num -> char -> string");
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
        	int num = (int)arr[i];
        	char c = ' ';
        	//System.out.println("ch:" + (char)num);
        	if(arr[i] == ' ') {
        		answer += ' ';
        	}else if(num == 90 || num == 122) {
        		num = num - (25 - (n - 1));
        		c = (char)num;
        		answer += c;
        		//System.out.println("ch > z:" + c);
        	}
        	else {
        		num += n;
        		c = (char)num;
        		answer += c;
        	}
        }
        System.out.println(answer);
        
        return answer;
    }

    public static String solution(String s, int n) {
    	System.out.println("::::: 처음 제출했던 코드 :::::");
        String answer = "";        
        String[] arr = s.split("");
        
        for(String item : arr) {
        	System.out.println("item::" + item);
        	if(!item.equals(" ") && item.equals("z") && item.equals("Z")) {        		
        		String a2 = (new BigInteger(item.getBytes())).toString(16);
        		int numA2 = Integer.parseInt(a2) + n;
        		String s2 = new String((new BigInteger(Integer.toString(numA2), 16)).toByteArray());
        		answer += s2;
        		System.out.println(a2 + ", " + numA2);
        		System.out.println("answer::" + s2);
        	}else if(item.equals("z")){
        		//String(z) -> hex -> int + n -> hex -> String
        		char c = 0x60;
        		int d = (int)c + n;
        		String str = Character.toString(c);
        	}else {
        		answer += item;
        		System.out.println("공백::" + item + "::");
        	}
        	System.out.println();
        }
        
        return answer;
    }
}
