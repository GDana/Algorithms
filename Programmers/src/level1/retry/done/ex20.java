package level1.retry.done;

public class ex20 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 콜라츠 추측
		// 다시풀기 완료
		/*
		 * 1. 짝수, 음수 체크 
		 * 2. 체크 결과에 따른 분기문
		 * 3. 분기문의 결과 == 1 break; 
		 * 4. 그렇지 않다면, 반복
		 */
		
		//solution2(6);	//8, 6→3→10→5→16→8→4→2→1 
		//solution2(16);	//4
		solution2(626331);	//-1

	}
	
	public static int solution2(long num) {
		System.out.println("::::: 다시 풀기(1) :::::");
        int answer = 0;
        
        while(true) {	//num이 1이 될 때 까지 반복
        	if(num == 1) {
	        	break;
	        }
        	
	        if(num % 2 == 0) {
	        	num /= 2;
	        }else {
	        	num = num * 3 + 1;
	        }	        
	        answer++;
	        //System.out.println("num: " + num);
	        if(answer == 500) {
	        	answer = -1;
	        	break;
	        }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
	
	public static int solution1(int num) {
        int answer;
        int curr = num;
        int temp = 0;
        
        for(answer = 1; answer < 500; answer++){    
            if(curr % 2 == 0){
            	System.out.print("[+, ");
                temp = curr / 2;
            }else{
            	System.out.print("[-, ");
                temp = curr * 3 + 1;
            }
            curr = temp;
            System.out.println(answer + "]curr: " + curr);
            
            if(curr == 1){
                break;
            }
        }
        
        if(answer == 500){
            answer = -1;
        }
        
        return answer;
    }

	public static int solution(int num) {
        int answer = 0;
        int curr = num;
        
        while(answer < 500) {        	
	        if(curr % 2 == 0) {	
	        	curr = (int) Math.floor(curr / 2);
	        }else {
	        	curr = (curr * 3) + 1;
	        }
	        answer++;
	        System.out.println("[" + answer + "]curr: " + curr);
	        
	        if(curr == 1) {
	        	break;
	        }
        }
        if (answer == 500) {
        	answer = -1;
        }
        //System.out.println("answer: " + answer + " / curr: " + curr);
        
        return answer;
    }
}
