package level1.done;

public class ex03 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 가운데 글자 가져오기 
		/*
		 1. 문자열 길이 % 2의 나머지가 0일때 짝수, 1일때 홀수 
		 2. 홀수 - 문자열 길이/2 의 몫을 인덱스로 접근한다 
		 3. 몫에서 소수가 발생하면 버린다
		 4. 짝수 - 문자열 길이/2 의 몫, 몫-1   
		 */
		
		String str1 = "abcde";
		String str2 = "qwer";
		
		System.out.println(solution(str1));
		System.out.println(solution(str2));

	}

	public static String solution(String s) {
		String answer = "";
		int num = s.length() % 2;
		int idx = (int) Math.floor(s.length() / 2);

		if (num == 1) { // 홀수
			answer = s.substring(idx, idx + 1);
		} else {
			answer = s.substring(idx - 1, idx + 1);
		}

		return answer;
	}

}
