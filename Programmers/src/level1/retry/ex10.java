package level1.retry;

public class ex10 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 문자열 다루기 기본 

		String str1 = "a234";
		String str2 = "1234";
		
		//System.out.println(solution(str1));
		//System.out.println(solution(str2));
		
	}

	public static boolean solution(String s) {
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
