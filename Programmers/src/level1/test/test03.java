package level1.test;

public class test03 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 가운데 글자 가져오기 
		/*
		 * 1. idx = s.length() / 2
		 * 2. if(s.length() % 2 == 0)
		 * 	s.substring(idx-1, idx)
		 * 3. else
		 *  s.substring(idx)
		 */

		solution("abcde");
		solution("qwer");
	}

	public static String solution(String s) {
        String answer = "";
        int idx = s.length() /2;
        
        if(s.length() % 2 == 0) {
        	answer = s.substring(idx-1, idx+1);
        }else {
        	answer = s.substring(idx, idx+1);
        }
        System.out.println(answer);
                
        return answer;
    }
}
