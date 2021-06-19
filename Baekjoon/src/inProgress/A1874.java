package inProgress;

import java.util.Scanner;
import java.util.Stack;

public class A1874 {

	public static void main(String[] args) {
		/**
		 * 1. 데이터의 수를 입력 받는다. 
		 * 2. 입력받은 데이터 크기를 갖는 배열을 생성한다. (스택으로 생성) 
		 * 3. 수열을 입력 받는다.  
		 * 3. 현재 peek() 값 조회, 없을 경우 예외 처리 (새로운 스택)
		 * 4. 현재 peek()과 수열과 다르다면 차이만큼 Push 
		 * 5. 같다면 pop
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- 데이터의 수를 입력하세요. -----");
		int num = Integer.parseInt(sc.nextLine());
		
		Stack<Integer> base = new Stack<>();
		Stack<Integer> result = new Stack<>();
		Stack<String> resultStr = new Stack<>();
		boolean resultBool = true;
		
		for(int i = num; i > 0; i--) {
			base.push(i);
		}
		//[4, 3, 6, 8, 7, 5, 2, 1] result
		//[8, 7, 6, 5, 4, 3, 2, 1]
		
		for(int i = 0; i < num; i++) {
			int target = Integer.parseInt(sc.nextLine());
			int temp = 0;
			
			for(int j = 0; j < target; j++) { 
				//push
				if(base.size() > 0) {
					if(result.size() > 0) {
						if(result.peek() != target) {	
							temp = base.pop();
							result.push(temp);
							resultStr.push("+");
						} else {
							break;
						}
					} else {
						temp = base.pop();
						result.push(temp);
						resultStr.push("+");
					}
				}
			}

			if(result.peek() > target) {
				resultBool = false;
				break;
			} else if(result.peek() == target) {	//pop
				result.pop();
				resultStr.push("-");
			} 
		}
		
		if(resultBool) {
			System.out.println(resultStr.toString());
		} else {
			System.out.println("NO");
		}
		
	}

}
