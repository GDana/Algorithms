package level1.test;

public class test05 {

	public static void main(String[] args) {
		// [실패] 코딩테스트 연습 > 연습문제 > 소수 찾기 

		solution4(10);
		solution4(5);
		solution4(2);	

		/*
		boolean[] arr = new boolean[2];	//기본 false로 초기화 됨 
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
	}
	
	public static int solution4(int n) {
		int answer = 0;
		boolean[] arr = new boolean[n+1];
		
		for(int i = 2; i <= n; i++) {
			arr[i] = true;
		}
		
		for(int i = 2; i <= (int) Math.sqrt(n); i++) {
			if(arr[i] == true) {
				for(int j = i; i*j <= n; j++) {
					arr[i*j] = false;
				}
			}
		}
		
		for(int i = 2; i <= n; i++) {
			 if(arr[i] == true) {
				 answer++;
			 }
		}
		
		System.out.println(answer);
		
		
		return answer;
    }
	
	public static int solution3(int n) {
		int answer = 0;
		boolean[] arr = new boolean[n+1];
		
		System.out.println(arr.length);
		
		for(int i = 2; i <= (int) Math.sqrt(n); i++) {
			if(arr[i] == false) {
				for(int j = i; i*j <= n; j++) {
					arr[i*j] = true;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			 if(arr[i] == false) {
				 answer++;
			 }
		}
		
		System.out.println(answer);
		
		
		return answer;
    }
	
	public static boolean solution2(int n) {
		boolean result = true;
        for(int i=2; i<n; i++){
            if(n % i == 0) {
            	System.out.println("n % i = " + n % i);
            	result = false;
            	return result;
            }
        }
        
        return result;
    }

	public static int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
        	boolean temp = true;
        	
        	for(int j = 2; j < i; j++) {
        		if(i % j == 0) {
        			temp = true;
        			break;
        		}	
        		//System.out.println(i + " & " + j + " = " + i%j);
        		temp = false;
        	}
        	if(!temp) {
        		answer++;
        	}
        }
        
        if(n >= 2) answer++;
        
        System.out.println(answer);
        
        return answer;
    }
}
