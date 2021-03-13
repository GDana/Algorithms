package level1.done;

public class ex25 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 평균 구하기 
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,5};

		solution(arr1);
		solution(arr2);
		
	}
	
	public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        
        for(int i = 0; i< arr.length; i++) {
        	sum += arr[i];
        }
        answer = (double) sum / arr.length;
        
        System.out.println(sum + "/ " + arr.length + " = " + answer);
        
        return answer;
    }

}
