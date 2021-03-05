package level1.retry;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Arrays;

public class ex15 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 시저 암호 
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
		
		/**/
		//System.out.println(solution("AB", 1));	//BC
		//System.out.println(solution("z", 1));	//a
		//System.out.println(solution("a B z", 4));	//e F d		
	}

    public static String solution(String s, int n) {
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
