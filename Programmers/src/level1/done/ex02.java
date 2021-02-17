package level1.done;

import java.util.Arrays;

public class ex02 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 정렬 > K번째수
		/*
		1. commands 배열의 반복문을 돈다.
		2. 각 원소는 배열로 이루어졌으므로 다시 반복문을 돈다.
		3. 첫번째 원소, 두번째 원소를 이용해 새로운 배열 생성(정렬 할 배열)
		4. 정렬 할 배열을 버블정렬한다.
		5. 정렬 한 배열을 세번째 원소에 부합하는 값을 출력한다.
		*/
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] answer = solution(array, commands);
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]);
		}
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		answer = new int[commands.length];
		int one = 0;
		int two = 0;
		int three = 0;

		for (int i = 0; i < commands.length; i++) {
			for (int j = 0; j < commands[i].length; j++) {
				if (j == 0) {
					one = commands[i][j];
				} else if (j == 1) {
					two = commands[i][j];
				} else if (j == 2) {
					three = commands[i][j];
				}
			}

			int size = (two - one) + 1;

			int[] temp = new int[size];
			temp = Arrays.copyOfRange(array, one - 1, two);

			for (int j = 0; j < temp.length - 1; j++) {
				for (int k = temp.length - 1; k > j; k--) {
					if (temp[k - 1] > temp[k]) {
						swap(temp, k - 1, k);
					}
				}
			}
			answer[i] = temp[three - 1];
		}

		return answer;
	}

	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

}
