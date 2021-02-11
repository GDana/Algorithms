package baekjoon.done_solution;

import java.util.Scanner;

public class A2490 {
	public static void main(String[] args) {
		/* ������
		 * https://www.acmicpc.net/problem/2490
		 * 
		 * 1. �迭�� ���鼭 int �Է°��� �޴´�
		 * 2. ���� 0�̸� count++
		 * 3. ���׿����ڷ� count�� 1�� ��, 2, 3... �� ���� Ȯ��
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
	
	// �ٸ� Ǯ��
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
