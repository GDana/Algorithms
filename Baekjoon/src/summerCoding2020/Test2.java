package summerCoding2020;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long [] arr = new long[4];
		long result = 0;
		
		for(int i = 0; i < 4;){
			int k;
			arr[i] = (long)Math.pow(3, i);
			System.out.println("i === " + i);
			if(i > 0) {				
				for(int j = 0; j < arr.length; j++) {
					System.out.println("arr[j] = " + arr[j] + " /// " + "arr[i] = " + arr[i]);
					k = i;
					arr[k++] = arr[j] + arr[i];
//					System.out.println("arr[i++] = " + arr[i++]);
				
					if(j++ == 4) {
						result = arr[j];
						return;
					}
				}
			}
		}        
		System.out.println("result = " + result);
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}
}
