package inProgress;

import java.util.ArrayList;
import java.util.Scanner;

public class A10828 {
	public static void main(String[] args) {
		
	}
	
	public static void test2() {
		
	}
	
	/**
	 * 실패 : 시간 초과 
	 */
	public static void test1() {
		Scanner sc = new Scanner(System.in);
		
		//ArrayList는 배열 길이를 초기화 시킬 필요없기 때문에 자유로운 원소 삽입이 가능
		ArrayList<Integer> resultArr = new ArrayList<>();
		
		//사용자 입력값에 따른 리턴값을 담을 임시변수 
		int temp = 0;
		
		System.out.println("----- 명령의 수를 입력하세요 -----");
		int length = sc.nextInt();
		
		for(int i = 0; i < length; i++) {
			System.out.println("------- 입력하세요 -------");
			String param = sc.next();
			
			switch(param) {
			case "push":
				/**
				 * arrayList에 원소를 삽입시 항상 마지막 인덱스에 추가되기 때문에 
				 * 임의로 가장 앞자리로 지정해준다.
				 */
				resultArr.add(0, sc.nextInt());
				
				break;
			case "pop":
				if(resultArr.size() == 0) {	//에러 방지 
					System.out.println(-1);
					
					break;
				} else {
					temp = resultArr.get(0);
					resultArr.remove(0);
					System.out.println(temp);
					
					break;
				}
			case "size":
				//size() : 배열의 크기(길이)를 반환하는 arrayList의 메섣
				temp = resultArr.size();	
				
				System.out.println(temp);
				break;
			case "empty":
				if(resultArr.size() == 0) {	//에러 방지 
					temp = 1;
					System.out.println(temp);
					
					break;
				} else {
					temp = 0;
					System.out.println(temp);
					
					break;
				}
			case "top":
				if(resultArr.size() == 0) {	//에러 방지 
					System.out.println(-1);
					break;
				} else {
					//가장 위에 있는 정수를 출력 
					temp = resultArr.get(0);
					
					System.out.println(temp);
					break;
				}
			}
		}
		System.out.println("----- 종료되었습니다 -----");
	}
}
