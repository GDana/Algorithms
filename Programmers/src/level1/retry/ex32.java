package level1.retry;

public class ex32 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 월간 코드 챌린지 시즌1 > 3진법 뒤집기  
		/*
		 * 1. 10진수를 3진수로 만든다.
		 * 2. 3진수를 문자열로 형변환 한다.
		 * 3. 문자열을 반전시킨다.
		 * 4. 반전시킨 문자열을 10진수로 만든다.
		 */
		
		solution(45);	//0021, 7
		solution(125);	//22111, 229
		//solution(14);	//211
		//solution(40);	//1111
		//solution(49);	//1121
	}

	public static int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while(n > 2) {
        	int temp = 0;
        	String s = "";
        	
        	temp = n % 3; //0, 0, 2
        	n /= 3;	//15, 5, 1
        	s = String.valueOf(temp);
        	sb.append(s);        		
        	
        	if(n < 3) {
        		sb.append(String.valueOf(n));
        	}
        }
        //System.out.println(sb);	//뒤집기 및 형변환 완료
        
        String str = String.valueOf(sb);
        long num = Long.parseLong(str);
        
        for(int i = 0; i < sb.length(); i++) {
        	long temp = 0;
        	double power = 0;
        	temp = num % 10;
        	num /= 10;
        	
        	if(i == 0) {
        		answer += (temp * 1);        		
        	}else {
        		power = Math.pow(3, i);
        		answer += (temp * (int)power);
        	}
        }
        System.out.println(answer);
        
        return answer;
    }
}
