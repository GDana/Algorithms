package level1.retry.done;

public class ex10 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 문자열 다루기 기본 
		// 다시풀기 완료

		String str1 = "a234";
		String str2 = "1234";
		
		//System.out.println(solution(str1));
		//System.out.println(solution(str2));
		
	}
	
	public static boolean solution2(String s) {
		System.out.println("::::: 다시풀기 성공한 코드 :::::");
        boolean answer = true;
        char[] arr = s.toCharArray();
        
        if(s.length() != 4 && s.length() != 6) {
        	System.out.println("길이가 짧음: " + s.length());
        	answer = false;
        }        
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((int)arr[i] + " ");
			int temp = (int)arr[i];
			
			if(!(48 <= temp && temp <= 57)) {
				System.out.println("숫자가 아닌 값이 들어옴: " + (char)temp);
				answer = false;
				break;
			}
		}
		
		System.out.println(answer);
        
        return answer;
    }

	public static boolean solution(String s) {
		System.out.println("::::: 처음 제출했던 코드 :::::");
        boolean answer = true;
        
        System.out.println("HEX vs INT");
        for(int i=0; i<s.length(); i++) {
        	
        	/*
			int ch = s.charAt(i);
        	String str = Integer.toHexString(ch);
        	
        	if(str.equals("30") || str.equals("31") || str.equals("32") || str.equals("33") || str.equals("34")
        			|| str.equals("35") || str.equals("36") || str.equals("37") || str.equals("38") || str.equals("39")) {
        		answer = true;
        	}else {
        		answer = false;
        		break;
        	}
        	 */
        	
        	System.out.println(s.charAt(i));
        }
        System.out.println();
        
        return answer;
    }
}
