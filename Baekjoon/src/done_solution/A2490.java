package done_solution;

import java.util.Scanner;

public class A2490 {
	public static void main(String[] args) {
		/* 윷놀이
		 * https://www.acmicpc.net/problem/2490
		 * 
		 * 1. 배열을 돌면서 int 입력값을 받는다
		 * 2. 정수 0이면 count++
		 * 3. 삼항연산자로 count가 1일 때, 2, 3... 일 때를 확인
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		String result;
		
		for(int i = 0; i < 3; i++) {
			int count = 0;
			
			for(int j = 0; j < arr.length; j++) {				
				arr[j] = sc.nextInt();
				
				if(arr[j] == 0) {
					count++;
				}
			}
			
			result = (count == 1) ? "A" : (count == 2) ? "B" : (count == 3) ? "C" : (count == 4) ? "D" : "E";
			System.out.println(result);
		}		
	}
	
	// 다른 풀이
// 	public static final char[] result = {'D', 'C', 'B', 'A', 'E'};

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
//        for (int i = 0; i < 3; i++) {
//            String[] input = br.readLine().split(" ");
//            int sum = 0;
           
//            for (int index = 0; index < input.length; index++) {
//                sum += Integer.parseInt(input[index]);
//            }

//            System.out.println(result[sum]);
//        }

//    }
}
