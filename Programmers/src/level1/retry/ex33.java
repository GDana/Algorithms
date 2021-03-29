package level1.done;

import java.util.ArrayList;
import java.util.Arrays;

public class ex33 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 월간 코드 챌린지 시즌1 > 두 개 뽑아서 더하기
		/*
        1. numbers 중복제거
        2. numbers 반복문 돌면서 더하기
        3. 더한값 list에 추가 
        4. list 중복제거 
        */
		
		/*
		테스트 1 〉	통과 (0.48ms, 52.1MB)
		테스트 2 〉	실패 (0.57ms, 53.4MB)
		테스트 3 〉	통과 (0.52ms, 52.3MB)
		테스트 4 〉	실패 (0.49ms, 52.3MB)
		테스트 5 〉	실패 (0.89ms, 52.5MB)
		테스트 6 〉	실패 (3.38ms, 51.4MB)
		테스트 7 〉	실패 (14.26ms, 53MB)
		테스트 8 〉	통과 (5.92ms, 52.9MB)
		테스트 9 〉	통과 (2.37ms, 52.4MB)
		 */

		int[] arr1 = {2,1,3,4,1};
		int[] arr2 = {5,0,2,7};
		
		solution(arr1);	//[2,3,4,5,6,7]
		solution(arr2);	//[2,5,7,9,12]
	}

	public static int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> resultList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(numbers);
        //System.out.println(Arrays.toString(numbers));
        
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		/*
        		System.out.println(i + " + " + j);
        		System.out.println(numbers[i] + " + " + numbers[i+1]);
        		System.out.println("------------------");
        		*/
        		int sum = numbers[i] + numbers[j];
        		list.add(sum);        		
        	}
        }
        //System.out.println(list.toString());
        
        for(int i = 0; i < list.size(); i++) {
        	if(!resultList.contains(list.get(i))) {
        		resultList.add(list.get(i));
        	}
        }
        System.out.println(resultList.toString());
        
        int size = 0;
        answer = new int[resultList.size()];
        for(Integer item : resultList) {
        	answer[size++] = item;
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}
