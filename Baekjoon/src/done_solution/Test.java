package done_solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		quickSort(arr, 0, arr.length-1);

		for(int i : arr){
			System.out.println(i);
		}
	}

	public static void quickSort(int[] arr, int low, int high){
		int i = low;
		int j = high;
		int pivot = arr[(low + high) / 2];
		int temp;

		while(i <= j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}

			if(i <= j){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if(low < j){
			quickSort(arr, low, j);
		}

		if(high > i){
			quickSort(arr, i, high);
		}
	}
}
