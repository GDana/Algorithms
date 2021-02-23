package level1.done;

public class ex09 {
	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 문자열 내 p와 y의 개수 
		
		String str1 = "pPoooyY";
		String str2 = "Pyy";
		
		System.out.println(solution(str1));
		System.out.println(solution(str2));
		
		System.out.println(str1.chars().filter( e -> 'P' == e).count());
	}
	
	static boolean solution(String s) {
        boolean answer = true;
        String lower = s.toLowerCase();
        int p = 0;
        int y = 0;
        
        for(int i=0; i<lower.length(); i++) {
        	String temp = lower.substring(i, i+1);
        	System.out.print(temp + " ");
        	
        	if(temp.equals("p")) {
        		p += 1;
        	}else if(temp.equals("y")) {
        		y += 1;
        	}
        }
        System.out.println();
        System.out.println("p: " + p + " y: " + y);
        System.out.println("------------------------");
        
        if(p != y) {
        	answer = false;
        }else if(p == y) {
        	answer = true;
        }else if(p == 0 && y == 0) {
        	answer = true;
        }

        return answer;
    }
}
