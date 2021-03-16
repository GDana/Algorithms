package level1.done;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 직사각형 별찍기 
		
        Scanner sc = new Scanner(System.in);
        System.out.println("::::: 가로 길이 n과 세로 길이 m을 입력하세요 :::::");
        int a = sc.nextInt();
        int b = sc.nextInt();

        /*
        //이 코드 이해가 안됨..
        System.out.println("::::: 다른 사람 풀이 :::::");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a; i++){
            sb.append("*");
        }
        System.out.println("end");
        for(int i=0; i<b; i++){
            System.out.println(sb.toString());
        }
        */
        /**/
        for(int i = 0; i < b; i++) {
        	for(int j = 0; j < a; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
}
