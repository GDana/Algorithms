package summerCoding2020;

import java.util.ArrayList;
import java.util.Scanner;

public class ReTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 4;
		int [] arr = new int[n];
		ArrayList<Integer> arr2 = new ArrayList<>();
//		ArrayList<Integer> arr3 = new ArrayList<>();
		int [] arr3 = new int [arr.length + arr2.size()];
		int [] arr4 = new int[arr3.length];
		
		// 3�� ���� �迭
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)Math.pow(3, i);			
		}
		
		// ���� �迭�� ���� �迭
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				arr2.add(arr[i] + arr[j]);
			}
		}
		
		// �� �迭�� ���Ͽ� ��ģ �迭
		for(int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i]; 
		}
		int index = 0;
		int arrIndex = arr.length;
		for(int i = 0; i < arr2.size(); i++) {
			System.out.println("i = " + arrIndex + " /// arr2.get(index) = " + arr2.get(index));
			int num = arr2.get(index);
			arr3[i] = num;
			arrIndex++;
			index++;
		}
		
//		for(int j = 1; j < arr3.length; j++) {
//			int temp = arr3[j];
//			int k;
//			
//			for(k = j-1; k >= 0 && arr3[k] > temp; k--) {
//				arr3[k+1] = arr3[k];
//			}
//			arr3[k+1] = temp;
//		}
				
		printArray(arr);
		printArray2(arr2);
		printArray(arr3);
	}
	
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void printArray2(ArrayList<Integer> arr2) {
		for(int i : arr2){
            System.out.print(i + " ");
        }
		System.out.println();
	}
}
