package done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A10845_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test3();
	}

	/**
	 * 성공, 196ms 
	 * - test2() 처럼 각 이벤트마다 출력해줄 필요없음, 속도 느림 (412ms)
	 * - 반복문 실행 완료 후 출력해줘도 됨(test3은 196ms)
	 * - String으로 println 비추 -> StringBuilder 로 println 추천 
	 */
	public static void test3() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
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
					sb.append(-1).append("\n");
				} else {
					sb.append(que.poll()).append("\n");
				}
			} else if(command.equals("size")) {
				if(que.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(que.size()).append("\n");
				}
			} else if(command.equals("empty")) {
				if(que.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n"); 					
				}
			} else if(command.equals("front")) {
				if(que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.peek()).append("\n");					
				}
			} else if(command.equals("back")) {
				if(que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.getLast()).append("\n"); 										
				}
			} 
		}
		System.out.println(sb);
		br.close();
	}
	
	/**
	 * 성공, 412ms 
	 */
	public static void teest2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> que = new LinkedList<>();
		
		for(int i = 0; i < max; i++) {
			StringBuilder sb = new StringBuilder();
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
					sb.append(-1);
					System.out.println(sb);
				} else {
					sb.append(que.poll());
					System.out.println(sb);
				}
			} else if(command.equals("size")) {
				if(que.isEmpty()) {
					sb.append(0);
					System.out.println(sb);
				} else {
					sb.append(que.size());
					System.out.println(sb);
				}
			} else if(command.equals("empty")) {
				if(que.isEmpty()) {
					sb.append(1);
					System.out.println(sb);
				} else {
					sb.append(0);
					System.out.println(sb);
				}
			} else if(command.equals("front")) {
				if(que.isEmpty()) {
					sb.append(-1);
					System.out.println(sb);
				} else {
					sb.append(que.peek());
					System.out.println(sb);
				}
			} else if(command.equals("back")) {
				if(que.isEmpty()) {
					sb.append(-1);
					System.out.println(sb);
				} else {
					sb.append(que.getLast()); 		
					System.out.println(sb);
				}
			} 
		}
		br.close();
	}
	
	/**
	 * 성공, 344ms 
	 */
	public static void test1() throws NumberFormatException, IOException {
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
