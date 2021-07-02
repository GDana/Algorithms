package inProgress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1463_1 {

	public static void main(String[] args) throws IOException {
		/**
			X가 3으로 나누어 떨어지면, 3으로 나눈다.
			X가 2로 나누어 떨어지면, 2로 나눈다.
			1을 뺀다.
			
			1로 만드는 최솟값을 구하시오.
			2 -> 1
			10 -> 3
		 */
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("----- 명령의 수를 입력하세요. -----");
		String str = br.readLine();
		
		int target = Integer.parseInt(str);
		int count = 0;
		target -= 1;
		
		while(true) {
			System.out.println("target: " + target);
			count++;
			
			if(target % 3 == 0) {
				target /= 3;
			} else if(target % 2 == 0) {
				target /= 2;
			}
			
			if(target == 1) {
				System.out.println("count: " + count);
				return;				
			}
		}
		
		
	}
//	public int fibonacci(int n) {
//		d[0] = 0;
//		d[1] = 1;
//		for (int i = 2; i <= n; i++) {
//			d[i] = d[i - 1] + d[i - 2];
//		}
//		return d[n];
//	}

}
