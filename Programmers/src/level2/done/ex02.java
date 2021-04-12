package level2.done;

public class ex02 {
	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > JadenCase 문자열 만들기 
		// +15
		
		
		System.out.println(solution2("3people unFollowed me "));	//"3people Unfollowed Me", 21
		//System.out.println(solution2("for the last week"));		//"For The Last Week", 17
	}
	public static String solution2(String s) {
		/*
		테스트 1 〉	통과 (0.07ms, 53.7MB)
		테스트 2 〉	통과 (0.08ms, 52.1MB)
		테스트 3 〉	통과 (0.09ms, 52.6MB)
		테스트 4 〉	통과 (0.12ms, 52.5MB)
		테스트 5 〉	통과 (0.10ms, 52.4MB)
		테스트 6 〉	통과 (0.08ms, 53.1MB)
		테스트 7 〉	통과 (0.06ms, 51.7MB)
		테스트 8 〉	통과 (0.06ms, 51.6MB)
		테스트 9 〉	통과 (0.08ms, 52.3MB)
		테스트 10 〉	통과 (0.05ms, 51.9MB)
		테스트 11 〉	통과 (0.10ms, 52.4MB)
		테스트 12 〉	통과 (0.10ms, 52.5MB)
		테스트 13 〉	통과 (0.08ms, 52.1MB)
		테스트 14 〉	통과 (0.09ms, 52.8MB)
		테스트 15 〉	통과 (0.11ms, 52.4MB)
		테스트 16 〉	통과 (0.08ms, 53.2MB)
		 */
		StringBuilder sb = new StringBuilder();
		sb.append(s.toLowerCase());
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ' && i != s.length()-1) {
				String str = s.substring(i+1, i+2).toUpperCase();
				sb.replace(i+1, i+2, str);
			}
		}
		String temp = s.substring(0, 1).toUpperCase();
		sb.replace(0, 1, temp);
		
        return sb.toString();
	}
	public static String solution(String s) {
		/*
		 1. 공백 기준으로 첫글자를 판단한다.
		 2. 첫글자가 숫자면 다음 공백 뒤로 오는 단어로 넘어간다.
		 3. 2번에 해당하지 않는다면 
		 첫글자를 대문자로 변경한다. 
		 */
        
        String[] sa = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < sa.length; i++) {
        	System.out.println(sa[i]);
        	char ch = sa[i].charAt(0);
    		
    		if((ch >= 0 && ch <= 9)|| (ch == 32)) {	//숫자, 공백 체크
    			System.out.println(ch + "는 continue");
    			continue; 
    		}else {
    			String str = String.valueOf(ch);
    			String low = sa[i].substring(1, sa[i].length());
    			System.out.println(str + "는 바꿀 값 ");
    			
    			str = str.toUpperCase();
    			sa[i] = str + low.toLowerCase();
    			System.out.println(sa[i] + "는 else 에서 정제된 값");
    		}
    		//System.out.println(sa[i]);
    		
        	sb.append(sa[i]);
        	sb.append(" ");
        	System.out.println("-----------------------------");
        }
        String temp = sb.toString().substring(0, sb.toString().length()-1);
        System.out.println(temp.length());
        
        return sb.toString().substring(0, sb.toString().length()-1);
    }
}
