package level1.done;

public class ex12 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 수박수박수박수박수박수?
		/*
		 * 1. n % 2 == 0
		 * 2. n / 2 = val
		 * 3. val 크기만큼 반복문을 돌며 "수박" + "수박"
		 * 
		 * 4. n % 2 == 1
		 * 5. n / 2 = val
		 * 6. val 크기만큼 반복문을 돌며 "수박" + "수박"
		 * 7. answer += "수"
		 */

		
		System.out.println("::::: 내가 제출한 풀이 :::::");
		System.out.println(solution(3));
		System.out.println(solution(4));
		
		System.out.println();
		System.out.println(solution2(3));
		System.out.println(solution2(4));
	}
	
	public static String solution2(int n){
		System.out.println("::::: 다른 사람 풀이 :::::");
        StringBuffer sf = new StringBuffer();
        
        for (int i = 1; i <= n; ++i) { //0부터 시작하면 n값에 +1한 결과값과 "박수"로 바뀌어 출력 
            sf.append(i % 2 == 1? "수" : "박");
        }
        
        return sf.toString();
    }
	
	public static String solution(int n) {
        String answer = "";
        StringBuilder temp = new StringBuilder();
        int remainder = n % 2;
        
        for(int i = 0; i < n / 2; i++) {
        	temp.append("수박");
        }
        
        if(remainder > 0) {
        	temp.append("수");
        }
        
        answer = temp.toString();
        
        return answer;
    }
	
	

}
