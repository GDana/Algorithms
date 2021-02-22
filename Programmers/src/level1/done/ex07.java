package level1.done;

public class ex07 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 두 정수 사이의 합 
		/*
		 * 1. a, b의 크기를 비교하여 큰 값, 작은 값 구분하여 초기화한다
		 * 2. 작은 값부터 큰 값까지 증감하여 더하는 반복문을 작성한다 
		 * 3. 만약 a, b가 같으면 둘 중 아무 수나 return 한다 
		 */
		
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
	}
	

	public static long solution(int a, int b) {
        long answer = 0;
        int big = 0;
        int small = 0;
        
        if(a > b) {
        	big = a;
        	small = b;
        }else if(a == b) {
        	return answer = a;
        }else {
        	big = b;
        	small = a;
        }
        
        for(int i = small; i < big+1; i++) {
        	answer += i;
        }
        
        return answer;
    }
}
