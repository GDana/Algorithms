package level1.done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex06 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 나누어 떨어지는 숫자 배열 
		/**
		 * 1. arr[i] % divisor 가 0일 때 Arraylist에 추가 
		 * 2. Arraylist 크기 만큼 answer 배열을 초기화 한다. 
		 * 3. Arraylist 를 버블정렬 한다.
		 */
		
		int[] arr1 = {5, 9, 7, 10};
		int[] arr2 = {2, 36, 1, 3};
		int[] arr3 = {3, 2, 6};
		
		solution(arr1, 5);
		solution(arr2, 1);
		solution(arr3, 10);
		
	}

	public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int item : arr) {
        	if(item % divisor == 0) {
        		list.add(item);
        	}
        }
        
        if(list.size() == 0) {
        	list.add(-1);
        }
        
        if(list.size() > 0) {
        	answer = new int[list.size()];
        }
        
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        for(int i=0; i<answer.length-1; i++) {
        	for(int j=answer.length-1; j>i; j--) {
        		if(answer[j-1] > answer[j]) {
        			int val = answer[j-1];
        			answer[j-1] = answer[j];
        			answer[j] = val;
        		}
        	}
        }
        
        /**/
        for(int i=0; i<answer.length; i++) {
        	System.out.print(answer[i] + " ");
        }
        System.out.println();
        
        return answer;
    }
}
