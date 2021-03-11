package level1.done;

import java.util.ArrayList;
import java.util.Arrays;

public class ex22 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 행렬의 덧셈 
		/*
		 * 2차원 배열 2개를 인자로 받는다
		 * 1차원 배열의 원소 개수만큼 새로운 2차원 배열을 만든다 
		 * 
		 * 1. arr1 길이를 갖는 새로운 2차원 배열을 선언한다. 
		 * 2. arr1 길이만큼 반복문을 돈다.  
		 * 3. 원소(배열)의 길이를 확인한다. 
		 * 4. 원소 길이를 갖는 새로운 배열을 생성한다.
		 * 4. arr1[i][j] + arr2[i][j]
		 */

		int[][] arr1 = {{1,2}, {2,3}};
		int[][] arr2 = {{3,4}, {5,6}};
		int[][] arr3 = {{1},{2}};
		int[][] arr4 = {{3},{4}};
		
		//solution(arr1, arr2);	//{{4,6}, {7,9}}
		//solution(arr3, arr4);	//{{4},{6}}
		
		solution2(arr1, arr2);
		
	}
	
	public static int[][] solution2(int[][] arr1, int[][] arr2) {
		System.out.println("::::: 다른 사람 풀이 :::::");
		int[][] answer = new int[arr1.length][arr1[0].length];
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {
				System.out.print(answer[i][j] + ", ");
			}
			System.out.println();
		}
		return answer;
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < arr1.length; i++) {
        	ArrayList<Integer> temp = new ArrayList<>();
        	        	
        	for(int j = 0; j < arr1[i].length; j++) {
        		int sum = arr1[i][j] + arr2[i][j];
        		temp.add(sum);
        	}
        	list.add(temp);
        }
        System.out.println(list.toString());
        
        for(int i = 0; i < list.size(); i++) {
        	int[] temp = new int[list.get(i).size()];
        	
        	for(int j = 0; j < list.get(i).size(); j++) {
        		temp[j] = Integer.parseInt(Integer.toString(list.get(i).get(j)));
        	}
        	
        	System.out.println(Arrays.toString(temp));
        	answer[i] = new int[temp.length];
        	for(int k = 0; k < temp.length; k++) {
        		answer[i][k] = temp[k];
        		System.out.println("answer[" + i + "]" + "[" + k + "] = " + temp[k]);
        	}
        }
        
        for(int i = 0; i < answer.length; i++) {
        	for(int j = 0; j < answer[i].length; j++) {
        		System.out.print(answer[i][j] + ", ");
        	}
        	System.out.println();
        }
        
        return answer;
    }
}
