package level1.done;

import java.util.ArrayList;
import java.util.Arrays;

public class ex29 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 자연수 뒤집어 배열로 만들기 
		/*
		 * 1. arrlist.add(n % 10)
		 * 2. n = n / 10
		 * 3. n < 10 -> arrlist.add(n); break;
		 * 4. arrlist 크기만큼 answer 길이 초기화
		 * 4. arrlist 반복문을 돌면서 answer요소 추가 
		 */
		
		/*
		 * Integer형 ArrayList배 int형으로 바꾸는 법 
		 * https://bit.ly/3bIcVmo 
		 */

		solution(12345);
	}

	public static int[] solution(long n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {        	
        	if(n < 10) {
        		list.add((int) n);
        		break;
        	}
        	
        	list.add((int) (n % 10));
        	n = n / 10;
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i).intValue();
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}
