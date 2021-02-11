package baekjoon.done;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A10951 {
	public static void main(String[] args) throws IOException {
		/* A + B - 4
		 * https://www.acmicpc.net/problem/10951
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String reader;
		
		while((reader = br.readLine()) != null) {
			int a = Integer.parseInt(reader.split(" ")[0]);
			int b = Integer.parseInt(reader.split(" ")[1]);
//			int result = a + b;
//			bw.write(String.valueOf(result));	
			bw.write(a + b + "\n");
			bw.flush();
		}
		bw.close();
	}
}
