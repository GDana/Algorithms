package level2.retry;

import java.util.ArrayList;
import java.util.Arrays;

public class ex01 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 스택/큐 > 기능 개발 
		/*
		 - 기능은 진도가 100%일 때 서비스에 반영 가능하다. 
		 - 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포된다(->'큐'니까?)
		 
		 - 배포되어야 하는 순대로 작업의 정도가 적힌 배열 progresses
		 - 각 작업의 개발 속도가 적힌 배열 speeds
		 
		 = 각 배포마다 몇개의 기능이 배포는지 
		 */
		/*
		 1. progresses[i]는 100과 같거나 클때까지 speeds[i]를 더한다.
		 2. 더할 때마다 작업일수를 카운트하여 새로운 배열의 원소로 넣어준다.
		 3. 100과 같거나 크다면 progresses의 다음 원소로 넘어간다.  
		 4. 작업일수를 카운트한 배열을 반복문을(int i) 돈다.
		 5. 중첩 반복문을(int j) 돈다.
		 6. arr[i] > arr[j] int count = 1; count++; list.add(count);
		 7. else i = j+1; break;		   
		 */
		
		int[] progresses1 = {93, 30, 55};
		int[] progresses2 = {95, 90, 99, 99, 80, 99};
		int[] speeds1 = {1, 30, 5};
		int[] speeds2 = {1, 1, 1, 1, 1, 1};

		solution(progresses1, speeds1);
		solution(progresses2, speeds2);
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		/*
		테스트 1 〉	실패 (0.07ms, 52.3MB)
		테스트 2 〉	실패 (0.21ms, 52.1MB)
		테스트 3 〉	통과 (0.13ms, 54MB)
		테스트 4 〉	실패 (0.11ms, 52.5MB)
		테스트 5 〉	실패 (0.09ms, 52.1MB)
		테스트 6 〉	통과 (0.06ms, 52.3MB)
		테스트 7 〉	통과 (0.13ms, 51.7MB)
		테스트 8 〉	통과 (0.09ms, 52MB)
		테스트 9 〉	통과 (0.12ms, 52.1MB)
		테스트 10 〉	통과 (0.12ms, 53.8MB)
		테스트 11 〉	통과 (0.04ms, 53MB)
		 */
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++) {
        	int sum = progresses[i];
        	int j;

        	for(j = 0; sum < 100; j++) {
        		sum += speeds[i];
        	}
        	list.add(j);
        }
        //System.out.println(list.toString());	//ok
        
        for(int i = 0; i < list.size(); i++) {
        	int count = 1;
        	//System.out.println("i = " + i);
        	
        	if(i == list.size()-1) {
        		result.add(count);
        		break;
        	}
        	
        	for(int j = i+1; i < list.size(); j++) {
        		if(list.get(i) > list.get(j)) {
        			//System.out.println("if: i = " + i + " j = " + j);
        			count++;
        			
        			if(j == list.size()-1) {
        				i = j;
        				result.add(count);
        				break;
        			}
        		}else {
        			i = j-1;
        			result.add(count);
        			
        			//System.out.println("else: i = " + i);
        			break;
        		}
        	}
        }
        System.out.println(result.toString());		//ok
        
        int size = 0;
        answer = new int[result.size()];
        for(Integer item : result) {
        	String str = String.valueOf(item);
        	int num = Integer.parseInt(str);
        	
        	answer[size++] = num;
        }
        
        System.out.println(Arrays.toString(answer));
        
        
        return answer;
    }
}
