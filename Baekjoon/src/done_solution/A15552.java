package done_solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A15552 {
	public static void main(String[] args) throws IOException {
		/* 빠른 A + B
		 * https://www.acmicpc.net/problem/15552 
		 * 
		 * 1. 반복할 횟수 입력받기
		 * 2. 각 줄마다 입력값 받기(String)
		 * 3. 2번 String -> split
		 * 4. 3번 split -> Number
		 * 5. 4번의 값 2개 더하고 출력 
		 */

//		Scanner sc = new Scanner(System.in);		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = bf.readLine();
//		bw.write("이 문자열을 buffer의 기능으로 인해 flush()가 실행되면 str과 함께 출력됩니다 \n");
		int num = bf.read();
		bw.write(str);
		bw.write(num);
		bw.flush();
		bw.close();

//		String str;
//		int first, second;
//		int result;
//		int repeat = Integer.parseInt(bf.readLine());
//
//		// bw.flush() 위치에 따라 속도가 달라짐
//		// for문 안쪽에 두면 더 느려지는 듯
//		for(int i = 0; i < repeat; i++) {
//			str = bf.readLine();
//			
//			first = Integer.parseInt(str.split(" ")[0]);
//			second = Integer.parseInt(str.split(" ")[1]);
//			
//			result = first + second;
//			
//			bw.write(String.valueOf(result));
//			bw.newLine();
//			
////			bw.write(first+second+"\n");	//되는 코드
//			bw.flush();
//		}
		
		
		// bw.flush() 위치에 따라 속도가 달라짐
		// for문 바깥에 둔게 더 빨라서 통과한 코드
//		String str;
//		int first, second, result;
//		int repeat = Integer.parseInt(bf.readLine());
//
//		for(int i = 0; i < repeat; i++) {
//			System.out.println(i);
//			str = bf.readLine();
//			
//			first = Integer.parseInt(str.split(" ")[0]);
//			second = Integer.parseInt(str.split(" ")[1]);
//			
//			result = first + second;
//			
//			bw.write(String.valueOf(result));
//			bw.newLine();
//		}
//		bw.flush();
	}
}
