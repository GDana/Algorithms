package level1.done;

import java.util.ArrayList;

public class ex05 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 같은 숫자는 싫어 
		/**
		 * 1. 0~10까지 도는 반복문을 실행한다 
		 * 2. 배열 파라미터를 도는 중첩 반복문을 실행한다
		 * 3. 첫번째 반복문의 변수값이 있다면 break 및 answer 배열에 추가한다 
		 */
		
		int[] arr1 = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};

		//solution(arr1);
		solution(arr2);
	}

	public static int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        int i;
        for(i=0; i<arr.length; i++) {
        	int count = 0;
        	System.out.println("arr[" + i + "]: " + arr[i]);
        	
        	for(int j=i+1; j<arr.length; j++) {
        		System.out.println("------------");
        		System.out.println("arr[" + j + "]: " + arr[j]);
        		
        		if(arr[i] == arr[j]) {
        			++count;
        			System.out.println("count: " + count);
        		}else {
        			break;        			
        		}
        	}
        	
        	if(count > 0) {
        		list.add(arr[i]);        			
        		i += count;
        	}else {
        		list.add(arr[i]);
        	}
        }
        
        answer = new int[list.size()];
        for(int j=0; j<answer.length; j++) {
        	answer[j] = list.get(j);
        }
        System.out.println(list.toString());

        return answer;
    }
}
