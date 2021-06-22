package inProgress;

import java.util.Scanner;

public class A10845 {
	private int max;	//큐 용량 
	private int front;	//첫 번째 요소 인덱스 
	private int rear;	//마지막 요소 인덱스 
	private int size; 	//현재 데이터 개수 
	private int[] que;
	
	public A10845(int commandNum) {
		size = front = rear = 0;
		max = commandNum;
		que = new int[commandNum];
	}
	
	public void push(int num) {
		if(rear == max) {
			rear = 0;
		}
		que[rear++] = num;
		size++;
	}
	
	public int pop() {
		int result = -1;
		
		if(size > 0) {
			result = que[front++];
			size--;			
		} else {
			return result;
		}
		
		if(front == max) {
			front = 0;
		}
		
		return result;
	}
	
	public int getSize() {
		int result = 0;
		
		if(size > 0) {
			result = size;
		}
		
		return result;
	}
	
	public int getEmpty() {
		int result = 1;
		
		if(size > 0) {
			result = 0;
		}
		
		return result;
	}
	
	public int getFront() {
		int result = -1;
		
		if(size > 0) {
			result = que[front];
		}
		
		return result;
	}
	
	public int getRear() {
		int result = -1;
		
		if(size > 0) {
			result = que[rear-1];
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- 명령의 수를 입력하세요. -----");
		int n = Integer.parseInt(sc.nextLine());
		
		A10845 que = new A10845(n);
		
		for(int i = 0; i < n; i++) {
			String command = sc.next();
			int num = 0;
			
			if(command.equals("push")) {
				num = Integer.parseInt(sc.next());
				que.push(num);
			} else if(command.equals("pop")) {
				System.out.println(que.pop());
			} else if(command.equals("size")) {
				System.out.println(que.getSize());
			} else if(command.equals("empty")) {
				System.out.println(que.getEmpty()); 
			} else if(command.equals("front")) {
				System.out.println(que.getFront()); 
			} else if(command.equals("back")) {
				System.out.println(que.getRear()); 
			} 
		}
		
	}

}
