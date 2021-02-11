package baekjoon.done;

import java.util.Scanner;

public class A9498 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/9498
		Scanner scan = new Scanner(System.in);		
		int score;
		
		score = scan.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}else if(score >= 80 && score < 90) {
			System.out.println("B");
		}else if(score >= 70 && score < 80) {
			System.out.println("C");
		}else if(score >= 60 && score < 70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
