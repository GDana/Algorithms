package done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A10845_1 {

	/**
	 * 
	 * 성공, 344ms 
	 * System.out.println 보다 빠른 BufferedReader 를 사용하는 것이 올바른 접근 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("----- 명령의 수를 입력하세요. -----");
		int max = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> que = new LinkedList<>();
		
		for(int i = 0; i < max; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			String command = st.nextToken();
			
			if(command.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				
				if(que.size() < max) {
					que.offer(num);
				}
			} else if(command.equals("pop")) {
				if(que.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(que.poll());							
				}
			} else if(command.equals("size")) {
				if(que.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(que.size());					
				}
			} else if(command.equals("empty")) {
				if(que.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0"); 					
				}
			} else if(command.equals("front")) {
				if(que.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(que.peek());					
				}
			} else if(command.equals("back")) {
				if(que.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(que.getLast()); 										
				}
			} 
		}
	}

}
