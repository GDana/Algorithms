package test;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	int hello[] = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33, 10 };
		int a = 72;
		long b = 9223372036854775807l;
		
			// System.out->표준출력장치(모니터,프린터),System.in(표준입력장치->키보드)
			System.out.println(a);// 72
			System.out.println(hello);// hello배열의 저장위치를 출력
			// 입출력할때 특히 출력->버퍼(데이터 저장영역)->어느정도 데이터쌓음->데이터성능향상을 위해
			System.out.write(a);// H, int형
			System.out.flush();// 버퍼에 저장하지 말고 바로바로 출력하라
//			System.out.write(hello);// 입출력할때에는 반드시 예외처리를 해야 된다.
//			System.out.write(b);
		
    }
}

