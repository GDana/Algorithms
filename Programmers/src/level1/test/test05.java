package level1.test;

public class test05 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 소수 찾기 

		//solution(10);
		//solution(5);
		solution(2);
		System.out.println(solution2(2));
	}
	
	public static boolean solution2(int n) {
		boolean result = true;
        for(int i=2; i<n; i++){
            if(n % i == 0) {
            	System.out.println("n % i = " + n % i);
            	result = false;
            	return result;
            }
        }
        
        return result;
    }

	public static int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
        	boolean temp = true;
        	
        	for(int j = 2; j < i; j++) {
        		if(i % j == 0) {
        			temp = true;
        			break;
        		}	
        		//System.out.println(i + " & " + j + " = " + i%j);
        		temp = false;
        	}
        	if(!temp) {
        		answer++;
        	}
        }
        
        if(n >= 2) answer++;
        
        System.out.println(answer);
        
        return answer;
    }
}
