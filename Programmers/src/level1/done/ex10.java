package level1.done;

public class ex10 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 문자열 다루기 기본
		/*
		 * 1. 문자열 길이 체크 
		 * 2. Integer형으로 형변환 되는지 체크
		 */
		
		String str1 = "a234";
		String str2 = "1234";
		
		//solution("a234");
		solution("1234");
	}

	public static boolean solution(String s) {
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

}
