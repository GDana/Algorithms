package done;

import java.util.Scanner;

public class A2475 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2475
		Scanner sc = new Scanner(System.in);
		
		int calc, result, sum = 0;		
		int [] arr = new int[5];		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();			
		}
		
		for(int i = 0; i < arr.length; i++) {
			calc = (arr[i] * arr[i]); 
			sum += calc;	//0, 16, 4, 25, 46				
		}
		result = sum % 10;
					
		System.out.println(result);
//		System.out.println(sum);
	}
}
