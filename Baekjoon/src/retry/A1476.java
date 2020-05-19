package retry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A1476 {
	public static void main(String[] args) throws IOException {
		/* 날짜 계산
		 * https://www.acmicpc.net/problem/1476
		 */

		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt(), s = sc.nextInt(), m = sc.nextInt();
		
		int year = 0;
		while(true) {
			year++;
			if((year-e)%15 == 0 && (year-s)%28 == 0 && (year-m)%19 == 0) break;
		}
		System.out.print(year);
		
		// scanner로는 시간초과가 뜨는 것 같아서 Buffer 쓰려고 했지만 실패 ->다중if문 조건을 잘못 기입해서 시간초과!
//		Scanner sc = new Scanner(System.in);
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
////		final int E = sc.nextInt(), S = sc.nextInt(), M = sc.nextInt();
//		final int E = bf.read(), S = bf.read(), M = bf.read();
//		int e = 1;
//		int s = 1;
//		int m = 1;
//		
//		for(int year = 1; ; year++) {
//			if(e == E && s == S && m == M) {
////				System.out.println(year);
//				bw.write(year);
//				bw.flush();
//				break;
//			}
//			
//			e += 1;
//			s += 1;
//			m += 1;
//			
//			if(e == 16) {
//				e = 1;
//			}
//			if(s == 28) {
//				s = 1;
//			}
//			if(m == 19) {
//				m = 1;
//			}
//		}
//		
//		bw.close();
//		bf.close();
	}
}
