package level2.retry;

public class ex03 {

	public static void main(String[] args) {
		// 코딩테스 연습 > 연습문제 > 올바른 괄호 
		
		/*
		char ch = 'c';
		int n = 40;
		
		if(ch == n) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}*/
		
		System.out.println(solution("()()"));
		//System.out.println(solution("(())()"));
		//System.out.println(solution(")()("));
		//System.out.println(solution("(()("));
	}

	static boolean solution(String s) {
		/*
		 1. 괄호 왼쪽 오른쪽을 구분하는 각각의 counter를 만든다.
		 2. 오른쪽 괄호부터 나오면 false 
		 3. 왼쪽 괄호의 counter만큼 오른쪽 괄호의 counter가 같아야 한다. 
		 */
        boolean answer = true;
        int left = 0;
        int right = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	String str = String.valueOf(s.charAt(i));
        	System.out.println(left + " =? " + right);
        	
        	if(String.valueOf(s.charAt(0)).equals(")")) {
        		return false;
        	}
        	if(left > 0 && right > 0) {
        		if(left == right) {
        			System.out.println("if");
        			System.out.println(left + " =? " + right);
        			left = 0;
        			right = 0;
        			continue;
        		}
        	}
        	
        	if(str.equals("(")) {
        		left++;
        	}else if(str.equals(")")) {
        		right++;
        	}
        }
        //System.out.println(left + " =? " + right);
        if(left != right) {
        	return false;
        }

        return answer;
    }
}






