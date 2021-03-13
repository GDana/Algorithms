package level1.done;

public class ex24 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 핸드폰 번호 가리기
		/*
		 * 1. phone_number를 Stringbuilder 문자열로 변환 
		 * 2. 문자열 길이 - 5 만큼 도는 반복문을 실행한다. 
		 * 3. 반복문을 실행하는 동안 str.replace(i, i+1, '*')
		 * 4. str을 리턴한다. -> str.toString();
		 */
		
		solution("01033334444");
		solution("027778888");
	}
	
	public static String solution2(String phone_number) {
		System.out.println("::::: 다른 사람 풀이 :::::");
	     char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     return String.valueOf(ch);
	  }

	public static String solution(String phone_number) {
        String answer = "";
        StringBuilder str = new StringBuilder(phone_number);
        
        for(int i = 0; i < str.length() - 4; i++) {
        	str.replace(i, i+1, "*");
        }
        //System.out.println(str.toString());
        answer = str.toString();
        System.out.println(answer);
        
        return answer;
    }
}
