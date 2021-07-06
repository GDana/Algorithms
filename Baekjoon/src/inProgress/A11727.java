package inProgress;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A11727 {
	/**
	 * 11727
	 * https://www.acmicpc.net/problem/11727
	 * 
	 * top-down(재귀, 메모제이션)
	 * - 11726 문제에 대한 이해가 필요 
	 * - 2x2 타일이 추가 되었기 때문에 점화식에 2x2 타일만 추가하면 된다.
	 * - 전체 가로길이가 n인 2xn 크기의 도형이 있을 때 
	 * (기본 모양을 그릴 수 있도록 주어진 타일(2x1, 1x2, 2x2)의 가로를 뺀 나머지는 도형이 채워져 있다고 가정한다)
	 * 
	 * n = 5
	 * n-1 = 4
	 * 도형의 남은 가로 길이가 1일 때 채울 수 있는 경우의 수는? 모양1 
	 * 모양 1) 1x2로 만들 수 있는 기본 모양
	 * 
	 * n = 5
	 * n-2 = 3
	 * 도형의 남은 가로 길이가 2일 때 채울 수 있는 경우의 수는? 모양2
	 * 모양 2) 2x1로 만들 수 있는 기본 모양
	 * 
	 * n = 5
	 * n-2 = 3
	 * 도형의 남은 가로 길이가 2일 때 채울 수 있는 경우의 수는? 모양3
	 * 모양 3) 2x2로 만들 수 있는 기본 모양
	 * 
	 * n = 5
	 * n-2 = 3 
	 * 도형의 남은 가로 길이가 2일 때 채울 수 있는 경우의 수는? 
	 * '모양1'를 2개 사용해서 만드는 것은 
	 * 결국 기본 '모양1'를 중복해서 사용하는 것이 되기 때문에 
	 * 기본 모양으로써 점화식에 세울 수가 없다.  
	 */

	static int[] arr = new int[1001];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int target = Integer.parseInt(br.readLine());
		
        bw.write(String.valueOf(topDown(target)));
//        bw.write(String.valueOf(bottomUp(target)));
        bw.flush();
	}

	//top-down, 136ms
	public static int topDown(int num) {
		if(num == 1) {
			arr[num] = 1;
			return arr[num];
		} else if(num == 2) {
			arr[num] = 3;
			return arr[num];
		}
		
		if(arr[num] != 0) return arr[num];	//재귀이기 때문에 중복값을 사용할 수 있음을 고려  
		
		return arr[num] = (topDown(num - 1) + (topDown(num - 2) * 2) % 10007) % 10007;
	}
	
	//bottm-up, 136ms
	public static int bottomUp(int num) {
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 3;
		
		for(int i = 3; i <= num; i++) {
			arr[i] = (arr[i-1] + (arr[i-2] * 2) % 10007) % 10007;
		}
		
		return arr[num];
	}
}
