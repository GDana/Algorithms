package level1.test;

public class test02 {

	public static void main(String[] args) {
		// [실패] 코딩테스트 연습 > 연습문제 > 시저 암호 
		/*
		 * 1. String -> char[]
		 * 2. char[] 반복문 
		 * 3. char -> int -> temp = int값 + n
		 * 4. int -> char
		 * 5. char -> String
		 * 6. return 
		 * 
		 * ++공백도 고려하는 코드 추가
		 * ++'z', 'Z'일 경우 고려하는 코드 추가 
		 */
		
		//solution("AB", 1);	//BC
		//solution("z", 1);	//a
		//solution("a B z", 4);	//e F d
		
	}
	
	public static String solution4(String s, int n) {
		System.out.println("::::: 다른 사람 풀이 :::::");
		StringBuilder sb = new StringBuilder();
		 
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);	//문자열 각 자리를 charAt()으로 참조 
 
			if (ch >= 'a' && ch <= 'z') {	//문자가 소문자인지 체크 
				ch = (char) (ch + n);		//거리 n만큼 더한다. 
				System.out.println("ch: " +  ch);
				if (ch > 'z') {		//더한 값이 'z'를 넘는다면 
					ch -= 26;
					System.out.println("ch > z: " + ch);
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

	public static String solution2(String s, int n) {
		System.out.println("::::: 다시 풀기 :::::");
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
        	int num = (int)arr[i];
        	char c = ' ';
        	
        	if(arr[i] == ' ') {
        		answer += ' ';
        	}else if(num == 90 || num == 122) {
        		num = num - (25 - (n - 1));
        		c = (char)num;
        		answer += c;
        	}
        	else {
        		num += n;
        		c = (char)num;
        		answer += c;
        	}
        }
        
        System.out.println("결과:" +answer + ":끝");
        
        return answer;
    }
}
