package level1.retry;

import java.util.ArrayList;
import java.util.Arrays;

public class ex19 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 제일 작은 수 제거하기 
		/*
		 * 1. arr.lenth == 0 || arr[0] == 10 이면
		 * 	-1을 반환 
		 * 2. array -> list 변환 
		 * 3. int temp = 첫번째 index를 저장한다.
		 * 4. list.get(index) > list.get(index+1) 보다 적으면 temp의 index 값을 변경한다.
		 * 5. 반복문이 끝나면
		 *  list.remove(index);
		 * 6. list -> array
		 */
		
		/* 궁금한 점 
		 * 1. 크기가 초기화 되어 있지 않은 기본형을 동적으로 초기화 하려면? 
		public static int[] solution(int[] arr) {
	        int[] answer = {};
	        
	        if(arr.length == 0 || arr[0] == 10) {
	       		answer = new int[1];
	        	answer = {-1};	//에러 발생 
	        }
	        
	        return answer;
	    }
		 */
		
		int[] arr1 = {4,3,2,1};
		int[] arr2 = {10};
		
		solution(arr1);
		solution(arr2);
	}
	
	public static int[] solution(int[] arr) {
		int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int item : arr) {
        	list.add(item);
        }
        
        int index = 0;
        for(int i = 0; i < list.size(); i++) {
        	for(int j = list.size()-1; j > i; j--) {
	        	if(list.get(j) < list.get(j-1)) {
	        		index = j;
	        	}
        	}
        }
        
        System.out.print("제일 작은 수: " + list.get(index) + "\n");
        
        list.remove(index);
        
        int size = 0;
        
        if(list.size() == 0) {
        	System.out.println("list.size(): " + list.size());
        	answer = new int[1];
        	answer[0] = size-1;
        }else {
        	answer = new int[list.size()];
        	
        	for(int item : list) {
            	answer[size++] = item; 
            }
        }
        
        System.out.println(Arrays.toString(answer) + "\n");
        
        return answer;
    }

}
