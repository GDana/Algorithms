package level2.retry.done;

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
		
		int num = 0;
		num--;
//		System.out.println(num);
		
		System.out.println(solution3("()()"));		//true
		//System.out.println(solution3("(())()"));		//true
		//System.out.println(solution3(")()("));		//false
		//System.out.println(solution3("(()("));		//false 
	}
	
	static boolean solution3(String s) {
		/**
		 '('와 ')'가 한쌍이므로 +1과 -1 연산의 반복이다.
		 때문에 true가 되는 조건은 count가 항상 0이여야 한다.
		 */
		boolean answer = true;
		char[] ch = s.toCharArray();
		
		int count = 0;
        for(int i = 0; i < ch.length; i++) {
        	if(ch[i] == '(') {
        		count++;
        		System.out.println("(: " + count);
        	}else if(ch[i] == ')') {
        		count--;
        		System.out.println("): " + count);
        	}        	
        	
        	// ')'가 많을 경우 음수
            if(count < 0) {
            	System.out.println("count: " + count);
            	return false;
            }
        }
        
       // '('가 많을 경우 양수값 
       if(count > 0) {
    	   return false;
       }
        
        return answer;
	}

	static boolean solution2(String s) {
		/*
		 ( -> +1
		 ) -> -1
		 
		 (()())
		 1. 1 + 1 = 2
		 2. 2 - 1 = 1
		 3. 1 + 1 = 2
		 4. 2 - 1 - 1 = 0
		 */
		boolean answer = true;
		int left = 0;
        int right = 0;
		
		if(String.valueOf(s.charAt(0)).equals(")")) {
    		return false;
    	}
		
		int count = 0;
        for(int i = 0; i < s.length(); i++) {
        	String str = String.valueOf(s.charAt(i));
        	
        	if(str.equals("(")) {
        		left++;
        	}else if(str.equals(")")) {
        		left -= 1;
        	}        	
        }
        
        if(left == 0) {
        	return true;
        }else {
        	return false;
        }
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
        
        if(String.valueOf(s.charAt(0)).equals(")")) {
    		answer = false;
    		return answer;
    	}
        for(int i = 0; i < s.length(); i++) {
        	String str = String.valueOf(s.charAt(i));
        	System.out.println(left + " =? " + right);
        	
        	if(str.equals("(")) {
        		left++;
        	}else if(str.equals(")")) {
        		right++;
        	}
        	
        	if(left > 0 && right > 0) {
        		if(left == right) {
        			System.out.println("[if] " + left + " =? " + right);
        			left = 0;
        			right = 0;
        			continue;
        		}
        	}
        }
        //System.out.println(left + " =? " + right);
        if(left != right) {
        	answer = false;
        	return answer;
        }
        
        System.out.println(answer);

        return answer;
    }
}






