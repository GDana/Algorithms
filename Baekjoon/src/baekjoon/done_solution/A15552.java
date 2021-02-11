package baekjoon.done_solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A15552 {
	public static void main(String[] args) throws IOException {
		/* ���� A + B
		 * https://www.acmicpc.net/problem/15552 
		 * 
		 * 1. �ݺ��� Ƚ�� �Է¹ޱ�
		 * 2. �� �ٸ��� �Է°� �ޱ�(String)
		 * 3. 2�� String -> split
		 * 4. 3�� split -> Number
		 * 5. 4���� �� 2�� ���ϰ� ��� 
		 */

//		Scanner sc = new Scanner(System.in);		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = bf.readLine();
//		bw.write("�� ���ڿ��� buffer�� ������� ���� flush()�� ����Ǹ� str�� �Բ� ��µ˴ϴ� \n");
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
//		// bw.flush() ��ġ�� ���� �ӵ��� �޶���
//		// for�� ���ʿ� �θ� �� �������� ��
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
////			bw.write(first+second+"\n");	//�Ǵ� �ڵ�
//			bw.flush();
//		}
		
		
		// bw.flush() ��ġ�� ���� �ӵ��� �޶���
		// for�� �ٱ��� �а� �� ���� ����� �ڵ�
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
