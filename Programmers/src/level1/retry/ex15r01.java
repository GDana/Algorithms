package level1.retry;

public class ex15r01 {
	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 시저 암호 
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
		solution("   ", 1);
	}

	public static String solution(String s, int n) {
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
