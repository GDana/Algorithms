package done;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("----- 명령의 수를 입력하세요. -----");
		int max = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> deque = new LinkedList<>();
		
		for(int i = 0; i < max; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			String command = st.nextToken();
			int val = 0;
			
			if(command.equals("push_front")) {
				val = Integer.parseInt(st.nextToken());
				deque.addFirst(val);
			} else if(command.equals("push_back")) {
				val = Integer.parseInt(st.nextToken());
				deque.addLast(val);
			} else if(command.equals("pop_front")) {
				if(deque.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(deque.pollFirst());					
				}
			} else if(command.equals("pop_back")) {
				if(deque.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(deque.pollLast());					
				}
			} else if(command.equals("size")) {
				System.out.println(deque.size());
			} else if(command.equals("empty")) {
				if(deque.isEmpty()) {
					System.out.println("1");			
				} else {
					System.out.println("0");
				}
			} else if(command.equals("front")) {
				if(deque.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(deque.getFirst());
				}					
			} else if(command.equals("back")) {
				if(deque.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(deque.getLast());
				}					
			}
		}
	}

}
